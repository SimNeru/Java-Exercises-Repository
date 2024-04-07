package arraysExercises;

import java.util.Scanner;

public class ExerciseSix {
	
	/*
	 * ES.6
	 * Scrivere un metodo booleano “appartiene” che data una stringa s ed un carattere c verifichi se c appare in s.
	 */
	
	public static void exerciseSix() 
	{
		Scanner input = new Scanner(System.in);
		String s = input.nextLine().toLowerCase();
		char c = 'h';
		char[] sArray = s.toCharArray();
		String output = belong(sArray, c) ? "The char BELONG to the given String" : "The char DOES NOT BELONG to the given String";
		System.out.println(output);
	}
	
	public static boolean belong(char[] charArrayArg, char charArg) 
	{
		for(int i=0; i<charArrayArg.length; i++) 
		{
			if (charArg==charArrayArg[i]) 
			{
				return true;
			}
		}
		return false;
	}
}
