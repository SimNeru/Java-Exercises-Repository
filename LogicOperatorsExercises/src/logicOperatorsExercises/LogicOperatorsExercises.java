package logicOperatorsExercises;

import java.util.Random;

public class LogicOperatorsExercises {

	public static void main(String[] args) {
		
		Random random = new Random();
		int month = random.nextInt(1,13);
		int year = random.nextInt(1,2025);

		System.out.println(monthCheck(month, year));
	}
	
	//restituisce un booleano per determinare se int passato come anno è bisestile oppure no
	public static boolean yearLeapCheck (int yearArg) 
	{
		if ((yearArg % 4 == 0) || (yearArg % 100 == 0 && yearArg % 400 == 0)) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//controlla i valori in int del mese e dell'anno per restituire 
    //una stringa che comunica il massimo dei giorni disponibili
	public static String monthCheck (int monthArg, int yearArg) 
	{
		//variabili per storare i dati
		String max30days =  " può avere massimo 30 giorni.";
		String max31days =  " può avere massimo 31 giorni.";
		String monthName;
		String result;
		
		// Assegna il nome del mese sottoforma di stringa
		switch (monthArg) 
		{
			case 1 :
				monthName = "Gennaio";
				break;
			case 2 :
				monthName = "Febbraio";
				break;
			case 3 :
				monthName = "Marzo";
				break;
			case 4 :
				monthName = "Aprile";
				break;
			case 5 :
				monthName = "Maggio";
				break;
			case 6 :
				monthName = "Giugno";
				break;
			case 7 :
				monthName = "Luglio";
				break;
			case 8 :
				monthName = "Agosto";
				break;
			case 9 :
				monthName = "Settembre";
				break;
			case 10 :
				monthName = "Ottobre";
				break;
			case 11 :
				monthName = "Novembre";
				break;
			case 12 :
				monthName = "Dicembre";
				break;
			default :
				monthName = "Error";
				break;
		}
		
		switch (monthArg) 
		{
		
		case 4, 6, 9, 11 :
			return monthName + " dell'anno " + yearArg + max30days;
		
		case 2 :
			if (yearLeapCheck(yearArg)) 
			{ 
				return yearArg + " è un ANNO BISESTILE e " + monthName + " può avere un massimo di 29 giorni";
			} 
			else 
			{
				return yearArg + " è un ANNO NON BISESTILE e " + monthName + " può avere un massimo di 28 giorni";
			}
			
		case 1, 3, 5, 7, 8, 10, 12 :
			return monthName + " dell'anno " + yearArg + max31days;

			default :
				return "Something went wrong";			
		}
	}
}