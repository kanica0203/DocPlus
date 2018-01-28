package org.apache.jsp.appointmentform;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class appointmentform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Appointment Request List</title>\n");
      out.write("\n");
      out.write("\t<!---------- CSS ------------>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/style.css\"></link>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
     
        Statement st=null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DPA", "root", "akshay");
        st = con.createStatement();
        }
        catch(Exception ex){}
        ResultSet rs= st.executeQuery("select docid from Doctor");
  
      out.write("\n");
      out.write("    <!--BEGIN #signup-form -->\n");
      out.write("    <div id=\"request-form\">\n");
      out.write("        \n");
      out.write("        <!--BEGIN #subscribe-inner -->\n");
      out.write("        <div id=\"signup-inner\">\n");
      out.write("        \n");
      out.write("        \t<div class=\"clearfix\" id=\"header\">\n");
      out.write("        \n");
      out.write("                <h1>Fill The Form To Make An Appointment Request</h1>\n");
      out.write("            </div>\n");
      out.write("\t\t\t<p>Please complete the fields below correctly to request for and appointment and you will be shown the best possible appointment.</p>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <form method=\"post\" action=\"http://localhost:8080/webminor1/appointmentform/DoctorsOption.jsp\">\n");
      out.write("            \t\n");
      out.write("                <p>\n");
      out.write("\n");
      out.write("                <label for=\"name\">Patient Name *</label>\n");
      out.write("                <input id=\"name\" type=\"text\" name=\"pname\" value=\"");
      out.print( session.getAttribute("Name"));
      out.write("\" required=\"\"/>\n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                <label for=\"Problem\">Problem</label>\n");
      out.write("                <input id=\"problem\" type=\"text\" name=\"problem\" value=\"\" />\n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                    <lable for=\"Doctor\">Preffered Doctor Id</lable><br/>\n");
      out.write("                    <select name=\"docid\">\n");
      out.write("                       ");
while(rs.next()){
      out.write("\n");
      out.write("                       <option>");
      out.print( rs.getString(1));
      out.write("</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </select> \n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                 <label for=\"phone\">Phone</label>\n");
      out.write("                <input id=\"phone\" type=\"text\" name=\"phone\" value=\"\" />\n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                <label for=\"dateint\">Time</label>\n");
      out.write("                <input id=\"ptime\" type=\"text\" name=\"dateint\" value=\"\" />\n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                <button id=\"submit\" type=\"submit\">Submit</button>\n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("\t\t<div id=\"required\">\n");
      out.write("\t\t<p>* Required Fields<br/></p>\n");
      out.write("\t\t</div>\n");
      out.write("             </div>\n");
      out.write("        \n");
      out.write("        <!--END #signup-inner -->\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    <!--END #signup-form -->   \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
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
