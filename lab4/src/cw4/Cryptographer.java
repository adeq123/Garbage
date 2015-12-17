package cw4;
import java.io.*;
/**
 * This class model crypting and decrypting of file for a given algorithm
 * @author RoguskiA
 *	@version 1.0
 *
 */
public class Cryptographer {
	
	/**
	 * This method reads the file (toCypher) andd crypt it according to a give algorithm (algo) and write crypted text to file (Crypted)
	 * @param toCypher, a File, file with text to be crypted
	 * @param Cyphred, a File, file whre crypted text is stored
	 * @param algo, Algorithm, algorith used to crypting
	 * @throws IOException 
	 */
	public static void cryptFile (File toCrypt, File Crypted, Algorithm algo) throws IOException{
		
		BufferedReader czytaj = new BufferedReader(new FileReader(toCrypt.getAbsolutePath()));
		String line = czytaj.readLine();
		String word [] = line.split(" ");
		
		} 
	
	/**
	 * This method reads the file (toCypher) andd crypt it according to a give algorithm (algo) and write crypted text to file (Crypted)
	 * @param toCypher, a File, file with text to be crypted
	 * @param Cyphred, a File, file whre crypted text is stored
	 * @param algo, Algorithm, algorith used to crypting
	 */
	public static void decryptFile (File toDecypher, File decyphred, Algorithm algo){
		
		}

}
