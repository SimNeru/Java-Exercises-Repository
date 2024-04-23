package a_classeIntro;

import java.text.DecimalFormat;

public class RettangoloTest3 {

	String nomeFigura;
	double altezza;
	double base;

	// ATT: metodo costruttore default lo vado a specificare solo se prevedo farne
	// uso
	// alt + shift + s
//	public RettangoloTest3(double altezza, double base) {
//		super();
//		this.altezza = altezza;
//		this.base = base;
//	}

	public RettangoloTest3(double altezza, double base, String nomeFigura) {
		super();
		this.altezza = altezza;
		this.base = base;
		this.nomeFigura = nomeFigura;
	}

	// costruisco dei metodi per la mia classe
	public double calculateArea() {
		// il double rapresenta il tipo di valore che restituirà
		return this.base * this.altezza;
	}

	public double calculatePerimeter() {
		return (this.base + this.altezza) * 2;
	}
	
	public double calculateVolume(double profondita) 
	{
		double volume = calculateArea() * profondita;
		return volume;
	}
	
	@Override
	public String toString() {
		return "RettangoloTest3 [nomeFigura=" + nomeFigura + ", altezza=" + altezza + ", base=" + base + "]";
	}

	public static void main(String[] args) {
		
		RettangoloTest3 rettangolo = new RettangoloTest3(8.5, 6.4, "Rettangolino");
		System.out.println(rettangolo.toString());
		System.out.println("Area: " + Math.floor((rettangolo.calculateArea() * 100) / 100));
		System.out.println("Perimeter: " + rettangolo.calculatePerimeter());
		String var = new DecimalFormat("#.##").format(rettangolo.calculateArea());
		System.out.println("Area: " + var);

		System.out.println("Il volume vale: " + new DecimalFormat("#.##").format(rettangolo.calculateVolume(5)));
	}
}