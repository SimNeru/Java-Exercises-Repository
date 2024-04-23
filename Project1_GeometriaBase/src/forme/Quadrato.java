package forme;

public class Quadrato extends Rettangolo {

	// Il quadrato è un lato ripetuto quattro volte
	public Segmento lato;

	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.lato = lato;
	}

	@Override
	public String toString() {
		return "\nQuadrato{\nlato=" + lato + "\nperimetro= "+ getPerimetro() + "\narea= " + getArea() + "\n}";
	}
}
