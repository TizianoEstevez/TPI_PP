package Modelos;

import lombok.Data;

@Data
public class Vehiculo {
    private String patente;
    private String modelo;
    private Cuenta cuenta; // referencia al propietario / cuenta

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    public Vehiculo(String patente, String modelo, Cuenta cuenta) {
        this.patente = patente;
        this.modelo = modelo;
        this.cuenta = cuenta;
    }
}
