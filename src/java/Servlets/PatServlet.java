/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Business.Appointments;
import Business.Patient;
import Business.Procedures;
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
 *	Java III - Logging in as Patient Servlet
 *      Kimora Bailey - Spring 2022
 *      PatServlet.java
 ********************************************************************/
@WebServlet(name = "PatServlet", urlPatterns = {"/PatServlet"})
public class PatServlet extends HttpServlet {

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
 *  This servlet is to log in as a Patient
 ********************************************************************/
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            
        String patid;
        int password;
/********************************************************************
 *  Get Parameter from previous HTML file
 ********************************************************************/
        password = Integer.parseInt(request.getParameter("Password"));
        patid = request.getParameter("PatID");
        
        try{
            System.out.println("Patient ID: "+patid);
            System.out.println("Password: "+password);
 /********************************************************************
 *  Creating Patient object 
 ********************************************************************/           
            Patient p1 = new Patient();
            p1.selectDB(patid);
            String id = p1.getpatId();
            int pw = p1.getpasswd();
/********************************************************************
 *  Putting Patient object into session
 ********************************************************************/            
            HttpSession ses1;
            ses1 = request.getSession();
            ses1.setAttribute("p1",p1);
/********************************************************************
 *  Creating Appointments object 
 ********************************************************************/           
            Appointments a1 = new Appointments();
            a1.selectDB(patid);
            String proc = a1.getproccode();
            System.out.println("Appointment Code: " + proc);
 /********************************************************************
 *  Putting Appointments object into session
 ********************************************************************/            
            HttpSession ses2;
            ses2 = request.getSession();
            ses2.setAttribute("a1", a1);
/********************************************************************
 *  Creating Procedures object 
 ********************************************************************/               
            Procedures pr = new Procedures();
            pr.selectDB(proc);
/********************************************************************
 *  Putting Procedures object into session
 ********************************************************************/           
            HttpSession ses3;
            ses3 = request.getSession();
            ses3.setAttribute("pr", pr);
            
            if((patid.equals(id)&& password==pw )){
              System.out.println("Patient ID: " + p1.getpatId());
              System.out.println("Patient Password: " + p1.getpasswd());
              System.out.println("Patient First Name: " + p1.getfirstName());
              System.out.println("Patient Last Name: " + p1.getlastName());
              System.out.println("Patient Address: " + p1.getaddr());
              System.out.println("Patient Email: " + p1.getemail());
              System.out.println("Insurance: " + p1.getinsCo());
 /********************************************************************
 *  Using RequestDispatcher to forward to next file
 ********************************************************************/                
              RequestDispatcher rd = request.getRequestDispatcher("/PatInfo.jsp");
              rd.forward(request, response);
            }
            else{
 /********************************************************************
 *  Using RequestDispatcher to forward to next file
 ********************************************************************/   
              RequestDispatcher rd = request.getRequestDispatcher("/ErrorPage.jsp");
              rd.forward(request, response);
          }
        }
        catch(Exception e){
            System.out.println("Error");
        }
        finally{
            System.out.println("PatServlet Ending...");
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
