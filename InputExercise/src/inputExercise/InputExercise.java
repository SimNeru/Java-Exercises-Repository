package inputExercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputExercise {

	public static void main(String[] args) {
		
		menu();

	}

	private void firstExercise() {
		System.out.println(":::Welcome to sum and moltiplication:::");
		boolean condition = true;

		do {
			Scanner input = new Scanner(System.in);

			System.out.println("Digit first number:");
			int firstNumber = input.nextInt();

			System.out.println("Digit second number:");
			int secondNumber = input.nextInt();
			input.nextLine();

			int sumResult = firstNumber + secondNumber;
			int multiplicationResult = firstNumber * secondNumber;

			System.out.println("Sum result is: " + sumResult);
			System.out.println("Multiplication result is: " + multiplicationResult);

			System.out.println("Would you like to do another operation? Type Y or N");
			String request = input.nextLine().toLowerCase();

			if (request.equals("n")) {
				condition = false;
			}

		} while (condition);
	}

	private void secondExercise() {
		System.out.println(":::Welcome to four digit sum:::");
		boolean condition = true;

		do {
			Scanner input = new Scanner(System.in);
			int tot = 0;

			System.out.println("Digit first number:");
			tot = input.nextInt();

			System.out.println("Digit second number:");
			tot += input.nextInt();

			System.out.println("Digit third number:");
			tot += input.nextInt();

			System.out.println("Digit fourth number:");
			tot += input.nextInt();
			input.nextLine();

			System.out.println("Total is: " + tot);

			System.out.println("Would you like to do another operation? Type Y or N");
			String request = input.nextLine().toLowerCase();

			if (request.equals("n")) {
				condition = false;
			}

		} while (condition);
	}

	private void thirdExercise() {
		boolean condition = true;
		System.out.println(":::Welcome to the Centigrades to Kelvin converter:::");

		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Please digit the centigrade's temperature to convert:");
			double centigradesToKelvin = input.nextDouble();
			centigradesToKelvin += 273.15;
			System.out.println(centigradesToKelvin + " Kelvin");
			input.nextLine();

			System.out.println("Would you like to do another operation? Type Y or N");
			String request = input.nextLine().toLowerCase();

			if (request.equals("n")) {
				condition = false;
			}

		} while (condition);
	}

	private void fourthExercise() {
		System.out.println(":::Welcome to hours to minutes converter:::");
		System.out.println("Digit an hour to convert into minutes");
		while (true) {
			Scanner input = new Scanner(System.in);
			double hoursToMinutes = input.nextDouble();
			int roundedMinutes = (int)(hoursToMinutes * 60);
			System.out.println(hoursToMinutes + " hours are equal to " + roundedMinutes + " minutes");
			input.nextLine();

			System.out.println("Would you like to do another operation? Type Y or N");
			String request = input.nextLine().toLowerCase();

			if (request.equals("n")) {
				return;
			}
		}
	}
	
	private void fifthExercise()
	{
		System.out.println("");
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("'Oggi è il' dd/MM/yyyy'. Sono le ore 'hh:mm:ss 'di 'EEEE");
		System.out.println(localDateTime.format(formatterDate));
		System.out.println("");
		String myString = "Java è un bel linguaggio di programmazione";
		System.out.println(myString);
		int x = (myString.indexOf("linguaggio"));
		System.out.println("La parola linguaggio si trova sulla posizione: " + x);
		int y = myString.length();
		System.out.println("L'ultimo carattere si trova in posizione: " + y);
		String formattedString = myString.substring(x);
		System.out.println("La frase formattata è: " + formattedString);
		System.out.println();
	}

	private static void menu() {
		System.out.println(":::WELCOME TO THE EXERCISE'S MENU:::");

		while (true) {
			System.out.println("");
			System.out.println("Digit the number of an exercise you would like to execute:");
			System.out.println("(1) Sum and moltiplication\n(2) Sum of 4 digits\n(3) Celsius's to Kelvin's converter\n(4) Hour's to minutes converter\n(5) String Date exercise\n(0) Close the program");
			Scanner input = new Scanner(System.in);
			int exerciseNumber = input.nextInt();

			InputExercise istance = new InputExercise();

			switch (exerciseNumber) {
			case 1:
				istance.firstExercise();
				break;
			case 2:
				istance.secondExercise();
				break;
			case 3:
				istance.thirdExercise();
				break;
			case 4:
				istance.fourthExercise();
				break;
			case 5:
				istance.fifthExercise();
				break;
			case 0:
				return;
			default:
				System.out.println("Please digit a valid number");
				break;
			}
		}
	}
}
