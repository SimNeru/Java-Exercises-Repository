package view;

import java.util.ArrayList;

import controller.CanzoniCtrl;
import model.Canzone;

public class Main {

	public static void main(String[] args) 
	{
		CanzoniCtrl canzoniCtrl = new CanzoniCtrl();
		canzoniCtrl.caricaCanzoniAMano();
		ArrayList<Canzone> tutteCanzoni = canzoniCtrl.dbCanzoni;
		
		for (Canzone canzone : tutteCanzoni ) {
			System.out.println(canzone.titolo + " - " + canzone.cantante);
			// System.out.println(canzone.toString());
		}
		
	}
}
