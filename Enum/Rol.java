package Enum;

public enum Rol {
    ESTUDIANTE("Estudiante", 100, "10/10/2025", "10/10/2026"),
    PROFESOR("Profesor", 50, "10/10/2025", "10/10/2026"),
    ADMINISTRATIVO("Administrativo", 50, "10/10/2025", "10/10/2026");

    private String rol;
    private Integer porcentajeTarifa;
    private String inicioTarifa;
    private String finTarifa;

    Rol(String rol, Integer porcentajeTarifa, String inicioTarifa, String finTarifa) {
        this.rol = rol;
        this.porcentajeTarifa = porcentajeTarifa;
        this.inicioTarifa = inicioTarifa;
        this.finTarifa = finTarifa;
    }

    public String getRol() {
        return rol;
    }

    public Integer getPorcentaje() {
        return porcentajeTarifa;
    }

    public String getFechaTarifa(){
        return inicioTarifa + " - " + finTarifa;
    }

    @Override
    public String toString() {
        return rol + " - " + porcentajeTarifa + "% desde " + inicioTarifa + " hasta " + finTarifa;
    }
}

