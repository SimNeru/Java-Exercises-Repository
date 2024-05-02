package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Dipendente;
import model.Manager;
import model.Programmatore;
import model.Stagista;

public class AziendaCtrl {

	private ArrayList<Dipendente> listaDipendenti = new ArrayList<Dipendente>();

	public void printList() {
		if (listaDipendenti.isEmpty()) {
			System.out.println("La tua azienda è un deserto, assumi qualcuno!");
		} else {
			for (Object dipendente : listaDipendenti) {
				System.out.println(dipendente.toString());
			}
		}
	}

	public void AddEmployee(Dipendente dipendente) {
		listaDipendenti.add(dipendente);
	}

	public Dipendente getEmployee(int index) {
		
		for (Dipendente dipendente : listaDipendenti) {
			if(dipendente.getNumMatricola() == index) 
			{
				return dipendente;
			}
			else 
			{
				System.out.println("");
				return null;
			}
		}
	}

	public void removeEmployee(Dipendente dipendente) {
		listaDipendenti.remove(dipendente);
	}

	public Object setEmployee(Object employee) {
		Object nuovoImpiegato = employee;
		return nuovoImpiegato;
	}

	public Dipendente removeEmployee(int index) {
		return listaDipendenti.get(index);
	}

	public void PromoteOrDemote(int matricola) {
		Scanner input = new Scanner(System.in);
		int saveMatricolaNum = 0;
		int choice = 0;
		Dipendente persona = getEmployee(matricola);
		System.out.println(persona.saluto());
		System.out.println(
				"Vuoi promuovere o degradare questo impiegato?\n1: Dipendente\n2: Programmatore\n3: Stagista\n4: Manager\nDefault: Esci");
		choice = input.nextInt();
		input.nextLine();

		switch (choice) {
		case 1:
			Dipendente dipendente = new Dipendente(persona.getNome(), persona.getCognome());
			saveMatricolaNum = persona.getNumMatricola();
			System.out.println("L'impiegato matricola " + saveMatricolaNum + " è adesso dipendente!");
			persona = dipendente;
			persona.setNumMatricola(saveMatricolaNum);
			break;

		case 2:
			Programmatore programmatore = new Programmatore(persona.getNome(), persona.getCognome(), null);
			saveMatricolaNum = persona.getNumMatricola();
			System.out.println("L'impiegato matricola " + saveMatricolaNum + " è adesso programmatore!");
			programmatore.setNumMatricola(saveMatricolaNum);
			AddEmployee(programmatore);
			removeEmployee(persona);
			break;

		case 3:
			Stagista stagista = new Stagista(persona.getNome(), persona.getCognome());
			saveMatricolaNum = persona.getNumMatricola();
			System.out.println("L'impiegato matricola " + saveMatricolaNum + " è adesso stagista!");
			persona = stagista;
			persona.setNumMatricola(saveMatricolaNum);
			break;

		case 4:
			Manager manager = new Manager(persona.getNome(), persona.getCognome(), null);
			saveMatricolaNum = persona.getNumMatricola();
			System.out.println("L'impiegato matricola " + saveMatricolaNum + " è adesso manager!");
			persona = manager;
			persona.setNumMatricola(saveMatricolaNum);

			break;

		default:
			break;
		}

	}

}