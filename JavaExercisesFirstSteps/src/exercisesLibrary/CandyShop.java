package exercisesLibrary;

import java.util.Random;
import java.util.Scanner;

public class CandyShop {
	
	public static void candyShop() 
	{
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_RED = "\u001B[31m";
		final String ANSI_GREEN = "\u001B[32m";
	    final String ANSI_YELLOW = "\u001B[33m";
		
	    Random random = new Random();
	    int candiesRequest = 0;
		int candiesStock = 50;
		double candiesPrice = 0.5;
		double candiesPriceTotal = 0;
		
		while(candiesStock>0) 
		{
			suspenceTimerTwoSeconds();
			System.out.println("ENTRA UN NUOVO CLIENTE!");
			suspenceTimerOneSecond();
			System.out.println(ANSI_GREEN + "Salve, quante caramelle desidera acquistare? Sarebbero disponibili "+ candiesStock + " caramelle. . ." + ANSI_RESET);
			candiesRequest = random.nextInt(1,20);
			suspenceTimerOneSecond();
			System.out.println(ANSI_YELLOW + "Salve vorrei " + candiesRequest + " caramelle!"+ ANSI_RESET);
			
			if (candiesRequest>candiesStock) 
			{
				suspenceTimerOneSecond();
				System.out.println(ANSI_GREEN + "Mi dispiace ma ci sono rimaste solo " + candiesStock + " caramelle." + ANSI_RESET);
				suspenceTimerOneSecond();
				System.out.println(ANSI_YELLOW + "Va bene allora vorrei acquistare le rimanenti che avete."+ ANSI_RESET);
				candiesRequest = candiesStock;
			}
			candiesPriceTotal = candiesRequest * candiesPrice;
			int transactionDollar = (int) candiesPriceTotal;
			double totalCents = (candiesPriceTotal - transactionDollar) * 100;
			int transactionCents =(int) totalCents;
			suspenceTimerOneSecond();
			System.out.println(ANSI_GREEN + "Benissimo sono " + transactionDollar + " dollaro/i e " + transactionCents + " centesimi." + ANSI_RESET);
			suspenceTimerOneSecond();
			System.out.println(ANSI_YELLOW + "Ecco qua, arrivederci!"+ ANSI_RESET);
			suspenceTimerOneSecond();
			System.out.println(ANSI_GREEN + "Grazie e arrivederci!\n " + ANSI_RESET);
			candiesStock -= candiesRequest;
			
			if(candiesStock<=0) 
			{
				suspenceTimerOneSecond();
				System.out.println(ANSI_RED + "LE CARAMELLE SONO FINITE IL NEGOZIO E' CHIUSO" + ANSI_RESET);
				return;
			}
		}
	}
	
	public static void suspenceTimerOneSecond() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void suspenceTimerTwoSeconds() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}