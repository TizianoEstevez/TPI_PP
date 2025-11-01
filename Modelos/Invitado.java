package Modelos;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import Enum.TipoDocumento;
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Invitado extends Persona {
    private String fechaVisita;
    private String horaVisita;
    
    public Invitado(String nombre, int edad, TipoDocumento tipo, int nroDocumento, String mail, Integer telefono, String fechaVisita, String horaVisita) {
        super.setNombre(nombre);
        super.setEdad(edad);
        super.setTipo(tipo);
        super.setNroDocumento(nroDocumento);
        super.setMail(mail);
        super.setTelefono(telefono);
        this.fechaVisita = fechaVisita;
        this.horaVisita = horaVisita;
    }
}
