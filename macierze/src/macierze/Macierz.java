package macierze;

/**
 * This class model a simple matrix
 * @author RoguskiA
 * @version 1.0
 */
public class Macierz {

	private float [] [] macierz;
	
	/**
	 * Construct a new Macierz using the specified input matrix
	 * @param macierz a float matrix that will be used to create Macierz
	 */
	public Macierz (float [] [] macierz){
		this.macierz = macierz;
	}
	
	/**
	 * Returns a result of addition a matrix to our Macierz
	 * @param inputMacierz a float input matrix
	 * @return resulting float matrix
	 * @throws Exception throws an exception when matrix sizes doesn't match
	 */
	public float [] [] add (float [] [] inputMacierz) throws Exception{
		
		float [] [] result = new float [this.macierz.length] [this.macierz[0].length];
		
		if(!(inputMacierz.length == macierz.length && inputMacierz[0].length == macierz[0].length)){
			throw  new Exception("Mozna dodawac tylko macierze majace taki sam wymiar!");
		}
		
		for(int i=0;i<macierz.length;i++){
			for(int j=0;j<macierz[0].length;j++){
				
				result [i] [j] = this.macierz [i] [j] + inputMacierz [i] [j];
			}
		}
		
		return result;
	}
	
	/**
	 * Returns a result of substraction a matrix to our Macierz
	 * @param inputMacierz a float input matrix
	 * @return resulting float matrix
	 * @throws Exception throws an exception when matrix sizes doesn't match
	 */
	public float [] [] sub (float [] [] inputMacierz) throws Exception{
		
		float [] [] result = new float [this.macierz.length] [this.macierz[0].length];
		
		if(!(inputMacierz.length == macierz.length && inputMacierz[0].length == macierz[0].length)){
			throw  new Exception("Mozna odejmowac tylko macierze majace taki sam wymiar!");
		}
		
		for(int i=0;i<macierz.length;i++){
			for(int j=0;j<macierz[0].length;j++){
				result [i] [j] = this.macierz [i] [j] - inputMacierz [i] [j];
			}
		}
		return result;
	}
	
	/**
	 * Returns a result of multiplying a matrix to our Macierz
	 * @param inputMacierz a float input matrix
	 * @return resulting float matrix
	 * @throws Exception throws an exeption when size of matrices are not correct
	 */
	public float [] [] mul (float [] [] inputMacierz) throws Exception{
		
		float [] [] result = new float [this.macierz.length] [this.macierz[0].length];
		float sumResult = 0;
		if(!(inputMacierz.length == macierz[0].length)){
			throw  new Exception("Liczba kolumn pierwszej macierzy musi sie rownac liczbe wierszy macierzy drugiej!");
		}
		
		for(int i=0;i<macierz.length;i++){
			for(int j=0;j<macierz[0].length;j++){
				for(int k=0;k<macierz.length;k++){
				 sumResult= sumResult+this.macierz [i] [k] * inputMacierz [k] [j];
				}
				result [i] [j] = sumResult;
				sumResult = 0;
			}
		}
		return result;
	}
	/**
	 * Method which prints out a matrix
	 * @param inputMacierz a float input matrix
	 * @return resulting float matrix
	 */
	public static void printOutMatrix (float [] [] matrixToBePrinted){
		
		
		for(int i=0;i<matrixToBePrinted.length;i++){
			for(int j=0;j<matrixToBePrinted[0].length;j++){
				System.out.print(matrixToBePrinted[i][j]+" ");
			}
		System.out.println(" ");
	}
	}
	
	public float [] [] getMacierz (){
		return this.macierz;
	}
}
