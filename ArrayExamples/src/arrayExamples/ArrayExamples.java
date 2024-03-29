package arrayExamples;

import java.util.Random;

public class ArrayExamples {

	public static void main(String[] args) {
		
		int[] firstArray = new int [10];
		firstArray[0]=1;
		firstArray[1]=2;
		firstArray[2]=3;
		int test;
		
		System.out.println(firstArray[1]); //stampo la posizione 2
		
		// se non specificato i valori numerici valgono 0
		// i booleani valgono false
		// stringhe valgono ""
		
		System.out.println(firstArray[8]); //print 0, perché non assegnata manualmente ma di default con lo 0
		// System.out.println(firstArray[10]); errore perché non esiste la pos 10
		
		String[] musicalNotes = new String[7];
		musicalNotes[0] = "do";
		musicalNotes[1] = "re";
		musicalNotes[2] = "mi";
		musicalNotes[3] = "fa";
		musicalNotes[4] = "sol";
		musicalNotes[5] = "la";
		musicalNotes[6] = "si";

		int lenght = musicalNotes.length; //proprietà (array posizioni + 1)
		System.out.println("L'array è lungo "+ lenght); // 7 sono gli spazi riempibili
		
		// altro metodo per creare valori in un array
		String[] colors = {"white", "nero", "yellow", "blue", "green", "red"}; //(array posizioni + 1 = 6) - 2(-1 ultimo -> -1 penultimo) = 
		System.out.println(colors[2]);
		System.out.println(colors[colors.length-2] + "\n");
		
		for (int i=0; i<colors.length; i++) 
		{
			System.out.print(colors[i] + " ");
		}
		System.out.println("");
		
		//forEach (per ogni)
		for (String color : colors) 
		{
			System.out.print(color + " ");
		}
		System.out.println("");
		
		//dichiaro array di 5 elementi
		int[] arr = new int[5];
		//li assegno con il valore di indice di posizione
		for (int i=0; i<5; i++) 
		{
			arr[i]=i;
		}
		//stampo con un forEach senza indice
		for (int values : arr) 
		{
			System.out.print(values + " ");
		}
		System.out.println("");
		
		//stampo con indici
		for (int i=0; i<arr.length;i++) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		
		//popolo array con dei numeri Casuali
		Random r = new Random();
		int[] randomizedArray = new int[10];
		for (int i=0; i<randomizedArray.length; i++) 
		{
			randomizedArray[i] = r.nextInt(1,11);
			System.out.print(randomizedArray[i] + " ");
		}
	}
}