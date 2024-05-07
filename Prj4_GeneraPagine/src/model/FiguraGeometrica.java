package model;

public class FiguraGeometrica implements IGeneraDati {

	private String nome;
	private double lato1;
	private double lato2;
	private double lato3;
	private double lato4;
	private double lato5;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getLato1() {
		return lato1;
	}
	public void setLato1(double lato1) {
		this.lato1 = lato1;
	}
	public double getLato2() {
		return lato2;
	}
	public void setLato2(double lato2) {
		this.lato2 = lato2;
	}
	public double getLato3() {
		return lato3;
	}
	public void setLato3(double lato3) {
		this.lato3 = lato3;
	}
	public double getLato4() {
		return lato4;
	}
	public void setLato4(double lato4) {
		this.lato4 = lato4;
	}
	public double getLato5() {
		return lato5;
	}
	public void setLato5(double lato5) {
		this.lato5 = lato5;
	}
	@Override
	public String generaHTML() {
		String html = "<h1>" + getNome() + "</h1>";
		html += "<p>I lati sono: " + getLato1() + ", " + getLato2() + ", " + getLato3() + ", " + getLato4() + ", " + getLato5() + "</p>";
		return html;
	}
	@Override
	public String generaXML() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String generaJSON() {
		String json = "{ \"nome\": " + this.nome + ", \"lato1\": '" + this.lato1 +", \"lato2\": '" + this.lato2 +", \"lato3\": '" + this.lato3 +", \"lato4\": '" + this.lato4 +
				", \"lato5\": '" + this.lato5 +"}";
		return json;
	}
	
}
