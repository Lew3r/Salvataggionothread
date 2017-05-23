package com.lezione;

import com.lezione.classi.Automobile;
import com.lezione.classi.Savable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class LoadManager {

    public ArrayList<Savable> caricaDaFile(String pathname) throws Exception
    {
        ArrayList<Savable> savables = new ArrayList<Savable>();
        String row;
        Savable savable;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(SaveManager.SAVE_DIRECTORY+pathname+SaveManager.EXTENSION));

        while(bufferedReader.ready())
        {
            row = bufferedReader.readLine();
            savable = (Savable) Class.forName(pathname).newInstance();

            savable.caricaDati(row);

            savables.add(savable);
        }

        return savables;
    }

}
