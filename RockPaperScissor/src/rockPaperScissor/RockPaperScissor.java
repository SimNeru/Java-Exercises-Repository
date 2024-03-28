package rockPaperScissor;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class RockPaperScissor {

	public static void main(String[] args) {
		System.out.println(":::WELCOME TO THE CHINESE'S MORRA:::");
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int totalWin = 0;
		
		while(true) {
		System.out.println(" \nMAKE YOUR CHOICE\n1. ROCK\n2. PAPER\n3. SCISSOR");
		
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
		
		System.out.println("");
		System.out.println("YOU: " + playerString + " | VS | " + virtualString + " :CPU");
		
		boolean playerLoss = (playerChoice == 1 && virtualChoice == 2) || (playerChoice == 2 && virtualChoice == 3) || (playerChoice == 3 && virtualChoice == 1) ? true : false;
		String output;
		
		if (playerChoice == virtualChoice) 
		{
			output = "it's a Draw!\n ";
		} else if (playerLoss)
		{
			output = "What a pity, you lost!\n ";
			totalWin--;
		} else 
		{
			output = "Congratulations, you won!\n ";
			totalWin++;
		}
		
		if(totalWin == 2) 
		{
			System.out.println("*Player is the WINNER!*");
			return;
		}
		
		if (totalWin == -2)
		{
			System.out.println("*COMPUTER is the WINNER!*");
			return;
		}
		
		input.nextLine();
		System.out.println(output + "\nWanna play again? Y or N");
		String request = input.nextLine().toLowerCase();
		if (request.equals("n")) {return;}
		}
	}
}