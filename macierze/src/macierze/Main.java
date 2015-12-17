package macierze;

public class Main {

	public static void main(String[] args) throws Exception {
		
		float [] [] a ={
					{1,2,3},
					{4,5,6},
					{7,8,9}
						};
		
		float [] [] b ={
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		
		
		Macierz A = new Macierz(a);				
		Macierz.printOutMatrix(A.add(b));
		System.out.println(" ");
		Macierz.printOutMatrix(A.sub(b));
		System.out.println(" ");
		Macierz.printOutMatrix(A.mul(b));
		

	}

}
