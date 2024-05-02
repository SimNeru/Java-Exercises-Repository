package model;

//enum RUOLO { dipendente, manager, programmatore, stagista };

public class Dipendente {
	
	String nome, cognome;
	static int numMatricola = 0;
	int numStoreMatricola = 0;
	final double stipendio;
	//ERuolo ruolo;
	String ruolo;
	
	public Dipendente(String nome, String cognome)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.numStoreMatricola = ++this.numMatricola;
		this.ruolo = "dipendente";
		this.stipendio = 1200;
	}

	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", cognome=" + cognome + ", numMatricola=" + numStoreMatricola + ", ruolo=" + ruolo +"]";
	}
	
	public double calcoloStipendio() 
	{
		return this.stipendio;
	}
	
	public String saluto() 
	{
		return "Ciao io sono " + nome + " " + cognome + ", il mio numero di matricola è " + numStoreMatricola + " e ricopro il ruolo di " + ruolo + "!\nE guadagno " + calcoloStipendio()  + " euro";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}	
	
	public int getNumMatricola() {
		return numStoreMatricola;
	}

	public void setNumMatricola(int numMatricola) {
		this.numStoreMatricola = numMatricola;
	}
}