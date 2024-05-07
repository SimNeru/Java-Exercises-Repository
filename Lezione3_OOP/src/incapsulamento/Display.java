package incapsulamento;

public class Display {
	
	private String marca;
	private String modello;
	private String risoluzione;
	
	public Display() {}
	
	public Display(String marca, String modello, String risoluzione) {
		this.marca = marca;
		this.modello = modello;
		this.risoluzione = risoluzione;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getRisoluzione() {
		return risoluzione;
	}

	public void setRisoluzione(String risoluzione) {
		this.risoluzione = risoluzione;
	}

	@Override
	public String toString() {
		return "Modello: " + getModello() + 
				" - Marca: " + getMarca() + 
				" - Risoluzione: " + getRisoluzione();
	}
	
	
}
