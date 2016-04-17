package macierze;

public class DummyMatrix extends Macierz {

	public DummyMatrix(float[][] macierz) {
		super(macierz);
		
	}
	
	/**
	 * Returns a result of addition a matrix to our Macierz
	 * @param inputMacierz a float input matrix
	 * @return resulting float matrix
	 * @throws Exception throws an exception when matrix sizes doesn't match
	 */
	public float [] [] add (float [] [] inputMacierz) throws Exception{
		float [] [] result = new float [inputMacierz.length] [inputMacierz[0].length];
		
		
		if((inputMacierz.length == macierz.length && inputMacierz[0].length == macierz[0].length)){
			
			for(int i=0;i<macierz.length;i++){
				for(int j=0;j<macierz[0].length;j++){
					
					result [i] [j] = this.macierz [i] [j] + inputMacierz [i] [j];
				}
			}
			
			return result;
		}else{ 
			
			if(inputMacierz.length < macierz.length) {
				if(inputMacierz [0].length < macierz [0].length){
					for(int i=0;i<inputMacierz.length;i++){
						for(int j=0;j<inputMacierz[0].length;j++){
							result [i] [j] = this.macierz [i] [j] + inputMacierz [i] [j];
							System.out.println("jestem tutaj");
						}
					}	
					throw  new MatrixDimensionsException("Wynik dla obcietej macierzy!", result);
				}	
				
				for(int i=0;i<inputMacierz.length;i++){
					for(int j=0;j<macierz[0].length;j++){
						result [i] [j] = this.macierz [i] [j] + inputMacierz [i] [j];
					}
				}
		
			throw  new MatrixDimensionsException("Wynik dla obcietej macierzy!", result);
		
			}else
				if(inputMacierz [0].length < macierz [0].length){
					for(int i=0;i<macierz.length;i++){
						for(int j=0;j<inputMacierz[0].length;j++){
							result [i] [j] = this.macierz [i] [j] + inputMacierz [i] [j];
						}
					}	
					throw  new MatrixDimensionsException("Wynik dla obcietej macierzy!", result);
				}	
			
		}
		return result;
	
	}
	
	/**
	 * Returns a result of addition a matrix to our Macierz
	 * @param inputMacierz a float input matrix
	 * @return resulting float matrix
	 * @throws Exception throws an exception when matrix sizes doesn't match
	 */
	public float [] [] sub (float [] [] inputMacierz) throws Exception{
		float [] [] result = new float [inputMacierz.length] [inputMacierz[0].length];
		
		
		if((inputMacierz.length == macierz.length && inputMacierz[0].length == macierz[0].length)){
			
			for(int i=0;i<macierz.length;i++){
				for(int j=0;j<macierz[0].length;j++){
					
					result [i] [j] = this.macierz [i] [j] - inputMacierz [i] [j];
				}
			}
			
			return result;
		}else{ 
			
			if(inputMacierz.length < macierz.length) {
				if(inputMacierz [0].length < macierz [0].length){
					for(int i=0;i<inputMacierz.length;i++){
						for(int j=0;j<inputMacierz[0].length;j++){
							result [i] [j] = this.macierz [i] [j] - inputMacierz [i] [j];
							System.out.println("jestem tutaj");
						}
					}	
					throw  new MatrixDimensionsException("Wynik dla obcietej macierzy!", result);
				}	
				
				for(int i=0;i<inputMacierz.length;i++){
					for(int j=0;j<macierz[0].length;j++){
						result [i] [j] = this.macierz [i] [j] - inputMacierz [i] [j];
					}
				}
		
			throw  new MatrixDimensionsException("Wynik dla obcietej macierzy!", result);
		
			}else
				if(inputMacierz [0].length < macierz [0].length){
					for(int i=0;i<macierz.length;i++){
						for(int j=0;j<inputMacierz[0].length;j++){
							result [i] [j] = this.macierz [i] [j] - inputMacierz [i] [j];
						}
					}	
					throw  new MatrixDimensionsException("Wynik dla obcietej macierzy!", result);
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
		
		float [] [] result = new float [this.macierz.length] [inputMacierz[0].length];
		float sumResult = 0;
		if(( macierz[0].length == inputMacierz.length )){
			
			for(int i=0;i<macierz.length;i++){
				for(int j=0;j<inputMacierz[0].length;j++){
					for(int k=0;k<macierz.length;k++){
						System.out.println(i+" "+k);
						 System.out.println(k+" "+j);
					 sumResult= sumResult+this.macierz [i] [k] * inputMacierz [k] [j];
					 
					}
					result [i] [j] = sumResult;
					System.out.println(" ");
					sumResult = 0;
				}
			}
		}else{
		if(inputMacierz.length < macierz[0].length){
			result = new float [inputMacierz[0].length] [inputMacierz[0].length];
			for(int i=0;i<macierz.length;i++){
				for(int j=0;j< inputMacierz[0].length;j++){
					for(int k=0;k< inputMacierz.length;k++){
					 sumResult= sumResult+this.macierz [i] [k] * inputMacierz [k] [j];
					}
					result [i] [j] = sumResult;
					sumResult = 0;
					}
				}
			}
			
		throw  new MatrixDimensionsException("Wynik dla obcietej macierzy!", result);
		}
		return result;
	}
	
}
