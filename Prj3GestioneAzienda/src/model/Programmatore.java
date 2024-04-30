package model;

public class Programmatore extends Dipendente {
	
	String linguaggio;

	public Programmatore(String nome, String cognome, int numMatricola, RUOLO ruolo) {
		super(nome, cognome, numMatricola, ruolo);
		this.ruolo = RUOLO.programmatore;
		this.linguaggio = "*NON ASSEGNATO*";
	}

	@Override
	public String toString() {
		return "Programmatore [nome=" + nome + ", cognome=" + cognome + ", numMatricola=" + numMatricola + ", ruolo="
				+ ruolo + "]";
	}
	
	public double calcoloStipendio() 
	{
		return (stipendio * 0.2) + stipendio;
	}
	
	public String saluto() 
	{
		return "Ciao io sono " + nome + " " + cognome + ", il mio numero di matricola è " + numMatricola + " e ricopro il ruolo di " + ruolo + " e programmo in lingua " + linguaggio + "!\nE guadagno " + this.calcoloStipendio();
	}
}
