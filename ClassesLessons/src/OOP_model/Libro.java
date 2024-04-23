package OOP_model;

import java.util.ArrayList;
import java.util.List;

public class Libro {

	public String titolo;
	private String autore;
	private ArrayList<String> generi;
	private int numPagine;
	private String casaEditrice;
	private boolean isNuovo;
	private double prezzo;
	
	public Libro(String titolo, String autore, ArrayList<String> generi, int numPagine, String casaEditrice, boolean isNuovo,
			double prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.generi = generi;
		this.numPagine = numPagine;
		this.casaEditrice = casaEditrice;
		this.isNuovo = isNuovo;
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		
		String condizione = isNuovo == true ? "Nuovo" : "Usato";
		
		return "Titolo: " + titolo + "\nAutore: " + autore + "\nGeneri: " + generi + "\nNumero Pagine: " + numPagine
				+ "\nCasa Editrice: " + casaEditrice + "\nCondizione: " + condizione + "\nPrezzo: " + prezzo + "\n";
	}
	
	
}
