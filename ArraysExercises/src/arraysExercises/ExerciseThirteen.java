package arraysExercises;

import java.util.Iterator;
import java.util.Scanner;

public class ExerciseThirteen {
	
	/*
	 * Scrivere un programma per trovare il valore più vicino a 100 tra una coppia di numeri forniti, se
	 * sono uguali ritorna un avviso.
	 */

	public static void exerciseThirteen() {
		
		Scanner input = new Scanner(System.in);
		
		// definisco array
		int[] array = new int[2];
		
		// ciclo array per popolarlo
		System.out.println("Input numbers beetween 1 and 100..");
		for(int i=0;i<2;i++) 
		{
				System.out.println("Digit the value to store:");
				array[i] = input.nextInt();
		}
		
		// lancio l'avviso se i valori sono uguali
		if(array[0]==array[1]) 
		{
			System.out.println("I numeri sono uguali");
			return;
		}
		
		// comparo i valori
		int x = 100 - array[0];
		int y = 100 - array[1];
		
		// stampo risultato
		if (x < y) 
		{
			System.out.println(array[0] + " is the number closer to 100");
		} else 
		{
			System.out.println(array[1] + " is the number closer to 100");
		}
	}
}