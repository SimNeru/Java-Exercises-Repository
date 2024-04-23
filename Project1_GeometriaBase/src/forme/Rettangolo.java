package forme;

public class Rettangolo {
	
	public Segmento base;
	public Segmento altezza;
	
	public Rettangolo(Segmento base, Segmento altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public double getPerimetro() 
	{
		double perimetro = 2 * (base.calcolaLunghezzaSegmento() + altezza.calcolaLunghezzaSegmento());
		return perimetro;
	}
	
	public double getArea() 
	{
		double area = base.calcolaLunghezzaSegmento() * altezza.calcolaLunghezzaSegmento();
		return area;
	}

	@Override
	public String toString() {
		return "Rettangolo\nbase=" + base + "\naltezza=" + altezza + 
				"\nperimetro=" + Math.ceil(getPerimetro()) + "\narea=" + Math.ceil(getArea());
	}
	
}
