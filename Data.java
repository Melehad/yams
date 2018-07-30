package com.play.yams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Data {

	private String fileName = "saveGame.txt";
    private File file = new File(fileName);
    private Scanner sc = new Scanner(System.in);

    
    public Data() {
    }

    public void saveGame(String nameUser, String tab) {
    	
    	
    	
        //on demande � l'utilisateur s'il veut sauvegarder son jeu
        // si oui, on �crit dans le fichier
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(nameUser);
            bufferedWriter.newLine();
            bufferedWriter.write(tab);
            

        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }


    public char loadGame() {

        BufferedReader bufferedReader = null;
        char letter = '\n';

        try {
            FileReader fileReader = new FileReader(file);
            // met en tampon le contenu
            bufferedReader = new BufferedReader(fileReader);

            String line = "";
            // lit la ligne
            if ((line = bufferedReader.readLine()) == null) {
            	letter = 'H';
            }else {
                letter = line.charAt(0);
            }


        } catch (FileNotFoundException e) {
            System.err.printf("Le fichier %s n'a pas �t� trouv�.", file.toString());
        } catch (IOException e) {
            System.err.println("Impossible de lire le contenu du fichier " + file.toString());
            // execute finally quoiqu'il arrive
        } finally {
            try {

                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.err.println("Impossible de fermer le fichier " + file.toString());
            } catch (NullPointerException e) {
                System.err.println("Impossible d'ouvrir le fichier " + file.toString());
            }

        }

        return letter;
    }
}
