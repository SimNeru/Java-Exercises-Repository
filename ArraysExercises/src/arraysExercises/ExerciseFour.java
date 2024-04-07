package arraysExercises;

import java.util.Scanner;

public class ExerciseFour {

	public static void exerciseFour() {
		
		/*
		 * ES.4 Inserire una serie di numeri interi positivi da tastiera ed individuare
		 * il massimo e il minimo; la serie deve terminare con il numero 0.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please digit a number");

		int inputValue = input.nextInt();

		int max = inputValue;
		int min = inputValue;

		while (true) {
			if (inputValue == 0) // no
			{
				System.out.println("Max: " + max + "\nMin: " + min);
				return;
			}

			if (inputValue < 0 || inputValue > Integer.MAX_VALUE || inputValue < Integer.MIN_VALUE)
			{
				System.out.println("Please digit a valid number to record. .");
				max = inputValue;
				min = inputValue;
				continue;
			}

			if (inputValue > max)
			{
				max = inputValue;
				continue;
			}

			if (inputValue < min)
			{
				min = inputValue;
				continue;
			}

			inputValue = input.nextInt();
		}
	}
}
