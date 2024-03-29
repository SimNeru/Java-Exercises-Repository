package exercisesLibrary;

import java.util.Scanner;

public class Counter {
	
	public static void counter() 
	{
		System.out.println("Digit a number >= 0, which indicates when i'll stop to count..");
		Scanner input = new Scanner(System.in);
		int limit = input.nextInt();
		int counterVar = 0;
		
		if (limit < 0) {
			System.out.println("Error, insert a number above or equal to 0"); 
			return;
			}
		
		do 
		{
			System.out.print(" "+ counterVar); 
			counterVar++;
		} while (counterVar <= limit);
		
	}

}
