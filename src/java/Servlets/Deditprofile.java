package Servlets;

import Business.Dentist;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/*******************************************************************
 *      Java III - Edit Dentist Profile Servlet
 *      Kimora Bailey - Spring 2022
 *      Deditprofile.java
 ******************************************************************/

@WebServlet(name = "Deditprofile", urlPatterns = {"/Deditprofile"})
public class Deditprofile extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
 /********************************************************************
 *  This servlet is to edit the dentist profile
 ********************************************************************/
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
 /********************************************************************
 *  Getting Dentist object out of session
 ********************************************************************/
        Dentist d1;
        HttpSession session = request.getSession();
        d1 = (Dentist)session.getAttribute("d1");
        
        String Did;
        String Dpass;
        String Dfn;
        String Dln;
        String Dem;
        int Doffice;
        
 /********************************************************************
 *  Get Parameter from previous HTML file
 ********************************************************************/
        Did = request.getParameter("dentid");
        Dpass = request.getParameter("dentpass");
        Dfn = request.getParameter("dfn");
        Dln = request.getParameter("dln");
        Dem = request.getParameter("dem");
        Doffice = Integer.parseInt(request.getParameter("doff"));
 /********************************************************************
 *  Put Dentist object in session
 ********************************************************************/
        d1.setid(Did);
        d1.setpasswd(Dpass);
        d1.setfirstName(Dfn);
        d1.setlastName(Dln);
        d1.setemail(Dem);
        d1.setoffice(Doffice);
        d1.updateDB();
 
        session.setAttribute("d1", d1);
 /********************************************************************
 *  Using RequestDispatcher to forward to next file
 ********************************************************************/    
        RequestDispatcher rd = request.getRequestDispatcher("/DentInfo.jsp");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
