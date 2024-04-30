package model;

public class Manager extends Dipendente {
	
	String reparto;

	public Manager(String nome, String cognome, int numMatricola, RUOLO ruolo, String reparto) {
		super(nome, cognome, numMatricola, ruolo);
		this.ruolo = RUOLO.manager;
		this.reparto = "*NON ASSEGNATO*";
	}
	
	@Override
	public String toString() {
		return "Manager [nome=" + nome + ", cognome=" + cognome + ", numMatricola=" + numMatricola + ", ruolo=" + ruolo
				+ "]";
	}
	
	public double calcoloStipendio() 
	{
		return (stipendio * 0.4) + stipendio;
	}
	
	public String saluto() 
	{
		return "Ciao io sono " + nome + " " + cognome + ", il mio numero di matricola è " + numMatricola + " e ricopro il ruolo di " + ruolo + " e dirigo il reparto" + reparto + "!\nE guadagno " + this.calcoloStipendio();
	}
}
