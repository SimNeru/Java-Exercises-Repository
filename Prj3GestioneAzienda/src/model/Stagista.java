package model;

public class Stagista extends Dipendente{

	public Stagista(String nome, String cognome, int numMatricola, RUOLO ruolo) {
		super(nome, cognome, numMatricola, ruolo);
		this.ruolo = RUOLO.stagista;
	}

	@Override
	public String toString() {
		return "Stagista [nome=" + nome + ", cognome=" + cognome + ", numMatricola=" + numMatricola + ", ruolo=" + ruolo
				+ "]";
	}
	
	public double calcoloStipendio() 
	{
		return stipendio - (stipendio * 0.5);
	}

	public String saluto() 
	{
		return "Ciao io sono " + nome + " " + cognome + ", il mio numero di matricola è " + numMatricola + " e ricopro il ruolo di " + ruolo + "!\n E guadagno " + this.calcoloStipendio();
	}
}
