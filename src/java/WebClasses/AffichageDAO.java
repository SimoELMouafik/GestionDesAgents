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
import java.sql.*;

public class AffichageDAO {
 
      static Connection currentCon = null;
     
      static ResultSet Rsql = null;
      static ResultSet Rsql2=null;
       static ResultSet Rsql3 = null;
      static ResultSet Rsql4=null;
      static ResultSet Rsql5=null;
      
      
      public static Agent Afficher(Agent emp) {
	
         //preparing some objects for connection 
         String matric =emp.getMatricule();
         
         String TrouverAgent = null;
          TrouverAgent="select * from agent where matricule='"
                  +matric
                  +"'" ;
	 
          Statement stmt;    
	 try 
      {
         //connect to DB 
         currentCon = ConnectDB2.getConnection();
        
         stmt=currentCon.createStatement();
         
             
         Rsql=stmt.executeQuery(TrouverAgent);	       
         
        if(Rsql.next())
         {System.out.println("vide");
         emp.setNom(Rsql.getString(7));
            
         emp.setPrenom(Rsql.getString(8));    
         
         String fctget1=Rsql.getString(4);
         String libelleBpr = null;
          libelleBpr="select * from bpr where codeBpr='"
                  +fctget1
                  +"'";
         Rsql2=stmt.executeQuery(libelleBpr);
         if(Rsql2.next()) System.out.println("rslt !!");
         emp.setBpr(Rsql2.getString(2));
         
        
        Rsql=stmt.executeQuery(TrouverAgent);
        if(Rsql.next())
         {       	
         String fctget2=Rsql.getString(6);
         String libelleSucc = null;
          libelleSucc="select * from succursal where codeSucc='"
                  +fctget2
                  +"'";
         Rsql3=stmt.executeQuery(libelleSucc);
         if(Rsql3.next()) System.out.println("rslt !!");
         emp.setSuccursal(Rsql3.getString(3));
         }  
        
        Rsql=stmt.executeQuery(TrouverAgent);
        if(Rsql.next()){ 	
         String fctget3=Rsql.getString(5);
         String libelleAg = null;
          libelleAg="select * from agence where codeAgence='"
                  +fctget3
                  +"'";
         Rsql4=stmt.executeQuery(libelleAg);
         if(Rsql4.next()) System.out.println("rslt !!");
         emp.setAgence(Rsql4.getString(4));
        }
         Rsql=stmt.executeQuery(TrouverAgent);
        if(Rsql.next())
        {	
         String fctget=Rsql.getString(9);
         String libelleFct = null;
          libelleFct="select * from fonction where fonction_id='"
                  +fctget
                  +"'";
         Rsql5=stmt.executeQuery(libelleFct);
         if(Rsql5.next()) System.out.println("rslt !!");
         emp.setFonction(Rsql5.getString(6));
        }
         
         Rsql=stmt.executeQuery(TrouverAgent);
        if(Rsql.next())
         
        {
         emp.setRole(Rsql.getString(2));
         emp.setPassword(Rsql.getString(3));
         emp.setEmail(Rsql.getString(10));
         emp.setVersion(String.valueOf(Rsql.getString(12)));
         emp.setActif(Rsql.getBoolean(11));         
        }      
        }    
      }
      catch (Exception ex) 
      {
         System.out.println("Erreur affichage.java !! " + ex);
          emp.setValide(false); 
      }     
   return emp;
   }
      
}