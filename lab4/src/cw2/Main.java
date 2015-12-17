package cw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ListIterator;


public class Main {

	public static void main(String[] args) throws IOException {
		
		int menu = 0;
		Kadry kadry = new Kadry ();
		kadry.addStudent(new Pesel("123123123123"), 123);
		kadry.addStudent(new Pesel("9081239812"), 1000);
		kadry.addStudent(new Pesel("93464569812"), 500);
		
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
			kadry.printOutList();
			
		}else if(menu == 2){
				int auxMenu = 1;
				String pesel;
				double wynagrodzenieBrutto;
				System.out.println("Podaj nr PESEL: ");
				pesel = bf.readLine();
				System.out.println("Podaj wynagrodzenie brutto: ");
				wynagrodzenieBrutto = Double.parseDouble(bf.readLine());
				
				System.out.println(" Wcisnij: \n1 - aby dodac student\n2 - aby dodac pracownika etatowego");
				auxMenu = Integer.parseInt(bf.readLine());
				if (auxMenu == 1){
					kadry.addStudent(new Pesel(pesel), wynagrodzenieBrutto);
					System.out.println("Dodano studenta o nr PESEL: "
					+pesel+" i wynagrodzeniu brutto "+wynagrodzenieBrutto);
				}else if(auxMenu == 2){
					kadry.addPracownikEtatowy(new Pesel(pesel), wynagrodzenieBrutto);
					System.out.println("Dodano Pracownika etatowego o nr PESEL: "
					+pesel+" i wynagrodzeniu brutto "+wynagrodzenieBrutto);
				}else{
					System.out.println("Nie poprawna Liczba! Wcisnij: \n 1 - aby dodac student\n2. aby dodac pracownika etatowego");
					menu = 0;
				}
		}else if(menu == 3){
			BufferedReader bf3 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Podaj nr PESEL: pracownika do usuniecia");
			String pesel = bf3.readLine();
			kadry.deletePracownik(pesel);
		}else if(menu == 4){
			int pos;
			BufferedReader bf3 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Podaj nr PESEL: pracownika do wyszukania");
			String pesel = bf3.readLine();
			pos=kadry.findPracownik(pesel);
			if(pos == -1)
				System.out.println("Nie znaleziono takiego pracownika :((((");
			else{
				System.out.println("Pracownik o numerze PESEL"+pesel+"znajduje sie na pozycji "+pos);
			}
		}else if(menu == 5){
			int pos;
			
			System.out.println("Podaj nr PESEL: pracownika ktorego wynagrodzenie chcesz zmienic");
			String pesel = bf.readLine();
			pos=kadry.findPracownik(pesel);
			if(pos == -1)
				System.out.println("Nie znaleziono takiego pracownika :((((");
			else{
				System.out.println("Podaj nowe wynagrodzenie");
				kadry.changeWynagrodzenie(pos, Double.parseDouble(bf.readLine()));
				System.out.println("Pracownik o nr PESEL "+kadry.getPracownik(pos).getPeselObj().getPesel()+" ma wynagrodzneie brutto "+kadry.getPracownik(pos).getBrutto());
			}
			}else if(menu == 6){
			int pos;
			BufferedReader bf3 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Podaj nr PESEL: pracownika do wyswietlenia");
			String pesel = bf3.readLine();
			pos=kadry.findPracownik(pesel);
			if(pos == -1)
				System.out.println("Nie znaleziono takiego pracownika :((((");
			else
				System.out.println("Pracownik o numerze PESEL "+pesel+" posiada wynagrodznie brutto "+kadry.getPracownik(pos).getBrutto()+" a netto "+kadry.getPracownik(pos).obliczNetto());
			}else if(menu == 7){
				boolean war = true;
				Kadry TempKadry = new Kadry ();
				TempKadry.addPracownik(kadry.getPracownik(1));
				PracownikComparator kopr = new PracownikComparator();
				for(int i = 0;i < kadry.getSize(); i ++){
					for(int j = 0;j < TempKadry.getSize()&&war;j++){
							if(kopr.compare(TempKadry.getPracownik(j), kadry.getPracownik(i)) > 0){
								TempKadry.addOnPosition(kadry.getPracownik(i), j);
								//war = false;
								break;
							}
						}
					war = true;
					}
				kadry = TempKadry;
				System.out.println("Done!");
				}else if(menu == 8){
			System.out.println("Bye Bye...");
			break;
			
	}
		}
		
	}

}
