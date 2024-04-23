package OOP_tester;

import java.util.Scanner;

import OOP_model.BloccoNote;

public class BloccoNoteController {

	public static void main(String[] args) {

		BloccoNote bloccoNote = new BloccoNote();
		boolean condition = true;
		
		System.out.println("Benvenuto nel " + bloccoNote.nome);
		
		while(condition) {
		System.out.println("Aggiungi una nuova nota");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Titolo");
		String titolo = sc.nextLine();
		
		System.out.println("Descrizione");
		String descrizione = sc.nextLine();
		
		System.out.println("Posizione");
		int posizione = sc.nextInt();
		sc.nextLine();
		
		// aggiungo una note
		bloccoNote.addNota(titolo, descrizione, posizione);
		
		bloccoNote.stampaBloccoNote();
		System.out.println("posizioni rimaste " + bloccoNote.calcolaPosizioniRestanti());
		
		System.out.println("Uscire? Y or N");
		String input = sc.nextLine().toLowerCase();
		if(input.equals("y")) 
		{
			condition = false;
		}
		}
	}

}
