package a_esEreditarieta;

public class Libro extends Prodotto{
	
	private String autore;

	public Libro(int id, String nome, String descrizione, double prezzo, String marca, String autore) {
		super(id, nome, descrizione, prezzo, marca);
		this.autore = autore;
	}

	@Override
	public String descriviProdotto() {
		return super.descriviProdotto() + " - Autore: " + this.autore;
	}
	
}
