package controller;

import java.util.ArrayList;

import model.Dipendente;
import model.Manager;
import model.Programmatore;
import model.RUOLO;
import model.Stagista;

public class AziendaCtrl {
	
	private ArrayList<Dipendente> listaDipendenti = new ArrayList<Dipendente>();
		
	public void printList() 
	{
		for (Dipendente dipendente : listaDipendenti) {
			dipendente.toString();
		}
	}

	public void AddEmployee(Dipendente dipendente) 
	{
		listaDipendenti.add(dipendente);
	}
	
	public Dipendente getEmployee(int index) 
	{
		return listaDipendenti.get(index);
	}
	
	public void PromoteOrDemote(int matricola) 
	{
		int choice = 0;
		Dipendente dipendente = getEmployee(matricola);
		dipendente.saluto();
		System.out.println("Vuoi promuovere o degradare questo impiegato?\n1: Dipendente\n2: Programmatore\n3: Stagista\n4: Manager\nDefault: Esci");
		
		switch (choice) {
		case 1:
			dipendente.setRuolo(dipendente.getRuolo().dipendente);
			break;
		
		case 2:
			
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			break;

		default:
			break;
		}
		
	}
	
}
