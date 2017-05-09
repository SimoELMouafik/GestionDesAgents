/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebClasses;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class listerDAO {
    static Connection currentCon = null;
      
      static ResultSet RsltSql = null;  
	
    /**
     *
     * @return
     * @throws SQLException
     */
    public static List  getAllBpr(String table,String colonne) throws SQLException  {
	 
       Statement statement = null;
       
        List list = new ArrayList();   
        try {
            currentCon = ConnectDB2.getConnection();
             statement = currentCon.createStatement();
            ResultSet rs = statement.executeQuery("select * from "+table);
            while(rs.next()) {
                liste bp = new liste();
               bp.setCode(rs.getString(colonne));
              bp.setLibelle(rs.getString("libelle"));
             System.out.println(bp.getLibelle());
                list.add(bp);   
            }
        }
         
      catch (Exception ex) 
      {
         System.out.println("Erreur Donnee.java" + ex);
          
      }     
   return list;
   }

}
