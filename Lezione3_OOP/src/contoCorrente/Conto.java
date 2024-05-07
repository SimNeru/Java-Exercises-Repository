package contoCorrente;

public class Conto {
	private double numConto;
	private String intestatario;
	private double saldo;
	private String pinCarta;

	public String preleva(String pin, double importo) {
		if (pin.equals(pinCarta)) {
			if (saldo > importo) {
				saldo -= importo;
				return "Hai prelevato " + importo;
			} else {
				return "Non hai abbastanza soldi";
			}
		} else {
			return "Pin errato!";
		}
	}

	public String deposita(String pin, double importo) {
		if (pin.equals(pinCarta)) {
			saldo += importo;
			return "Hai depositato " + importo;
		} else {
			return "Pin errato!";
		}
	}

	public double getNumConto() {
		return numConto;
	}
	
	public void setNumConto(double numConto) {
		this.numConto = numConto;
	}
	
	public String getIntestatario() {
		return intestatario;
	}
	
	public void setIntestatario(String intestatario) {
		this.intestatario = intestatario;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setPinCarta(String pinCarta) {
		this.pinCarta = pinCarta;
	}

}
