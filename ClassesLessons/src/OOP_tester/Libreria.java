package OOP_tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import OOP_model.Libro;

public class Libreria {

	public static void main(String[] args) {

		// creo uno scaffale array che conterrà gli oggetti di tipo libro
		ArrayList<Libro> scaffale = new ArrayList<Libro>();

		// creo un nuovo libro e lo inserisco nello scaffale
		ArrayList<String> generiLibro1 = new ArrayList<String>();
		generiLibro1.add("Fantasy");
		generiLibro1.add("Avventura");

		ArrayList<String> generiLibro2 = new ArrayList<String>();
		generiLibro2.add("Fantasy");
		generiLibro2.add("Avventura");

		// creo l'oggetto libro da inserire nello scaffale
		Libro libro1 = new Libro("Il signore degli anelli", "J.R.Tolkien", generiLibro1, 1200, "Utet", false, 16.80);
		Libro libro2 = new Libro("Il visconte dimezzato", "I.Calvino", generiLibro2, 150, "Feltrinelli", true, 12.50);

		// richiamo il metodo add per aggiungere l'oggetto libro alla lista
		scaffale.add(libro1);
		scaffale.add(libro2);

		// foreach per stampare ciascun libro presente sullo scaffale
		for (Libro libro : scaffale) {
			System.out.println(libro.toString());
		}

		Scanner input = new Scanner(System.in);
		System.out.println(
				"digita 's' per stampare tutti i libri sullo scaffale\ndigita 't' per cercare un titolo sullo scaffale");
		String comand = input.nextLine();
		int counter = 0;

		while (!comand.equals("0")) {
			System.out.println(
					"digita 's' per stampare tutti i libri sullo scaffale\ndigita 't' per cercare un titolo sullo scaffale");
			comand = input.nextLine();
			if (comand.equals("t")) {
				System.out.println("inserisci un titolo");
				String titoloInput = input.nextLine();
				for (Libro libro : scaffale) {
					if (libro.titolo.equals(titoloInput)) {
						System.out.println(libro.toString());
						counter++;
					}
				}

				if (counter == 0) {
					System.out.println("il titolo non è presente");
				}

			} else if (comand.equals("s")) {
				System.out.println("stampo tutti i libri");
				for (Libro libro : scaffale) {
					System.out.println(libro.toString());
				}
			} else {
				System.out.println("feature non implementata");
			}

			System.out.println("Digit 0 to end or any other digit to perform another operation");
			comand = input.nextLine();
		}
	}

}
