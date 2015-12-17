/**
 * @author RoguskiA
 * @version 1.0
 */

public class Main {

	public static void main(String[] args) {
		Pesel peselAdriana = new Pesel("90010707657");
		if (peselAdriana.checkPesel()){
			System.out.println("PESEL poprawny");
		}else System.out.println("PESEL jest nieporawny");
	
	}
}
