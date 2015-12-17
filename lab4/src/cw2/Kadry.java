package cw2;

import java.util.*;


public class Kadry {
	
	private LinkedList<Pracownik> kadry = new LinkedList<Pracownik>();
	
	public void printOutList(){
	for(int i = 0; i<kadry.size();i++)
		System.out.println(i+". "+"PESEL: "+kadry.get(i).getPeselObj().getPesel()+", wynagrodzenie brutto : "+kadry.get(i).getBrutto());
	}
	
	public void deletePracownik(String pesel){
		for(int i = 0; i<kadry.size();i++){
			if(kadry.get(i).getPeselObj().getPesel().equals(pesel)){
				System.out.println("Usuwanie pracownika o numerze PESEL "
			+kadry.get(i).getPeselObj().getPesel());
				kadry.remove(i);
			}
		}

	}
	
	public int findPracownik(String pesel){
		for(int i = 0; i<kadry.size();i++){
			if(kadry.get(i).getPeselObj().getPesel().equals(pesel)){
			
				return i;
			}
				
		}return -1;

	}
	
	public void addStudent(Pesel pesel, double wynagrodzenieBrutto){
		kadry.add(new Student(pesel,wynagrodzenieBrutto));
	}
	
	public void addPracownikEtatowy(Pesel pesel, double wynagrodzenieBrutto){
		kadry.add(new PracownikEtatowy(pesel,wynagrodzenieBrutto));
	}
	
	public void addPracownik(Pracownik p){
		kadry.add(p);
	}
	
	public void changeWynagrodzenie(int i, double wynag){
		kadry.get(i).setBrutto(wynag);
	}
	
	public Pracownik getPracownik(int i){
		return kadry.get(i);
	}

	public int getSize(){
		return kadry.size();
	}
	
	public void addOnPosition(Pracownik p1, int i){
		kadry.add(i, p1);
	}
}
