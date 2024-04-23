package OOP_tester;

import OOP_model.Motocicletta;

public class MotociclettaTester {

	public static void main(String[] args) 
	{
		// ATT: per poter utilizzare il costruttore di default deve essere dichiarato
		Motocicletta moto1 = new Motocicletta("Z750", 750);
		Motocicletta moto2 = new Motocicletta("Ninja", 1000);
		Motocicletta moto3 = new Motocicletta("Z800", 799);
		
		System.out.println(moto1.toString());
		System.out.println(moto2.toString());
		System.out.println(moto3.toString());
	}
}
