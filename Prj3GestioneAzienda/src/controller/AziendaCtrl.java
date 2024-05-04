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
	
	public void resetNumeriMatricola() 
	{
		int nuovoNumero = 1;
		for (Dipendente dipendente : listaDipendenti) {
			dipendente.setNumMatricola(nuovoNumero++);
			dipendente.setNumMatricolaStatic(listaDipendenti.lastIndexOf(dipendente)+1);
		}
	}

	public ArrayList<Dipendente> getListaDipendenti() {
		return listaDipendenti;
	}

	public Dipendente getEmployee(int index) {
		try {
			for (Dipendente dipendente : listaDipendenti) {
				if (dipendente.getNumMatricola() == index) {
					return dipendente;
				}
			}
		} catch (Exception e) {
			System.out.println("Numero di matricola non presente!");
		}
		return null;
	}

	public void removeEmployee(Dipendente dipendente) {
		listaDipendenti.remove(dipendente);
	}

	public void removeEmployee(int matricola) {
		listaDipendenti.remove(getEmployee(matricola));
	}

	// POSSO ACCEDERE DIRETTAMENTE ALLA POSIZIONE DELL'OGGETTO SULL'ARRAY E
	// SOSTITUIRLO CON UNO PASSATO DA UN METODO SOVRASCRIVENDO INVECE DI ELIMANRLO?
	public void setEmployeeObject(Dipendente dipendenteDaModificare, Dipendente dipendenteModificato) {
		for (int i = 0; i < listaDipendenti.size(); i++) {
			if (dipendenteDaModificare.equals(listaDipendenti.get(i))) {
				listaDipendenti.add(dipendenteModificato);
			}
		}
	}

	public void editEmployee(int matricola) {
		try {
			Scanner input = new Scanner(System.in);
			Dipendente dipendenteChiamato = getEmployee(matricola);

			if (dipendenteChiamato.getRuolo().equals("dipendente")) {
				Dipendente dipendenteDaEditare = dipendenteChiamato;
				System.out.println("Digita il nuovo NOME da assegnare:");
				String dipendenteNomeModificato = input.nextLine();
				System.out.println("Digita il nuovo COGNOME da assegnare:");
				String dipendenteCognomeModificato = input.nextLine();
				System.out.println("\nMODIFICHE REGISTRATE. .");
				dipendenteDaEditare.setNome(dipendenteNomeModificato);
				dipendenteDaEditare.setCognome(dipendenteCognomeModificato);
				dipendenteDaEditare.setNumMatricola(matricola);
				System.out.println("\nMODIFICHE EFFETTUATE. .");
				System.out.println("\n" + dipendenteDaEditare.saluto());
				listaDipendenti.remove(dipendenteChiamato);
				listaDipendenti.add(dipendenteDaEditare);
			} else

			if (dipendenteChiamato.getRuolo().equals("stagista")) {
				Dipendente dipendenteDaEditare = dipendenteChiamato;
				System.out.println("Digita il nuovo NOME da assegnare:");
				String dipendenteNomeModificato = input.nextLine();
				System.out.println("Digita il nuovo COGNOME da assegnare:");
				String dipendenteCognomeModificato = input.nextLine();
				System.out.println("\nMODIFICHE REGISTRATE. .");
				dipendenteDaEditare.setNome(dipendenteNomeModificato);
				dipendenteDaEditare.setCognome(dipendenteCognomeModificato);
				dipendenteDaEditare.setNumMatricola(matricola);
				System.out.println("\nMODIFICHE EFFETTUATE. .");
				System.out.println("\n" + dipendenteDaEditare.saluto());
				listaDipendenti.remove(dipendenteChiamato);
				listaDipendenti.add(dipendenteDaEditare);
			} else

			if (dipendenteChiamato.getRuolo().equals("programmatore")) {
				Dipendente dipendenteDaEditare = dipendenteChiamato;
				System.out.println("Digita il nuovo NOME da assegnare:");
				String dipendenteNomeModificato = input.nextLine();
				System.out.println("Digita il nuovo COGNOME da assegnare:");
				String dipendenteCognomeModificato = input.nextLine();
				System.out.println("Digita il nuovo Linguaggio da assegnare:");
				String linguaggioProgrammazione = input.nextLine();
				System.out.println("\nMODIFICHE REGISTRATE. .");
				dipendenteDaEditare.setNome(dipendenteNomeModificato);
				dipendenteDaEditare.setCognome(dipendenteCognomeModificato);
				dipendenteDaEditare.setNumMatricola(matricola);
				Programmatore isAProgrammer = (Programmatore) dipendenteDaEditare;
				isAProgrammer.setLinguaggio(linguaggioProgrammazione);
				System.out.println("\nMODIFICHE EFFETTUATE. .");
				System.out.println("\n" + dipendenteDaEditare.saluto());
				listaDipendenti.remove(dipendenteChiamato);
				listaDipendenti.add(dipendenteDaEditare);
			} else

			if (dipendenteChiamato.getRuolo().equals("manager")) {
				Dipendente dipendenteDaEditare = dipendenteChiamato;
				System.out.println("Digita il nuovo NOME da assegnare:");
				String dipendenteNomeModificato = input.nextLine();
				System.out.println("Digita il nuovo COGNOME da assegnare:");
				String dipendenteCognomeModificato = input.nextLine();
				System.out.println("Digita il nuovo REPARTO da assegnare:");
				String managerReparto = input.nextLine();
				System.out.println("\nMODIFICHE REGISTRATE. .");
				dipendenteDaEditare.setNome(dipendenteNomeModificato);
				dipendenteDaEditare.setCognome(dipendenteCognomeModificato);
				dipendenteDaEditare.setNumMatricola(matricola);
				Manager isAManager = (Manager) dipendenteDaEditare;
				isAManager.setReparto(managerReparto);
				System.out.println("\nMODIFICHE EFFETTUATE. .");
				System.out.println("\n" + dipendenteDaEditare.saluto());
				listaDipendenti.remove(dipendenteChiamato);
				listaDipendenti.add(dipendenteDaEditare);
			} else

			{
				System.out.println("Something went wrong. .");
			}
		} catch (Exception e) {
			System.out.println("Something went wrong. .");
		}

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
			dipendente.setNumMatricola(saveMatricolaNum);
			listaDipendenti.add(dipendente);
			removeEmployee(persona);
			break;

		case 2:
			Programmatore programmatore = new Programmatore(persona.getNome(), persona.getCognome(), null);
			saveMatricolaNum = persona.getNumMatricola();
			System.out.println("L'impiegato matricola " + saveMatricolaNum + " è adesso programmatore!");
			programmatore.setNumMatricola(saveMatricolaNum);
			listaDipendenti.add(programmatore);
			removeEmployee(persona);
			break;

		case 3:
			Stagista stagista = new Stagista(persona.getNome(), persona.getCognome());
			saveMatricolaNum = persona.getNumMatricola();
			System.out.println("L'impiegato matricola " + saveMatricolaNum + " è adesso stagista!");
			stagista.setNumMatricola(saveMatricolaNum);
			listaDipendenti.add(stagista);
			removeEmployee(persona);
			break;

		case 4:
			Manager manager = new Manager(persona.getNome(), persona.getCognome(), null);
			saveMatricolaNum = persona.getNumMatricola();
			System.out.println("L'impiegato matricola " + saveMatricolaNum + " è adesso manager!");
			manager.setNumMatricola(saveMatricolaNum);
			listaDipendenti.add(manager);
			removeEmployee(persona);
			break;

		default:
			System.out.println("Invalid digit please try again");
			break;
		}

	}

}