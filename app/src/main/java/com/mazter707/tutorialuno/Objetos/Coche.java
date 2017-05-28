package com.mazter707.tutorialuno.Objetos;

/**
 * Created by LAP on 5/28/2017.
 */

public class Coche {
    String marca;
    String propietario;
    int puerta;
    int ruedas;

    public Coche() {
    }

    public Coche(String marca, String propietario, int puerta, int ruedas) {
        this.marca = marca;
        this.propietario = propietario;
        this.puerta = puerta;
        this.ruedas = ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
}
