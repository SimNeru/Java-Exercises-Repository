package utils;

import java.io.File;
import java.io.PrintWriter;

public class LeggiScriviFile {

	public static void scrivi(File f, String source) 
	{
		try {
				PrintWriter out = new PrintWriter(f);
				out.print(source);
				out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
