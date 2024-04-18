package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {

		// definisco le variabile
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		int numbersToExtract = 0;
		System.out.println("Hello player choose how many numbers you would like to extract");
		numbersToExtract = input.nextInt();

		// controllo che l'utente inserisca un numero in un range accettabile
		while (numbersToExtract < 1 || numbersToExtract > 90) {
			System.out.println("You are out of range, please digit a set of numbers to extract beetween 1 and 90");
			numbersToExtract = input.nextInt();
		}

		System.out.println("You have choose to extract: " + numbersToExtract + " numbers");

		// genero la lista e il value che conterrà il numero generato randomicamente
		List<Integer> numbers = new ArrayList<>();

		// SISTEMA 2
		// Popolo l'array di numbers con dei numeri da 1 a 90
		for (int i = 0; i < 90;) {
			numbers.add(i, ++i);
		}

		// genero una seconda lista su cui assegnerò i valori dell'indice estratti
		List<Integer> extractedNumbers = new ArrayList<>();
		int randomPosition = 0;

		// estraggo randomicamente l'indice della lista di numeri di partenza, assieme
		// all'elemento presente in quella posizione
		// aggiungo l'elemento presente alla seconda lista di numeri estratti e lo
		// rimuovo dalla lista precedente
		for (int i = 0; i < numbersToExtract; i++) {
			randomPosition = (int) Math.ceil(Math.random() * (numbers.size()));

			int value = numbers.get(randomPosition);
			// assegna alla seconda array il numero estratto
			extractedNumbers.add(i, value);
			// rimuove dall'originale il numero estratto
			numbers.remove(randomPosition);
		}

		System.out.println("Extrated values:");
		for (Integer value : extractedNumbers) {
			System.out.print(value + " ");
		}

		
		/* // SISTEMA 1: popolo la lista di numberi finché non differiscono da numeri
		 * già presenti
		 * 
		 * // USANDO UN CICLO WHILE while(counter<numbersToExtract) { numberGenerated =
		 * r.nextInt(1, 91);
		 * 
		 * if(!numbers.contains(numberGenerated)) { numbers.add(numberGenerated);
		 * counter++; } else { continue; } }
		 * 
		 * // USANDO UN CICLO FOR for(int i=0; i<numbersToExtract;) { numberGenerated =
		 * r.nextInt(1, 91); if(!numbers.contains(numberGenerated)) {
		 * numbers.add(numberGenerated); i++; } }
		 * 
		 * // stampo la lista dei numeri generati for (Integer number : numbers) {
		 * System.out.print(number + " "); }
		 */
	}

}
