package Modelos.Facturas;
import lombok.Data;
import java.time.LocalDate;

@Data
public class RecargaSaldo {
    private Integer cantidadSaldo;
    private LocalDate fechaRecarga;

    public RecargaSaldo(Integer cantidadSaldo, LocalDate fechaRecarga) {
        this.cantidadSaldo = cantidadSaldo;
        this.fechaRecarga = fechaRecarga;
    }
}
