package dictionary;

import java.io.IOException;

import model.Board;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String filename = "C:\\Users\\RoguskiA\\Documents\\private\\java\\eclipseworkspace\\cwdb.txt";
		InteliCwDB krzyzowka = new InteliCwDB(filename);
		try {
			krzyzowka.createDB(filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Board board = new Board();
		
	

	}

}
