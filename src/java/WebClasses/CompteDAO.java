/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebClasses;

/**
 *
 * @author user
 */
 //import java.text.*;
 //import java.util.*;
//import java.io.PrintWriter;
import java.sql.*;

public class CompteDAO {
 
      static Connection currentCon = null;
      static ResultSet RsltSql = null;  
	
        public static Agent login(Agent user) {
	
         //preparing some objects for connection 
         Statement stmt ;    
	
         String matricule = Agent.getUsername();    
         String password = Agent.getPass();    
         String TrouverCompte =
               "select * from agent where matricule='"
                        + matricule
                        + "' AND password='"
                        + password
                 + "' AND Role='ADM'";
                                
                 
	    
      
      System.out.println("Nom : " + matricule);          
      System.out.println("Mot De Passe : " + password);
      System.out.println("Query: "+TrouverCompte);
	    
      try 
      {
         //connect to DB 
         currentCon = ConnectDB2.getConnection();
         stmt=currentCon.createStatement();
         RsltSql = stmt.executeQuery(TrouverCompte);	        
         boolean more = RsltSql.next();
	       
         // if user does not exist set the EstValide variable to false
         if (!more) 
         {
            System.out.println("Sorry, you are not a registered user! Please sign up first");
            user.setValide(false);
         } 
	        
         //if user exists set the EstValide variable to true
         else if (more) 
         {
            String role = RsltSql.getString(2);
            user.setRole(role);
            
            
            
	     	
            //System.out.println("Welcome " + Name);
            //user.setNom(Name);
            user.setValide(true);
         }
      } 

      catch (Exception ex) 
      {
         System.out.println("Log In failed: An Exception has occurred! " + ex);
      }     
   return user;
   }
}
