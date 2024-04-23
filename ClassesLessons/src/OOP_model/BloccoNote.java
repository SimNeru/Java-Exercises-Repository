package OOP_model;

import java.util.ArrayList;

public class BloccoNote {
	
	public String nome = "Blocco Note di Simone";
	Nota[] elencoNote = new Nota[10];
	
	public void addNota(String titolo, String descrizione, int posizione) 
	{
		Nota n = new Nota(titolo, descrizione);
		
		elencoNote[posizione] = n;
	}

	public void stampaBloccoNote() 
	{
		for (int i = 0; i < elencoNote.length; i++) {
			if(elencoNote[i] != null) 
			{
				System.out.println(elencoNote[i].stampaNota());
			}
		}
	}
	
	public void pulisciBloccoNote() 
	{
		for (int i = 0; i < elencoNote.length; i++) {
			elencoNote[i] = null;
		}
	}
	
	public int calcolaPosizioniRestanti() 
	{
		int emptySpaces = 0;
		for (int i = 0; i < elencoNote.length; i++) {
			if(elencoNote[i]==null) 
			{
				emptySpaces++;
			}
		}
		return emptySpaces;
	}
}