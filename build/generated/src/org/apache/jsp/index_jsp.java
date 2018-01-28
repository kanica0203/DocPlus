package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html >\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Dance Login</title>\n");
      out.write("    \n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"Patient/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("body{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-family: Arial;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".body{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: -20px;\n");
      out.write("\tleft: -20px;\n");
      out.write("\tright: -40px;\n");
      out.write("\tbottom: -40px;\n");
      out.write("\twidth: auto;\n");
      out.write("\theight: auto;\n");
      out.write("    background-size: cover;\n");
      out.write("\tz-index: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".grad{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: -20px;\n");
      out.write("\tleft: -20px;\n");
      out.write("\tright: -40px;\n");
      out.write("\tbottom: -40px;\n");
      out.write("\twidth: auto;\n");
      out.write("\theight: auto;\n");
      out.write("\tbackground: url(images/pic1.jpg);\n");
      out.write("    background-size: cover;\n");
      out.write("    z-index: 1;\n");
      out.write("\topacity: 1.0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: calc(50% - 55px);\n");
      out.write("\tleft: 350px;\n");
      out.write("\tz-index: 2;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header div{\n");
      out.write("\tfloat: left;\n");
      out.write("\tcolor: #aaa;\n");
      out.write("\tfont-family: 'Exo', sans-serif;\n");
      out.write("\tfont-size: 35px;\n");
      out.write("\tfont-weight: 200;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header div span{\n");
      out.write("\tcolor: #5379fa !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: calc(50% - 75px);\n");
      out.write("\tleft: calc(50% - 50px);\n");
      out.write("\theight: 150px;\n");
      out.write("\twidth: 350px;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\tz-index: 2;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type=text]{\n");
      out.write("\twidth: 250px;\n");
      out.write("\theight: 30px;\n");
      out.write("\tbackground: transparent;\n");
      out.write("\tborder: 1px solid rgba(255,255,255,0.6);\n");
      out.write("\tborder-radius: 2px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-family: 'Exo', sans-serif;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tfont-weight: 400;\n");
      out.write("\tpadding: 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type=password]{\n");
      out.write("\twidth: 250px;\n");
      out.write("\theight: 30px;\n");
      out.write("\tbackground: transparent;\n");
      out.write("\tborder: 1px solid rgba(255,255,255,0.6);\n");
      out.write("\tborder-radius: 2px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-family: 'Exo', sans-serif;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tfont-weight: 400;\n");
      out.write("\tpadding: 4px;\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".login input[type=text]:focus{\n");
      out.write("\toutline: none;\n");
      out.write("\tborder: 1px solid rgba(255,255,255,0.9);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type=password]:focus{\n");
      out.write("\toutline: none;\n");
      out.write("\tborder: 1px solid rgba(255,255,255,0.9);\n");
      out.write("}\n");
      out.write(".loi{\n");
      out.write("    color: #080808;\n");
      out.write("    margin-top:10px; \n");
      out.write("    width: 250px;\n");
      out.write("}\n");
      out.write(".mi{\n");
      out.write("    color: #080808;\n");
      out.write("    width: 250px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".rn{\n");
      out.write("    position: absolute;\n");
      out.write("    z-index: 99;\n");
      out.write("    left: 637px;\n");
      out.write("    top:370px;\n");
      out.write("}\n");
      out.write(".msg{\n");
      out.write("    color: red;\n");
      out.write("    position: absolute;\n");
      out.write("   top: 60px;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    \n");
      out.write("        <!--<script src=\"js/prefixfree.min.js\"></script>-->\n");
      out.write("      \n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("      ");

          try{
          if((boolean)request.getSession().getAttribute("isvalid"))
              response.sendRedirect("Doctor");
          else
              response.sendRedirect("Patient");
          }catch(Exception ex){}
      
      out.write("\n");
      out.write("    <div class=\"body\"></div>\n");
      out.write("\t\t<div class=\"grad\"></div>\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div>Doc Pat <span>App</span></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<form class=\"login\" method=\"post\" action=\"http://localhost:8080/webminor1/log\">\n");
      out.write("                    <input type=\"text\" placeholder=\"username\" name=\"username\" id=\"email\" required=\"\"><br>\n");
      out.write("            <input type=\"password\" placeholder=\"password\" name=\"password\" required=\"\"><br>\n");
      out.write("            <input type=\"submit\" value=\"Login\" class=\"btn btn-warning btn-lg loi\"><br><br>\n");
      out.write("               </form>  \n");
      out.write("           \n");
      out.write("                <a href=\"Register.html\" class=\"rn\"><button class=\"btn btn-danger btn-lg mi\">Register now </button> </a>\n");
      out.write("            <script src=\"Patient/js/bootstrap.js\"></script>\n");
      out.write("            <script src=\"Patient/js/bootstrap.min.js\"></script>\n");
      out.write("  </body>\n");
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
