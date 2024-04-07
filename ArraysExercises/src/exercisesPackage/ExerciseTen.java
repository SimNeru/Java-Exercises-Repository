package exercisesPackage;

import java.util.Scanner;

public class ExerciseTen {
	
	public static void exerciseTen() 
	{
		/*
		 * Es.10
		 * Scrivi un programma che stampa il seguente pattern (chiede all’utente il numero):
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Digit how many rows you would like to give to the number's triangle:");
		int varRows = input.nextInt();
		int counter = 1;
		
		for (int i=0;i<varRows;i++) 
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.print(counter + " ");
				counter++;
			}
			System.out.println();
		}
	}
}
