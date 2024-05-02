package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import model.Canzone;

public class CanzoniCtrl {

	ArrayList<Canzone> dbCanzoni;

	public CanzoniCtrl() 
	{
		this.dbCanzoni = new ArrayList<Canzone>();
	}
	
	// costruisco un metodo per caricare le canzoni manualmente
	public void caricaCanzoniAMano() 
	{
		String raccolta[] = 
			{
					"Starway To Heaven; Led Zepplin",
					"Una vita spericolata; Vasco rossi",
					"Stai zitto; Salmo",
					"Paradise City; Guns and Roses",
					"Kind of Blue; Miles Davis",
					"Acido; Prozac+",
					"Servo della gleba; EELST",
					"Cornutone; Squallor",
					"Bocca di rosa; De Andrè",
			};
		
		for (String song : raccolta) {
			String[] separate = song.split(";");
			String titolo = separate[0];
			String cantante = separate[1];
			Canzone canzone = new Canzone(titolo, cantante);
			dbCanzoni.add(canzone);
		}
	}
	
	public void caricaCanzoniDaFile() 
	{
		File fileDB = new File("./canzoni.csv");
		
		try 
		{
			Scanner sc = new Scanner(fileDB);
			
			while(sc.hasNextLine()) 
			{
				String riga = sc.nextLine();
				String[] separate = riga.split(";");
				String titolo = separate[0];
				String cantante = separate[1];
				Canzone canzone = new Canzone(titolo, cantante);
				this.dbCanzoni.add(canzone);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<Canzone> getDBcanzoni() 
	{
		return this.dbCanzoni;
	}

}
