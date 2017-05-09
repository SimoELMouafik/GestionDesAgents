/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

/**
 *
 * @author user
 */
 import java.sql.*;
 //import java.util.*;

public class ConnectBD {
    //Attributs
      static Connection con;
      static String url;
    //Méthode        
      public static Connection getConnection()
      {
        
         try
         {
            String url; 
            // assuming "DataSource" is your DataSource name
             url = "jdbc:sqlserver://localhost:1433;"+"databaseName=Users";
                     //+"user=SQL;"
                     //+"password=simobenatia26rd";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            try
            {            	
               con = DriverManager.getConnection(url,"SQL","simobenatia26rd"); 
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

