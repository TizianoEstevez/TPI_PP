package Enum;
public enum TipoDocumento {
    DNI("DNI", "Documento Nacional de Identidad"),
    PASAPORTE("PAS", "Pasaporte"),
    CEDULA("CE", "Cédula de Identidad");

    private final String siglas;
    private final String descripcion;

    TipoDocumento(String siglas, String descripcion) {
        this.siglas = siglas;
        this.descripcion = descripcion;
    }

    public String getSiglas() {
        return siglas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return siglas + " - " + descripcion;
    }
}