package shapes;

public class Trojkat extends Shape{

	  public Trojkat(String name){
		  this.name = name;
	  }
	  
	public void draw() {
		for(int j = 0;j<=6;j++){
			
		
			for(int i=0;i<=j;i++){
				System.out.print("* ");
			}
			System.out.println("");
		}	
	}
	
}
