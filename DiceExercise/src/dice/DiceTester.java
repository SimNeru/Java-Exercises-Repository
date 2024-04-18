package dice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiceTester {

	public static void main(String[] args) {

		Dice dice6 = new Dice(6);
		Dice dice12 = new Dice(12);
		Dice dice20 = new Dice(20);
		
		int dice6Result = dice6.throwDice();
		int dice12Result = dice12.throwDice();
		int dice20Result = dice20.throwDice();

		System.out.println("dado 6 facce: " + dice6Result);
		System.out.println("dado 12 facce: " + dice12Result);
		System.out.println("dado 20 facce: " + dice20Result);
		
		int total = dice6Result + dice12Result + dice20Result;
		
		if (total>26) 
		{
			total+=10;
			System.out.println("Wow your result is above 26! +10 points!");
		}
		
		if (dice6Result%2 == 0) 
		{
			total+=6;
			System.out.println("D6 result is a multiple o 2! +6 points!");
		}
		
		if (dice12Result%2 == 0) 
		{
			total+=6;
			System.out.println("D12 result is a multiple o 2! +6 points!");
		}
		
		if (dice20Result%2 == 0) 
		{
			total+=6;
			System.out.println("D20 result is a multiple o 2! +6 points!");
		}
		
		System.out.println("Total points: " + total + "!");
		
		/* Stesso esercizio ma con array */
		
		List<Dice> arrayDice = new ArrayList<Dice>(
				Arrays.asList(dice6, dice12, dice20));
		
		int result = 0;
		int finalPoints = 0;
		
		// for each si interrompe prima dell'esecuzione dell'ultima parte, l'if interferisce
		/*for (Dice dice : arrayDice) {
			result = dice.throwDice();
			System.out.println("Throwed a " + result);
			if (result%2==0) 
			{
				result+=6;
				System.out.println("Result is a multiple o 2! +6 points!");
				continue;
			}
			finalPoints+=result;
		}*/
		
		for (int i = 0; i < arrayDice.size(); i++) {
			Dice dice = arrayDice.get(i);
			result = dice.throwDice();
			System.out.println("Throwed a " + result);
			if (result%2==0) 
			{
				result+=6;
				System.out.println("Result is a multiple o 2! +6 points!");
			}
			finalPoints+=result;
		}
		
		System.out.println("Total points: " + finalPoints + "!");
		
	}

}
