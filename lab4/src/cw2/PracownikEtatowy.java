package cw2;
import java.lang.Math.*;

public class PracownikEtatowy extends Pracownik{

	public PracownikEtatowy(Pesel pesel, double wynagrodzenieBrutto){
		super(pesel,wynagrodzenieBrutto);
	}
		
	public double obliczNetto() {
			
		double emerytalna = 0.0976*getBrutto();
		double rentowa = 0.015*getBrutto();
		double chorobowa = 0.0245*getBrutto();
		double skladkiSpoleczne = emerytalna + rentowa + chorobowa;
		double podstawaZdrowotne =getBrutto() - skladkiSpoleczne;	
		double zdrowotne = podstawaZdrowotne*0.09;	
		double kosztyUzyskania = 111.25;
		long podstawaDochodowy = java.lang.Math.round(getBrutto()- skladkiSpoleczne - kosztyUzyskania);
		long zaliczkaDochodowy = java.lang.Math.round(podstawaDochodowy*0.18 - 46.33- podstawaZdrowotne*0.0775);
		return  getBrutto() - skladkiSpoleczne - zdrowotne - zaliczkaDochodowy;
	}
		
}
