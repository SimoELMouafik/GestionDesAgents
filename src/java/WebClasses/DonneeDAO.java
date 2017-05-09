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

public class DonneeDAO {
 
      static Connection currentCon = null;
      static Connection currentCon1 = null;
      static ResultSet RsltSql = null;  
	 public static Agent Exister(Agent emp) {
             String matric =emp.getMatricule();
         String ExistAgent="select * from agent where matricule='"+matric+"'";
        Statement stmt;
         try{  
         currentCon1 = ConnectDB2.getConnection();
         stmt=currentCon1.createStatement();
         	        
         RsltSql=stmt.executeQuery(ExistAgent);
         if(RsltSql.next()) emp.setValide(true);
         else emp.setValide(false);
       
         }
       catch (Exception ex) 
      {
         System.out.println("Erreur Existence" + ex);
          
      } 
    return emp; 
    } 

        public static Agent Traiter(Agent emp,int action) {
	
         //preparing some objects for connection 
         Statement stmt ;    
	 String matric =emp.getMatricule();
         String nom = emp.getNom();    
         String prenom = emp.getPrenom();    
         String bpr = emp.getBpr();
         String succ = emp.getSuccursal();
         String agence=emp.getAgence();
         String fct=emp.getFonction();
         String role=emp.getRole();
         String password=emp.getPassword();
         String email=emp.getEmail();
         String version=emp.getVersion();
         boolean actif=emp.getActif();
         
         String TrouverCompte = null;
         String fctID=null;
        fctID="select * from fonction where libelle='"
                +fct
                +"'";
         
      
      //System.out.println("Nom : " + nom);          
      //System.out.println("Mot De Passe : " + password);
      //System.out.println("Query: "+TrouverCompte);
	    
      try 
      {
         //connect to DB 
         currentCon = ConnectDB2.getConnection();
         stmt=currentCon.createStatement();
         	        
         RsltSql=stmt.executeQuery(fctID);
         if(RsltSql.next()) 
         fct=RsltSql.getString(1);
            System.out.println(fct);
        
        if(action==1)
         {
             TrouverCompte=
          // Mise à jour
                  "update agent SET bpr='"
                  + bpr
                  + "',succursal='"
                  + succ
                  + "',agence='"
                  + agence
                  + "',fonction_id='"
                  + fct
                  +"' where matricule='"
                  + matric
                  + "'";}
        
        if(action==2)
         {
             TrouverCompte=
        //Insertion
 "insert into agent(matricule,nom,bpr,prenom,Role,password,succursal,agence,email,version,actif,fonction_id) values('"
                  +matric
                  +"','"
                  +nom
                  +"','"
                  +bpr
                  +"','"
                  +prenom
                  +"','"
                  +role
                  +"','"
                  +password
                  +"','"
                  +succ
                  +"','"
                  +agence   
                  +"','"
                  +email  
                  +"','"
                  +version 
                  +"','"
                  +actif  
                  +"','"
                  + fct
                  +"')"; 
         }
        if(action==3)
            {
             //suppression
                TrouverCompte="delete from agent where matricule='"
                  +matric
                  +"'"; }
	
        
        stmt.executeUpdate(TrouverCompte);
         
         emp.setValide(true);
         }      
         
       

      catch (Exception ex) 
      {
         System.out.println("Erreur Donnee.java" + ex);
          emp.setValide(false); 
      }     
   return emp;
   }
}