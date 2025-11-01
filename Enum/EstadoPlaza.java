package Enum;

public enum EstadoPlaza {
    CONSTRUCCION("Construcción"),
    MANTENIMIENTO("Mantenimiento"),
    APTA("Apta"),
    OCUPADA("Ocupada");


    private final String valor;

    EstadoPlaza(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor;
    }
}
