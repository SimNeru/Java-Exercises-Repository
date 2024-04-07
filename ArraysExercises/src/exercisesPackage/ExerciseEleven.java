package exercisesPackage;

import java.util.Scanner;

public class ExerciseEleven {

	public static void exerciseEleven() 
	{
		/*
		 * Es.11
		 * Scrivi un programma che stampa il seguente pattern (chiede all’utente il numero di righe):
		 * @
		 * @@
		 * @@@
		 * @@@@
		 * @@@@@
		 * @@@@@@
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Digit how many rows you would like to give to the number's triangle:");
		int varRows = input.nextInt();
		
		for (int i=0;i<varRows;i++) 
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
