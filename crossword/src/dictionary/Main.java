package dictionary;
import model.*;
import browser.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		String filename = "C:\\Users\\RoguskiA\\Documents\\GitHub\\cwdb.txt";
		InteliCwDB krzyzowka = new InteliCwDB(filename);
		try {
			krzyzowka.createDB(filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String cwBaseFolder = "C:\\Users\\RoguskiA\\Documents\\GitHub\\cwbase";
		
		Crossword cw = new Crossword(5,10);
		cw.setCwDB(krzyzowka);
		EasyStrategy str = new EasyStrategy();
		
		Crossword cw1 = new Crossword(5,10);
				cw1.setCwDB(krzyzowka);
				cw1.generate(str);
				
		Crossword cw2 = new Crossword(5,10);
				cw2.setCwDB(krzyzowka);
				cw2.generate(str);
			
		Crossword cw3 = new Crossword(5,10);
				cw3.setCwDB(krzyzowka);
				cw3.generate(str);
		System.out.println(cw1.printBoard()+"\n"+cw2.printBoard()+"\n"+cw3.printBoard());
		*/
		
		
		int menu = 0;
		String cwDataBase = "C:\\Users\\RoguskiA\\Documents\\GitHub\\cwdb.txt";
		String folderWithCws = "C:\\Users\\RoguskiA\\Documents\\GitHub\\cwbase";
		BufferedReader menuInput = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader readInput= new BufferedReader(new InputStreamReader(System.in));
		CwBrowser cwBrowser = new CwBrowser(cwDataBase, folderWithCws);
		
		
		
		while(menu !=9){
		System.out.println("MENU\n 1. Wygeneruj nowa krzyzowke\n 2. Nastepna krzyzowka \n 3. Poprzednia"
				+ " krzyzowka \n 4. Wyswietl aktualna krzyzowke \n 5. Wczytaj wszytkie krzyzowki \n "
				+ "6. Wyswietl ilosc wczytanych krzyzowek \n 7. Zapisz aktualna krzyzowke \n 9. zakoncz");
		menu = Integer.parseInt(menuInput.readLine());
		if(menu == 1){
			int height, width;
			
			System.out.println("Podaj wysokosc:");
			height = Integer.parseInt(readInput.readLine());
			System.out.println("Podaj szerokosc:");
			
			width = Integer.parseInt(readInput.readLine());
			cwBrowser.generateCW(height, width);
				
		}else if(menu == 2){
			cwBrowser.nextCW();
			if(cwBrowser.checkIfActualExist()){
				System.out.println(cwBrowser.getActualCws().printBoard());
			}
			
		}else if(menu == 3){
			cwBrowser.previousCW();
			if(cwBrowser.checkIfActualExist()){
				System.out.println(cwBrowser.getActualCws().printBoard());
			}
			
		}else if(menu == 4){
			System.out.println(cwBrowser.getActualCws().printBoard());
			
		}else if(menu == 5){
			if(cwBrowser.folderEmpty()){
				System.out.println("Folder jest pusty.... wygenreuj krzyzowki");
			}else{
			cwBrowser.loadAllCwsFromFolder();
			System.out.println("Wczytano!");
			}
			
		}else if(menu == 6){
			System.out.println(cwBrowser.getNumberOfCws()+"\n");
		}else if(menu == 7){
			cwBrowser.saveAndMakeTmpActual();
		}else if(menu == 9){
			break;
		
		}
	

	}
	}

}
