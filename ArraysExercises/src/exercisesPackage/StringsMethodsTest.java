package exercisesPackage;

public class StringsMethodsTest {
	
	public static void stringMethodsTest() 
	{
		/*
		 * 	Es.1a
		 *	Usare metodi lenght(), concat(String) e toUpperCase() su stringhe e verificare il risultato in output.
		 *	Parole esempio : Java; Script
		 */
		
		String stringToTest = "Java";
		String stringToTestTwo = "Script";
		
		System.out.println(stringToTest.length()); // lunghezza stringa
		System.out.println(stringToTest.concat(" " + stringToTestTwo)); // stampa una stringa affiancata ad un altra
		System.out.println(stringToTest.toUpperCase()); // stampa la stringa in caratteri maiuscoli
	}

}
