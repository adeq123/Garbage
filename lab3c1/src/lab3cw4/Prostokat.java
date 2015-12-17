package lab3cw4;

public class Prostokat extends Shape{

	  public Prostokat (String name){
		  this.name = name;
	  }
	  
	public void draw() {
		for(int j = 0;j<=6;j++){
			
		
			for(int i=0;i<=12;i++){
				System.out.print("* ");
			}
			System.out.println("");
		}	
	}
	
}
