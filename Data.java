package com.play.yams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Data {

	private String fileName = "saveGame.txt";
    private File file = new File(fileName);
    //private Scanner sc = new Scanner(System.in);

    
    public Data() {}

    public void saveGame(String nameUser, String tab) {

        //on demande à l'utilisateur s'il veut sauvegarder son jeu
        // si oui, on écrit dans le fichier
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(nameUser);
            bufferedWriter.newLine();
            bufferedWriter.write(tab);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void loadGame() {

        BufferedReader bufferedReader = null;       
        String messageEmpty = "Aucune sauvegarde !";

        try {  

        	FileReader fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line;

			if ((line = bufferedReader.readLine()) != null) {
				System.out.println("***************************");
				System.out.println("******  Votre score  ******");
				System.out.println("***************************");

				do {
					System.out.println(line);
				} while ((line = bufferedReader.readLine()) != null);

			} else {
				System.err.println(messageEmpty);	
			}

        } catch (FileNotFoundException e) {
            System.err.printf("Le fichier %s n'a pas été trouvé.", file.toString());
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


    }
}
