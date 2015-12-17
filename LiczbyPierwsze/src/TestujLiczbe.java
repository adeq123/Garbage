/**
 * This class tests if the number is a prime number using 
 * @author RoguskiA
 * @version 1.0
 */
public class TestujLiczbe {

	
	/**
	 * Tests if the number is a prime number using 
	 * @param liczba an int which is going to be tested
	 */
	public static boolean Testuj (int liczba) {
		
		if(liczba<2){
			return false;
		}
		else{
			for(int i=2;i<liczba;i++){
				if(liczba%i==0) return false;			
			}
		}
		return true;
	}
	
	
}
