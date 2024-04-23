package OOP_tester;

import java.util.Scanner;

import OOP_model.Bicicletta;

public class BiciclettaTester {
	
	public static void main(String[] args) 
	{
		Bicicletta bici1 = new Bicicletta("Cannondale", "c-bike", (byte) 21);
		System.out.println(bici1.toString());
		
		bici1.accellera(200);
		bici1.accellera(100);
		bici1.rallenta(60);
		bici1.calcolaVelocitàMax();
		System.out.println(bici1.toString());

		System.out.println("\nALTRA BICICLETTA");
		Bicicletta bici2 = new Bicicletta("Bianch", "Bartali", (byte) 10);
		bici2.toString();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci marca..");
		String miaMarca = sc.nextLine();
		System.out.println("Inserisci modello.");
		String mioModello = sc.nextLine();
		
		Bicicletta bici3 = new Bicicletta(mioModello, miaMarca, (byte) 3);
		System.out.println(bici3.toString());
	}
}
