package org.apache.jsp.appointmentform;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class requestandresponse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"../Doctor/assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Doctor/assets//table_example-1/table.css\" type=\"text/css\"/>\n");
      out.write("       ");

           ResultSet rs=null;
                try{ 
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DPA", "root", "akshay");
                Statement st = con.createStatement();                
                rs=st.executeQuery("select * from Apprequest,Doctor where and Apprequest.docid=Doctor.docid patid="+session.getAttribute("patid"));
                }
                catch(Exception ex){}
       
      out.write("\n");
      out.write("<div class=\"nav navbar\"> <h1 style=\"text-align: center\">See your Previous request and responses</h1></div>\n");
      out.write("        <div class=\"CSS_Table_Example\" style=\"width:1300px;height:50px;\">\n");
      out.write("            <h1 class=\"header\">Pending Request</h1>\n");
      out.write("            <table >\n");
      out.write("                <tr> \n");
      out.write("                    <td>\n");
      out.write("                        Doctor\n");
      out.write("                    </td>\n");
      out.write("                    <td >\n");
      out.write("                        Problem\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       Date\n");
      out.write("                    </td>    \n");
      out.write("                </tr>\n");
      out.write("                ");
while(rs.next()){
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( rs.getString("Dname")+"("+rs.getString("Patient.docid")+")");
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs.getString("preblem"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs.getString("ptime"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <h1 class=\"header\">Confirmed Request</h1>\n");
      out.write("             <table >\n");
      out.write("                <tr> \n");
      out.write("                    <td>\n");
      out.write("                        Patient Name\n");
      out.write("                    </td>\n");
      out.write("                    <td >\n");
      out.write("                        Problem\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        Confirm\n");
      out.write("                    </td>    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("        </div>\n");
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
