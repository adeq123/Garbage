package cw2;

import java.util.Comparator;

public class PracownikComparator implements Comparator<Pracownik> {

	
	public int compare(Pracownik p1, Pracownik p2) {
		return p1.getBrutto().compareTo(p2.getBrutto());
	}

}
