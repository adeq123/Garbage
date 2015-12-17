package test;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;


public class MailWyslanie {

    public static void main(String[] Args) throws MessagingException{

 class myAuthenticator extends Authenticator {
        String username = "marek.czwartek@wp.pl";
        String password = "adrianroguski1990";
        @Override
        public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
        }
}
        try {
            Properties prop = System.getProperties();
            Authenticator auth = new myAuthenticator();
            prop.put("mail.transport.protocol", "smtps");
            prop.put("mail.smtp.host", "smtp.wp.pl");
            prop.put("mail.smtp.user", "marek.czwartek@wp.pl");
            prop.put("mail.smtp.password", "adrianroguski1990");
            prop.put("mail.smtp.auth", "true");
            prop.put("mail.smtp.port", "465");

            

            Session session = Session.getInstance(prop, auth);

            session.setDebug(true);
            
            Message message = new MimeMessage(session);
        
        //message.setContent("tresc","text/plain");
            message.setText("tresc");
        
            message.setSubject("temat");
            Address address = new InternetAddress("marek.czwartek@wp.pl");
            Address addressOdbiorcy = new InternetAddress("adrroguski@gmail.com");
            

            
            message.setFrom(address);
            
            message.addRecipient(Message.RecipientType.TO, addressOdbiorcy);
            message.saveChanges();
            Transport transport = session.getTransport("smtps");//z s SSL
            transport.connect("smtp.wp.pl", "marek.czwartek@wp.pl","adrianroguski1990");
            transport.send(message, message.getAllRecipients());
       
            transport.close();

        } catch (NoSuchProviderException ex) {
            //Logger.getLogger(mailWyslanie.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
