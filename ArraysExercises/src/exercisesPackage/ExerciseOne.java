package exercisesPackage;

import java.util.Scanner;

public class ExerciseOne {
	/*
	 	ES.1
		Scrivere un programma che visualizzi sullo schermo del terminale il vostro nome all’interno di un
		rettangolo, come nell’esempio seguente:
		+ - - - +
		| Dario |
		+ - - - +
		*/

	public static void printMyName() 
	{
		// definisco le variabili per conservare la stringa e la misura della sua lunghezza 
		// aggiustata per gli apici che serviranno nell'array
	    Scanner input = new Scanner(System.in);
	    String nameVar = input.nextLine();
	    int lengthArrayColumns = nameVar.length()+2;
	    
	    // condizione che termina il programma se il nome eccede il massimo per un array
	    if(lengthArrayColumns>12) 
	    {
	    	System.out.println("Sorry your name too long can't print it :(");
	    	return;
	    }
	    
	    // creo l'array con una lunghezza righe default e lunghezza colonne variabili
	    char[][] arrayName = new char[3][lengthArrayColumns];
	    // casto la stringa del nome ad un array di char
	    char[] orginalCharArray = nameVar.toCharArray();

	    // assegno i valori di default nell'array
	    arrayName[0][0] = '+'; // [riga][colonna]
	    arrayName[0][lengthArrayColumns-1] = '+';
	    arrayName[2][0] = '+';
	    arrayName[2][lengthArrayColumns-1] = '+';
	    
	    arrayName[1][0] = '|';
	    arrayName[1][lengthArrayColumns-1] = '|';
	    
	    // assegno i valori di default nell'array che si alternano 
	    // in base alla positività o negatività dell'indice
	    for(int i=1; i<lengthArrayColumns-1;i++) 
	    {
	    	if(i%2==0) 
	    	{
	    		arrayName[0][i] = '-';
	    	}
	    	else
	    	{
	    		arrayName[0][i] = ' ';
	    	}
	    	
	    	if(i%2==0) 
	    	{
	    		arrayName[2][i] = '-';
	    	}
	    	else
	    	{
	    		arrayName[2][i] = ' ';
	    	}
	    }
	    
	    // inizio ad assegnare i valori char del nome sulla stessa riga e su colonna variabile
		int position = 0;
		for(int i=1; i<lengthArrayColumns-1;i++) 
		{
			arrayName[1][i] = orginalCharArray[position];
			position++;
		}
	    
		// eseguo un ciclo nestato per stampare tutti i valori presenti nell'array 
		// a seconda della posizione delle righe e delle colonne con l'aiuto degli indici
		for(int i=0;i<arrayName.length;i++) 
	    {
	    	for(int j=0;j<arrayName[i].length;j++) 
	    	{
	    		System.out.print(arrayName[i][j]);
	    	}
	    	System.out.println("");
	    }
	}
}
