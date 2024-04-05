package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Business.Procedures;
import Business.Appointments;
import Business.Patient;

public final class PatInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Oswald&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                font-family: 'Oswald', sans-serif;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background-image: url('data:image/jpeg;base64,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');\n");
      out.write("                background-size: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                height: 100%;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Patient Info</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Patient p1 =(Patient)session.getAttribute("p1");
            Appointments a1 = (Appointments)session.getAttribute("a1");
            Procedures pr = (Procedures)session.getAttribute("pr");
        
      out.write("\n");
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
