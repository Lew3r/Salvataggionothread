package com.lezione.classi;

/**
 * Created by Mario on 15/05/2017.
 */
public class Folletto implements Savable {

    private String nome;
    private int peso;

    public Folletto() {
    }

    public Folletto(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String stringaPerFile() {
        return this.getNome()+"|"+this.getPeso();
    }

    @Override
    public void caricaDati(String dati) {
        this.nome = dati.substring(0, dati.indexOf("|"));
        this.peso = Integer.parseInt(dati.substring(dati.indexOf("|")+1));
    }
}
