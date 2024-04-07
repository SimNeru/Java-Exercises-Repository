package exercisesPackage;

import java.util.Scanner;

public class ExerciseFourteen {

	/*
	 * ES.14 Scrivi un programma che stampa tutti gli interi da 1 a 100. Per i
	 * multipli di 3 stampa “Ciao”, per i multipli di 5 stampa “Mondo”. Per i
	 * multipli sia di 3 , sia di 5 stamperà “Ciao, Mondo”
	 */

	public static void exerciseFourteen() {

		String hello = "Ciao";
		String world = "Mondo";
		String helloWorld = "Ciao, Mondo";

		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println(helloWorld);
					continue;
				}
				System.out.println(hello);
			}

			if (i % 5 == 0) {
				System.out.println(world);
			} else {
				System.out.println(i);
			}
		}
	}
}