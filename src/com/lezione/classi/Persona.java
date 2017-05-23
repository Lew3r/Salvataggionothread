package com.lezione.classi;


public class Persona implements Savable {

    private String nome;
    private String cognome;

    public Persona() {
    }

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String stringaPerFile() {
        return this.getNome()+"|"+this.getCognome();
    }

    @Override
    public void caricaDati(String dati) {
        this.nome = dati.substring(0, dati.indexOf("|"));
        this.cognome = dati.substring(dati.indexOf("|")+1);
    }
}
