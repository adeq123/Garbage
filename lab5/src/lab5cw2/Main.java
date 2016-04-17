package lab5cw2;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args)  {
		
		String inputPath = "C:\\Users\\RoguskiA\\Documents\\private\\java\\lab5\\gravity.txt";
		String outputPath = "C:\\Users\\RoguskiA\\Documents\\private\\java\\lab5\\output.txt";
		
		try {
			MicroDVDdelayer.microDVDdelayer(inputPath, outputPath,10, 10000);
		} catch (WrongDataException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Nie poprawne dane wejsciowe");

		}catch (IOException e){
			e.printStackTrace();
			System.out.println("Blad wejscia wyjscia");
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("Nieznany typ wyjatku");
		}
		
		
	}

}
