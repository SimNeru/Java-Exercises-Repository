package controller;

import java.util.ArrayList;

import model.Canzone;

public class PlaylistCtrl extends CanzoniCtrl {
	
	ArrayList<Canzone> canzoniPref;
	String nomePlayL;

	public PlaylistCtrl(String nomePlayL) {
		this.canzoniPref = dbCanzoni;
		this.nomePlayL = nomePlayL;
	}
	
	public void AddTraceByIndex(ArrayList<Canzone> defaultRepo, int position) 
	{
		try {
			Canzone canzone = defaultRepo.get(position);
			canzoniPref.add(canzone);
		} catch (Exception e) {
			System.out.println("Position digit invalid");
		}
	}
	
	public void AddTraceByName(ArrayList<Canzone> defaultRepo, String songName) 
	{
		try {
				for (Canzone canzone : defaultRepo) {
					if(canzone.getTitolo().equals(songName)) 
					{
						canzoniPref.add(canzone);
					}
				}
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
	}
	
	public void RemoveTraceByIndex(int position) 
	{
		try {
			canzoniPref.remove(position);
		} catch (Exception e) {
			System.out.println("Position digit invalid");
		}
	}
	
	public void RemoveTraceByName(String songName) 
	{
		try {
			for (int i = 0; i < this.canzoniPref.size(); i++) {
				if(songName.equals(canzoniPref.get(i).getTitolo())) 
				{
					canzoniPref.remove(i);
				}
			}
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
	}
	
	public void RemoveAll() 
	{
		canzoniPref.removeAll(canzoniPref);
	}
	
}

