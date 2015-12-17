package cw4;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		File zaszyfFile = new File("C:\\Users\\RoguskiA\\Documents\\private\\java\\eclipseworkspace\\zaszyforwane.txt");
		File rozszyfFile = new File("C:\\Users\\RoguskiA\\Documents\\private\\java\\eclipseworkspace\\rozszyfrowane.txt");
		ROT11 kod = new ROT11();
		String word = "Adrian";
		int menu = 0;
		Polibiusz poli = new Polibiusz();
		InputStreamReader rd = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(rd);

		
		while (menu != 3){
			

		
		if (menu == 1){
			 System.out.println("1 - szyfr polibiusza, 2 - ROT 11");
			 int podmenu = Integer.parseInt(bfr.readLine());
			 BufferedReader czytaj;
			 String zszyf ="";
			 czytaj = new BufferedReader(new FileReader(rozszyfFile.getAbsolutePath()));
			 String line = czytaj.readLine();
			 String word1 [] = line.split(" ");
			 for(int i = 0; i < word1.length; i++){
				 if (podmenu == 1){
					 if(i == 0){
						 zszyf = poli.crypt(word1[i]);
					 }else{
						 zszyf = zszyf +" "+poli.crypt(word1[i]); 
					 }
				 }else if(podmenu == 2){
					 if(i == 0){
						 zszyf = kod.crypt(word1[i]);
					 }else{
						 zszyf = zszyf +" "+kod.crypt(word1[i]); 
					 }
					 
				 }
				 
				}
				
			Writer writer = new BufferedWriter(new OutputStreamWriter(
			             new FileOutputStream(zaszyfFile.getAbsolutePath()), "utf-8"));
			writer.write(zszyf);
			writer.close();
			czytaj.close();
			menu = 0;
		}else if(menu == 2){
			
			 System.out.println("1 - szyfr polibiusza, 2 - ROT 11");
			 int podmenu = Integer.parseInt(bfr.readLine());
			 BufferedReader czytaj;
			 String zszyf ="";
			 czytaj = new BufferedReader(new FileReader(zaszyfFile.getAbsolutePath()));
			 String line = czytaj.readLine();
			 String word1 [] = null;
			 
			 if (podmenu == 1){
				 word1 = line.split("  ");
			 }else{
				 word1 = line.split(" ");
			 }
			 
			 for(int i = 0; i < word1.length; i++){
				 
				 if (podmenu == 1){
					 if(i == 0){
						 zszyf = poli.decrypt(word1[i]);
					 }else{
						 zszyf = zszyf +" "+poli.decrypt(word1[i]); 
					 }
				 }else if(podmenu == 2){
					 if(i == 0){
						 
						 zszyf = kod.decrypt(word1[i]);
					 }else{
						 
						 zszyf = zszyf +" "+kod.decrypt(word1[i]); 
					 }
					 
				 }
				}
				
			Writer writer = new BufferedWriter(new OutputStreamWriter(
			             new FileOutputStream(rozszyfFile.getAbsolutePath()), "utf-8"));
			writer.write(zszyf);
			writer.close();
			czytaj.close();
			menu = 0;
			
		}else if (menu == 3){
		break;
		}
		else if (menu == 0){
	        System.out.println("Jezeli chcesz szyfrowac wcisnij 1, Jezeli rozszyfrowac wcisnij 2, wcisnij 3 aby zakonczyc");
			menu = Integer.parseInt(bfr.readLine());
		}
	
		
	}
	

}
}