/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Business.Appointments;
import Business.Dentist;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/********************************************************************
 *	Java III - Logging in as Dentist Servlet
 *      Kimora Bailey - Spring 2022
 *      DenServlet.java
 ********************************************************************/

@WebServlet(name = "DenServlet", urlPatterns = {"/DenServlet"})
public class DenServlet extends HttpServlet {

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
 *  This servlet is to log in as a Dentist
 ********************************************************************/
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
 /********************************************************************
 *  Get Parameter from previous HTML file
 ********************************************************************/
        String dentid = request.getParameter("DenID");
        String password = request.getParameter("DPasswd");
        
        try{
            System.out.println("Dentist ID: "+dentid);
            System.out.println("Password: "+password);
/********************************************************************
 *  Creating Dentist object 
 ********************************************************************/
            Dentist d1 = new Dentist();
            d1.selectDB(dentid);
            String Did = d1.getid();
            String PW = d1.getpasswd();
 /********************************************************************
 *  Putting Dentist object into session
 ********************************************************************/           
            HttpSession ses4 = request.getSession();
            ses4.setAttribute("d1", d1);
 /********************************************************************
 *  Creating Appointments object 
 ********************************************************************/           
            Appointments a2 = new Appointments();
            a2.selectDBD(dentid);
            String descrip = a2.getproccode();
            System.out.println("Testing: "+descrip);
 /********************************************************************
 *  Putting Appointments object into session
 ********************************************************************/             
            HttpSession ses5 = request.getSession();
            ses5.setAttribute("a2", a2);
          
            if((Did.equals(dentid)&& PW.equals(password))){
              System.out.println("Dentist ID: " + d1.getid());
              System.out.println("Dentist Password: " + d1.getpasswd());
              System.out.println("Dentist First Name: " + d1.getfirstName());
              System.out.println("Dentist Last Name: " + d1.getlastName());
              System.out.println("Dentist Email: " + d1.getemail());
              System.out.println("Office: " + d1.getoffice());
 /********************************************************************
 *  Using RequestDispatcher to forward to next file
 ********************************************************************/    
              RequestDispatcher rd = request.getRequestDispatcher("/DentInfo.jsp");
              rd.forward(request, response);
            }
            else{
 /********************************************************************
 *  Using RequestDispatcher to forward to next file
 ********************************************************************/    
              RequestDispatcher rd = request.getRequestDispatcher("/DErrorPage.jsp");
              rd.forward(request, response);
          }
            
        }
        catch(Exception e){
            System.out.println("Error");
        }
        finally{
            System.out.println("DenServlet Ending...");
            out.close();
        }
           
        
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
