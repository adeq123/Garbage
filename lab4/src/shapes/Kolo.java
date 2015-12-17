package shapes;

public class Kolo extends Shape{
	
	public Kolo(String name){
		this.name = name;
	}
	
	public void draw() {
		for(int j = 1;j<=4;j++){
						
			for(int k=4-j;k>0;k--)
			System.out.print(" ");
				
			for(int i=1;i<=j;i++)
			System.out.print("*");
			
			for(int l=2;l<=j;l++)
			System.out.print("*");
			
			System.out.println("");
		}	
		
		for(int j = 4;j>=1;j--){
			
	
			
			for(int k=4-j;k>0;k--)
			System.out.print(" ");
				
			for(int i=1;i<=j;i++)
			System.out.print("*");
			
			for(int l=2;l<=j;l++)
			System.out.print("*");
			
			System.out.println("");
		}	
	}
	
	
}
