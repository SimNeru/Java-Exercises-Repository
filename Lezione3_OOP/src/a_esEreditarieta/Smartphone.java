package a_esEreditarieta;

public class Smartphone extends Prodotto {
	
	public double polliciSchermo;
	public int memoriaRam;
	public int memoria;
	
	public Smartphone(int id, String nome, String descrizione, double prezzo, String marca, double polliciSchermo,
			int memoriaRam, int memoria) {
		super(id, nome, descrizione, prezzo, marca);
		this.polliciSchermo = polliciSchermo;
		this.memoriaRam = memoriaRam;
		this.memoria = memoria;
	}

	@Override
	public String descriviProdotto() {
		return super.descriviProdotto() + " - Ram: " + this.memoriaRam + " - HD: " + this.memoria
				+ " - Schermo: " + this.polliciSchermo + " pollici";
	}
	
}
