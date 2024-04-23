package forme;

public class Triangolo {
	
	public Punto a,b,c;
	public Segmento ab,bc,ca;
	double perimetro;
	double sp;
	double area;
	
	// Definisco il costruttore del triangolo partendo da tre punti
	public Triangolo(Punto a, Punto b, Punto c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
		
		// Definisco dentro il costruttore i segmenti
		this.ab = new Segmento(a,b);
		this.bc = new Segmento(b,c);
		this.ca = new Segmento(c,a);
	}
	
	// Formula perimetro
	public double getPerimetro() 
	{
		perimetro = ab.calcolaLunghezzaSegmento() + bc.calcolaLunghezzaSegmento() + ca.calcolaLunghezzaSegmento();
		return perimetro;
	}
	
	// Formula di Erone
	public double getArea() 
	{
		sp = getPerimetro()/2;
		area = Math.sqrt(sp*((sp-ab.lunghezza)*(sp-bc.lunghezza)*(sp-ca.lunghezza)));
		return area;
	}

	@Override
	public String toString() {
		return "Triangolo [ab=" + ab + ", bc=" + bc + ", ca=" + ca + ", perimetro=" + Math.ceil(getPerimetro()) + ", area=" + Math.ceil(getArea())
				+ "]";
	}
	
}
