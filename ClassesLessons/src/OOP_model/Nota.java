package OOP_model;

import java.util.Date;

public class Nota {
	
	String titolo;
	String descrizione;
	Date dataCreazione = new Date();
	
	public Nota(String titolo, String descrizione) {
		this.titolo = titolo;
		this.descrizione = descrizione;
	}
	
	public String stampaNota() 
	{
		return "[Titolo] " + this.titolo + "\n[Descrizione] " + this.descrizione + "\n[Data] " + this.dataCreazione;
	}
}
