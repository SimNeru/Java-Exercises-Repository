package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExercises {
	
	/* Crea arrayList di nomi comuni di persona(10) X
	 * Ordina alfabeticamente X
	 * Stampa i nomi in console con l'indice a fianco X
	 * Stampa il numero di elementi presenti nell'arrayList X
	 * Rimuovi tutti gli elementi dall'arrayList (con metodo opportuno) X
	 * Controlla se l'ArrayList è vuoto (con metodo opportuno)-+
	 * ATT// Metodi appratententi ad ArrayList
	 */

	public static void main(String[] args) {
		
		// creo la lista e la popolo
		ArrayList<String> names = new ArrayList<>(
				Arrays.asList("Mario", "Luigi", "Peach", "Daisy", "Yoshi", "Toad", "Wario", "Bowser", "Donkey", "Shyguy"));

		// ordino alfabeticamente
		System.out.println("Ordinando i valori nell'array alfabeticamente");
		Collections.sort(names);
		
		// stampo per iniziale e a fianco la posizione
		for (int i=0; i<names.size();i++) 
		{
			System.out.print(i + " " + names.get(i) + " ");
		}
		
		int counterElements = 0;
		// stampo il numero di elementi presenti
		for (int i=0; i<names.size();i++) 
		{
			counterElements++;
		}
		System.out.println("\nDentro ci sono " + counterElements + " elementi");
		
		// rimuove tutti gli elementi
		names.removeAll(names);
		System.out.println("Rimuovo gli elementi");
		
		// controllo se l'array è vuoto
		boolean check = names.isEmpty();
		System.out.println("L'array è vuoto? " + check);
	}
}
