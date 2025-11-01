package Modelos;
import lombok.Data;
@Data

public class Tarifa {
    private Integer monto;
    private String fechaDesde;
    private String fechaHasta;

    public Tarifa(Integer monto, String fechaDesde, String fechaHasta) {
        this.monto = monto;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }
}
