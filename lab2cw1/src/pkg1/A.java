package pkg1;

public class A {

	protected int number;
	String name;
	
	public A(int number, String name){
		this.number=number;
		this.name=name;
	}
	
	public void callDecrement(){
		decrement();
	}
	
	public void callChangeName(String _name){
		changeName(_name);
	}
	public void callIncrement(){
		increment();
	}
	private void increment(){
		this.number++;
	}
	
	protected void decrement(){
		this.number--;
	}
	void changeName(String name){
		this.name = name;
	}
public int getNumber(){
	return this.number;
}
}



