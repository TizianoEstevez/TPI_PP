package Interfaz;
import Enum.TipoDocumento;
import Enum.Rol;
import Modelos.*;
import Modelos.Facturas.Cobro;

//ESTA CLASE ACTUALMENTE ES PARA COMPROBAR EL FUNCIONAMIENTO, A FUTURO VA A SER LA INTERFAZ
public class Main {
    public static void main(String[] args) {
        //creacion del estacionamiento
        Estacionamiento estacionamiento = new Estacionamiento("Estacionamiento Central", 10);

        //Asignacion de tarifas
        Tarifa tarifa = new Tarifa(100, "2025-01-01", "2025-12-31");

        //Registro de usuario
        UsuarioInterno p = new UsuarioInterno( "Juan Perez", 30, TipoDocumento.DNI, 12345678, "", 312313, 5, Rol.ADMINISTRATIVO);
        Cuenta cuenta = new Cuenta(p);
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota", cuenta);

        //Carga de saldo
        cuenta.recargarSaldoCuentaCorriente(500);

        // Simulacion de uso del estacionamiento
        UsoEstacionamiento uso = new UsoEstacionamiento(estacionamiento.getPlazas().get(0), "2024-06-01", "10:00", vehiculo);
        uso.registrarEgreso("12:30");
        Cobro cobro = new Cobro(1,uso,tarifa);
        Integer montoFinal = cobro.calcularMontoFinal(tarifa, uso);


        System.out.println("Monto final a cobrar: " + montoFinal + "$");
        cobro.registrarCobro();
        System.out.println("Saldo restante en cuenta corriente: " + cuenta.getSaldo() + "$");

    }
}