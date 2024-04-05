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
 *	Java III - Scheduling Appointment Servlet
 *      Kimora Bailey - Spring 2022
 *      ScheduleServ.java
 ********************************************************************/
@WebServlet(name = "ScheduleServ", urlPatterns = {"/ScheduleServ"})
public class ScheduleServ extends HttpServlet {

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
 *  This servlet is to schedule appointments
 ********************************************************************/
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
 /********************************************************************
 *  Getting Patient and Procedures object out of session
 ********************************************************************/     
        Patient p1;
        HttpSession session = request.getSession();
        p1 = (Patient)session.getAttribute("p1");
        
        Procedures pr;
        pr = (Procedures)session.getAttribute("pr");
        
        String month, day, time, yr, dID, pID, insur, proc, adt;
/********************************************************************
 *  Get Parameter from previous HTML file
 ********************************************************************/
        month = request.getParameter("Mon");
        day = request.getParameter("Day");
        yr = request.getParameter("year");
        time = request.getParameter("Time");
        dID = request.getParameter("Dentist");
        pID = p1.getpatId();
        insur = request.getParameter("Insurance");
        proc = request.getParameter("Procedure");
        adt = month+" "+day+" "+yr+" "+time;
        
        Appointments a1 = new Appointments();
        a1.setADT(adt);
        a1.setpatId(pID);
        a1.setdentId(dID);
        a1.setproccode(proc);
        a1.insertDB();
        
        pr.selectDB(proc);
        String desc = pr.getprdesc();
 /********************************************************************
 *  Putting Procedures and Appointments object into session
 ********************************************************************/           
        session.setAttribute("a1",a1);
        session.setAttribute("pr", pr);
 /********************************************************************
 *  Using RequestDispatcher to forward to next file
 ********************************************************************/          
        RequestDispatcher rd = request.getRequestDispatcher("/PatInfo.jsp");
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
