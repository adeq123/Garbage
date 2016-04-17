package lab5cw2;

public class WrongDataException extends Exception{

	public WrongDataException() {
		super(" Wrong Data!");
	}
	
	public WrongDataException(String messeage) {
		super(messeage);
	}

}
