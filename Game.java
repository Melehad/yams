package com.play.yams;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Game {


    private Data slot = new Data();
    private String exceptionMessage = "Veuillez taper sur entr�e qu'une fois la saisie effectu�e ! ";
    private Scanner sc = new Scanner(System.in);
    private Dice roll1 = new Dice();
    private Figure figure = new Figure();
    String nameUser;
	
    public Game() {

       

    }
    
    //******************************************************************************************************************
    //                                           GAME CONFIGURATION
    //******************************************************************************************************************
    
    

    
    
    //******************************************************************************************************************
    //                                                PRINTING
    //******************************************************************************************************************

    private void printMainMenu() {
        System.out.println("\n********************\n" +
                "**    LE YAM'S    **\n" +
                "********************\n");

        System.out.println("Nouvelle partie (N)\n"
                + "Partie sauvegardée (P)\n"
                + "Quitter (Q)");
    }

    private void printActionMenu() {
        System.out.println("Listes des actions possibles :\n\t"
                + "- Lancer les dés (D)\n\t"
                + "- Enregistrer mon score (E)\n\t"
                + "- Voir mes figures (V)\n\t"
                + "- Sauvegarder la partie et quitter (S)\n");
    }
    
    private void printDiceMenu() {
        System.out.println("Vous pouvez :\n\t"
                + "- Relancez tous les dés (A)\n\t"
                + "- Relancez certains dés (C)\n\t"
                + "- Voir mes figures (V)\n\t"
                + "- Marquer votre score (E)\n");
    }


    //******************************************************************************************************************
    //                                                   MENU
    //******************************************************************************************************************
    
    
    public void mainMenu() {
        char menuChoice = '\0';
        this.printMainMenu();

        do {
            try {
                menuChoice = sc.nextLine().toUpperCase().charAt(0);
            } catch (IndexOutOfBoundsException n) {
                System.err.println(exceptionMessage);
            } catch (NullPointerException e) {
                System.err.println(exceptionMessage + e.getMessage());
            }

            if (menuChoice != 'Q' && menuChoice != 'N' && menuChoice != 'P')
                System.err.println("Merci de s�lectionner une des options proposées");

        } while (menuChoice != 'Q' && menuChoice != 'N' && menuChoice != 'P');

        //NEW GAME
        if (menuChoice == 'N') {
            this.newGame();
            //CONTINUE GAME
        } else if (menuChoice == 'P') {
            this.continueGame();
            //QUIT GAME
        } else {
            System.out.println("Au revoir !");
        }

    }
    
    
    private void actionMenu() {
        char actionChoice = '\0';
        this.printActionMenu();
        figure.figurePoints();

        do {
            try {
                actionChoice = sc.nextLine().toUpperCase().charAt(0);
            } catch (IndexOutOfBoundsException n) {
                System.out.println(exceptionMessage);
            } catch (NullPointerException e) {
                System.out.println(exceptionMessage + e.getMessage());
            }

            if (actionChoice != 'E' && actionChoice != 'D' && actionChoice != 'S' && actionChoice != 'V')
                System.err.println("Merci de sélectionner une des options proposées !");

        } while (actionChoice != 'E' && actionChoice != 'D' && actionChoice != 'S' && actionChoice != 'V');
        //ROLL THE DICE
        if (actionChoice == 'D') {
            this.RollTheDice();
            //SAVE POINTS
        } else if (actionChoice == 'E') {
            //this.observeRoom();
            //SAVE GAME AND BACK MENU
        } else if (actionChoice == 'V') {
        	
        	figure.seeTab();
        	this.actionMenu();
            //SAVE GAME AND BACK MENU
        } else  if (actionChoice == 'S') {
        	
        	try {
        		System.out.println("Entrez votre pseudo : ");
        		nameUser = sc.nextLine();
        		String tab = (String)figure.seeTab();
        		//System.out.println(tab);
        		//String tab = "autre";
        		this.slot.saveGame(nameUser, tab);
        		
            } catch (IndexOutOfBoundsException n) {
                System.out.println(exceptionMessage);
            } catch (NullPointerException e) {
                System.out.println(exceptionMessage + e.getMessage());
            } finally {
    			// execute finally quoiqu'il arrive
            	//if (nameUser != null) {
            		System.out.println("=> Vous sauvegardez votre partie et quittez le jeu, au revoir !");	
            	//}
            	
    		}
        	
        	
            //Go back to the menu when finish the game
            
            //this.mainMenu();
        }

    }
    
    
    private void diceMenu() {
        char actionChoice = '\0';
        this.printDiceMenu();

        do {
            try {
                actionChoice = sc.nextLine().toUpperCase().charAt(0);
            } catch (IndexOutOfBoundsException n) {
                System.out.println(exceptionMessage);
            } catch (NullPointerException e) {
                System.out.println(exceptionMessage + e.getMessage());
            }

            if (actionChoice != 'A' && actionChoice != 'C' && actionChoice != 'E' && actionChoice != 'V')
                System.err.println("Merci de sélectionner une des options proposées !");

        } while (actionChoice != 'A' && actionChoice != 'C' && actionChoice != 'E' && actionChoice != 'V');
        //ROLL THE DICE
        if (actionChoice == 'A') {
            this.RollTheDice();
            //SAVE POINTS
        } else if (actionChoice == 'C') {
            //this.observeRoom();
            //SAVE GAME AND BACK MENU
        } else  if (actionChoice == 'V') {
        	figure.figurePoints();
        	figure.seeTab();
        	this.mainMenu();
        	
        } else  if (actionChoice == 'E') {
            //Go back to the menu when finish the game
            //System.out.println("=> Vous sauvegardez votre partie et retournez au menu principal");
            this.mainMenu();
        }

    }
    
    
    private void newGame() {  
        this.actionMenu();
    }
    
    private void continueGame() {
        //We need to check if the game have a saving first before
//        if (!ifSaving()) {
//            System.out.println("AUCUNE SAUVEGARDE TROUVEE !!! ");
//            System.out.println("=> Vous allez d�buter une nouvelle partie\n");
//            this.newGame();
//        } else {
//            System.out.println("=> Vous reprenez votre partie !");
//            this.actionMenu();
//
//        }
    }
    
    
    //******************************************************************************************************************
    //                                                   ACTION
    //******************************************************************************************************************


    
    private void RollTheDice() {
        char choice = '\0';
        System.out.println("=> Vous lancez les dés\n");
        this.roll1.shuffleDice();

//        do {
//            try {
//                choice = sc.nextLine().toUpperCase().charAt(0);
//            } catch (IndexOutOfBoundsException n) {
//                System.out.println(exceptionMessage);
//            } catch (NullPointerException e) {
//                System.out.println(exceptionMessage + e.getMessage());
//            }
//
//            if (choice != 'A')
//                System.out.println(this.listRoom[checkRoomPlayerChoice(choice)]);
//
//        } while (choice != 'A');
        
        this.diceMenu();
    }
    
    //******************************************************************************************************************
    //                                                   UTILS
    //******************************************************************************************************************

//    public Boolean ifSaving() {
//        return slot.saveGame(nameUser) != true;  
//    }
    
    
    
}
