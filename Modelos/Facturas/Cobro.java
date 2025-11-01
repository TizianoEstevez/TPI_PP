package Modelos.Facturas;
import java.time.LocalDate;
import lombok.Data;
import Modelos.UsoEstacionamiento;
import Modelos.Tarifa;
import Modelos.Cuenta;
import Enum.Mensajes;
import Enum.Rol;

@Data
public class Cobro {
    private Integer numeroCobro;
    private UsoEstacionamiento usoEstacionamiento;
    private Tarifa tarifa;
    private Integer montoFinal;
    private LocalDate fechaCobro;

    public Cobro(Integer numeroCobro, UsoEstacionamiento usoEstacionamiento, Tarifa tarifa) {
        this.numeroCobro = numeroCobro;
        this.usoEstacionamiento = usoEstacionamiento;
        this.tarifa = tarifa;
    }

    //CONOCER RELACIONES
    public Modelos.Persona conocerUsuario() {
        Modelos.Cuenta c = conocerCuenta();
        if (c == null) return null;
        return c.getUsuario();
    }

    public Modelos.Cuenta conocerCuenta() {
        Modelos.Vehiculo v = usoEstacionamiento.getVehiculo();
        if (v == null) return null;
        return v.getCuenta();
    }


    //LOGICA MONTO FINAL
    public Integer aplicarDescuento(Integer monto){
        Modelos.Persona p = conocerUsuario();
        
        if (p instanceof Modelos.UsuarioInterno) {
            Modelos.UsuarioInterno ui = (Modelos.UsuarioInterno) p;
            Rol rol = ui.getRol();
            if (rol != null) {
                int porcentaje = rol.getPorcentaje();
                double factor = Math.max(0, Math.min(100, porcentaje)) / 100.0;
                double resultado = monto * factor;
                return (int) Math.round(resultado);
            }
        }
        // Por defecto cobrar el 100% del monto
        return monto;
    }

    public Integer calcularMontoFinal(Tarifa tarifa, UsoEstacionamiento usoEstacionamiento) {
        Integer monto = tarifa.getMonto();
        int duracionMinutos = usoEstacionamiento.calcularDuracionEstadia();

        if (duracionMinutos < 5) {
            montoFinal = 0;
        } else {
            montoFinal = aplicarDescuento(monto);
        }
        return montoFinal;
    }

    //LOGICA REGISTRAR COBRO
    public boolean registrarCobro( ) {
        this.fechaCobro = LocalDate.now();
        Cuenta c = conocerCuenta();
        if (c.esCuentaCorriente()){
            return cobroCuentaCorriente(c);
        }
        else {
            return cobroAbonoMensual(c);
        }
    }

    public boolean cobroCuentaCorriente(Cuenta c) {
        if (c.getSaldo() < this.montoFinal) {
            System.err.println(Mensajes.SALDO_INSUFICIENTE);
            return false;
        }
        c.setSaldo(conocerCuenta().getSaldo() - this.montoFinal);
        return true;
    }  

    public boolean cobroAbonoMensual(Cuenta c) {
        if (!c.tieneAbonoVigente()) {
            System.err.println(Mensajes.ABONO_NO_VIGENTE);
            return false;
        }
        return true;
    }

    
}
