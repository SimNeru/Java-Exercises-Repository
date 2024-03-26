package rockPaperScissor;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class RockPaperScissor {

	public static void main(String[] args) {
		System.out.println(":::WELCOME TO THE CHINESE MORRA:::");
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		while(true) {
		System.out.println("MAKE YOUR CHOICE\n1. ROCK\n2. PAPER\n3. SCISSOR");
		
		int playerChoice = input.nextInt();
		int virtualChoice = random.nextInt(1,4);
		String playerString;
		String virtualString;
		
		switch(playerChoice) 
		{
		case 1 :
			playerString = "rock";
			break;
		case 2 :
			playerString = "paper";
			break;
		case 3 :
			playerString = "scissor";
			break;
		default:
			return;
		}
		
		switch(virtualChoice) 
		{
		case 1 :
			virtualString = "rock";
			break;
		case 2 :
			virtualString = "paper";
			break;
		case 3 :
			virtualString = "scissor";
			break;
		default :
			return;
		}
		
		System.out.println("YOU: " + playerString + " | VS | " + virtualString + " :CPU");
		
		boolean playerLoss = (playerChoice == 1 && virtualChoice == 2) || (playerChoice == 2 && virtualChoice == 3) || (playerChoice == 3 && virtualChoice == 1) ? true : false;
		String output;
		
		if (playerChoice == virtualChoice) 
		{
			output = "it's a Draw!";
		} else if (playerLoss)
		{
			output = "What a pity, you lost!";
		} else 
		{
			output = "Congratulations, you won!";
		}
		
		input.nextLine();
		System.out.println(output + "\nWanna play again? Y or N");
		String request = input.nextLine().toLowerCase();
		if (request.equals("n")) {return;}
		}
	}
}