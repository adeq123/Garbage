/**
 * Class that checks if a matrix is a normal magic square
 */

class MagicSquareChecker{

    public static boolean test(int[][] matrix, int dim){
	
	// The sum of each diagonal, row and column should be
	int sum = dim * (dim * dim +1) / 2;
	int diag1 = 0;
	int diag2 = 0;
	int rowSum = 0;
	int colSum = 0;
	// Check the sum of each diagonals 
    for(int row = 0; row < dim; row ++ ){
    	colSum = 0;
    	rowSum = 0;
    	for(int col = 0; col < dim; col++){
    		int matrixElement = matrix [row] [col];
    		int matrixElementRow = matrix [col] [row];
    		 //Check if the numbers in the matrix are 1 to dim*dim (with no repetitions)
    		if(matrixElement < 1 || matrixElement > dim*dim)
    			return false;
    		
    		//sum of first diagonal
    		if(col == row)
    			diag1 += matrixElement;
    		
    		//sum of second diagonal
    		if (row == (dim - col -1))
    			diag2 += matrix [row] [col];
    		
    		//sum of each column
    		colSum += matrixElement;
    		
    		//sum of each row
    		rowSum += matrixElementRow ;
    	}
    	// check conditions
    	if(rowSum != sum || colSum != sum)
    		return false;
    }
    
    if(diag1 != sum || diag2!= sum)
		return false;


	
    /* Put your code here (you can implement other methods) */
	 
	
	
    /* Put your code here (you can implement other methods) */


	return true;
    }
    
    public static void main(String[] args){
	int magicSquareMars[][] ={{11, 24, 7, 20, 3},
				              {4, 12, 25, 8, 16},
				              {17, 5, 13, 21, 9},
				              {10, 18, 1, 14, 22},
				              {23, 6, 19, 2, 15}};
	int magicSquareJupiter[][] ={{4, 14, 15, 1},
				                 {9, 7, 6, 12},
				                 {5, 11, 10, 8},
				                 {16, 2, 3,	13}};

	int magicSquareSagradaFamilia[][]={{1,14,14,4},
					   {11,7,6,9},
					   {8,10,10,5},
					   {13,2,3,15}};

	if (test(magicSquareJupiter, 4)){
	    System.out.println("The Jupiter Magic Square is a normal magic square");
	}
	else{
	    System.out.println("The Jupiter Magic Square is NOT a normal magic square");
	}

	if (test(magicSquareMars, 5)){
	    System.out.println("The Mars Magic Square is a normal magic square");
	}
	else{
	    System.out.println("The Mars Magic Square is NOT a normal magic square");
	}

	if (test(magicSquareSagradaFamilia, 4)){
	    System.out.println("The Sagrada Familia Magic Square is a normal magic square");
	}
	else{
	    System.out.println("The Sagrada Familia Magic Square is NOT a normal magic square");
	}

    }
}

