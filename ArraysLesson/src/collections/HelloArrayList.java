package collections;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloArrayList {

	public static void main(String[] args) {
		
		// ArrayList diversamente array non possiede misura fissa
		ArrayList<String> animals = new ArrayList<String>();
		
		// .add metodo che permette di popolare lista
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Canarino");
		animals.add("Shark");
		
		// per richiamare un elemento uso il .get
		System.out.println(animals.get(0));
		System.out.println(animals.get(2));
		
		// l'arraylist è scalabile, posso anche rimuovere un elemento
		animals.remove(0);
		
		// .size aiuta a conoscera la misura lunghezza array
		System.out.println("array list length is " + animals.size());
		
		for (int i=0; i< animals.size(); i++) 
		{
			System.out.println(animals.get(i));
		}
		
		System.out.println("Stampo con il foreach");
		animals.add("Dolphin");
		animals.add("Ostrich");
		
		for (String animal : animals) 
		{
			System.out.println(animal);
		}
		
		// Faccio un arrayList di numeri
		// Nell'operatore diamond del costruttore posso non dichiarare la classe Wrapper
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(10);
		marks.add(5);
		marks.add(12);
		marks.add(1);
		
		for (Integer mark : marks) {
			System.out.println(mark);
		}
		
		// per creare arraylist posso far riferimentonto al tipo List
		List<String> words = new ArrayList<>();
		words.add("Ciao");
		words.add("come");
		words.add("stai?");
		
		for (String word : words) {
			System.out.println(word);
		}
		
		List<String> names = new ArrayList<>(
				Arrays.asList("Dario","Luisa","Gennaro","Pasquale","Anna","Luca"));
		
		for (String name : names) {
			System.out.println(name);
		}
		
		// voglio creare un array partendo da un Arraylist
		List<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("yellow");
		colors.add("blue");
		colors.add("verde");
		colors.add("rosa");
		colors.add("bianco");
		colors.add("nero");
		
		// definisco l'array partendo dalla List
		String[] colorsPR = new String[colors.size()];
		
		for (int i=0; i<colors.size(); i++) 
		{
			colorsPR[i] = colors.get(i);
		}
		
		// uso un ciclo for per far scorrere arrayPR
		System.out.println("Colori power rangers");
		for (String colorPR : colorsPR) 
		{
			System.out.print(colorPR + " ");
		}
		
		Collections.reverse(colors);
		
		System.out.println("\ncolori invertiti");
		for (String color : colors) 
		{
			System.out.print(color + " ");
		}
		
		Collections.shuffle(colors);
		
		System.out.println("\ncolori mischiati");
		for (String color : colors) 
		{
			System.out.print(color + " ");
		}
		
		Collections.sort(colors);
		
		System.out.println("\ncolori ordinati");
		for (String color : colors) 
		{
			System.out.print(color + " ");
		}
		
		// ordine inverso con Comparator
		Collections.sort(colors, Collections.reverseOrder());
		
		System.out.println("\ncolori ordinati secondo un parametro che poi viene invertito");
		for (String color : colors) 
		{
			System.out.print(color + " ");
		}
	}
}
