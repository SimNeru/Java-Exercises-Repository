package terzo;

public class Terzo {

	public static void main(String[] args) {
		
		/* ELENCO TIPI DI DATI Primitivi:
		 * boolean: vero, falso (0, 1)
		 * int: numeri interi
		 * double: numeri con virgola
		 * char: un singolo carattere ASCII
		 * String: array di char ASCII */
		
		int age = 18;
		double height = 1.80;
		String name = "Simone Nerucci";
		char sex = 'M';
		boolean adult = age >= 18 ? true : false;
		
		//Stampo "l'anagrafica"
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height + "m");
		System.out.println("Sex: " + sex);
		System.out.println("Adult: " + adult);
		
		Terzo.printMessage();
		
		Terzo terzo = new Terzo();
		terzo.printMessage2();
		
		///////////////////////////////////////////////////////////////////////////////
		
		//assegno due value interi
		int primo = 10;
		int secondo = 5;
		//assegno a un value la somma di altri due
		int result = primo + secondo;
		//Stampo la variabile
		System.out.println("Somma: " + primo + " + " + secondo + " = " + result);
		result = primo * secondo;
		System.out.println("Moltiplicazione: " + primo + " x " + secondo + " = " + result);
		result = primo / secondo;
		System.out.println("Divisione: " + primo + " : " + secondo + " = " + result);
		result = primo - secondo;
		System.out.println("Sottrazione: " + primo + " - " + secondo + " = " + result);
		
		///////////////////////////////////////////////////////////////////////////////
		
		//assegnazione valore char
		char a1 = 'a';
		char a2 = 'b';
		char a3 = 'c';
		//Stampo i char affiancati
		System.out.println("Char affiancati: " + a1 + "" + a2 + "" + a3);
		
		//Assegno variabile char un valore
		char aMaiuscola = 65;
		//Stamperà il char assegnato a 65 sulla scala ASCII
		System.out.println("Valore ASCII 65: "+ aMaiuscola);
		aMaiuscola++;
		System.out.println("Valore ASCII 66: "+ aMaiuscola);
		aMaiuscola--;
		System.out.println("Valore ASCII 65: "+ aMaiuscola);
		
		///////////////////////////////////////////////////////////////////////////////
		
		//final è la keyword per indicare un valore costante
		final double pi = 3.1415;
		
		///////////////////////////////////////////////////////////////////////////////

		//tipi dati interi dal più piccolo al più grande
		byte b; // -128 +127 valori 2^8=256 // il più piccolo valore
		short s; // -32768 32767 +65000 2^16
		long l; // tipo dato più grande
		
		//CAST IMPLICITO
		int i = 56;
		long lunga = i;
		
		int a = 10;
		double dbl = (double) a;
		float flt = a;
		System.out.println(flt);
		
		//CAST ESPLICITO
		long myLong = Long.MAX_VALUE;
		long prova = 9223372036854775807l;
		System.out.println(myLong);
		int myInt = (int) myLong;
		System.out.println(myInt);
		int test = 130;
		byte myByte = (byte) test;
		System.out.println(myByte);
		
		byte myByteSecond = 12;
		byte myByteThird = 15;
		//Java ha come predef Int quindi considera operazione somma tale
		byte totBytes = (byte)(myByteSecond + myByteThird);
		
		//CLASSI WRAPPER
		//Esistono classi per tipi primitivi per espandere utilizzi ed utilità
		Integer intValue = 123;
		Double dblValue = 3.14;
		Character charValue = 'x';
		Boolean boolValue = true;
		
		System.out.println(Character.toUpperCase(charValue));
		
		String strValue = "TRUE";
		//converto stringa a caratteri minuscoli
		String strValueLowerCase = strValue.toLowerCase();
		//converto stringa a boolean
		Boolean strValueToBoolean = Boolean.parseBoolean(strValueLowerCase);
		
		//stampo
		System.out.println(strValueToBoolean);
		
		String one = "1";
		//converto stringa in integer
		int strValueToInt = Integer.parseInt(one);
		
		//stampo
		System.out.println(strValueToInt);
		
		int ten = 10;
		String intValueToString = Integer.toString(ten);
		
		//stampo
		System.out.println(intValueToString);
		
		//trovo valore maggiore tra due integer values
		int firstValue = 1;
		int secondValue = 100;
		int maxValue = Integer.max(firstValue, secondValue);
		System.out.println(maxValue);
		
		int x = 10;
		System.out.println(++x); //pre incremento
		System.out.println(x++); //post incremento

		///////////////////////////////////////////////////////////////////////////////

		int var1 = 3;
		int var2 = 8;
		System.out.println(var1 + " " + var2);
		
		int var3 = var1;
		var1 = var2;
		var2 = var3;
		System.out.println(var1 + " " + var2);
		
		///////////////////////////////////////////////////////////////////////////////

	}
	
	public static void printMessage() 
	{
		System.out.println("Hello There!");
	}
	
	public void printMessage2() 
	{
		System.out.println("How's going?");
	}
}