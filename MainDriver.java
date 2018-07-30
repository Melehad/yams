package com.play.yams;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
	
		//VAR
        Scanner sc = new Scanner(System.in);
        Game game = new Game();

        String exceptionMessage = "Veuillez taper sur entrée qu'une fois la saisie effectuée !";
        char choice = '\0';

        //************************
        // PLAY
        //************************


        game.mainMenu();

	}

}
