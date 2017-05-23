package com.lezione;


/*
* 1 rigo 1 entità
* |
*
* Mario|Pirris
* Leonardo|Mansueto
*
*
* */

import com.lezione.classi.Savable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SaveManager {

    public final static String SAVE_DIRECTORY = "salvataggi\\";
    public final static String EXTENSION = ".txt";

    public SaveManager() {
        File directory = new File(SAVE_DIRECTORY);
        directory.mkdirs();
    }

    public void salvaSuFile(ArrayList<Savable> daSalvare) throws FileNotFoundException
    {
        if(!daSalvare.isEmpty())
        {
            String className = daSalvare.get(0).getClass().getName();

            System.out.println("Stiamo salvando un arraylist di "+ className);

            PrintWriter pw = new PrintWriter(SAVE_DIRECTORY+className+ EXTENSION);

            for(Savable savable : daSalvare)
            {
                pw.append(savable.stringaPerFile()+"\n");
            }

            pw.flush();
        }

    }



}
