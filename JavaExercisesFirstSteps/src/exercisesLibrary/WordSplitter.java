package exercisesLibrary;

import javax.print.attribute.standard.JobOriginatingUserName;

public class WordSplitter {

	public static void wordSplitter() {
		String stringToFormat = "tanto va la gatta al lardo che ci lascia lo zampino";

		for (int i = 0; i < stringToFormat.length(); i++) {
			if (stringToFormat.charAt(i) == ' ') {
				System.out.print("\n");
			} else {
				System.out.print(stringToFormat.charAt(i));
			}
		}
	}

	public static void wordSplitterTwo() {
		// Converto una stringa in un array
		String stringToFormat = "tanto va la gatta al lardo che ci lascia lo zampino";
		char[] originalCharArray = stringToFormat.toCharArray();

		// ciclo array e sostituisco il char
		for (int i = 0; i < originalCharArray.length; i++) {
			if (originalCharArray[i] == ' ') {
				originalCharArray[i] = '\n';
			}
			System.out.print(originalCharArray[i]);
		}

		// Converte un Array di char in una Stringa
		System.out.println("\n \nTRAMITE CONVERSIONE DI ARRAY CHAR IN STRINGA");
		String formattedString = new String(originalCharArray);
		System.out.println(formattedString);
	}

	public static void revertingString() {
		String stringToFormat = "tanto va la gatta al lardo che ci lascia lo zampino";
		char[] originalCharArray = stringToFormat.toCharArray();
		char[] revertedCharArray = new char[originalCharArray.length];
		int indexForRevertedCharArray = 0;

		for (int i = originalCharArray.length - 1; i >= 0; i--) {
			revertedCharArray[indexForRevertedCharArray] = originalCharArray[i];
			indexForRevertedCharArray++;
		}
		String formattedString = new String(revertedCharArray);
		System.out.println(formattedString);
	}

	// Rimuove gli spazi e splitta una stringa in char a seconda della posizione
	// pari o dispari
	public static void stringSplitEvenAndOdd() {
		String stringToFormat = "tanto va la gatta al lardo";
		char[] originalCharArray = stringToFormat.toCharArray();
		int lenghtForFormattedArray = originalCharArray.length;

		// cicla e conta quanti spazi vuoti ci sono in totale per numerizzare
		// correttamente gli spazi per l'array da formattare
		for (int i = 0; i < originalCharArray.length - 1; i++) {
			if (originalCharArray[i] == ' ') {
				lenghtForFormattedArray--;
			} else {
				continue;
			}
		}

		// cicla e rimuove COMPLETAMENTE gli spazi dall'array in uno nuovo senza spazi
		char[] formattedCharArray = new char[lenghtForFormattedArray];
		int indexOfArray = 0;
		for (int i = 0; i < originalCharArray.length; i++) {
			if (originalCharArray[i] != ' ') {
				formattedCharArray[indexOfArray] = originalCharArray[i];
				indexOfArray++;
			}
		}
		String formattedString = new String(formattedCharArray);
		System.out.println(formattedCharArray);
		System.out.println(formattedCharArray.length);

		// crea due array separati per contenere i caratteri a seconda della posizione
		// pari o dispari
		char[] oddArray = new char[(formattedCharArray.length + 1) / 2];
		char[] evenArray = new char[(formattedCharArray.length + 1) / 2];
		int evenPosition = 0;
		int oddPosition = 0;

		// assegna a due array separati la posizione pari o dispari
		for (int i = 0; i < formattedCharArray.length; i++) {
			if (i % 2 == 0) {
				evenArray[evenPosition] = formattedCharArray[i];
				evenPosition++;
			} else {
				oddArray[oddPosition] = formattedCharArray[i];
				oddPosition++;
			}
		}
		// converte nuovamente gli array in stringhe
		String formattedStringEven = new String(evenArray);
		String formattedStringOdd = new String(oddArray);
		// stampa le stringhe
		System.out.println(formattedStringEven);
		System.out.println(formattedStringOdd);
	}

	public static void printStringEvenAndOdd() {
		String stringToFormat = "tanto va la gatta al lardo";

		for (int i = 0; i < stringToFormat.length(); i += 2) {
			if (stringToFormat.charAt(i) != ' ') {
				System.out.print(stringToFormat.charAt(i) + " ");
			}
		}

		System.out.println("");

		for (int i = 1; i < stringToFormat.length(); i += 2) {
			if (stringToFormat.charAt(i) != ' ') {
				System.out.print(stringToFormat.charAt(i) + " ");
			}
		}
	}

	public static void printEachThreeChars() {
		String stringToFormat = "tantovalagattaallardo";

		for (int i = 0; i < stringToFormat.length() - 1;) {
			int counter = 0;
			while (counter < 3) {
				System.out.print(stringToFormat.charAt(i));
				i++;
				counter++;
			}
			System.out.println("");
		}
	}

	public static void printOneCharacterEachThree() {
		String stringToFormat = "tantovalagattaallardo";

		for (int i = 0; i < stringToFormat.length();) {
			int counter = 0;
			do {
				if (counter != 3) {
					System.out.print(stringToFormat.charAt(i++));
					counter++;

					if (i == stringToFormat.length()) {
						return;
					} else {
						continue;
					}
				} else {
					System.out.println("\n" + stringToFormat.charAt(i++));
					counter++;
				}
			} while (counter < 4);
		}
	}
	
	public static void wordsCounter() 
	{
		String stringToFormat = "tanto va la gatta al lardo";
		int counter = 0;
		
		for(int i=0; i<stringToFormat.length(); i++) 
		{
			if(stringToFormat.charAt(i) == ' ')
			{
				counter++;
			}
		}
		System.out.println(counter + " spazi");
		
	}
}
