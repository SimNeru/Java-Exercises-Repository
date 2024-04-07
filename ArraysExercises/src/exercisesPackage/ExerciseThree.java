package exercisesPackage;

import java.util.Scanner;

public class ExerciseThree {
	
	/* ES.3
	Scrivere un programma che richiesto un numero intero visualizzi tutti i suoi divisori, contandoli.*/

	public static void exerciseThree() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please digit a number..");
		int value = input.nextInt();
		int counter = 0;
		
		System.out.println("Divisori: ");
		for (int i=1; i<=value; i++) 
		{
			if(value%i==0) 
			{
				System.out.print(i + " ");
				counter++;
			}
		}
		System.out.println("\nCi sono un totale di " + counter + " divisori");
	}
}