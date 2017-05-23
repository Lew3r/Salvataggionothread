package com.lezione.classi;


public class Automobile implements Savable {

    private String marca;
    private String modello;

    public Automobile() {
    }

    public Automobile(String marca, String modello)
    {
        this.marca = marca;
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String stringaPerFile() {
        return this.getMarca()+"|"+this.getModello();
    }

    @Override
    public void caricaDati(String dati) {
        this.marca = dati.substring(0, dati.indexOf("|"));
        this.modello = dati.substring(dati.indexOf("|")+1);
    }
}
