package Enum;

public enum TipoCuenta {
    CUENTA_CORRIENTE("Cuenta Corriente"),
    ABONO_MENSUAL("Abono Mensual");
    
    private final String valor;

    TipoCuenta(String valor) {
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
