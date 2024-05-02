package model;

public class Manager extends Dipendente {
	
	String reparto;

	public Manager(String nome, String cognome, String reparto) {
		super(nome, cognome);
		this.ruolo = "manager";
		if(reparto == null)
		{
			this.reparto = "*NON ASSEGNATO*";
		} 
		else 
		{
			this.reparto = reparto;

		}
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

	public String getReparto() {
		return reparto;
	}

	public void setReparto(String reparto) {
		this.reparto = reparto;
	}
	
}
