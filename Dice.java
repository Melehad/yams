package com.play.yams;

import java.util.Random;

public class Dice {

	private Random generator = new Random();
	int dice1;
	int dice2;
	int dice3;
	int dice4;
	int dice5;
	int[] tab = {dice1, dice2, dice3, dice4, dice5};
	
    public void shuffleDice() {
        //random generator to shuffle number
        dice1 = this.generator.nextInt(6) + 1;
        dice2 = this.generator.nextInt(6) + 1;
        dice3 = this.generator.nextInt(6) + 1;
        dice4 = this.generator.nextInt(6) + 1;
        dice5 = this.generator.nextInt(6) + 1;
        
        tab[0] = dice1;
        tab[1] = dice2;
        tab[2] = dice3;
        tab[3] = dice4;
        tab[4] = dice5;
    }
    
    public void seeTabDice() {
    	System.out.println("Votre combinaison est : " + tab[0] + " " + tab[1] + " " + tab[2] + " " + tab[3] + " " + tab[4]);	
    }
    public String seeDiceOne() {
    	String strDiceOne = String.valueOf(tab[0]);
    	return strDiceOne;
    	//System.out.println(strDiceOne);	
    }
    public String seeDiceTwo() {
    	String strDiceTwo = String.valueOf(tab[1]);
    	return strDiceTwo;
    }
    public String seeDiceThree() {
    	String strDiceThree = String.valueOf(tab[2]);
    	return strDiceThree;
    }
    public String seeDiceFour() {
    	String strDiceFour = String.valueOf(tab[3]);
    	return strDiceFour;
    }
    public String seeDiceFive() {
    	String strDiceFive = String.valueOf(tab[4]);
    	return strDiceFive;
    }
    
    public void shuffleDice1() {
    	dice1 = this.generator.nextInt(6) + 1;
    	tab[0] = dice1;
    }
    
	public void shuffleDice2() {
		dice2 = this.generator.nextInt(6) + 1;
		tab[1] = dice2;
	}
	
	public void shuffleDice3() {
		dice3 = this.generator.nextInt(6) + 1;
		tab[2] = dice3;
	}
	
	public void shuffleDice4() {
		dice4 = this.generator.nextInt(6) + 1;
        tab[3] = dice4;
	}
	
	public void shuffleDice5() {
		dice5 = this.generator.nextInt(6) + 1;
        tab[4] = dice5;
	}
    
 
    
    
    
    
}
