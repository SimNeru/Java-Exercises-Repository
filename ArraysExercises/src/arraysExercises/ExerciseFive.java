package arraysExercises;

import java.util.Scanner;

public class ExerciseFive {
	
	/*
	 * ES.5
	 * Scrivere un programma che inseriti i lati di un ipotetico triangolo, dica se tale triangolo esiste oppure no.
	 * (Un triangolo esiste se ogni lato è minore della somma degli altri due)
	 */
	
	public static void exerciseFive() 
	{
		Scanner input = new Scanner(System.in);
		int varA, varB, varC;

		// registra i valori
		System.out.println("Insert 3 digits to check if the lenghts in a triangle are possible..");
		varA = input.nextInt();
		varB = input.nextInt();
		varC = input.nextInt();
		
		// controllo casi e output corrispettivo
		String output = ((varA<varB+varC && varB<varA+varC) && varC<varA+varB) ? "Triangle exist!" : "Triangle dosn't exist! :(";
		
		System.out.println(output);
	}

}
