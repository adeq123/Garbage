package pkg1;

public class B extends A{
	
	
	protected void decrement(){
		number--;
		number--;
	}
	
	void changeName(){
		
	}
	
	private void increment(){
		number++;
		number++;
	}
	public B(int number, String name){
		super(number,name);
		
	}
	
	public void callIncrement(){
		increment();
	}
}
