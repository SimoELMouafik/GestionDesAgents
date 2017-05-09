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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class ConnectDB2 {
  //Attributs
      static Connection con;
      public static String NameServer;
      public static String NameData;
      private static String NameUser;
      private static String NamePass;
      public static String ClassForName;
//Méthode        

    /**
     *
     */
     public static void  ImporterUrl() {
    //Création de l'objet File 
try
{
    File f = new File ("C:\\Users\\user\\Documents\\NetBeansProjects\\WebApplication1\\src\\java\\WebClasses\\text.txt");
    FileReader fr = new FileReader (f);
    BufferedReader br = new BufferedReader (fr);
 
    try
    {
        String line;
        
 
        {
            line= br.readLine();
            System.out.println (line);
            NameServer=line;
            System.out.println (line);
            line = br.readLine();
            System.out.println (line);
            NameData=line;
            System.out.println (line);
             line = br.readLine();
             ClassForName=line;
            System.out.println (line);
            line = br.readLine();
             NameUser=line;
            System.out.println (line);
             line = br.readLine();
             NamePass=line;
            
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
     
      

      
      public static Connection getConnection()
      {
         ImporterUrl();
         try
         {
            String url; 
            // assuming "DataSource" is your DataSource name
             url = "jdbc:sqlserver:"+NameServer+"databaseName="+NameData;
                     //+"user=SQL;"
                     //+"password=simobenatia26rd";

            Class.forName(ClassForName);
            
            try
            {            	
               con = DriverManager.getConnection(url,NameUser,NamePass); 
            }
            
            catch (SQLException ex)
            {
               ex.printStackTrace();
            }
         }

         catch(ClassNotFoundException e)
         {
            System.out.println(e);
         }

      return con;
    }   
}