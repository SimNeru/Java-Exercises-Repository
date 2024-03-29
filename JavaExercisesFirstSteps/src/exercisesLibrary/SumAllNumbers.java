package exercisesLibrary;

import java.util.Scanner;

public class SumAllNumbers {

	public static void sumAllNumbers() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Digit a number limit to sum each other number present..");
		int storedInput = input.nextInt();
		int sumResult = 0;
		
		for (int i=0; i<=storedInput; i++) 
		{
			System.out.print(sumResult + " + " + i + " = ");
			sumResult+=i;
			System.out.println(sumResult);
		}
		System.out.println("Total = " + sumResult);
	}
	
	public static void sumHowManyNumbers() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Digit a number limit to sum each other number present..");
		int storedInput = input.nextInt();
		int counter = 0;
		int sumResult = 0;
		
		if(storedInput<0) {System.out.println("Error input is a negative number"); return;}
		
		while(counter<storedInput) 
		{
			System.out.println("Digit the number..");
			int varToSum = input.nextInt();
			sumResult += varToSum;
			counter++;
		}
		System.out.println("Total = " + sumResult);
	}
}

/*
0 + 0 = 0
0 + 1 = 1
1 + 2 = 3
3 + 3 = 6
6 + 4 = 10*/
