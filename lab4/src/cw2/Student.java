package cw2;

public class Student extends Pracownik{

	public Student(Pesel pesel, double wynagrodzenieBrutto){
		super(pesel,wynagrodzenieBrutto);
	}
	@Override
	public double obliczNetto() {
		return getBrutto()*0.81;
	}
	
	

}
