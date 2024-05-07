package incapsulamento;

public class Main {
	
	public static void main(String[] args) {
		 
		Display d1 = new Display("DispAAA","a03","1024 x 1080");
		
		Display d2 = new Display(); 
		d2.setModello("DispBBB");
		d2.setMarca("b02");
		d2.setRisoluzione("1080x1980");
		
		System.out.println(d2.toString());
		
		// creo tablet
		Tablet tab1 = new Tablet();
		// assegno valori tramite setters
		tab1.setMarca("Samsung");
		tab1.setModello("abc1");
		tab1.setImeiSerial("qweqweqrr12314");
		tab1.setDisplay(d1);
		
		System.out.println(tab1.toString());
		
	}	
}
