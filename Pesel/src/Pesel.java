import java.math.*;
/**
 * This class creates generic PESEL number
 * @author RoguskiA
 * @version 1.0
 */
public class Pesel {
	
	private String pesel;
	
	/**Construct a generic PESEL number
	 * 
	 * @param pesel String reprsentation of PESEL number
	 */
	public Pesel(String pesel){
		setPesel(pesel);
	}
	/** Method which checks correctnes of pesel number
	 * @return true if PESEL is correct false if it is not
	 * */
	public boolean checkPesel (){
	
		Integer checkNumber =new Integer(Character.getNumericValue(pesel.charAt(0))*1+Character.getNumericValue(pesel.charAt(1))*3+Character.getNumericValue(pesel.charAt(2))*7+
		Character.getNumericValue(pesel.charAt(3))*9+Character.getNumericValue(pesel.charAt(4))*1+Character.getNumericValue(pesel.charAt(5))*3+
		Character.getNumericValue(pesel.charAt(6))*7+Character.getNumericValue(pesel.charAt(7))*9+Character.getNumericValue(pesel.charAt(8))*1+
		Character.getNumericValue(pesel.charAt(9))*3);
		
		
		int lastNumberOfCheckNumber=Character.getNumericValue(checkNumber.toString().charAt(checkNumber.toString().length()-1));
		return (10 - lastNumberOfCheckNumber) == Character.getNumericValue(pesel.charAt(10));
	}
	
	
	public void setPesel(String pesel){
		this.pesel = pesel;
	}
	
	public String getPesel(){
		return this.pesel;
	}

}
