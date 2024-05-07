package a_esEreditarieta;

public class Main {
	
	public static void main(String[] args) {
		
		Smartphone sp1 = new Smartphone(0, "S22", "Un telefono fico", 499, "Samsung", 6.5, 8, 128);
		System.out.println(sp1.descriviProdotto());
	
		Libro l1 = new Libro(1, "Il visconte dimezzato", "Ciclo calvinismo", 12.0, "Mondadori", "Italo Calvino");
		System.out.println(l1.descriviProdotto());
	}

}
