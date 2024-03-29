package exercisesLibrary;

import java.util.Scanner;

public class GuessTheZero {
	
	public static void guessTheZero(int argNumber) 
	{
		System.out.println("Il programma viene eseguito finché non viene inserito uno 0");
		Scanner input = new Scanner(System.in);
		while (true) {
		argNumber = input.nextInt();
		if (argNumber == 0) {return;}
		else {continue;}
		}
	}

}
