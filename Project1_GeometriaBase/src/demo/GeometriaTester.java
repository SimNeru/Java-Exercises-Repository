package demo;

import forme.Punto;
import forme.Quadrato;
import forme.Rettangolo;
import forme.Segmento;
import forme.Triangolo;

public class GeometriaTester {

	public static void main(String[] args) {

		Punto a = new Punto(2,3);
		Punto b = new Punto(5,3);
		Segmento ab = new Segmento(a, b);
		System.out.println(ab.calcolaLunghezzaSegmento());
	
		// creo un quadrato
		Quadrato q1 = new Quadrato(ab);
		// System.out.println(q1.toString());
		
		// creo un triangolo
		Punto c = new Punto(4,8);
		Triangolo tr1 = new Triangolo(a,b,c);
		// System.out.println(tr1);
		
		// creo rettangolo
		Segmento bc = new Segmento(b,c);
		Rettangolo ret1 = new Rettangolo(ab, bc);
		System.out.println(ret1);
	}
	
}
