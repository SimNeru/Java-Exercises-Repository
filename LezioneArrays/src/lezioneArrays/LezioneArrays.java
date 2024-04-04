package lezioneArrays;

import java.util.Arrays;

public class LezioneArrays {

	public static void main(String[] args) {

		// Gli array sono contenitori di elementi simili tra loro (tipo identico,
		// valore diverso. Sono 0 - based

		String[] studenti = new String[12];
		studenti[0] = "Simone";
		studenti[1] = "Andrea";
		studenti[2] = "Fabio";
		studenti[3] = "Raffaele";
		studenti[4] = "Lannuce";
		studenti[5] = "Marco";
		studenti[6] = "Dannis";
		studenti[7] = "Enrico";
		studenti[8] = "Davide";
		studenti[9] = "Giada";
		studenti[10] = "Abderrahim";
		studenti[11] = "Erika";

		// Richiamo un valore attraverso il suo indice
		System.out.println(studenti[4]);

		// Stampo la proprietà lenght che fornisce la misura
		System.out.println("Num studenti in aula " + studenti.length);

		// Posso riassegnare un valore
		studenti[0] = "Simo";
		System.out.println(studenti[0]);

		// Stampo un array con ciclo for
		for (int i = 0; i < studenti.length; i++) {
			System.out.println(studenti[i]);
		}

		// Math.ceil serve per arrotondare
		int[] votes = new int[12];
		// Utilizzo per riempire un array
		for (int i = 0; i < votes.length; i++) {
			// voto minimo 18 e massimo 30
			double value = Math.ceil((Math.random() * 12) + 18);
			votes[i] = (int) value;
		}

		for (int i = 0; i < votes.length; i++) {
			System.out.println(studenti[i] + " " + votes[i]);
		}
		
		/////// MATRICE MULTIDIMENSIONALE ////////
		int[][] matrix = new int [5][6]; // [riga][colonna]
		int counter = 1;
		
		System.out.println(matrix.length); // riga
		System.out.println(matrix[0].length); // colonna
		
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix[i].length;j++) 
			{
				matrix[i][j] = counter;
				counter++;
			}
		}
		
		System.out.println("::::::::::::: STAMPO MATRICE :::::::::::::");
		for (int i=0;i<matrix.length;i++) 
		{
			for(int j=0; j<matrix[i].length; j++) 
			{
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("");
		}
		
		// ordinare un array
		String[] words = {"Ciao", "come", "stai", "tutto", "bene", "grazie"};
		
		Arrays.sort(words);
		
		for(int i=0; i<words.length;i++) 
		{
			System.out.println(words[i]);
		}
	}

}
