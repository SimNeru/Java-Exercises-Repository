package incapsulamento;

public class Tablet {
	
	private String imeiSerial;
	private String marca;
	private String modello;
	private Display display;
	
	public String getImeiSerial() {
		return imeiSerial;
	}
	public void setImeiSerial(String imeiSerial) {
		this.imeiSerial = imeiSerial;
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
	public Display getDisplay() {
		return display;
	}
	public void setDisplay(Display display) {
		this.display = display;
	}
	@Override
	public String toString() {
		return "Modello: " + this.getModello() + 
				" - Marca: " + this.getMarca() + 
				" - imeiSerial: " + this.getImeiSerial() +
				"\nDisplay: " + "Modello: " + getDisplay().getModello() + 
				" - Marca: " + getDisplay().getMarca() + 
				" - Risoluzione: " + getDisplay().getRisoluzione();
	}
	
}
