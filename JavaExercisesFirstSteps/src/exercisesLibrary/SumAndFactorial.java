package exercisesLibrary;

import java.util.Scanner;

public class SumAndFactorial {

	public static void sumAndFactorial() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Digit a number limit to sum each other number present..");
		int storedInput = input.nextInt();
		int sumResult = 0;
		int factorialResult = 1;
		
		for (int i=0; i<=storedInput; i++) 
		{
			System.out.print(sumResult + " + " + i + " = ");
			sumResult+=i;
			System.out.println(sumResult);
		}
		
		for (int i=1; i<=storedInput; i++) 
		{
			System.out.print(factorialResult + " x " + i + " = ");
			factorialResult*=i;
			System.out.println(factorialResult);
		}
		System.out.println(" \nSum = " + sumResult + "\nFactorial = " + factorialResult);
	}
}
