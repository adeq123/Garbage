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
		
		String filename = "C:\\Users\\RoguskiA\\Documents\\GitHub\\cwdb.txt";
		InteliCwDB krzyzowka = new InteliCwDB(filename);
		try {
			krzyzowka.createDB(filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Crossword cw = new Crossword(5,10);
		cw.setCwDB(krzyzowka);
		EasyStrategy str = new EasyStrategy();
		cw.generate(str);
		String cwBaseFolder = "C:\\Users\\RoguskiA\\Documents\\GitHub\\cwbase";
		CwWriter krzyzowkowyWrajter = new CwWriter(cwBaseFolder);
		krzyzowkowyWrajter.WriteCW(cw);
		
		CwReader krzyzowkowyRider = new CwReader(cwBaseFolder);
		krzyzowkowyRider.loadAllCwsToList();
		System.out.println(krzyzowkowyRider.getAllCws().getLast().printBoard());
		
		//krzyzowkowyRider.loadAllCwsToList();
		//LinkedList <Crossword> listaKrzyzowek = krzyzowkowyRider.getAllCws();
		//System.out.println(listaKrzyzowek.size());
		
			
		
		

		
	

	}

}
