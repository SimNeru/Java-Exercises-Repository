package diceRoller;

import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {
		Random random = new Random();
	    int diceOne = random.nextInt(1,7);
	    int diceTwo = random.nextInt(1,7);
	    
	    int result = diceOne + diceTwo;
	    String verdict;
	    
	    if (result >= 10) 
	    {
	    	verdict = " You have WON! :D";
	    } 
	    else 
	    {
	    	verdict = " You have LOST! :(";
	    }
	    
	    System.out.println(diceOne + " + " + diceTwo + " = "  + result + verdict);
	}
}