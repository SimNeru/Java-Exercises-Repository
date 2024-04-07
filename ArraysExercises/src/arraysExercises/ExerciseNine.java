package arraysExercises;

import java.util.Scanner;

public class ExerciseNine {
	
	public static void exerciseNine() 
	{
		/*
		 * Es.9
		 * Scrivi un programma che stampa un pattern come il seguente triangolo, chiedendo all’utente il numero di
		 * righe:
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Digit how many rows you would like to give to the number's triangle:");
		int varRows = input.nextInt();
		
		for (int i=0;i<varRows;i++) 
		{
			int counter = 1;			
			for(int j=0;j<=i;j++) 
			{
				System.out.print(counter);
				counter++;
			}
			System.out.println();
		}
	}
}
