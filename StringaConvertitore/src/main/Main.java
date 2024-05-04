package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String valueToFormat = sc.nextLine();
		
		String charsToAccept = "abcdefghijklmnopqrstuvwxyz";
		String charsToCheck = charsToAccept + charsToAccept.toUpperCase();
		
		String formattedString = "";
		
		for (int i = 0; i < valueToFormat.length(); i++) {
			for (int j = 0; j < charsToCheck.length(); j++) {
				if(charsToCheck.toCharArray()[j] == valueToFormat.charAt(i)) 
				{
					formattedString += valueToFormat.charAt(i);
					break;
				}
			}
		}
		
		/*
		for (int i = 0; i < valueToFormat.length(); i++) {
			if((valueToFormat.toCharArray()[i] >= 65 && valueToFormat.toCharArray()[i] <= 90) || (valueToFormat.toCharArray()[i] >= 97 && valueToFormat.toCharArray()[i] < 122))
			{
				formattedString += valueToFormat.charAt(i);
			}
		}
		*/
		System.out.println(formattedString);
	}

}
