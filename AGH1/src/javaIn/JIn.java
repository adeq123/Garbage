package javaIn;
 
import java.io.*;
 
public class JIn {
	int a = 0;
    public static String getString() {
	  String text = null;
	  try{
		InputStreamReader rd = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(rd);
 
		text = bfr.readLine();
	  }catch(IOException e){e.printStackTrace();}
      return text;	  
    }
    
    public static int getInt(){
    	int value = 0;
    	 try{
    			BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    	 
    			value = Integer.parseInt(bfr.readLine());
    		  }catch(IOException e){e.printStackTrace();}
    	      return value;
    }
}