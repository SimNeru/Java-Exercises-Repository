package OOP_model;

public class Motocicletta {
	
	// modificatori d'accesso:
	// default: visibili ovunque a patto che si trovi nello stesso package condiviso
	// public: visibile nell'intero progetto
	// private: visibile solo all'interno della classe
	// protected: visibile?
	
	String marca = "Kawasaki";
	String modello;
	int cilindrata;
	byte ruoteMotrici = 1;
	boolean isAcceso = false;
	
	// cotruttore in modo che restino di default alla creazione di marca, ruoteMotrici, isAcceso
	public Motocicletta(String modello, int cilindrata) 
	{
		this.modello = modello;
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		return "Motocicletta " + marca + ", " + modello + "\nCilindrata: " + cilindrata
				+ "\nRuote Motrici: " + ruoteMotrici + "\nStato Motore: " + isAcceso + "\n";
	}
	
	
}