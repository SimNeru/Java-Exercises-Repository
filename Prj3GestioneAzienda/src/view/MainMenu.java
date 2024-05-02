package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.AziendaCtrl;
import model.Dipendente;
import model.Manager;
import model.Programmatore;
import model.Stagista;

public class MainMenu {
	
	Scanner input = new Scanner(System.in);
	AziendaCtrl aziendactrl = new AziendaCtrl();
	private ArrayList<Dipendente> listaDipendenti = new ArrayList<Dipendente>();

	public void menuList() 
	{
		System.out.println("Benvenuto nella gestionale della tua azienda");
		System.out.println("Digita quale operazione vorresti svolgere..");
		System.out.println("1. Stampa la lista dei tuoi dipendenti.\n2. Aggiungi un dipendente\n3. Chiama e ricevi dettagli di un dipendente\n4. Promuovi o retrocedi un dipendente\n5. Rimuovi un dipendente\n0. Esci dall'applicazione");
		
		int choice = input.nextInt();
		input.nextLine();
		
		switch (choice) {
		case 1:
			aziendactrl.printList();
			break;
		case 2:
			System.out.println(" \nChi vuoi assumere?\n1. Stagista\n2. Dipendente\n3. Programmatore\n4. Manager");
			int select = input.nextInt();
			input.nextLine();
			menuCreazioneDipendente(select);
			break;
		case 3:
			System.out.println(" \nInserisci il numero di matricola che vorresti chiamare..");
			int matricola = input.nextInt();
			aziendactrl.getEmployee(matricola);
			break;
		case 4:
			
			break;
		case 5:
			
			break;

		default:
			break;
		}
		
	}
	
	public void menuCreazioneDipendente(int select) 
	{
		switch (select) {
		case 1:
			System.out.println("Stai aggiungendo uno STAGISTA");
			System.out.println("NOME: ");
			String nomeStagista = input.nextLine();
			System.out.println("COGNOME: ");
			String cognomeStagista = input.nextLine();
			Stagista stagista = new Stagista(nomeStagista, cognomeStagista);
			stagista.saluto();
			listaDipendenti.add(stagista);
			System.out.println("CREAZIONE AVVENUTA CON SUCCESSO");
			break;
		case 2:
			System.out.println("Stai aggiungendo un DIPENDENTE");
			System.out.println("NOME: ");
			String nomeDipendente = input.nextLine();
			System.out.println("COGNOME: ");
			String cognomeDipendente = input.nextLine();
			Dipendente dipendente = new Stagista(nomeDipendente, cognomeDipendente);
			dipendente.saluto();
			listaDipendenti.add(dipendente);
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
			listaDipendenti.add(programmatore);
			System.out.println("CREAZIONE AVVENUTA CON SUCCESSO");
			break;
		case 4:
			System.out.println("Stai aggiungendo un MANAGER");
			System.out.println("Stai aggiungendo un PROGRAMMATORE");
			System.out.println("NOME: ");
			String nomeManager = input.nextLine();
			System.out.println("COGNOME: ");
			String cognomeManager = input.nextLine();
			System.out.println("REPARTO: ");
			String repartoManager = input.nextLine();
			Manager manager = new Manager(nomeManager, cognomeManager, repartoManager);
			manager.saluto();
			listaDipendenti.add(manager);
			System.out.println("CREAZIONE AVVENUTA CON SUCCESSO");
			break;
		default:
			System.out.println("cazzo digiti?");
			break;
		}
	}

}
