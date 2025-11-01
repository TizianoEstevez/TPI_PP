package Modelos;
import lombok.Data;

@Data
public class UsoEstacionamiento {
    private Plaza plaza;
    private String fechaIngreso;
    private String horaIngreso;
    private String horaEgreso;
    private Vehiculo vehiculo;

    public UsoEstacionamiento(Plaza plaza, String fechaIngreso, String horaIngreso, Vehiculo vehiculo) {
        this.plaza = plaza;
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
        this.vehiculo = vehiculo;
        this.plaza.setOcupada();
    }

    public void registrarEgreso(String horaEgreso) {
        this.horaEgreso = horaEgreso;
        this.plaza.setApta();
    }

    public Integer calcularDuracionEstadia() {
        String[] ingresoParts = this.horaIngreso.split(":");
        String[] egresoParts = this.horaEgreso.split(":");

        int ingresoHoras = Integer.parseInt(ingresoParts[0]);
        int ingresoMinutos = Integer.parseInt(ingresoParts[1]);
        int egresoHoras = Integer.parseInt(egresoParts[0]);
        int egresoMinutos = Integer.parseInt(egresoParts[1]);

        int duracionHoras = egresoHoras - ingresoHoras;
        int duracionMinutos = egresoMinutos - ingresoMinutos;

        if (duracionMinutos < 0) {
            duracionHoras--;
            duracionMinutos += 60;
        }

        return duracionHoras * 60 + duracionMinutos;
    }

}
