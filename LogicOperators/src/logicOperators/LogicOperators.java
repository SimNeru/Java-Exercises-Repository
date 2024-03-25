package logicOperators;

import java.util.Random;

public class LogicOperators {

	public static void main(String[] args) {
		
		
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
		*/
		
		Random random = new Random();
		
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
		}
	}
}