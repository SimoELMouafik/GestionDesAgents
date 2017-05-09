/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebClasses;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class retourServlet extends HttpServlet {
     static int  R=0;
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    try
    {	    

     Agent user = new Agent();
     
     user = CompteDAO.login(user);
    
         if (user.EstValide())
        {
	      
          HttpSession session = request.getSession(true);	    
           int r = 0;
           String role=user.getRole();
           
        if(role.equals( "ADM")) r=2;
       //else if(role.equals("Consultation")) r=2;  
         
        session.setAttribute("employe",r); 
           
          response.sendRedirect("UserLogged.jsp"); //logged-in page
        
        }
	        
        else
          response.sendRedirect("InvalidLogin.jsp"); //error page 
    
    }
    
		
    catch (Throwable theException) 	    
    {
     System.out.println(theException); 
    }
   }
}
        
   

    

