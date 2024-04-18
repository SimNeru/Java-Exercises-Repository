package exercisesPackage;

import java.util.ArrayList;
import java.util.List;

public class StringFormatting {

	public static void main(String[] args) {

		String stringToFormat = "1234 abcd 5678 ahjxc !% bcaj";
		String formattedString = "";
		char[] correctChars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (int i = 0; i < stringToFormat.length(); i++) {
			char value = stringToFormat.charAt(i);
			for (int j = 0; j < correctChars.length; j++) {
				if (value == correctChars[j]) {
					formattedString += value;
					break;
				}
			}
		}
		System.out.println(formattedString);
	}
}