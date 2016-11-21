package cw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ListIterator;


public class Main {

	public static void main(String[] args) throws IOException {
		
		int menu = 0;
		DB db = new DB();
		db.createTable();
		db.wylistujPracownikow();

		while(menu != 8){
		
			if (menu == 0)
				System.out.println("MENU \n0. Wyswietl menu \n1. Wyswietl liste pracownikow \n"
						+ "2. Dodaj pracownika \n3. Usun pracownika\n"
						+ "4. Znajdz pracownika\n5. Zmien wynagrodzenie\n6. Wyswietl pracownika\n7. Sortuj wg. wynagrodzenia \n8. Escape!");
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
				menu = Integer.parseInt(bf.readLine());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(menu == 1){
			db.wylistujPracownikow();;
			
		}else if(menu == 2){
				int auxMenu = 1;
				String pesel;
				String wynagrodzenieBrutto;
				System.out.println("Podaj nr PESEL: ");
				pesel = bf.readLine();
				System.out.println("Podaj wynagrodzenie brutto: ");
				wynagrodzenieBrutto = bf.readLine();
				db.dodajPracownika(pesel, wynagrodzenieBrutto);
				
		}else if(menu == 3){
			BufferedReader bf3 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Podaj nr PESEL: pracownika do usuniecia");
			String pesel = bf3.readLine();
			db.deleteByPesel(pesel);
		}else if(menu == 4){
			int pos;
			BufferedReader bf3 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Podaj nr PESEL: pracownika do wyszukania");
			String pesel = bf3.readLine();
			db.znajdzPracownika(pesel);
			
		}else if(menu == 5){
			int pos;
			
			System.out.println("Podaj nr PESEL: pracownika ktorego wynagrodzenie chcesz zmienic");
			String pesel = bf.readLine();
			System.out.println("Podaj nowe wynagrodzenie");
			String noweWynagrodzenie = bf.readLine();
			db.updatePracownik(pesel, noweWynagrodzenie);
			
			}else if(menu == 6){
			int pos;
			BufferedReader bf3 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Podaj nr PESEL: pracownika do wyswietlenia");
			String pesel = bf3.readLine();
			db.znajdzPracownika(pesel);
				}else if(menu == 8){
					db.closeCon();
			System.out.println("Bye Bye...");
			break;
			
	}
		}
		
	}

}
