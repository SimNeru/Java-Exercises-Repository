package arraysExercises;

import java.util.Scanner;

public class ExerciseEight {

	/*
	 * ES.8
	 * Scrivi un programma che riceve in input 5 numeri e ne calcola la somma e la media.
	 */
	
	public static void exerciseEight() 
	{
		Scanner input = new Scanner(System.in);
		int counter = 0;
		double varNum = 0;
		double total = 0;
		
		while(counter<5) 
		{
			varNum = input.nextDouble();
			total += varNum;
			counter++;
			
			if(counter==5) 
			{
				System.out.println("The average of the sum " + total + " is: " + total/counter);
			}
		}
	}
}
