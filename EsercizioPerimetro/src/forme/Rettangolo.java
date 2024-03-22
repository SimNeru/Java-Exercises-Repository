package forme;

public class Rettangolo {
	
	/* Nuovo progetto, calcolo perimetro di un rettangolo che 
	 * ha base 25, altezza 40, output stampato*/

	public static void main(String[] args) {
		
		int width = 25;
		int height = 40;
		int perimeter = (width + height) * 2;
		String rectangle = ":::RECTANGLE:::\nWidth: " + width + "\nHeight: " + height + "\nPerimeter: " + perimeter;
		
		System.out.println(rectangle);
	}
}