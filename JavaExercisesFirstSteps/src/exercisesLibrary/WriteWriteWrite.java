package exercisesLibrary;

import java.util.Scanner;

public class WriteWriteWrite {
	
	public static void writeWriteWrite() 
	{
		System.out.println("Digit a number which indicates how many cycles you want to do..");
		Scanner input = new Scanner(System.in);
		int ciclesToDo = input.nextInt();
		int counter = 0;
		
		if (ciclesToDo <= -1)
		{
			System.out.println("Error you must insert a positive number");
		} else { 
			for (int i = 0; i < ciclesToDo; i++) 
			{
				counter++;
				System.out.println("I'm cicling " + counter);
			};
		}
	}

}
