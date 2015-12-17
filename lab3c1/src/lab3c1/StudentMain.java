package lab3c1;

public class StudentMain {

	public static void main(String[] args) {
		
		PracowityStudent student1 = new PracowityStudent();
		
		
		Pracownik ada = student1.rzutujNaPracownika();
		
		for(int i=0;i<60;i++){
			ada.dodajZajecia();
		}
		
		
		
		Student student2 = student1;
		
		
		System.out.println("Pracowity student1 "+student1.getIloscZajecCzystyStudent());
		System.out.println("Pracownik 1 "+ada.getIloscZajecPracownik());
		System.out.println("student2 "+student2.getIloscZajecCzystyStudent());
		
		
		
		
		for(int i=0;i<60;i++){
			student2.dodajZajecia();
		}
		
		
		Pracownik ada2 = student1.rzutujNaPracownika();
		
		
		System.out.println();
		System.out.println("Pracowity student1 "+student1.getIloscZajecCzystyStudent());
		System.out.println("student2 "+student2.getIloscZajecCzystyStudent());
		System.out.println();
		System.out.println("Pracownik 1 "+ada.getIloscZajecPracownik());
		System.out.println("Pracownik 2 "+ada2.getIloscZajecPracownik());
		

		
		
				
	}
	
	
}
