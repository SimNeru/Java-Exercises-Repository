package cicli;

import java.util.Iterator;
import java.util.Random;

public class Cicli {

	public static void main(String[] args) {

		// Ciclo che stampa 10 volte
		// firstCycle();

		// Ciclo che stampa numeri da 1 a 10 Crescente
		// secondCycle();

		// Ciclo che stampa numeri da 1 a 10 Decrescente
		// thirdCycle();

		// Ciclo che stampa i numeri pari da 1 a 10
		// fourthCycle();

		// Ciclo che stampa i numeri dispari da 1 a 10
		// fifthCycle();

		// Ciclo che stampa char da 33 a 256
		// sixthCycle();

		// Ciclo senza variabile interna e incremento definito esternamente
		// seventhCycle();

		// Stampa doppia variabile con una sola condizione di ciclo e doppio incremento
		// eightCycle();

		// Stampa ciascun singolo char presente in una Stringa
		// ninthCycle();

		// Stampa quanti char "spazio" presenti in una String
		// tenthCycle();

		// Stampa se un numero generato random si può trovare su un ciclo incrementale di 10 cifre
		// eleventhCycle();
		
		// Nested for che stampa la moltiplicazione per sé stesso di un ciascun numero
		//twelvethCycle(); 
		
		// Introduzione while
		//thirteenthCycle();
		
		// Introduzione do While
		// fourteenthCycle();
		
		// Char print with While
		// fifteenthCycle();
		
		// Ciclo da 1 fino a 10
		sixteenthCycle();
	}

	public static void firstCycle() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " HELLO");
		}
	}

	public static void secondCycle() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}

	public static void thirdCycle() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}

	public static void fourthCycle() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void fifthCycle() {
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
	}

	public static void sixthCycle() {
		for (int i = 32; i <= 257; i++) {
			char castedVar = (char) i;
			System.out.print(castedVar);
		}
	}

	public static void seventhCycle() {
		int counter = 0;

		for (; counter <= 10;) {
			System.out.println(counter);
			counter++;
		}
	}

	public static void eightCycle() {
		for (int i = 0, j = 10; i <= 10; i++, j--) {
			System.out.println("i=" + i + "  |  j=" + j);
		}
	}

	public static void ninthCycle() {
		String a = "ciao a tutti";
		for (int i = 0; i < a.length(); i++) {
			System.out.print("[" + a.charAt(i) + "]");
		}
		;
	}

	public static void tenthCycle() {
		String originalString = "in questa frase ci sono tot spazi:";
		int counter = 0;
		for (int i = 0; i < originalString.length(); i++) {
			if (originalString.charAt(i) == ' ') {
				counter++;
			}
		}
		System.out.println(originalString + " " + counter);
	}

	public static void eleventhCycle() {
		Random random = new Random();
		int x = random.nextInt(1, 21);
		System.out.println(x);
		boolean found = false;

		for (int i = 1; i <= 10; i++) {
			// System.out.println(i);
			if (i == x) {
				found = true;
				break;
			}
		}
		System.out.println(found ? "Il numero è stato trovato" : "Il numero non è stato trovato");
	}

	public static void twelvethCycle() 
	{
		for(int i=1; i<=10; i++) 
		{
			for(int j=1; j<=10; j++) 
			{
				int result = i*j;
				System.out.print("\t| " + result);
			}
			System.out.println("");
		}
	}

	public static void thirteenthCycle() {
		int counter = 0;
		while (counter<=10) {
			System.out.print(counter + " ");
			counter++;
		}
	}
	
	public static void fourteenthCycle() {
		int counter = 0;
		do {
			System.out.print(counter + " ");
			counter++;
		} while (counter<=10);
	}
	
	public static void fifteenthCycle() {
		int i = 32;
		while (i<255) 
		{
			char character = (char) i ;
			System.out.print(character);
			i++;
		}
	}

	public static void sixteenthCycle() {
		for (int j = 0; j <= 10; j++) 
		{
			if (j==5) 
			{
				continue; // salta il ciclo
			}
			System.out.print(j);
		}
	}
}