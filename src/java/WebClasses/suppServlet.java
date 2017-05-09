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
@WebServlet(name = "suppServlet", urlPatterns = {"/suppServlet"})
public class suppServlet extends HttpServlet {

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
   	    
     Agent emp = new Agent();
     emp.setMatricule(request.getParameter("matric"));
     emp.setNom(request.getParameter("nom"));
     emp.setPrenom(request.getParameter("prenom")); 
     
  try
    {	    
     emp=DonneeDAO.Exister(emp);
     System.out.println(emp.getMatricule());
     if(emp.Valide) 
     { emp = DonneeDAO.Traiter(emp,3);        
           HttpSession session = request.getSession(true);	    
          session.setAttribute("currentSessionUser",emp); 
        request.getRequestDispatcher("/AfficheServSup").forward(request,response);
     }  
      else { HttpSession session = request.getSession(true);	    
          session.setAttribute("employe",emp); 
          response.sendRedirect("erreurBD.jsp"); //logged-in page
            }
    }
                		
    catch (Throwable theException){
     System.out.println(theException); 
    }
   }
}
        