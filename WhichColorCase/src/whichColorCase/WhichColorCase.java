package whichColorCase;

import java.util.Random;

public class WhichColorCase {

	public static void main(String[] args) {

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
	}
}