package forme;

public class AreaCerchio {

	public static void main(String[] args) {
		
		final double PI = 3.1415;
		double ray = 12;
		double area = PI * ray * ray;
		String stringValues = "::::CIRCLE::::\nRay: " + ray +"\nPi: " + PI + "\nArea: " + area;
		
		System.out.println(stringValues);
	}
}