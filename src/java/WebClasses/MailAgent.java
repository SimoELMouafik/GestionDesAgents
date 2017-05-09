/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebClasses;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.mail.internet.InternetAddress;
import javax.mail.Session;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author user
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;

public class MailAgent
{
    static String Destinataire;
    static String Expediteur;
    static String Login;
    static String Password;
    static String NameDest;
    static String PassDest ;

    public static String getDestinataire() {
        return Destinataire;
    }

    public static void setDestinataire(String Destinataire) {
        MailAgent.Destinataire = Destinataire;
    }

    public static String getNameDest() {
        return NameDest;
    }

    public static void setNameDest(String NameDest) {
        MailAgent.NameDest = NameDest;
    }

    public static String getPassDest() {
        return PassDest;
    }

    public static void setPassDest(String PassDest) {
        MailAgent.PassDest = PassDest;
    }
      
  

//Lecture des élements nécessaire   
    public static void  ImporterElements() {
    //Création de l'objet File 
try
{
    File f = new File ("C:\\Users\\user\\Documents\\NetBeansProjects\\WebApplication1\\src\\java\\WebClasses\\mail.txt");
    FileReader fr = new FileReader (f);
    BufferedReader br = new BufferedReader (fr);
 
    try
    {
        String line;
        {
            line= br.readLine();
            System.out.println (line);
            Login=line;
            System.out.println (line);
            line = br.readLine();
            System.out.println (line);
            Password=line;
            System.out.println (line);
             line = br.readLine();
             Expediteur=line;
            System.out.println (line);
        }
 
        br.close();
        fr.close();
    }
    catch (IOException exception)
    {
        System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
    }
  }
    catch (FileNotFoundException exception)
    {
    System.out.println ("Le fichier n'a pas été trouvé");
    }
  } 
     
//Envoi de l'email      
     private static class SMTPAuthenticator extends Authenticator
    {
        private final PasswordAuthentication authentication;

        public SMTPAuthenticator(String login, String password)
        {
             authentication = new PasswordAuthentication(login, password);
        }

        @Override
        protected PasswordAuthentication getPasswordAuthentication()
        {
             return authentication;
        }
    }

    /**
     *
     */
    public static void mail()
    {
        ImporterElements();
        String to = Destinataire;
        String from = Expediteur;
        String subject = "Récupération de Mot de Passe TALABI";
        String message = "Salut "+NameDest+" ,\n\n"
                +" Nous avons reçu votre demande de récupération du mot de passe à travers la plateforme TALABI .\n Votre mot de passe est : "
                +PassDest+".\n\n Cordialement."; 
        String login = Login;
        String password = Password;
        Properties props = new Properties();
        props.setProperty("mail.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.starttls.enable", "true");
        Authenticator auth = new SMTPAuthenticator(login, password);
        Session session = Session.getInstance(props, auth);
        MimeMessage msg = new MimeMessage(session);
        try
        {
            msg.setText(message);
            msg.setSubject(subject);
            msg.setFrom(new InternetAddress(from));
            msg.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));
            Transport.send(msg);
        }
        catch (MessagingException ex)
        {
            Logger.getLogger(MailAgent.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }
}

/**
 *
 * @author user
 */
/*final public class EnvoiEmailDAO
{
    public static void main(String...args)
    {
        new MailAgent().mail();
    }
}*/
