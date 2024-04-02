package exercisesLibrary;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	
	public static void guessTheNumber() 
	{
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int randomGeneratedNumber= random.nextInt(0,11);
		//boolean numberGuessed = false;
		int givenTries = 10;
		System.out.println("Try to guess the number! It's in a range of 0 up to 10!");
		while (true) 
		{
			System.out.println("You got " + givenTries + " tries");
			int guessTry = input.nextInt();
			if(guessTry == randomGeneratedNumber) 
			{
				input.nextLine();
				System.out.println("Congratulations! You guessed it!\nWanna play again? Y or N?");
				String inputRequest = input.nextLine().toLowerCase();
				if (inputRequest.equals("n")) 
				{
					return;
				} else 
				{
					randomGeneratedNumber = random.nextInt(0,10);
					givenTries = 10;
					System.out.println("New number to guess generated!");
					continue;
				}
			} else if (guessTry > randomGeneratedNumber) 
			{
				System.out.println("The number to guess is . . LOWER!");
				givenTries--;
			} else 
			{
				System.out.println("The number to guess is . . HIGHER!");
				givenTries--;
			}
		}
	}
}