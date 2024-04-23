package OOP_model;

public class Bicicletta {

	String modello;
	String marca;
	byte ruote = 2;
	double velocita = 0;
	int frequenza = 0;
	byte numMarce;
	
	public Bicicletta(String modello, String marca, byte numMarce) 
	{
		this.modello = modello;
		this.marca = marca;
		this.numMarce = numMarce;
	}
	
	// modificatore tipoDiRitorno nomeMetodo (parametri?)
	// con void non ho nessun valore restituito dal metodo
	public void accellera(int incFrequenza) {
		this.frequenza = frequenza + incFrequenza;
		System.out.println("Stai accellerando la frequenza attuale è: " + frequenza + " Hz");
	}
	
	public void rallenta(int incFrequenza) {
		this.frequenza = frequenza - incFrequenza;
		System.out.println("Stai decellerando la frequenza attuale è: " + frequenza + " Hz");
	}
	
	public void calcolaVelocitàMax() 
	{
		this.velocita = frequenza * numMarce;
		System.out.println("La velocità massima è " + velocita);
	}

	@Override
	public String toString() {
		return "\nModello: " + modello + ", " + marca + "\nNumero ruote: " + ruote + "\nVelocita: " + velocita
				+ "\nFrequenza: " + frequenza + "\nNumero marce: " + numMarce + "\n";
	}
	
	
}
