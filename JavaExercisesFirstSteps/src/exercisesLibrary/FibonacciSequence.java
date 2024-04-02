package exercisesLibrary;

import java.util.Random;

public class FibonacciSequence {

	public static void fibonacciSequence() 
	{
		Random r = new Random();
		long generatedNumber = r.nextLong(0,21);
		generatedNumber = 50;
		System.out.println("GENERATO: " + generatedNumber);
		long x = 0;
		long y = 0;
		boolean alternate = true;
		
		for (long i=0; i<generatedNumber; i++) 
		{
			if(generatedNumber == 0) 
			{
				System.out.println("Error cannot input 0");
				return;
			}
			
			if(y==0) 
			{
				System.out.println(1);
				y++;
			} 
			
			else if(alternate) 
			{
				x+=y;
				System.out.println(x);
				alternate = false;
			}
			
			else
			{
				y+=x; //5+8 y=13
				System.out.println(y);
				alternate = true;
			}
		}
	}
}
