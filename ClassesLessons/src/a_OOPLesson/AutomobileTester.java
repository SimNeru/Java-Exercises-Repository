package a_OOPLesson;

public class AutomobileTester {

	public static void main(String[] args) 
	{
		// qui realizzo tutte le automobili che voglio usando uno dei tanti costruttori
		Automobile auto1 = new Automobile();

		// uso costruttore vuoto
		System.out.println(auto1.marca);
		System.out.println(auto1.cilindrata); // 0
		auto1.cilindrata = 1200;
		System.out.println(auto1.cilindrata);
		
		// uso il costruttore con marca modello e cilindrata
		Automobile auto2 = new Automobile("Opel", "Astra", 1600);
		System.out.println(auto2.marca);
		System.out.println(auto2.modello);
		System.out.println(auto2.cilindrata);

		Automobile auto3 = new Automobile("Peugeot", "2008", 1200, (byte) 2, false);
		System.out.println(auto3.toString());

	}
}
