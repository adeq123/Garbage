import java.io.*;

public class MainHanoi {

	public MainHanoi() {
		// TODO Auto-generated constructor stub
	}

	public static int solveHanoiTower(int discs, String startRod, String auxRod, String endRod,int noOfMoves){
		
		
		if(discs > 1){
			
			solveHanoiTower(discs - 1, startRod, endRod, auxRod,noOfMoves);
			solveHanoiTower(1, startRod, auxRod, endRod, noOfMoves);
			solveHanoiTower(discs - 1, auxRod, startRod, endRod, noOfMoves);
			
		}else{
			System.out.println(startRod+"->"+endRod);	
			noOfMoves++;
		}
		return noOfMoves;
	}
	public static void main(String[] args) throws IOException {
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Please, enter the number of discs: ");
		int amountOfDiscs =  Integer.parseInt(reader.readLine());
		System.out.println(solveHanoiTower(amountOfDiscs,"A", "B", "C", 0));
	}

}
