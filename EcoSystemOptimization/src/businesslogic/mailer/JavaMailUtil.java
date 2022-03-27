/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.mailer;

/**
 *
 * @author gunav
 */
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaMailUtil {
    public static void sendMail(String recepientMail, String recepientName) throws Exception {
        System.out.println("Preparing to send an email");
        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccountEmail = "harinireddy.121asdf@gmail.com";
        String password = "aedfinalproject123";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });
        Message message = prepareMessage(session, myAccountEmail, recepientMail, recepientName);

        Transport.send(message);
        System.out.println("Hurray "+"Mail sent successfully");
    }

    public static Message prepareMessage(javax.mail.Session session, String myAccountEmail, String recepientMail, String recepientName) {
        try {
            javax.mail.Message message = new javax.mail.internet.MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepientMail));
            message.setSubject("Account activation mail from Ecosystem Optimisation Team");
            message.setText("Hi " + recepientName + ". Welcome to the family of EcoSystem Optimisers.\nBecome one of the saviours of this planet by helping our community in optimising our resources.");
            return message;
        } catch (Exception e) {
        }
        return null;
    }
    
//    public static void main(String[] args) throws Exception {
//        JavaMailUtil.sendMail("harinireddy.121asdf@gmail.com");
//    }
    
}

