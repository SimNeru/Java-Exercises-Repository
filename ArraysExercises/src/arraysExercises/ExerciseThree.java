package arraysExercises;

import java.util.Scanner;

public class ExerciseThree {
	
	/* ES.3
	Scrivere un programma che richiesto un numero intero visualizzi tutti i suoi divisori, contandoli.*/

	public static void exerciseThree() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please digit a number..");
		int value = input.nextInt();
		
		System.out.println("Divisori: ");
		for (int i=1; i<=value; i++) 
		{
			if(value%i==0) 
			{
				System.out.print(i + ",");
			}
		}
	}
}