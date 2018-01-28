package org.apache.jsp.appointmentform;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.io.*;
import java.net.*;
import java.util.*;

public final class DoctorsOption_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Appointment</title>\n");
      out.write("        <link href=\"../Doctor/assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("        <style>\n");
      out.write("            .nav{\n");
      out.write("                background-color: turquoise;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"../images/images.jpg\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("            }\n");
      out.write("            .CSS_Table_Example{\n");
      out.write("                position: relative;\n");
      out.write("                left:35px;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            .btnmak{\n");
      out.write("                position:relative;\n");
      out.write("                top:1100px;\n");
      out.write("                left:550px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Doctor/assets/table_example-1/table.css\" type=\"text/css\"/>\n");
      out.write("        ");

            ResultSet rs = null;
            String Dateshowing="";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DPA", "root", "akshay");
                Statement st = con.createStatement();
                rs=st.executeQuery("select ADDDATE(curdate(),"+request.getParameter("dateint")+")");
                rs.next();
                Dateshowing=rs.getString(1);
                String query="select atime from Doctor,Appointment1 where Doctor.docid=Appointment1.docid and month(curdate())=month(atime) and year(curdate())=year(atime) and day(ADDDATE(curdate(),"+request.getParameter("dateint")+"))=day(atime) and Doctor.docid=" +  request.getParameter("docid");
                rs = st.executeQuery(query);
            } catch (Exception ex) {
            }
            String output[] = new String[24];
            while (rs.next()) {
                for (int i = 0; i < 24; i++) {
                    String cmpstr = "";
                    if (i < 10) {
                        cmpstr += "0" + i;
                    } else {
                        cmpstr += i;
                    }
                    if (rs.getString("atime").substring(11, 13).equals(cmpstr)) {
                        output[i] = rs.getString("atime");
                        break;
                    }
                }
            }
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"nav navbar\"> <h1 style=\"text-align: center\">Take a look at your appointment on ");
      out.print( Dateshowing);
      out.write(" Dr.");
      out.print( request.getParameter("docid"));
      out.write("</h1></div>\n");
      out.write("        <div class=\"CSS_Table_Example\" style=\"width:1300px;height:150px;\">\n");
      out.write("            <table >\n");
      out.write("                <tr> \n");
      out.write("                    <td>\n");
      out.write("                        Time\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        Request\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    for (int i = 0; i < output.length; i++) {
                
      out.write("<tr>");

                        if(output[i]==null)
                        { 
                           
      out.write("<td>");
 out.println(i+":00"); 
      out.write("</td>");

                               
      out.write("<form action=\"http://localhost:8080/webminor1/Makerequest\"><td><div style=\"position: absolute;left: -1000px;\"><input type=\"number\" value=\"");
      out.print( i);
      out.write("\" name='time'></div> <input type=\"submit\" class=\"btn btn-success\" value=\"Request Slot\"></td></form>");
    
                        }
                        else{
                           
      out.write("<td>");
      out.print( output[i] );
      out.write("</td>");

                               
      out.write("<td><button class=\"btn btn-block\" disabled=\"true\"> Filled </button></td>");

                        }
                                    
                    
      out.write("</tr>");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("            <a href=\"appointmentform.jsp\"> <button class=\"btn btn-info btn-lg btnmak\" >See another Doctor</button></a>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
