package org.apache.jsp.Doctor;

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

public final class appointmenlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 static String make(String date){
        String ans="";
        for(int i=0;i<date.length();i++){
                if(! (date.charAt(i)=='-'))
                   ans+=(char)date.charAt(i);
            }
            return ans;
            }       
       
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
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
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
      out.write("            .btnnxt{\n");
      out.write("                position:relative;\n");
      out.write("                top:1080px;\n");
      out.write("                left:1230px;\n");
      out.write("            }\n");
      out.write("            .btnprev{\n");
      out.write("                position:relative;\n");
      out.write("                top:990px;\n");
      out.write("                left:50px;\n");
      out.write("            }\n");
      out.write("            .btnmak{\n");
      out.write("                position:relative;\n");
      out.write("                top:1030px;\n");
      out.write("                left:650px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/table_example-1/table.css\" type=\"text/css\"/>\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            ResultSet rs = null;
            String Dateshowing="";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DPA", "root", "akshay");
                Statement st = con.createStatement();
                rs=st.executeQuery("select ADDDATE(curdate(),"+session.getAttribute("dateint")+")");
                rs.next();
                Dateshowing=rs.getString(1);
                String query="select Patient.pname,Patient.phone,atime,problem,done from Doctor,Patient,Appointment1 where Doctor.docid=Appointment1.docid and Patient.patid=Appointment1.patid and month(curdate())=month(atime) and year(curdate())=year(atime) and day(ADDDATE(curdate(),"+(int)session.getAttribute("dateint")+"))=day(atime) and Doctor.docid=" + (int) session.getAttribute("docid");
                rs = st.executeQuery(query);
            } catch (Exception ex) {
            }
            String output[][] = new String[24][4];
            while (rs.next()) {
                for (int i = 0; i < 24; i++) {
                    String cmpstr = "";
                    if (i < 10) {
                        cmpstr += "0" + i;
                    } else {
                        cmpstr += i;
                    }
                    if (rs.getString("atime").substring(11, 13).equals(cmpstr)) {
                        output[i][0] = rs.getString("Patient.pname");
                        output[i][1] = rs.getString("Patient.phone");
                        output[i][2] = rs.getString("atime");
                        output[i][3] = rs.getString("problem");
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
      out.print( session.getAttribute("Name"));
      out.write("</h1></div>\n");
      out.write("        <div class=\"CSS_Table_Example\" style=\"width:1300px;height:150px;\">\n");
      out.write("            <table >\n");
      out.write("                <tr> \n");
      out.write("                    <td>\n");
      out.write("                        Patient\n");
      out.write("                    </td>\n");
      out.write("                    <td >\n");
      out.write("                        Patients phone\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        Time\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        Problem\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        See request\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    for (int i = 0; i < output.length; i++) {
                
      out.write("<tr>");

                           for (int j = 0; j < output[i].length; j++) {
                    if (output[i][j] == null) {
                         if(j==2){
                    
      out.write("<td class=\"emptydate\">");
out.println(i+":00"); 
      out.write("</td>");
   
                        }else{
                    
      out.write("<td class=\"empty\">");
 out.println("Empty slot");
      out.write("</td>");
                 
                      }
                    }
                    else{
      out.write(" \n");
      out.write("                    <td> ");
 out.println(output[i][j]);
      out.write(" </td>\n");
      out.write("                    ");
}}
                    if(output[i][0]==null){
                    
      out.write("\n");
      out.write("                    <td><form action=\"http://localhost:8080/webminortest/testerservlet\"><div style=\"position: absolute;left: -1000px;\"><input type=\"number\" value=\"");
      out.print( i);
      out.write("\" name='time'><input type=\"text\" value=\"");
      out.print( make(Dateshowing));
      out.write("\" name=\"date\"></div> <input type=\"submit\" class=\"btn btn-warning\" value=\"Watch\"></form></td>\n");
      out.write("                    ");
}else{
                        
      out.write("\n");
      out.write("                        <td><button class=\"btn btn-success\" disabled=\"true\">Filled</button></td>\n");
      out.write("                    ");

                    }
      out.write("\n");
      out.write("                </tr>");
}
      out.write("\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("                <form action=\"http://localhost:8080/webminor1/datefix\"> <input type=\"submit\" class=\"btn btn-danger btn-lg btnnxt\" value=\"NextDay\"><input type=\"number\" value=\"1\" style=\"text-indent: -1000px;\" name=\"day\"></form>\n");
      out.write("                        <a href=\"\"> <button class=\"btn btn-info btn-lg btnmak\" >ADD NEW</button></a>\n");
      out.write("                        <form action=\"http://localhost:8080/webminor1/datefix\"><input type=\"submit\" class=\"btn btn-danger btn-lg btnprev\" value='PrevDay'><input type=\"number\" value=\"-1\" style=\"text-indent: -1000px;\" name=\"day\"></form>\n");
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
