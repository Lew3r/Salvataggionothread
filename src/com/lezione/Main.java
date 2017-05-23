package com.lezione;

import com.lezione.classi.Automobile;
import com.lezione.classi.Folletto;
import com.lezione.classi.Persona;
import com.lezione.classi.Savable;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        SaveManager saveManager = new SaveManager();
        LoadManager loadManager = new LoadManager();

        ArrayList<Savable> automobili = new ArrayList<Savable>();
        ArrayList<Savable> persone = new ArrayList<Savable>();
        ArrayList<Savable> folletti = new ArrayList<Savable>();

        try
        {
            automobili = loadManager.caricaDaFile("com.lezione.classi.Automobile");
            persone = loadManager.caricaDaFile("com.lezione.classi.Persona");
            folletti = loadManager.caricaDaFile("com.lezione.classi.Folletto");
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        



        try
        {
            saveManager.salvaSuFile(persone);
            saveManager.salvaSuFile(automobili);
            saveManager.salvaSuFile(folletti);
        }catch (FileNotFoundException e)
        {
            System.out.println("Impossibile scrivere file");
        }


    }
}

/*
* creare un metodo di salvataggio su file per gli arrayList automobili/persone mantenendolo il più generico possibile,
* in modo che aggiungendo un terzo arraylist le modifiche da apportare debbano essere minime.
*
* Questo sistema dovrà creare dei file di salvataggio in chiusura e dovrà caricarli all'apertura del programma.
* */