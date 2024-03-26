package logicOperators;

import java.lang.reflect.Array;
import java.sql.Date;
import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class LogicOperators {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		/*
		// TESTING OPERATORS
		System.out.println(10>8 && 7<6); //false
		System.out.println(9>5 && 5==5); //true
		System.out.println(10>8 || 7<6); //true
		System.out.println(4<3 || 7>9); //false
		
		//precedenza operatori && prima di ||
		System.out.println(4<3||7>9&&2>1); //false
		System.out.println((4<5||7>9)&&2>1); //true
		*/
		
		/*
		boolean isSunny = true;
		int temp = 25;
		
		if (isSunny && temp>=20) 
		{
			System.out.println("esco");
		}
		else
		{
			System.out.println("sto a casa");
		}
		*/
		
		/*
		// CONTROLLO VOTI PROMOSSO/BOCCIATO
		int x = 8;
		int y = 7;
		int k = 8;
		boolean firstCheck = x>=6&&y>=6&&k>=6 ? true : false;
		boolean secondCheck = (x>=6 || y>=6) && k>6? true : false;
		boolean thirdCheck = (y>=6 || k>=6) && x>6? true : false;
		boolean fourthCheck = (x>=6 || k>=6) && y>6? true : false;
		
		if (firstCheck) 
		{
			System.out.println("promosso");
		}
		else if (secondCheck || thirdCheck || fourthCheck)
		{
			System.out.println("rimandato");
		}
		else
		{
			System.out.println("bocciato");
		}	
		
		System.out.println("Inserisci ore e minuti");
		int hours = random.nextInt(0,24);
		int minutes = random.nextInt(0,60);
		
		System.out.println("Ore: " + hours);
		System.out.println("Minuti: " + minutes);
		
		if (hours<0) 
		{
			System.out.println("Ore invalide");
		} else if(hours>23)
		{
			System.out.println("Orare invalide");
		} else if(minutes<0)
		{
			System.out.println("Minuti invalidi");
		} else if(minutes>59)
		{
			System.out.println("Minuti invalidi");
		}
		
		if ((hours<0 || hours>23) || ( minutes<0 || minutes > 59)) 
		{
			System.out.println("Orario invalido");
		}
		else
		{
			System.out.println("Orario valido");
		}
		
		boolean hoursBool = (hours>=0)&&(hours<24);
		boolean minutesBool = (minutes>=0)&&(minutes<60);
		
		if (hoursBool && minutesBool) 
		{
			System.out.println("Valid Time");
		}
		else
		{
			System.out.println("Invalid Time");
		}*/
		
		//OPERATORE TERNARIO
		int mark = 8;
		String result = mark >= 6 ? "promosso" : "bocciato";
		
		System.out.println(result);
		
		int height = 190;
		String heightResult = height > 150 ? "alto" : "basso";
		
		System.out.println(heightResult);
		
		int a = 10; 
		int b = 10;
		
		if (a>b) 
		{
			System.out.println("A è maggiore");
		} 
		else if (b>a)
		{
			System.out.println("B è maggiore");
		} 
		else 
		{
			System.out.println("Sono uguali");
		}
		
		String max = (a>b) ? "A" : (b>a) ? "B" : "UGUALI";
		System.out.println("Max is: " + max);
		
		int i = 0;
		switch (i) {
		case 0: 
			System.out.println("i = 0");
			break;
		case 1: 
			System.out.println("i = 1");
			break;
		case 2: 
			System.out.println("i = 2");
			break;
		default:
			System.out.println("i è diverso da 0,1,2");
			break;
		}
		
		int day = LocalDate.now().getDayOfWeek().getValue();
		switch (day) {
		case 1: 
			System.out.println("Oggi è lunedì");
			break;
		case 2: 
			System.out.println("Oggi è martedì");
			break;
		case 3: 
			System.out.println("Oggi è mercoledì");
			break;
		case 4: 
			System.out.println("Oggi è giovedì");
			break;
		case 5: 
			System.out.println("Oggi è venerdì");
			break;
		case 6: 
			System.out.println("Oggi è sabato");
			break;
		case 7: 
			System.out.println("Oggi è domenica");
			break;
		default:
			System.out.println("ERRORE DATA");
			break;
		}
		
		String lettera = "f";
		String messaggio;
		
		switch (lettera) {
		case "a": 
		case "e": 
		case "i": 
		case "o": 
		case "u": 
			messaggio = lettera + "è una vocale";
			break;
		default:
			messaggio = lettera + " è una consonante";
			break;
		}
		System.out.println(messaggio);
		
		////////////////////////////////////////////////////////////////////////////////////////
		switch (lettera) {
		case "a", "e", "i", "o", "u" -> messaggio = lettera + "è una vocale";
		default -> messaggio = lettera + " è una consonante"; }
		System.out.println(messaggio);
		
		////////////////////////////////////////////////////////////////////////////////////////
		messaggio = switch (lettera) {
		case "a", "e", "i", "o", "u" -> lettera + "è una vocale";
		default -> lettera + " è una consonante"; };
		System.out.println(messaggio);
		
		////////////////////////////////////////////////////////////////////////////////////////*/
		
		int randomMonth = random.nextInt(1,13);
		int randomYear = random.nextInt(1,2025);
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, randomYear);
		c.set(Calendar.MONTH, randomMonth);
		messaggio = switch(c.get(Calendar.MONTH) {case 11, 4, 6, 9 -> date.getMonth() + " ha 30 giorni";
		case 2 -> date.getMonth() + " ha 28 giorni" ;
		default -> date.getMonth() + " ha 31 giorni";
		};
		System.out.println(messaggio);
	
		/*System.out.println("Inserisci mese: ");
		String mese = input.nextLine().toLowerCase();
		messaggio = switch(mese) {case "novembre", "aprile", "giugno", "settembre" -> mese + " ha 30 giorni";
		case "febbraio" -> mese + " ha 28 giorni";
		default -> mese + " ha 31 giorni";
		};
		System.out.println(messaggio);*/
		
	}
}