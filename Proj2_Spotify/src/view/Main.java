package view;

import java.util.ArrayList;

import controller.CanzoniCtrl;
import controller.PlaylistCtrl;
import model.Canzone;

public class Main {

	/*
	 * Controllare l'aggiunta e la rimozione delle tracce da una playlist che
	 * arrivano da CanzoniCtrl
	 * 
	 * Il metodo aggiungi e rimuovi dovrà essere creato qui dentro In app, cioè nel
	 * main, costruirò una playlist e richiamo i metodi per aggiungere e rimuovere
	 * una canzone presente nella lista
	 */

	public static void main(String[] args) {
		CanzoniCtrl canzoniCtrl = new CanzoniCtrl();
		canzoniCtrl.caricaCanzoniAMano();
		ArrayList<Canzone> tutteCanzoni = canzoniCtrl.getDBcanzoni();
		System.out.println("LISTA DI TUTTE LE CANZONI PRESENTI DI DEFAULT");
		StampoRisultato(tutteCanzoni);

		// Costruisco playlist
		PlaylistCtrl playlistFirst = new PlaylistCtrl("Preferite");
		playlistFirst.caricaCanzoniAMano();
		ArrayList<Canzone> listaPreferiti = playlistFirst.getDBcanzoni();

		// Rimuovo canzone per indice
		System.out.println("\n1) RIMUOVENDO CANZONE PER INDICE");
		playlistFirst.RemoveTraceByIndex(8);
		StampoRisultato(listaPreferiti);

		// Rimuovo canzone per nome
		System.out.println("\n2) RIMUOVO CANZONE PER NOME");
		playlistFirst.RemoveTraceByName("Cornutone");
		StampoRisultato(listaPreferiti);

		// Rimuovo tutte le canzoni dalla playlist
		System.out.println("\n3) RIMUOVO TUTTE LE CANZONI DALLA PLAYLIST");
		playlistFirst.RemoveAll();
		StampoRisultato(listaPreferiti);

		// Aggiungo canzone per indice presente da un repository di default
		System.out.println("\n4) AGGIUNGO CANZONE PER INDICE");
		playlistFirst.AddTraceByIndex(tutteCanzoni, 0);
		StampoRisultato(listaPreferiti);

		// Aggiungo canzone per nome presente da un repository di default
		System.out.println("\n5) AGGIUNGO CANZONE PER NOME");
		playlistFirst.AddTraceByName(tutteCanzoni, "Kind of Blue");
		StampoRisultato(listaPreferiti);

	}

	// Metodo default che stampa gli elementi presenti in una lista di canzoni
	public static void StampoRisultato(ArrayList<Canzone> listaDaStampare) {
		if (listaDaStampare.isEmpty()) {
			System.out.println("La playlist preferiti è vuota");
		} else {
			for (Canzone canzone : listaDaStampare) {
				System.out.println((canzone.getTitolo()) + " - " + (canzone.getCantante()));
			}
		}
	}
}
