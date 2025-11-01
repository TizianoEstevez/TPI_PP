package Modelos;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class TarifaAbonoMensual {
    private Integer monto;
    private String fechaDesde;
    private String fechaHasta;
}
