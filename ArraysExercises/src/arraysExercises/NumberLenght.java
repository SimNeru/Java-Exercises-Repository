package arraysExercises;

import java.util.Scanner;

public class NumberLenght {
	
	/*ES.2
	Scrivi un programma che inserito un numero intero restituisca in uscita da quante cifre è formato.*/

	public static void numberLenght() 
	{
		Scanner input = new Scanner(System.in); 
		System.out.println("Please input a number..");
		int value = input.nextInt();
		int storeValue = value;
		input.nextLine();
		int counter = 0;
		
		do 
		{
			value/=10;
			counter++;
		} 
		while (value>0);
		
		System.out.println(storeValue + " is long " + counter + " digits");
	}
}

