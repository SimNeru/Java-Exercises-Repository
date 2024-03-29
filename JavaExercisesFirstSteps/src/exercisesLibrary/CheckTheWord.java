package exercisesLibrary;

import java.util.Random;
import java.util.Scanner;

public class CheckTheWord {
	
	public static void checkTheWord() 
	{
		Scanner input = new Scanner(System.in);
		String wordToFormat = input.nextLine();
		int wordLenght = wordToFormat.length();
		
		if (wordLenght%2==0) 
		{
			System.out.println(wordToFormat + " ha un numero di lettere PARI");
		} else 
		{
			System.out.println(wordToFormat + " ha un numero di lettere DISPARI");
		}
		
		Random r = new Random();
		int randomNumber = r.nextInt(1,10);
		System.out.println("Random è " + randomNumber);
		if (wordLenght==randomNumber) 
		{
			System.out.println("La parola è di un numero di caratteri PARI a " + randomNumber);
		}
		else if (wordLenght>randomNumber) 
		{
			System.out.println("La parola è più lunga di " + randomNumber + " caratteri");
		} else 
		{
			System.out.println("La parola è più corta di " + randomNumber + " caratteri");
		}
	}

}
