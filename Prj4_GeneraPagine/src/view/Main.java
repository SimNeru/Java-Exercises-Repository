package view;

import java.io.File;

import model.Prodotto;
import utils.LeggiScriviFile;

public class Main {

	public static void main(String[] args) {

		Prodotto p = new Prodotto();
		p.setId(10124);
		p.setCodice("ABC123");
		p.setMarca("Pippus");
		p.setPrezzo(2850);
		
		File destinazione = new File("./paginaWebProdotto.html");
		LeggiScriviFile.scrivi(destinazione, p.generaHTML());
		
		File destinazioneJSON = new File("./formatoJson.json");
		LeggiScriviFile.scrivi(destinazioneJSON, p.generaJSON());
		
		File destinazioneXML = new File("./formatoXML.xml");
		LeggiScriviFile.scrivi(destinazioneXML, p.generaXML());
	}

}
