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
@WebServlet(name = "ajoutServlet", urlPatterns = {"/ajoutServlet"})
public class ajoutServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    try
    {	    

     Agent emp = new Agent();
     emp.setMatricule(request.getParameter("matric"));
     emp.setNom(request.getParameter("nom"));
     emp.setPrenom(request.getParameter("prenom"));
     emp.setBpr(request.getParameter("bpr"));
     emp.setSuccursal(request.getParameter("succ"));
     emp.setAgence(request.getParameter("agence"));
     emp.setFonction(request.getParameter("fct"));
     emp.setRole(request.getParameterValues("role")[0]);
     emp.setPassword(request.getParameter("mdp"));
     emp.setEmail(request.getParameter("ema"));
     emp.setVersion(request.getParameter("vers"));
     emp.setActif(request.getParameterValues("actif")[0].equals("oui"));
            
     
     emp = DonneeDAO.Traiter(emp,2);
    
         
       
	      
         HttpSession session = request.getSession(true);	    
          session.setAttribute("currentSessionUser",emp); 
          request.getRequestDispatcher("/AfficheServSup").forward(request,response);
        
	        
       
    }
    
		
    catch (Throwable theException) 	    
    {
     System.out.println(theException); 
    }
   }
}
        