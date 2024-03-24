package passwordGenerator;

import java.util.Random;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		System.out.println(":::WELCOME TO PASS GENERATOR:::");
		
		Random random = new Random();
		String finalString = "";
		
		for (int i = 0; i < 10; i++) 
		{
			int randomInt = random.nextInt(33, 127);
			char assignedChar = (char)randomInt;
			finalString += assignedChar;
		}
		
		System.out.println("This is the password of ten printable characters: \n" + finalString);
	}
}