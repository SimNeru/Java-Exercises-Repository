package exercisesLibrary;

import java.util.Scanner;

public class Asterisks {
	
	public static void asterisk() 
	{
		System.out.println("Digit a number to indicate how many rows of asteriks you want to get..");
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		String asteriskSting = "*";
		
		if (rows < 0) {System.out.println("Error must digit a positive number"); return;}
		
		System.out.println("There is the corrisponding triangle..");
		while (rows > 0) 
		{
			System.out.println(asteriskSting);
			asteriskSting += " *";
			rows--;
		}
	}
	
	public static void asteriskWithFor() 
	{
		System.out.println("Digit a number to indicate how many rows of asteriks you want to get..");
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		if (rows < 0) {System.out.println("Error must digit a positive number"); return;}
		
		for(int i=0; i<rows; i++) 
		{
			for (int j=0;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
