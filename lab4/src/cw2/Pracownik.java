package cw2;

import java.util.*;

public abstract class Pracownik {
	
	private Pesel pesel;
	private Double wynagrodzenieBrutto;
	
	public Pracownik(Pesel pesel, double wynagrodzenieBrutto){
		this.pesel = pesel;
		this.wynagrodzenieBrutto = wynagrodzenieBrutto;
	}
	
	public abstract double obliczNetto();
	
	public Double getBrutto(){
		return wynagrodzenieBrutto;
	}
	public void setBrutto(double wynag){
		this.wynagrodzenieBrutto = wynag;;
	}
	
	public Pesel getPeselObj(){
		return pesel;
	}
	

}
