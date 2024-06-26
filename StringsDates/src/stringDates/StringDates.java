package stringDates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class StringDates {

	public static void main(String[] args) {
				
		//data di oggi
		Date today = new Date();
		System.out.println(today);
		
		//data in formato americano
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//ora con millisecondi
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		//data e ora locale
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(date.format(formatterDate));
		
		DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy 'Ora: 'HH:mm:ss \n'Giorno:' EEEE dd', Mese:' MMMM");
		//alla data senza ora applico il formato creato con dateTimeFormat
		System.out.println(localDateTime.format(formatterDateTime));

		//Estrarre parti di data
		int dayNumber = LocalDate.now().getDayOfMonth();
		System.out.println(dayNumber);
		
		String dayName = LocalDate.now().getDayOfWeek().name();
		System.out.println(dayName);
		
		String monthName = LocalDate.now().getMonth().name();
		System.out.println(monthName);
		
		int year = LocalDate.now().getYear();
		System.out.println(year);
		
		//nomi in italiano
		String nameDayItalian = LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY).toUpperCase();
		System.out.println(nameDayItalian);
		
		String nameMonthItalian = LocalDate.now().getMonth().getDisplayName(TextStyle.FULL, Locale.ITALY).toUpperCase();
		System.out.println(nameMonthItalian);
		
		//////////////////////////////////////////////////////////////////////////////
		
		String firstWord = "Hello ";
		String secondWord = "World!";
		String thirdWord = firstWord + secondWord;
		System.out.println(thirdWord);
		
		int lenght = thirdWord.length();
		System.out.println(lenght);
		
		boolean startsWith = thirdWord.startsWith("Hello");
		System.out.println(startsWith);
		
		boolean endsWith = thirdWord.endsWith("world!");
		System.out.println(endsWith);
		
		int positionOf = thirdWord.indexOf("!");
		System.out.println(positionOf);
		
		/////////////////////////////////////////////////////////////////////////////
		
		String name = "Fabio";
		char ch = name.charAt(2);
		System.out.println(ch);
		
		int lenghtName = name.length();
		char penUltimate = name.charAt(lenghtName-2);
		
		System.out.println(penUltimate);
		
		/////////////////////////////////////////////////////////////////////////////
		
		String myString = "Hello@mail.com";
		System.out.println(myString.contains("@"));
		
		boolean dosntContain = myString.contains("?");
		System.out.println(dosntContain);
		
		int x = 10;
		int y = 10;
		System.out.println("x = y? " + (x==y));
		
		String a = "abcd";
		String b = "abcd";
		System.out.println("a equals b? "+ a.equals(b));
		
		String c = "ABCD";
		boolean equalsNoCase = a.equalsIgnoreCase(c);
		System.out.println("a equals c? "+ equalsNoCase);
		
		//indici superiori non cosiderati ne devono essere aggiunto 1
		String fourthWord = "hello everyone";
		String everyone = fourthWord.substring(6,11);
		System.out.println(everyone);
		
		String fifthWord = fourthWord.substring(0,4);
		System.out.println(fifthWord);
		
		/////////////////////////////////////////////////////////////////////////////

		//per generare numeri casuali
		Random r = new Random();
		int casual = r.nextInt(); //un numero casuale da -2^31 fino 2^31
		System.out.println(casual);
		
		//estremi superiori non vengono considerati
		int casualWithExtremes = r.nextInt(0,6);
		System.out.println(casualWithExtremes);
		
		int casualExtreme = r.nextInt(Integer.MAX_VALUE);
		System.out.println(casualExtreme);
		
		double casualDouble = r.nextDouble(11);
		System.out.println(casualDouble);
		
		System.out.println(r.nextBoolean());
	}
}