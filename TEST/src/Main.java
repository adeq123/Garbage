import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("C://test//tst.txt", true)));
		
		writer.write("raz");
		writer.write("raz");
		writer.close();
	
		writer.write("raz");
		writer.write("raz");
		writer.close();
		//writer1.write("raz");
		//writer1.write("raz");
	 
	
		/*
		try(PrintWriter out = new PrintWriter ("C://test//tst.txt")){
			out.println("raz");
		};
		
		try(PrintWriter out = new PrintWriter ("C://test//tst.txt")){
			out.println("raz");
		};
		*/
	}

}
