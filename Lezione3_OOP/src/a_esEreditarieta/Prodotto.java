package a_esEreditarieta;

public class Prodotto {
	
	public int id;
	public String nome;
	public String descrizione;
	public double prezzo;
	public String marca;
	
	public static final String TIPOPRODOTTO = "Prodotto Generico";

	public Prodotto(int id, String nome, String descrizione, double prezzo, String marca) {
		this.id = id;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.marca = marca;
	}
	
	public String descriviProdotto() 
	{
		String descrizione = "Informazioni: " + this.nome + " - " + this.marca + " - " + this.prezzo + "€";
		return descrizione;
	}
}
