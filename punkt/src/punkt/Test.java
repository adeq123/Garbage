package punkt;
import java.awt.Menu;
import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		
		LinkedList <Punkt3D> punkty = new LinkedList <Punkt3D>();
		
		try {
			

			
			String menuOption;
			
			do{

			System.out.println("\nWybierz z ponizszej listy: \n 1. Wczytaj punkt 3D\n 2. Wyświetl wszystkie punkty\n 3. Oblicz odległość\n 4. Zakończ");
				
			BufferedReader sIn = new BufferedReader(new InputStreamReader(System.in));
				
			menuOption = sIn.readLine();
			if(Integer.parseInt(menuOption) == 1){
				
				String pointName;
				double pointX;
				double pointY;
				double pointZ;
				
				System.out.println("Podaj wspolrzedna x punktu");
				pointX = Double.parseDouble(sIn.readLine());	
				
				System.out.println("Podaj wpolrzedna Y punktu");
				pointY = Double.parseDouble(sIn.readLine());
				
				System.out.println("Podaj wpolrzedna Z punktu");
				pointZ = Double.parseDouble(sIn.readLine());
				
				punkty.add(new Punkt3D(pointX, pointY, pointZ));
				
		
			
			}else if(Integer.parseInt(menuOption) == 2){
				

				// standard approach
				
				for(int i = 0;i < punkty.size();i++){
					
					System.out.println("Punkt nr. " +i+" ("+punkty.get(i).getX()+" , "+punkty.get(i).getY()+" , "+punkty.get(i).getZ()+")");
					
				}
			}else if(Integer.parseInt(menuOption) == 3){
				
				int pointNr1;
				int pointNr2;
				
				System.out.println("Podaj nr punktu (z listy) od ktorego chcesz rozpoczac obliczanie odleglosci" );
				pointNr1 = Integer.parseInt(sIn.readLine());
				
				if (pointNr1 > (punkty.size()-1) || pointNr1 <0) {
					throw new Exception ("Nie ma takiego punktu!");
				}
				System.out.println("Podaj nr punktu koncowego (z listy) " );
				pointNr2 = Integer.parseInt(sIn.readLine());
				
				System.out.println("Odleglosc miedzy punktem nr: "+pointNr1+" ("+punkty.get(pointNr1).getX()+","+punkty.get(pointNr1).getY()+","+punkty.get(pointNr1).getZ()+")" 
				+" a punktem nr: "+pointNr2+ "("+punkty.get(pointNr2).getX()+","+punkty.get(pointNr2).getY()+","+punkty.get(pointNr2).getZ()+
				") wynosi: "+punkty.get(pointNr1).distance(punkty.get(pointNr2)));
			
			}
			
			}while (Integer.parseInt(menuOption) != 4);
			
			
			
			
		} catch (Exception e) {
			System.out.println("Wyjatek typu IOException lub Exception zostal wyrzucony!");
			e.printStackTrace();
		}
		
		
		

	}

}


