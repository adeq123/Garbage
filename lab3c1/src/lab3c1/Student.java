package lab3c1;

abstract class Student{
	  public int iloscZajec;
	  public abstract void dodajZajecia();
	  
	  public int getIloscZajecCzystyStudent (){
		  return iloscZajec;
	  }
	  
	}

abstract class Pracownik{
	  public int iloscZajec;
	  public abstract void dodajZajecia();
	  
	  public int getIloscZajecPracownik (){
		  return iloscZajec;
	  }
	  
	  
	}

class PracowityStudent extends Student{
	  
	 
	  public Pracownik rzutujNaPracownika(){
		  return new InnerPracownik();
	  	}
	 
	  public void dodajZajecia(){
	    iloscZajec++;
		
	  }
	  

	  
	  public int getIloscZajecStudent (){
		  return iloscZajec;
	  }
	  
	  
	  class InnerPracownik extends Pracownik{
		  
		  public void dodajZajecia(){
			    iloscZajec++;
			    PracowityStudent.this.iloscZajec++;
				
			  }
		  

		  
		  public int getIloscZajecInner (){
			  return iloscZajec;
		  }
	  }
	}