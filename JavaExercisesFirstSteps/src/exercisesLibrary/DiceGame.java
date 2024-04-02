package exercisesLibrary;

import java.util.Random;

public class DiceGame {

	public static void diceGame() 
	{
	    final String ANSI_RESET = "\u001B[0m";
		final String ANSI_RED = "\u001B[31m";
		final String ANSI_GREEN = "\u001B[32m";
	    final String ANSI_YELLOW = "\u001B[33m";
		
		
		Random random = new Random();
		int playerOneScore = 30;
		int playerTwoScore = 30;
		int roundCounter = 0;
		
		
		while (playerOneScore >= 0 && playerTwoScore >=0) {
			int diceRollFirst = random.nextInt(1,7);
			int diceRollSecond = random.nextInt(1,7);
			roundCounter++;
			System.out.println("ROUND " + roundCounter);
			System.out.print(ANSI_RED +"Player ONE rolls");
			suspenceTimerOneSecond(); System.out.print(". ");
			suspenceTimerOneSecond(); System.out.print(". " + ANSI_RESET);
			System.out.print(diceRollFirst + "!\n");
			
			System.out.print(ANSI_GREEN + "Player TWO rolls");
			suspenceTimerOneSecond(); System.out.print(". ");
			suspenceTimerOneSecond(); System.out.print(". "  + ANSI_RESET);			
			System.out.print(diceRollSecond + "!\n");

			if (diceRollFirst == diceRollSecond){
				System.out.println(ANSI_YELLOW + "IT'S A DRAW!");
			}
			else if (diceRollFirst > diceRollSecond) 
			{
				playerTwoScore -= diceRollFirst;
				System.out.println(ANSI_YELLOW + "PLAYER TWO LOSES: " + playerTwoScore + " points left"+ ANSI_RESET);
			} else 
			{
				playerOneScore -= diceRollSecond;
				System.out.println(ANSI_YELLOW + "PLAYER ONE LOSES: " + playerOneScore + " points left" + ANSI_RESET);
			}
		}
		
		String winnerResult = playerOneScore>playerTwoScore ? ANSI_RED + "CONGRATULATION PLAYER ONE YOU WON!" + ANSI_RESET : ANSI_GREEN + "CONGRATULATION PLAYER TWO YOU WON!" + ANSI_RESET;
		System.out.println(winnerResult);
	}

	public static void suspenceTimerOneSecond() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
