package com.play.yams;

import java.util.Random;

public class Dice {

	private Random generator = new Random();
	
    public void shuffleDice() {
        //random generator to shuffle number
        int dice1 = this.generator.nextInt(6) + 1;
        int dice2 = this.generator.nextInt(6) + 1;
        int dice3 = this.generator.nextInt(6) + 1;
        int dice4 = this.generator.nextInt(6) + 1;
        int dice5 = this.generator.nextInt(6) + 1;
//        for (Room room : listRoom) {
//            //number of item by room
//            numberDice = this.generator.nextInt(5);
//           attributeItemToRoom(numberDice, room);
//        }
        System.out.println(dice1 + " " + dice2 + " " + dice3 + " " + dice4 + " " + dice5 + "\n");
	
    }
}
