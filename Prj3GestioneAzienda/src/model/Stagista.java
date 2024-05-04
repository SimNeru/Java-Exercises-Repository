package model;

public class Stagista extends Dipendente{

	public Stagista(String nome, String cognome) {
		super(nome, cognome);
		this.ruolo = "stagista";
	}

	@Override
	public String toString() {
		return "Stagista [nome=" + nome + ", cognome=" + cognome + ", numMatricola=" + numStoreMatricola + ", ruolo=" + ruolo
				+ "]";
	}
	
	public double calcoloStipendio() 
	{
		return stipendio - (stipendio * 0.5);
	}

	public String saluto() 
	{
		return "Ciao io sono " + super.nome + " " + super.cognome + ", il mio numero di matricola è " + super.numStoreMatricola + " e ricopro il ruolo di " + this.ruolo + "!\nE guadagno " + this.calcoloStipendio() + " euro";
	}
}