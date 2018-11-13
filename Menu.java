package com.play.yams;

import java.util.Scanner;

public class Menu {

	private Data slot = new Data();
	private String exceptionMessage = "Veuillez taper sur entrée qu'une fois la saisie effectuée ! ";
	private Scanner sc = new Scanner(System.in);
	private Figure figure = new Figure();
	//private Dice roll1 = new Dice();
	private Print print = new Print();
	String nameUser;
	int count = 0;

	// ******************************************************************************************************************
	// ACTION
	// ******************************************************************************************************************

	public void mainMenu() {
		char menuChoice = '\0';
		this.print.printMainMenu();
		figure.figurePoints();

		do {
			try {
				menuChoice = sc.nextLine().toUpperCase().charAt(0);
			} catch (IndexOutOfBoundsException n) {
				System.err.println(exceptionMessage);
			} catch (NullPointerException e) {
				System.err.println(exceptionMessage + e.getMessage());
			}

			if (menuChoice != 'Q' && menuChoice != 'N' && menuChoice != 'P')
				System.err.println("Merci de sélectionner une des options proposées");

		} while (menuChoice != 'Q' && menuChoice != 'N' && menuChoice != 'P');

		// NEW GAME
		if (menuChoice == 'N') {
			this.newGame();
			// CONTINUE GAME
		} else if (menuChoice == 'P') {
			System.out.println("P fonctionne mais n'est pas encore paramétré. Un peu de patience.");
			// this.continueGame();
			// QUIT GAME
		} else {
			System.out.println("Au revoir !");
		}

	}

	private void actionMenu() {
		char actionChoice = '\0';
		this.print.printActionMenu();
		String tab = (String) figure.seeTab();

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
		// ROLL THE DICE
		if (actionChoice == 'D') {
			this.RollAllDice();
			// SAVE POINTS
		} else if (actionChoice == 'E') {
			System.out.println("E fonctionne mais n'est pas encore paramétré. Un peu de patience.");
			this.actionMenu();

			// SAVE GAME AND BACK MENU
		} else if (actionChoice == 'V') {

			slot.loadGame();

			this.actionMenu();

			// SAVE GAME AND BACK MENU
		} else if (actionChoice == 'S') {
			try {
				System.out.println("Entrez votre pseudo : ");
				nameUser = sc.nextLine();

				this.slot.saveGame(nameUser, tab);
			} catch (IndexOutOfBoundsException n) {
				System.out.println(exceptionMessage);
			} catch (NullPointerException e) {
				System.out.println(exceptionMessage + e.getMessage());
			} finally {
				// execute finally quoiqu'il arrive
				// if (nameUser != null) {
				System.out.println("=> Vous sauvegardez votre partie et quittez le jeu, au revoir !");
				// }

			}

		}
	}

	private void diceMenu() {
		char actionChoice = '\0';
		this.print.printDiceMenu();
		//this.print.roll1.seeTabDice();

		do {
			try {
				actionChoice = sc.nextLine().toUpperCase().charAt(0);
			} catch (IndexOutOfBoundsException n) {
				System.out.println(exceptionMessage);
			} catch (NullPointerException e) {
				System.out.println(exceptionMessage + e.getMessage());
			}

			if (actionChoice != '5' && actionChoice != '4' && actionChoice != '3' && actionChoice != '2'
					&& actionChoice != '1' && actionChoice != 'V' && actionChoice != 'E')
				System.err.println("Merci de sélectionner une des options proposées !");

		} while (actionChoice != '5' && actionChoice != '4' && actionChoice != '3' && actionChoice != '2'
				&& actionChoice != '1' && actionChoice != 'V' && actionChoice != 'E');
		// ROLL THE DICE

		if (actionChoice == '5') {
			// relancer tous les dés
			//this.print.roll1.seeTabDice();
			this.RollAllDice();

		} else if (actionChoice == '4') {
			// relancer 4 dés
			//this.print.roll1.seeTabDice();
			RollFourDiceMenu();

		} else if (actionChoice == '3') {
			// relancer 3 dés
			//this.print.roll1.seeTabDice();
			RollFourDiceMenu();

		} else if (actionChoice == '2') {
			// relancer 2 dés
			//this.print.roll1.seeTabDice();
			RollFourDiceMenu();

		} else if (actionChoice == '1') {
			// relancer 1 dé
			//this.print.roll1.seeTabDice();
			RollOneDiceMenu();

		} else if (actionChoice == 'V') {

			System.out.println(count + " jet");

			figure.seeTab();
			this.mainMenu();

		} else if (actionChoice == 'E') {
			// Go back to the menu when finish the game
			// System.out.println("=> Vous sauvegardez votre partie et retournez au menu
			// principal");
			this.mainMenu();
		}

	}

	private void RollFourDiceMenu() {
		char actionChoice = '\0';
		//this.print.roll1.seeTabDice();
		this.print.printFourDiceMenu();
		do {
			try {
				actionChoice = sc.nextLine().toUpperCase().charAt(0);
			} catch (IndexOutOfBoundsException n) {
				System.out.println(exceptionMessage);
			} catch (NullPointerException e) {
				System.out.println(exceptionMessage + e.getMessage());
			}

			if (actionChoice != '1' && actionChoice != '2' && actionChoice != '3' && actionChoice != '4'
					&& actionChoice != '5' && actionChoice != 'R')
				System.err.println("Merci de sélectionner une des options proposées !");

		} while (actionChoice != '1' && actionChoice != '2' && actionChoice != '3' && actionChoice != '4'
				&& actionChoice != '5' && actionChoice != 'R');

		if (actionChoice == '1') {
			count++;
			System.out.println("Vous êtes à votre " + count + "ème jet");
			System.out.println("Vous avez relancer les dés " + this.print.roll1.seeDiceOne() + " " + this.print.roll1.seeDiceTwo() + " "
					+ this.print.roll1.seeDiceThree() + " " + this.print.roll1.seeDiceFour());
			//this.roll2.shuffleDice1();
			//this.roll2.seeTabDice();
			if (count == 3) {
				this.finishRoundMenu();

			} else {
				this.diceMenu();
			}

		} else if (actionChoice == '2') {
			count++;
			System.out.println("Vous êtes à votre " + count + "ème jet");
			System.out.println("Vous avez relancer les dés " + this.print.roll1.seeDiceOne() + " " + this.print.roll1.seeDiceTwo() + " "
					+ this.print.roll1.seeDiceThree() + " " + this.print.roll1.seeDiceFive());
			//this.roll2.shuffleDice2();
			//this.roll2.seeTabDice();
			if (count == 3) {
				this.finishRoundMenu();

			} else {
				this.diceMenu();
			}

		} else if (actionChoice == '3') {
			count++;
			System.out.println("Vous êtes à votre " + count + "ème jet");
			System.out.println("Vous avez relancer les dés " + this.print.roll1.seeDiceOne() + " " + this.print.roll1.seeDiceTwo() + " "
					+ this.print.roll1.seeDiceFour() + " " + this.print.roll1.seeDiceFive());
			//this.roll2.shuffleDice3();
			//this.roll2.seeTabDice();
			if (count == 3) {
				this.finishRoundMenu();

			} else {
				this.diceMenu();
			}

		} else if (actionChoice == '4') {
			count++;
			System.out.println("Vous êtes à votre " + count + "ème jet");
			System.out.println("Vous avez relancer les dés " + this.print.roll1.seeDiceOne() + " " + this.print.roll1.seeDiceThree() + " "
					+ this.print.roll1.seeDiceFour() + " " + this.print.roll1.seeDiceFive());
			//this.roll2.shuffleDice4();
			//this.roll2.seeTabDice();
			if (count == 3) {
				this.finishRoundMenu();

			} else {
				this.diceMenu();
			}

		} else if (actionChoice == '5') {
			count++;
			System.out.println("Vous êtes à votre " + count + "ème jet");
			System.out.println("Vous avez relancer les dés " + this.print.roll1.seeDiceTwo() + " " + this.print.roll1.seeDiceThree() + " "
					+ this.print.roll1.seeDiceFour() + " " + this.print.roll1.seeDiceFive());
			//this.roll2.shuffleDice5();
			//this.roll2.seeTabDice();
			if (count == 3) {
				this.finishRoundMenu();

			} else {
				this.diceMenu();
			}
		} else if (actionChoice == 'R') {
			this.diceMenu();
		}

	}

	private void RollOneDiceMenu() {
		char actionChoice = '\0';
		this.print.printOneDiceMenu();
		do {
			try {
				actionChoice = sc.nextLine().toUpperCase().charAt(0);
			} catch (IndexOutOfBoundsException n) {
				System.out.println(exceptionMessage);
			} catch (NullPointerException e) {
				System.out.println(exceptionMessage + e.getMessage());
			}

			if (actionChoice != '1' && actionChoice != '2' && actionChoice != '3' && actionChoice != '4'
					&& actionChoice != '5' && actionChoice != 'R')
				System.err.println("Merci de sélectionner une des options proposées !");

		} while (actionChoice != '1' && actionChoice != '2' && actionChoice != '3' && actionChoice != '4'
				&& actionChoice != '5' && actionChoice != 'R');

		if (actionChoice == '1') {
			count++;
			System.out.println("Vous êtes à votre " + count + "ème jet");
			System.out.println("Vous avez relancer le premier dé");
			this.print.roll1.shuffleDice1();
			//this.print.roll1.seeTabDice();
			if (count == 3) {
				this.finishRoundMenu();

			} else {
				this.diceMenu();
			}

		} else if (actionChoice == '2') {
			count++;
			System.out.println("Vous êtes à votre " + count + "ème jet");
			System.out.println("Vous avez relancer le deuxième dé");
			this.print.roll1.shuffleDice2();
			//this.print.roll1.seeTabDice();
			if (count == 3) {
				this.finishRoundMenu();

			} else {
				this.diceMenu();
			}

		} else if (actionChoice == '3') {
			count++;
			System.out.println("Vous êtes à votre " + count + "ème jet");
			System.out.println("Vous avez relancer le troisième dé");
			this.print.roll1.shuffleDice3();
			//this.print.roll1.seeTabDice();
			if (count == 3) {
				this.finishRoundMenu();

			} else {
				this.diceMenu();
			}

		} else if (actionChoice == '4') {
			count++;
			System.out.println("Vous êtes à votre " + count + "ème jet");
			System.out.println("Vous avez relancer le quatrième dé");
			this.print.roll1.shuffleDice4();
			//this.print.roll1.seeTabDice();
			if (count == 3) {
				this.finishRoundMenu();

			} else {
				this.diceMenu();
			}

		} else if (actionChoice == '5') {
			count++;
			System.out.println("Vous êtes à votre " + count + "ème jet");
			System.out.println("Vous avez relancer le cinquième dé");
			this.print.roll1.shuffleDice5();
			//this.print.roll1.seeTabDice();
			if (count == 3) {
				this.finishRoundMenu();

			} else {
				this.diceMenu();
			}
		} else if (actionChoice == 'R') {
			this.diceMenu();
		}

	}

	private void finishRoundMenu() {
		char actionChoice = '\0';
		this.print.printFinishRoundMenu();
		count = 0;

		do {
			try {
				actionChoice = sc.nextLine().toUpperCase().charAt(0);
			} catch (IndexOutOfBoundsException n) {
				System.out.println(exceptionMessage);
			} catch (NullPointerException e) {
				System.out.println(exceptionMessage + e.getMessage());
			}

			if (actionChoice != 'E' && actionChoice != 'V')
				System.err.println("Merci de sélectionner une des options proposées !");

		} while (actionChoice != 'E' && actionChoice != 'V');
		// ROLL THE DICE
		if (actionChoice == 'V') {

			System.out.println(count + " jet");

			figure.seeTab();
			this.mainMenu();

		} else if (actionChoice == 'E') {
			// Go back to the menu when finish the game
			// System.out.println("=> Vous sauvegardez votre partie et retournez au menu
			// principal");
			this.mainMenu();
		}

	}

	private void newGame() {
		this.actionMenu();
	}

	// private void continueGame() {
	// We need to check if the game have a saving first before
	// if (!ifSaving()) {
	// System.out.println("AUCUNE SAUVEGARDE TROUVEE !!! ");
	// System.out.println("=> Vous allez débuter une nouvelle partie\n");
	// this.newGame();
	// } else {
	// System.out.println("=> Vous reprenez votre partie !");
	// this.actionMenu();
	//
	// }
	// }

	// ******************************************************************************************************************
	// ACTION
	// ******************************************************************************************************************

	private void RollAllDice() {

		// char choice = '\0';
		System.out.println("=> Vous lancez les dés\n");

		// this.combo.combination();
		this.print.roll1.shuffleDice();
		//this.print.roll1.seeTabDice();
		count++;
		System.out.println(count + " jet");

		if (count == 3) {
			this.finishRoundMenu();

		} else {
			this.diceMenu();
		}

	}

}
