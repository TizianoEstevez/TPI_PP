package Modelos;
import Enum.TipoDocumento;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Persona {
    private String nombre;
    private int edad;
    private TipoDocumento tipo;
    private int nroDocumento;
    private String mail;
    private Integer telefono;
}
