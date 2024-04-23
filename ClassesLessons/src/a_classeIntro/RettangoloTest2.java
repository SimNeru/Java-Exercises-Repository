package a_classeIntro;

public class RettangoloTest2 {
	
	double altezza;
	double base;

	// esiste il costruttore di defaul il seguente
	// il seguente metodo costruttore è a firma vuota
	// NOTA: Non è good practice tenerlo
//	public RettangoloTest2() 
//	{
//		super();
//	}
	
	// creo il metodo costruttore con firma piena
	public RettangoloTest2(double base, double altezza) 
	{
		// this.altezza permette il riferimento alla proprietà di classe
		// altezza fa riferimento al parametro passato al costruttore
		this.altezza = altezza;
		this.base = base;
	}
	
	@Override
	public String toString() {
		return "RettangoloTest2 [altezza=" + altezza + ", base=" + base + "]";
	}

	public static void main(String[] args) {
		
		RettangoloTest2 rettangoloTest2 = new RettangoloTest2(4.2, 7.4);
		System.out.println(rettangoloTest2.toString());
		
		double area = rettangoloTest2.altezza * rettangoloTest2.base;
		double perimeter = (rettangoloTest2.altezza + rettangoloTest2.base) * 2;
		
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}
}
