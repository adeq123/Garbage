import java.io.*;
/**
 *
 * @author AdrianRoguski
 */
public class LoginProgram {
    public static void main(String[] argv){
      Login log = new Login ("ala", "makota");
	  try{
		InputStreamReader rd = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(rd);

        System.out.println("Prosze podac login");
		String login = bfr.readLine();
		System.out.println("Prosze podac haslo");
        String haslo = bfr.readLine();

        if(log.check(login, haslo)){
        	System.out.println("OK!");
        }else{
        	System.out.println("Login lub haslo niepoprawne... :(");
        }
	  }catch(IOException e){e.printStackTrace();}

    }
}
