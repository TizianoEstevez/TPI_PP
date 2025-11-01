package Modelos.Facturas;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;
import Modelos.TarifaAbonoMensual;

@Data
@AllArgsConstructor
public class AbonoMensual {
    private TarifaAbonoMensual tarifa;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;

}
