package lab3cw4;

public class Kwadrat extends Shape{

	  
	  public Kwadrat(String name){
		  this.name = name;
	  }
	  
	public void draw() {
		for(int j = 0;j<=6;j++){
			
		
			for(int i=0;i<=6;i++){
				System.out.print("* ");
			}
			System.out.println("");
		}	
	}

}
