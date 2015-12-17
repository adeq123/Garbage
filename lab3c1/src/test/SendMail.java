package test;


import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * 
 * @author Mateusz Korwel
 * 
 */
public class SendMail {

 private static final String HOST = "smtp.wp.pl";
 private static final int PORT = 465;

 private static final String FROM = "marek.czwartek@wp.pl";

 private static final String PASSWORD = "adrianroguski1990";
 
 private static final String TO = "adrroguski@gmail.com";

 private static final String SUBJECT = "Hello World";
 
 private static final String CONTENT = "To moj pierwszy mail wyslany za pomoca JavaMailAPI.";

 public static void main(String[] args) {
  try {
   new SendMail().send();
  } catch (MessagingException e) {
   e.printStackTrace();
  }
 }

 public void send() throws MessagingException {
	 

  Authenticator auth = new myAuthenticator(FROM, PASSWORD);
  Properties props = new Properties();
  props.put("mail.transport.protocol", "smtps"); // protokol z ssl
  props.put("mail.smtps.auth", "true");

  
  Session mailSession = Session.getDefaultInstance(props,auth); 
  mailSession.setDebug(true);

  
  MimeMessage message = new MimeMessage(mailSession);
  message.setFrom(FROM); //required
  message.setSubject(SUBJECT);
  message.setContent(CONTENT, "text/plain; charset=ISO-8859-2");
  message.addRecipient(Message.RecipientType.TO, new InternetAddress(TO));

  Transport transport = mailSession.getTransport();// rowniez mosliweTransport transport = session.getTransport("smtps");//z s SSL
  transport.connect(HOST, PORT, FROM, PASSWORD);

 
  transport.sendMessage(message, message
    .getRecipients(Message.RecipientType.TO));
  transport.close();
 }
}

class myAuthenticator extends Authenticator {
    String username;
    String password;
    
    //konstruktor
    public myAuthenticator(String username,String password){
    	this.username = username;
    	this.password = password;
    }
    
    @Override
    public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
    }
    
}