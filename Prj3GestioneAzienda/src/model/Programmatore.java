package model;

public class Programmatore extends Dipendente {
	
	String linguaggio;

	public Programmatore(String nome, String cognome, String linguaggio) {
		super(nome, cognome);
		this.ruolo = "programmatore";
		if(linguaggio == null)
		{
			this.linguaggio = "*NON ASSEGNATO*";
		} 
		else 
		{
			this.linguaggio = linguaggio;

		}
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

	public String getLinguaggio() {
		return linguaggio;
	}

	public void setLinguaggio(String linguaggio) {
		this.linguaggio = linguaggio;
	}
	
}
