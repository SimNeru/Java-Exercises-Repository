package forme;

public class Segmento {

	// il segmento è definito a partire da due punti
	// Punto a;
	// Punto b;
	
	public Punto a,b;
	public double lunghezza;
	
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}
	
	// teorema di pitagora
	public double calcolaLunghezzaSegmento() 
	{
		this.lunghezza = Math.sqrt(Math.pow((b.x - a.x),2) + Math.pow((b.y - a.y),2));
		return lunghezza;
	}

	@Override
	public String toString() {
		return "Segmento{\na=" + a + "\nb=" + b +"}";
	}
	
}
