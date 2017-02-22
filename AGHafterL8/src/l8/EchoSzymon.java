package l8;

import java.io.*;
import java.net.*;
 
public class EchoSzymon {
	
    Socket echoSocket = null;
    PrintWriter out = null;
    BufferedReader in = null;
    static String login = "szymon";
    static String pwd = "zwyradniany";
    
    public static void main(String[] args) throws IOException {
    	EchoSzymon echo1 = new EchoSzymon();
    	echo1.logToServer(login, pwd);
    	echo1.close();
    }

 private void connect(){
        try {
            echoSocket = new Socket("149.156.98.73", 3000);
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(
            echoSocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("szymon.ia.agh.edu.pl");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for "
            + "the connection to: localhost.");
            System.exit(1);
        }
 
     
        
 }  
 
 private void logToServer(String login, String pwd) throws IOException{
	 connect();
	 out.println("LOGIN "+login+";"+pwd);
	 System.out.println("result:" + in.readLine());
	 close();
 }
  private void close() throws IOException{
        out.close();
        in.close();
        echoSocket.close();
  }
    }
