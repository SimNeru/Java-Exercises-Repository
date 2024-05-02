package view;

import controller.AziendaCtrl;
import model.Dipendente;

public class Main {

	public static void main(String[] args) {
		
		AziendaCtrl aziendactrl = new AziendaCtrl();
		
		//creo quattro dipendenti diversi
		Dipendente uno = new Dipendente("Mister", "Uno");
		aziendactrl.AddEmployee(uno);
		Dipendente due = new Dipendente("Signor", "Due");
		aziendactrl.AddEmployee(due);
		Dipendente tre = new Dipendente("Miss", "Tre");
		aziendactrl.AddEmployee(tre);
		Dipendente quattro = new Dipendente("Signora", "Quattro");
		aziendactrl.AddEmployee(quattro);
		
		aziendactrl.printList();
		
		aziendactrl.PromoteOrDemote(1);
		
		aziendactrl.printList();
	}

}
