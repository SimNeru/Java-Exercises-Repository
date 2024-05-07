package contoCorrente;

public class Main {

	public static void main(String[] args) {

		Conto conto = new Conto();
		conto.setPinCarta("1234");
		conto.setIntestatario("Me");
		conto.setNumConto(1);

		System.out.println(conto.deposita("1234", 50));
		System.out.println(conto.preleva("1234", 25));
		System.out.println("Ti restano tot soldi " + conto.getSaldo());

		System.out.println(conto.deposita("1234", 50));
		System.out.println(conto.preleva("134", 25));
		System.out.println("Ti restano tot soldi " + conto.getSaldo());
	}

}
