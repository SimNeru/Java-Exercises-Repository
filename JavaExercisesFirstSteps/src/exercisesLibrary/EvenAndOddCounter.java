package exercisesLibrary;

import java.util.Random;

public class EvenAndOddCounter {

	public static void evenAndOddCounter() 
	{
		Random r = new Random();
		int numberLimit = r.nextInt(0,101);
		System.out.println("The random is: " + numberLimit);
		int evenTotal = 0;
		int oddTotal = 0;
		
		for (int i=1; i<=numberLimit; i++) 
		{
			if(i%2 == 0) 
			{evenTotal++;} 
			else 
			{oddTotal++;}
		}
		System.out.println("Total even number: " + evenTotal + "\nTotal odd number: " + oddTotal);
	}
}
