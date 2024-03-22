package inputUserTwo;

import java.util.Scanner;

public class InputUserTwo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Come ti chiami?");
		String name = input.nextLine();
		System.out.println("Ti chiami " + name);
		
		System.out.println("Quanti anni hai?");
		//impedisce la lettura di invio come keyword
		int age = input.nextInt();
		System.out.println("Hai " + age + " anni");
		
		//registra "invio" come keyword
		input.nextLine();
		
		System.out.println("Qual'è il tuo colore preferito?");
		String color = input.nextLine();
		System.out.println("Il tuo colore preferito è il " + color);
	}

}
