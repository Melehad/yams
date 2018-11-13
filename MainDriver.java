package com.play.yams;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
	
		//VAR
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        

        String exceptionMessage = "Veuillez taper sur entrée qu'une fois la saisie effectuée !";
        char choice = '\0';

        //************************
        // PLAY
        //************************


        menu.mainMenu();

	}

}
