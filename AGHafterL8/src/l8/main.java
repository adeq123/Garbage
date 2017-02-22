package l8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sIn=null;
		try {
			sIn=new Scanner(new File("C:\\Users\\adeq123\\Desktop\\java\\polish-dic.txt"));
			int linia = 12150;
	        for(int i =0;i<linia;i++){
	        	System.out.println(sIn.nextLine());
	        }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}
