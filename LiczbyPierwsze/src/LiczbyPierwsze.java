import javaIn.JIn;;

/**
 * @author RoguskiA
 * @version 1.0
 */
public class LiczbyPierwsze {

	public static void main(String[] args) {
		
		System.out.println("Prosze podac liczbe calkowita do testowania");
		int liczba = JIn.getInt();
		if(TestujLiczbe.Testuj(liczba)) {
			System.out.println("Liczba: "+liczba+" jest liczba pierwsza");
		}else System.out.println("Liczba: "+liczba+" Nie jest liczba pierwsza");

	}

}
