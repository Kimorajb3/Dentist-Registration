package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Business.Patient;

public final class schedule_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");

            Patient p1 = (Patient)session.getAttribute("p1");
         
      out.write("\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                font-family: 'Oswald', sans-serif;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background-image: url('https://cdn.mwallpapers.com/photos/wallpapers/3d-abstract/aesthetic-blue-computerhd-wallpapers-desktop-background-android-iphone-1080p-4k-8r46r.jpg');\n");
      out.write("                background-size: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .rectangle{\n");
      out.write("                width: 320px;\n");
      out.write("                height: 650px;\n");
      out.write("                background: #0177D9;\n");
      out.write("                color: #000F52;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                position: absolute;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                padding: 20px 40px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0 0 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 22px;\n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("               margin-bottom: 5px;\n");
      out.write("               padding: 0;\n");
      out.write("               font-weight: bold;               \n");
      out.write("            }\n");
      out.write("            select{\n");
      out.write("                background-color: #D4E6F1;\n");
      out.write("                border: none;\n");
      out.write("                padding: 0 1em 1em 0;\n");
      out.write("                margin: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                font-size: inherit;\n");
      out.write("                cursor: inherit;\n");
      out.write("                line-height: inherit;\n");
      out.write("            }\n");
      out.write("            .input{ \n");
      out.write("              width: 100%;\n");
      out.write("              margin: 0px;\n");
      out.write("              border: none;\n");
      out.write("              background: #D4E6F1;\n");
      out.write("              outline: none;\n");
      out.write("              height: 30px;\n");
      out.write("              color: black;\n");
      out.write("              font-size: 16px;\n");
      out.write("            }\n");
      out.write("            .form_button{\n");
      out.write("                width: 100%;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                padding: 0px;\n");
      out.write("                font-size: 1.1rem;               \n");
      out.write("                cursor: pointer;\n");
      out.write("                border: none;\n");
      out.write("                outline: none;\n");
      out.write("                height: 40px;\n");
      out.write("                background: #67D3F3;\n");
      out.write("                color: #fff;    \n");
      out.write("            }\n");
      out.write("           \n");
      out.write("           </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Schedule Appt</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"rectangle\">\n");
      out.write("            <h3> Hello ");
      out.print(p1.getfirstName()+" "+p1.getlastName());
      out.write(" </h3> \n");
      out.write("        \n");
      out.write("        <form name=\"PSCHEDULE\" action=\"ScheduleServ\" method=\"post\">\n");
      out.write("            <div>\n");
      out.write("            <p>Month</p>\n");
      out.write("            <select name=\"Mon\">\n");
      out.write("                <option value=\"Jan\">January</option>\n");
      out.write("                <option value=\"Feb\">February</option>\n");
      out.write("                <option value=\"Mar\">March</option>\n");
      out.write("                <option value=\"Apr\">April</option>\n");
      out.write("                <option value=\"May\">May</option>\n");
      out.write("                <option value=\"Jun\">June</option>\n");
      out.write("                <option value=\"Jul\">July</option>\n");
      out.write("                <option value=\"Aug\">August</option>\n");
      out.write("                <option value=\"Sep\">September</option>\n");
      out.write("                <option value=\"Oct\">October</option>\n");
      out.write("                <option value=\"Nov\">November</option>\n");
      out.write("                <option value=\"Dec\">December</option>\n");
      out.write("            </select>\n");
      out.write("            </div>\n");
      out.write("            <p>Day</p>\n");
      out.write("            <select name=\"Day\">\n");
      out.write("                <option value=\"1\">1</option>\n");
      out.write("                <option value=\"2\">2</option>\n");
      out.write("                <option value=\"3\">3</option>\n");
      out.write("                <option value=\"4\">4</option>\n");
      out.write("                <option value=\"5\">5</option>\n");
      out.write("                <option value=\"6\">6</option>\n");
      out.write("                <option value=\"7\">7</option>\n");
      out.write("                <option value=\"8\">8</option>\n");
      out.write("                <option value=\"9\">9</option>\n");
      out.write("                <option value=\"10\">10</option>\n");
      out.write("                <option value=\"11\">11</option>\n");
      out.write("                <option value=\"12\">12</option>\n");
      out.write("                <option value=\"13\">13</option>\n");
      out.write("                <option value=\"14\">14</option>\n");
      out.write("                <option value=\"15\">15</option>\n");
      out.write("                <option value=\"16\">16</option>\n");
      out.write("                <option value=\"17\">17</option>\n");
      out.write("                <option value=\"18\">18</option>\n");
      out.write("                <option value=\"19\">19</option>\n");
      out.write("                <option value=\"20\">20</option>\n");
      out.write("                <option value=\"21\">21</option>\n");
      out.write("                <option value=\"22\">22</option>\n");
      out.write("                <option value=\"23\">23</option>\n");
      out.write("                <option value=\"24\">24</option>\n");
      out.write("                <option value=\"25\">25</option>\n");
      out.write("                <option value=\"26\">26</option>\n");
      out.write("                <option value=\"27\">27</option>\n");
      out.write("                <option value=\"28\">28</option>\n");
      out.write("                <option value=\"29\">29</option>\n");
      out.write("                <option value=\"30\">30</option>\n");
      out.write("                <option value=\"31\">31</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <p>Year</p>\n");
      out.write("            <input type=\"text\" readonly=\"readonly\" value=\"2018\" name=\"year\" class=\"input\"/>\n");
      out.write("            \n");
      out.write("            <p>Time</p>\n");
      out.write("            <select name=\"Time\">\n");
      out.write("                <option value=\"9am\">9:00 am</option>\n");
      out.write("                <option value=\"10am\">10:00 am</option>\n");
      out.write("                <option value=\"11am\">11:00 am</option>\n");
      out.write("                <option value=\"12pm\">12:00 pm</option>\n");
      out.write("                <option value=\"1pm\">1:00 pm</option>\n");
      out.write("                <option value=\"2pm\">2:00 pm</option>\n");
      out.write("                <option value=\"3pm\">3:00 pm</option>\n");
      out.write("                <option value=\"4pm\">4:00 pm</option>\n");
      out.write("                <option value=\"5pm\">5:00 pm</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <p>Dentist</p>\n");
      out.write("            <select name=\"Dentist\">\n");
      out.write("                <option value=\"D201\">Frank Martin</option>\n");
      out.write("                <option value=\"D202\">Susan Cassidy</option>\n");
      out.write("                <option value=\"D203\">Jerry York</option>\n");
      out.write("                <option value=\"D204\">Wayne Pattersen</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <p>Insurance</p>\n");
      out.write("            <select name=\"Insurance\">\n");
      out.write("                <option value=\"Cigna\">Cigna</option>\n");
      out.write("                <option value=\"Aetna\">Aetna</option>\n");
      out.write("                <option value=\"Blue\">Blue Cross</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <p>Procedure</p>\n");
      out.write("            <select name=\"Procedure\">\n");
      out.write("                <option value=\"P114\">Cleaning/Exam ($99.99)</option>\n");
      out.write("                <option value=\"P119\">Xrays ($320)</option>\n");
      out.write("                <option value=\"P122\">Whitening ($129.99)</option>\n");
      out.write("                <option value=\"P321\">Cavity ($319.00)</option>\n");
      out.write("                <option value=\"P650\">Top Dentures ($1950.00)</option>\n");
      out.write("                <option value=\"P660\">Bottom Dentures ($1950.00)</option>\n");
      out.write("                <option value=\"P780\">Crown ($795.00)</option>\n");
      out.write("                <option value=\"P790\">Root Canal ($1019.00)</option>\n");
      out.write("            </select>\n");
      out.write("            <button class=\"form_button\" type=\"submit\">Submit</button>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
