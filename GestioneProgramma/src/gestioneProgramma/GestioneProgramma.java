package gestioneProgramma;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class GestioneProgramma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert your age: ");
		
		int age = Integer.parseInt(scanner.nextLine());
		
		if (age >= 18) 
		{ System.out.println("You shall pass!"); }
		else { System.out.println("You shall not pass!");}
		System.out.println("//////////////////////////////////////////////////////////");
		scanner.nextLine();

		int num = 5;
		if (num>5) 
		{ System.out.println("number is above 5"); } 
		else if (num==5)
		{ System.out.println("number is 5"); } 
		else 
		{ System.out.println("number is less than 5"); }
		System.out.println("//////////////////////////////////////////////////////////");
		
		System.out.println("Input a room temperature..");
		double temp = scanner.nextDouble();
		if (temp>=30) {System.out.println("Turn ON air conditioner..");}
		else if (temp<=15) {System.out.println("Turn OFF air conditioner..");}
		else {System.out.println("Standby..");}
		System.out.println("//////////////////////////////////////////////////////////");
		scanner.nextLine();
		
		//chiedere due numeri da dividere secondo 0 errore all'utente
		System.out.println("Digit first number to divide:");
		double x = scanner.nextDouble();
		System.out.println("Digit second number to divide:");
		double y = scanner.nextDouble();
		scanner.nextLine();
		if(y==0) 
		{
			System.out.println("Can't provide a division by 0");
		} 
		else 
		{ 
			double result = x / y;
			System.out.println(x + " / " + y + " = " + result);
		}
		System.out.println("//////////////////////////////////////////////////////////");
		
		System.out.println("Is EVEN or ODD?\nInsert a number: ");
		int a = scanner.nextInt();
		if(a%2 == 0) {System.out.println(a + " is an EVEN number");}
		else System.out.println(a + " is an ODD number");
		scanner.nextLine();
		
		System.out.println("//////////////////////////////////////////////////////////");

	    int hour = LocalTime.now().getHour();
	    System.out.println(hour);
	    String greetings;
	    
	    if(hour<12) {greetings ="Goodmorning";}
	    else if(hour<18) {greetings ="Goodafternoon";}
	    else if(hour<22) {greetings ="Goodevening";}
	    else {greetings ="Goodnight";}

	    System.out.println(greetings);
	    
	    System.out.println("//////////////////////////////////////////////////////////");
	}
}