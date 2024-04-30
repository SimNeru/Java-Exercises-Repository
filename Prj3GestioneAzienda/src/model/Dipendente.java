package model;

enum RUOLO { dipendente, manager, programmatore, stagista };

public class Dipendente {
	
	String nome, cognome;
	int numMatricola;
	final double stipendio;
	RUOLO ruolo;
	
	public Dipendente(String nome, String cognome, int numMatricola, RUOLO ruolo)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.numMatricola = numMatricola;
		this.ruolo = RUOLO.dipendente;
		this.stipendio = 1200;
	}

	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", cognome=" + cognome + ", numMatricola=" + numMatricola + ", ruolo=" + ruolo +"]";
	}
	
	public double calcoloStipendio() 
	{
		return this.stipendio;
	}
	
	public String saluto() 
	{
		return "Ciao io sono " + nome + " " + cognome + ", il mio numero di matricola è " + numMatricola + " e ricopro il ruolo di " + ruolo + "!\nE guadagno " + calcoloStipendio();
	}
	
	public RUOLO getRuolo() 
	{
		return this.ruolo;
	}
	
	public void setRuolo(RUOLO ruolo) 
	{
		this.ruolo = ruolo;
	}
}
