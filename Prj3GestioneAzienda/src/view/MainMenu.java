package view;

import java.util.Scanner;

import controller.AziendaCtrl;
import model.Dipendente;
import model.Manager;
import model.Programmatore;
import model.Stagista;

public class MainMenu {
	
	// Non funziona il cambio di ruolo da sistemare
	
	Scanner input = new Scanner(System.in);
	AziendaCtrl aziendactrl = new AziendaCtrl();

	public boolean menuLista() 
	{
		try {
		System.out.println("\nBENVENUTO NEL GESTIONALE DELLA TUA AZIENDA");
		System.out.println("Digita quale operazione vorresti svolgere..");
		System.out.println("1. Stampa la lista dei tuoi dipendenti.\n2. Aggiungi un dipendente\n3. Chiama e ricevi dettagli di un dipendente\n4. Promuovi o retrocedi un dipendente\n5. Rimuovi un dipendente\n6. Modifica dati di un dipendente\n0. Esci dall'applicazione");
		
		int choice = input.nextInt();
		input.nextLine();
		
		switch (choice) {
		case 1:
			aziendactrl.printList();
			break;
		case 2:
			System.out.println(" \nChi vorresti assumere?\n1. Stagista\n2. Dipendente\n3. Programmatore\n4. Manager");
			int matricolaDaAssumere = input.nextInt();
			input.nextLine();
			menuCreazioneDipendente(matricolaDaAssumere);
			break;
		case 3:
			System.out.println(" \nInserisci il numero di matricola che vorresti chiamare..");
			int matricolaDaChiamare = input.nextInt();
			input.nextLine();
			System.out.println(aziendactrl.getEmployee(matricolaDaChiamare).saluto());
			break;
		case 4:
			System.out.println(" \nInserisci il numero di matricola a cui vorresti cambiare il ruolo..");
			int matricolaDaModificareRuolo = input.nextInt();
			input.nextLine();
			aziendactrl.PromoteOrDemote(matricolaDaModificareRuolo);
			break;
		case 5:
			System.out.println(" \nInserisci il numero di matricola che vorresti rimuovere..");
			int matricolaDaRimuovere = input.nextInt();
			input.nextLine();
			aziendactrl.removeEmployee(matricolaDaRimuovere);
			break;
		case 6:
			System.out.println(" \nInserisci il numero di matricola a cui vorresti modificare i dati..");
			int matricolaDaModificareDati = input.nextInt();
			input.nextLine();
			aziendactrl.editEmployee(matricolaDaModificareDati);
			break;
		case 7:
			System.out.println(" \nResetto i numeri di matricola e ne assegno di nuovi..");
			aziendactrl.resetNumeriMatricola();
			break;
		case 0:
			System.out.println(" \nBYE!");
			return false;
		default:
			System.out.println("Please digit a valid number..");
			break;
		}
		return true;
		} catch (Exception e) {
			System.out.println("Please digit a valid number..");
			input.nextLine();
			return true;
		}
	}
	
	private void menuCreazioneDipendente(int select) 
	{
		try {
		switch (select) {
		case 1:
			System.out.println("Stai aggiungendo uno STAGISTA");
			System.out.println("NOME: ");
			String nomeStagista = input.nextLine();
			System.out.println("COGNOME: ");
			String cognomeStagista = input.nextLine();
			Stagista stagista = new Stagista(nomeStagista, cognomeStagista);
			stagista.saluto();
			aziendactrl.getListaDipendenti().add(stagista);
			System.out.println("CREAZIONE AVVENUTA CON SUCCESSO");
			break;
		case 2:
			System.out.println("Stai aggiungendo un DIPENDENTE");
			System.out.println("NOME: ");
			String nomeDipendente = input.nextLine();
			System.out.println("COGNOME: ");
			String cognomeDipendente = input.nextLine();
			Dipendente dipendente = new Dipendente(nomeDipendente, cognomeDipendente);
			dipendente.saluto();
			aziendactrl.getListaDipendenti().add(dipendente);
			System.out.println("CREAZIONE AVVENUTA CON SUCCESSO");
			break;
		case 3:
			System.out.println("Stai aggiungendo un PROGRAMMATORE");
			System.out.println("NOME: ");
			String nomeProgrammatore = input.nextLine();
			System.out.println("COGNOME: ");
			String cognomeProgrammatore = input.nextLine();
			System.out.println("LINGUAGGIO PROGRAMMAZIONE: ");
			String linguaggioProgrammazione = input.nextLine();
			Programmatore programmatore = new Programmatore(nomeProgrammatore, cognomeProgrammatore, linguaggioProgrammazione);
			programmatore.saluto();
			aziendactrl.getListaDipendenti().add(programmatore);
			System.out.println("CREAZIONE AVVENUTA CON SUCCESSO");
			break;
		case 4:
			System.out.println("Stai aggiungendo un MANAGER");
			System.out.println("NOME: ");
			String nomeManager = input.nextLine();
			System.out.println("COGNOME: ");
			String cognomeManager = input.nextLine();
			System.out.println("REPARTO: ");
			String repartoManager = input.nextLine();
			Manager manager = new Manager(nomeManager, cognomeManager, repartoManager);
			System.out.println(manager.saluto());
			aziendactrl.getListaDipendenti().add(manager);
			System.out.println("CREAZIONE AVVENUTA CON SUCCESSO");
			break;
		default:
			System.out.println("cazzo digiti?");
			break;
		}
		} catch (Exception e) {
			System.out.println("cazzo digiti?");
			return;
		}
	}

}
