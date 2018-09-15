package num364.easy.dungeonsdragons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/*
 * given input of dungeons and dragon dice notation
 * output the results of the given roles 
 * incorporating random results of each dice roll
 * example 3d6 > 3 rolls of 6 sided dice.
 * 
 * Challenge Input
	5d12
	6d4
	1d2
	1d8
	3d6
	4d20
	100d100
 */

public class Main {

	public static void main(String[] args) {
				
		List<String> inputDiceStr = new ArrayList<String>();
			inputDiceStr.add("5d12");
			inputDiceStr.add("6d4");
			inputDiceStr.add("1d2");
			inputDiceStr.add("1d8");
			inputDiceStr.add("3d6");
			inputDiceStr.add("4d20"); //LOL!!
			inputDiceStr.add("100d100"); 
		
		//run function
		alldice(inputDiceStr);
	}

	//function to be called by main
	private static void dice(String roll) {
		
		//needs to split up string to array
		List<String> rollArrStr = new ArrayList<String>(Arrays.asList(roll.split("d")));
		
		//needs to convert to integers
		List<Integer> rollArrInt = new ArrayList<Integer>(rollArrStr.size());
		for (String value:rollArrStr) {
			rollArrInt.add(Integer.parseInt(value));
		}
		
		//create ArrayList to hold roll outcomes
		List<Integer> rolls = new ArrayList<>();
		//needs to take first index as for loop run count
		for (int f = 0; f <= rollArrInt.get(0); f++) {
			//needs to random range between 1 and second index
			int randNum = ThreadLocalRandom.current().nextInt(1, rollArrInt.get(1) + 1);
			// needs to load roll results into Arraylist
			rolls.add(randNum);
		}
		
		//Needs to print the output of each roll
		System.out.println("You are rolling a " + rollArrInt.get(1) + 
							"-sided die " + rollArrInt.get(0) + " times.\n");
		for (int g = 0; g < rolls.size()-1; g++) {
			System.out.println("You rolled a : " + rolls.get(g));
		}
		//needs to add sum of rolls together
		int sum = rolls.stream().mapToInt(Integer::intValue).sum();
		
		//needs to print result
		System.out.println("\nThe sum of your rolls is " + sum);
	}
	
	//needs to loop dice() through all the input values.
	private static void alldice(List<String> die) {
		
		for (int d = 0; d < die.size(); d++) {
			System.out.println("\n----------\n");
			dice(die.get(d));
		}
	}
}
