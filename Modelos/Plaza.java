package Modelos;
import Enum.EstadoPlaza;
import lombok.Data;
import java.time.LocalDate;
@Data

public class Plaza {
    private Integer numeroPlaza;
    private EstadoPlaza estadoPlaza;
    private LocalDate fechaAlta;

    public Plaza(Integer numeroPlaza, LocalDate fechaAlta) {
        this.numeroPlaza =  numeroPlaza;
        this.estadoPlaza = EstadoPlaza.APTA;
        this.fechaAlta = fechaAlta;
    }

    public boolean isOcupada() {
        return this.estadoPlaza == EstadoPlaza.OCUPADA;
    }

    //setear estados
    public void setOcupada() {
        this.estadoPlaza = EstadoPlaza.OCUPADA;
    }

    public void setApta() {
        this.estadoPlaza = EstadoPlaza.APTA;
    }

    public void setEnMantenimiento() {
        this.estadoPlaza = EstadoPlaza.MANTENIMIENTO;
    }

    public void setEnConstruccion() {
        this.estadoPlaza = EstadoPlaza.CONSTRUCCION;
    }

}
