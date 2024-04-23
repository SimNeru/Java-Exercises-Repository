package a_esercitazioneClasse;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		boolean condition = true;
		
		while(condition) {
			
			Scanner s = new Scanner(System.in);
			baseMessage();
			
			String input = s.nextLine();
			double x = 0;
			double y = 0;
			Calcolatrice c = new Calcolatrice(x, y);
			
			switch (input) {
			case "+": 
				System.out.println("Digit two numbers..");
				x = s.nextDouble();
				y = s.nextDouble();
				c = new Calcolatrice(x, y);
				System.out.println("Your object is: " + c);
				System.out.println("Sum result: " + c.sum());
				break;
			
			case "-": 
				System.out.println("Digit two numbers..");
				x = s.nextDouble();
				y = s.nextDouble();
				c = new Calcolatrice(x, y);
				System.out.println("Your object is: " + c);
				System.out.println("Subtraction result: " + c.sub());
				break;
			
			case "*": 
				System.out.println("Digit two numbers..");
				x = s.nextDouble();
				y = s.nextDouble();
				c = new Calcolatrice(x, y);
				System.out.println("Your object is: " + c);
				System.out.println("Multiplication result: " + c.mul());
				break;
			
			case "/": 
				System.out.println("Digit two numbers..");
				x = s.nextDouble();
				y = s.nextDouble();
				c = new Calcolatrice(x, y);
				System.out.println("Your object is: " + c);
				System.out.println("Division result: " + c.div());
				System.out.println("Spare result: " + c.spare());
				break;
			
			case "0": 
				System.out.println("Bye!");
				condition = false;
				break;
			
			default: 
				System.out.println("Please digit a proper input");
				break;
			} 
		}
	}

	public static void baseMessage() 
	{
		System.out.println("Select which operation you would like to do:");
		System.out.println("+) to execute a Sum");
		System.out.println("-) to execute a Subtraction");
		System.out.println("*) to execute a Multiplication");
		System.out.println("/) to execute a Division");
		System.out.println("0) to exit");
	}
}
