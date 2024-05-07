package model;

public class Prodotto implements IGeneraDati {
	
	private long id;
	private String marca;
	private String codice;
	private double prezzo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String generaHTML() {
		String html = "<h1>" + this.marca + "</h1>";
		html += "<p> ID: " + getId() + "</p>" +
				"<p> CODICE:" + getCodice() + "</p>" +
				"<p> PREZZO: <strong>" + getPrezzo() + "</strong></p>";
		return html;
	}
	@Override
	public String generaXML() {
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n"
				+ "<root>\r\n"
				+ "  <id>" + this.id + "</id>\r\n"
				+ "  <codice>" + this.codice + "</codice>\r\n"
				+ "  <marca>" + this.marca + "</marca>\r\n"
				+ "  <prezzo>" + this.prezzo + "</prezzo>\r\n"
				+ "</root>";
		return xml;
	}
	@Override
	public String generaJSON() {
		String json = "{ \"id\": " + this.id + ", \"marca\": '" + this.marca + ", \"prezzo\": " + this.prezzo + "}";
		return json;
	}
}
