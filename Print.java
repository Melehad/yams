package com.play.yams;

public class Print {

	public Dice roll1 = new Dice();

	public Print() {

	}

	// ******************************************************************************************************************
	// PRINTING
	// ******************************************************************************************************************

	public void printMainMenu() {
		System.out.println("\n********************\n" + "**    LE YAM'S    **\n" + "********************\n");

		System.out.println("Nouvelle partie (N)\n" + "Partie sauvegardée (P)\n" + "Quitter (Q)");
	}

	public void printActionMenu() {
		System.out.println(
				"Listes des actions possibles :\n\t" + "- Lancer les dés (D)\n\t" + "- Enregistrer mon score (E)\n\t"
						+ "- Voir mes figures (V)\n\t" + "- Sauvegarder la partie et quitter (S)\n");
	}

	public void printDiceMenu() {
		System.out.println("Votre combinaison est : " + this.roll1.seeDiceOne() + " " + this.roll1.seeDiceTwo() + " "
				+ this.roll1.seeDiceThree() + " " + this.roll1.seeDiceFour() + " " + this.roll1.seeDiceFive());
		System.out.println("Vous pouvez :\n\t" + "- Relancez les 5 dés (5)\n\t" + "- Relancez 4 dés (4)\n\t"
				+ "- Relancez 3 dés (3)\n\t" + "- Relancez 2 dés (2)\n\t" + "- Relancez 1 dé (1)\n\t"
				+ "- Voir mes figures (V)\n\t" + "- Marquer votre score (E)");
	}

	public void printOneDiceMenu() {
		System.out.println("Votre combinaison est : " + this.roll1.seeDiceOne() + " " + this.roll1.seeDiceTwo() + " "
				+ this.roll1.seeDiceThree() + " " + this.roll1.seeDiceFour() + " " + this.roll1.seeDiceFive());
		System.out.println("Vous voulez relancer :\n\t- Le dé " + this.roll1.seeDiceOne() + " (tapez 1)");
		System.out.println("\t- Le dé " + this.roll1.seeDiceTwo() + " (tapez 2)");
		System.out.println("\t- Le dé " + this.roll1.seeDiceThree() + " (tapez 3)");
		System.out.println("\t- Le dé " + this.roll1.seeDiceFour() + " (tapez 4)");
		System.out
				.println("\t- Le dé " + this.roll1.seeDiceFive() + " (tapez 5)" + "\n\t- Revenir au choix des dés (R)");
	}

	public void printFourDiceMenu() {
		System.out.println("Votre combinaison est : " + this.roll1.seeDiceOne() + " " + this.roll1.seeDiceTwo() + " "
				+ this.roll1.seeDiceThree() + " " + this.roll1.seeDiceFour() + " " + this.roll1.seeDiceFive()

				+ "\n\tVous pouvez relancer :\n\t" + "- " + this.roll1.seeDiceOne() + " " + this.roll1.seeDiceTwo()
				+ " " + this.roll1.seeDiceThree() + " " + this.roll1.seeDiceFour() + " X (1)\n\t"

				+ "- " + this.roll1.seeDiceOne() + " " + this.roll1.seeDiceTwo() + " " + this.roll1.seeDiceThree()
				+ " X " + this.roll1.seeDiceFive() + " (2)\n\t"

				+ "- " + this.roll1.seeDiceOne() + " " + this.roll1.seeDiceTwo() + " X " + this.roll1.seeDiceFour()
				+ " " + this.roll1.seeDiceFive() + " (3)\n\t"

				+ "- " + this.roll1.seeDiceOne() + " X " + this.roll1.seeDiceThree() + " " + this.roll1.seeDiceFour()
				+ " " + this.roll1.seeDiceFive() + " (4)\n\t"

				+ "- " + "X " + this.roll1.seeDiceTwo() + " " + this.roll1.seeDiceThree() + " "
				+ this.roll1.seeDiceFour() + " " + this.roll1.seeDiceFive() + " (5)\n\t"

				+ "- Revenir au choix des dés (R)");
	}

	public void printThreeDiceMenu() {
		System.out.println("Vous pouvez :\n\t" + "- Relancez 4 dés (4)\n\t" + "- Relancez 3 dés (3)\n\t"
				+ "- Relancez 2 dés (2)\n\t" + "- Voir mes figures (V)\n\t" + "- Marquer votre score (E)\n");
	}

	public void printTwoDiceMenu() {
		System.out.println("Vous pouvez :\n\t" + "- Relancez 4 dés (4)\n\t" + "- Relancez 3 dés (3)\n\t"
				+ "- Relancez 2 dés (2)\n\t" + "- Voir mes figures (V)\n\t" + "- Marquer votre score (E)\n");
	}

	public void printFinishRoundMenu() {
		System.out.println("Vous pouvez :\n\t" + "- Voir mes figures (V)\n\t" + "- Marquer votre score (E)\n");
	}

	// ******************************************************************************************************************
	// UTILS
	// ******************************************************************************************************************

	// public Boolean ifSaving() {
	// return slot.saveGame(nameUser) != true;
	// }

}
