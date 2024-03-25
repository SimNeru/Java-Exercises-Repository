package findTheWord;

import java.util.Scanner;

public class FindTheWord {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a sentence where i'll have to search a word in:");
		String sentenceInput = input.nextLine();
		System.out.println("Which word would you like to retrive?");
		String wordInputToRetrive = input.nextLine();
		String output;
		boolean condition = sentenceInput.contains(wordInputToRetrive) ? true : false; 
		
		if (condition) 
		{
			int position = sentenceInput.indexOf(wordInputToRetrive);
			output = "The word " + "'" + wordInputToRetrive + "'" + " is located on the index " + position;
		}
		else
		{
			output = "Sentence dosn't contain that specific word";
		}
		
		System.out.println(output);
	}
}