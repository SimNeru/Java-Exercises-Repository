package arraysExercises;

import java.util.Scanner;

public class ExerciseTwelve {

	/*
	 * Es.12 Scrivi un programma che riceve tre numeri e stampa “crescente” se i
	 * numeri sono stati forniti in ordine crescente; “decrescente” se forniti in
	 * ordine decrescente; altrimenti stamperà “nessun ordine”.
	 */

	public static void exerciseTwelve() {
		Scanner input = new Scanner(System.in);

		// definisco la lunghezza dell'array che poi verrà creato
		int arrayLenght = 0;
		while (true) {
			System.out.println("Digit the array's lenght beetween 2 and 12..");
			arrayLenght = input.nextInt();

			if (arrayLenght < 2 || arrayLenght > 12) {
				continue;
			} else {
				break;
			}
		}

		// dichiaro l'array
		int[] arrayValues = new int[arrayLenght];
		System.out.println("Your array can store up to " + arrayValues.length + " values");

		// Popola l'array di valori
		for (int i = 0; i < arrayValues.length; i++) {
			System.out.println("Digit the next number..");
			arrayValues[i] = input.nextInt();
		}

		// Stampa i numeri in successione inseriti nell'array
		for (int values : arrayValues) {
			System.out.print(values + " ");
		}
		System.out.println();

		// variabile che serve per conservare il primo numero
		int storedValue = 0;

		// variabile che serve per definire se un l'array sarà ordinato in ordine
		// crescente o decrescente
		int condition = 0;

		// Controlla qual'è maggiore
		for (int i = 0; i < arrayValues.length; i++) {

			if (i == 0) {
				storedValue = arrayValues[i];
				continue;
			}

			// Crescente
			if (arrayValues[i] > storedValue) {
				storedValue = arrayValues[i];
				condition++;
			}

			// Decrescente
			if (arrayValues[i] < storedValue) {
				storedValue = arrayValues[i];
				condition--;
			}
		}

		// verifica
		if (condition == arrayValues.length - 1) {
			System.out.println("Condition: " + condition);
			System.out.println("Ascending order");
		} else if (condition == -(arrayValues.length - 1)) {
			System.out.println("Condition: " + condition);
			System.out.println("Descending order");
		} else {
			System.out.println("No order");
		}
	}
}
