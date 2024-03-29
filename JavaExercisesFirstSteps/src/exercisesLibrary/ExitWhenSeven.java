package exercisesLibrary;

public class ExitWhenSeven {

	public static void extiWhenSeven() 
	{
		int counter = 0;
		do 
		{
			if(counter==7) {System.out.println("Interrupting.."); return;}

			if(counter%2!=0) {System.out.println(counter);}
			
			counter++;
		} while (counter<10);
	}
}
