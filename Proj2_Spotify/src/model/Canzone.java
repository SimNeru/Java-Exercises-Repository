package model;

public class Canzone {

	String titolo;
	String cantante;
	
	public Canzone(String titolo, String cantante) {
		this.titolo = titolo;
		this.cantante = cantante;
	}
	
	public String suona() 
	{
		return "Stai ascoltando "+ this.titolo + " di " + this.cantante + "!";
	}

	@Override
	public String toString() {
		return "Canzone [titolo=" + titolo + ", cantante=" + cantante + "]";
	}
	
	public String getTitolo() 
	{
		return this.titolo;
	}
	
	public String getCantante() 
	{
		return this.cantante;
	}
}
