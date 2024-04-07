package arraysExercises;

import java.util.Scanner;

public class ExerciseSeven {

	/*
	 * ES.7 Scrivi un programma che prenda un intero tra 1 e 7 e mostri il giorno
	 * della settimana.
	 */

	public enum DaysOfTheWeek {
		MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

		private int dayNumber;

		private DaysOfTheWeek(int varDayNumber) {
			this.dayNumber = varDayNumber;
		}

		// metodo get per accedere alla var privata
		public static DaysOfTheWeek getByNumber(int number) {
			// ciclo per ogni elemento presente nell'enum controllandone i values restituendo il corrispettivo enum
			for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
				if (day.dayNumber == number) {
					return day;
				} 
			}
			throw new IllegalArgumentException("Error something went wrong..");
		}
	}

	public static void exerciseSeven() {
		System.out.println("Please insert the digit and i'll give the day name..");
		Scanner input = new Scanner(System.in);
		int inputNumber = input.nextInt();
		
		// Il ciclo blocca l'avanzamento in caso di digit errato
		while(true) 
		{
			if(inputNumber<1 || inputNumber>7) 
			{
				System.out.println("Invalid day number: " + inputNumber + " please insert a number beetween 1 and 7..");
				inputNumber = input.nextInt();
				continue;
			}
			break;
		}
		
		DaysOfTheWeek daysOftheWeek = DaysOfTheWeek.getByNumber(inputNumber);
		System.out.println("Corrisponding day to number " + inputNumber + " is " + daysOftheWeek);

	}

}
