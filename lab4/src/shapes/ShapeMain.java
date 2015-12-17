package shapes;

import java.io.*;
import java.util.*;

public class ShapeMain {

	public static void main(String[] args) {
		
		int menu = 0;
		LinkedList<Shape> szejplist = new LinkedList<Shape>();
		
		Kwadrat kwadrat = new Kwadrat("kwadrat");		
		Trojkat trojkat = new Trojkat("trojkat");
		Prostokat prostokat = new Prostokat("prostokat");
		Kolo kolo = new Kolo("kolo");
		
		szejplist.add(kwadrat);
		szejplist.add(trojkat);
		szejplist.add(prostokat);
		szejplist.add(kolo);
		
		ListIterator<Shape> iter = szejplist.listIterator();
		
		while(menu != 7){
		
			if (menu == 0)
				System.out.println("MENU \n0. Print menu \n1. Print the List \n2. Next shape \n3. Move pointer forward\n4. Previous shape\n5. Move pointer forward \n6.Draw shape\n7.Escape!");
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
				menu = Integer.parseInt(bf.readLine());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(menu == 1){
			for(int i = 0; i<szejplist.size();i++)
				System.out.println(i+". "+szejplist.get(i).name);
			
		}else if(menu == 2){
				System.out.println(szejplist.get(iter.nextIndex()).name);
				
		}else if(menu == 3){
				iter.next();
				System.out.println("Moved to pos"+iter.nextIndex());
			
		}else if(menu == 4){
			System.out.println(szejplist.get(iter.previousIndex()).name);	
		}else if(menu == 5){
			iter.previous();
			System.out.println("Moved to pos "+iter.previousIndex());
		}else if(menu == 6){
				System.out.println("Give the position that you want to draw");
				BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
				int pos = 0;
				 try {
					pos = Integer.parseInt(bf2.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				 szejplist.get(pos).draw();
		}else if(menu == 7){
			System.out.println("Bye Bye...");
			break;
			
	}
		}
		
	}

}
