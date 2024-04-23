package a_classeIntro;

public class RettangoloTest {

	// Dichiaro degli Attributi
	int base;
	int altezza;
	int area;
	int perimetro;
	
	// costruttore
	public RettangoloTest() 
	{
	};
	
	// costruttore overload
	public RettangoloTest(int base, int altezza) 
	{
		this.base = base;
		this.altezza = altezza;
		this.area = this.base*this.altezza;
		this.perimetro = (this.base*2)+(this.altezza*2);
	}
	
	public int calculateArea() 
	{
		return this.base * this.altezza;
	}
	
	public int calculatePerimeter() 
	{
		return (this.base*2)+(this.altezza*2);
	}
	
	@Override
	public String toString() {
		return "RettangoloTest [base=" + base + ", altezza=" + altezza + "]";
	}

	public static void main(String[] args) {
		
		// Costruisco oggetto, costruisco il costruttore di default. 
		// I costruttori hanno lo stesso nome della classe
		
		// Creo nuovo oggetto rettangolo Istanza della classe RettangoloTest
		RettangoloTest rettangolo = new RettangoloTest();
		rettangolo.base = 5;
		rettangolo.altezza = 6;
		
		System.out.println(rettangolo.toString());
		System.out.println("L'area è: " + rettangolo.calculateArea());
		System.out.println("Il perimetro è: " + rettangolo.calculatePerimeter());
		
		// Istanzio un nuovo oggetto di tipo rettangolo
		RettangoloTest rettangolo2 = new RettangoloTest(3,2);
		System.out.println(rettangolo2.toString());
		System.out.println("L'area è: " + rettangolo2.calculateArea());
		System.out.println("Il perimetro è: " + rettangolo2.calculatePerimeter());

		// Istanzio un nuovo oggetto di tipo rettangolo
		RettangoloTest rettangolo3 = new RettangoloTest(3,2);
		System.out.println(rettangolo3.toString());
		System.out.println("L'area è: " + rettangolo3.area);
		System.out.println("Il perimetro è: " + rettangolo3.perimetro);
	}
	
}
