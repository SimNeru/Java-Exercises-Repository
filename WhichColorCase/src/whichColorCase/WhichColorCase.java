package whichColorCase;

import java.util.Random;
import java.util.Scanner;

public class WhichColorCase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		Random random = new Random();
		int generatedInt = random.nextInt(4,19);
		
		System.out.println("Il numero generato è: " + generatedInt);
		boolean isOdd = generatedInt%2 == 0 ? false : true;
		String output;
		
		if (isOdd && generatedInt != 12) 
		{
			output = "Giallo!";
		} else if (!isOdd && generatedInt != 12)
		{
			output = "Rosso!";
		} else 
		{
			output = "Blu!";
		}
		System.out.println(output);
		System.out.println("");
		
		System.out.println("Wanna generate another number? Y or N?");
		String input = scanner.nextLine().toLowerCase();
		System.out.println("");
		if (input.equals("n")) {return;}
		}
	}
}