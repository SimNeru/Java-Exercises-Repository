package a_OOPLesson;

public class Automobile {

	String marca = "Fiat";
	String modello;
	int cilindrata;
	byte ruoteMotrici = 2;
	boolean statoMotore = false;

	// specifico il costruttore di default
	public Automobile() {}
	
	// Overload del metodi costruttori
	// specifico costruttore per una sola caratteristica
	public Automobile(String marca) 
	{
		this.marca = marca;
	}
	
	// specifico costruttore per più caratteristiche
	public Automobile(String marca, String modello, int cilindrata) {
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
	}

	// alt + shift + s genera costruttore per quante caratteristiche desideriamo
	public Automobile(String marca, String modello, int cilindrata, byte ruoteMotrici, boolean statoMotore) {
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.ruoteMotrici = ruoteMotrici;
		this.statoMotore = statoMotore;
	}
	
	// Override del tooString
	@Override
	public String toString() {
		return "Automobile [marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata + ", ruoteMotrici="
				+ ruoteMotrici + ", statoMotore=" + statoMotore + "]";
	}
}
