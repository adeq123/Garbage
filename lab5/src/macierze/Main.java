package macierze;

public class Main {

	public static void main(String[] args)  {
		
		float [] [] a ={
					{1,2,3},
					{4,5,6},
					{7,8,9}
						};
		
		float [] [] b ={
				{1,2,3},
				{4,5,6},
					};
		
		
		Macierz A = new DummyMatrix(a);	
		try{
		//Macierz.printOutMatrix(A.add(b));
		//System.out.println(" ");
		//Macierz.printOutMatrix(A.sub(b));
		//System.out.println(" ");
		Macierz.printOutMatrix(A.mul(b));
		}catch(MatrixDimensionsException e){
			Macierz.printOutMatrix(e.getThrowedMatrix());
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}

	}

}
