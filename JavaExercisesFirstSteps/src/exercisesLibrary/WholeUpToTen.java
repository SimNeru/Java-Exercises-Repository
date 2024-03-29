package exercisesLibrary;

import java.util.Random;

public class WholeUpToTen {

	public static void wholeUpToTen() {
		Random r = new Random();
		int number = r.nextInt(1, 41);
		System.out.println("Random is: " + number);
		int cyclesCounter = 0;
		int whole = 0;

		// Ricava il numero di volte da ciclare, estrapolando solo la cifra decimale del
		// numero generato
		double castedToDouble = (double) number;
		// System.out.println(castedToDouble);
		castedToDouble /= 10;
		// System.out.println(castedToDouble);
		int timesToCicle = (int) castedToDouble;
		// System.out.println(timesToCicle);

		do {
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + " ");
				if (i == 10) {
					System.out.println("");
					whole++;
					break;
				}
				;
			}
			cyclesCounter++;
		} while (timesToCicle > cyclesCounter);

		System.out.println("Total wholes: " + whole);
	}
}
