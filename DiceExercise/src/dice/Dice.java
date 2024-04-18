package dice;

import java.util.Random;

public class Dice {
	
	int numFaces;
	Random numRandom = new Random();
	
	public Dice(int numFaces)
	{
		this.numFaces = numFaces;
	}
	
	public int throwDice() 
	{
		return numRandom.nextInt(1,(this.numFaces)+1);
	}
	
	
}
