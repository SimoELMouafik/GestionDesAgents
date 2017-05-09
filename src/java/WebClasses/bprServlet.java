/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebClasses;

import static WebClasses.listerDAO.getAllBpr;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "bprServlet", urlPatterns = {"/bprServlet"})
public class bprServlet extends HttpServlet {

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
         
       
        try {
            
           List listB =(List)getAllBpr("bpr","codeBpr");
           List listS =(List)getAllBpr("succursal","codeSucc");
           List listA =(List)getAllBpr("agence","codeAgence");
           List listF =(List)getAllBpr("fonction","fonction_id");
           HttpSession session = request.getSession(true);	    
          session.setAttribute("listB",listB); 
          session.setAttribute("listS",listS);
          session.setAttribute("listA",listA);
          session.setAttribute("listF",listF);

          response.sendRedirect("modifier.jsp");
         
     
        } catch (SQLException ex) {
            Logger.getLogger(bprServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        





    }


}
