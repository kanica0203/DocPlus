package org.apache.jsp.Patient;

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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Patient-");
      out.print( session.getAttribute("Name"));
      out.write("</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/creative.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        .loc{\n");
      out.write("            position: relative;\n");
      out.write("            left:140px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("    ");

         try{
        if((boolean)request.getSession().getAttribute("isvalid"))
            response.sendRedirect("../logf.html");
        }
        catch(Exception ex){
            response.sendRedirect("../logf.html");        
        }
        
    
      out.write("\n");
      out.write("    <nav id=\"mainNav\" class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("           <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("               <a class=\"navbar-brand page-scroll\" href=\"#page-top\">Hello Mr. ");
out.println(request.getSession().getAttribute("Name"));
      out.write("</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"#quick\">Quick Apoi</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"#detail\">Detailed Apoi</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"#bestdoc\">Best Doctors</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"#contact\">Contact us</a>\n");
      out.write("                    </li>\n");
      out.write("                     <li>\n");
      out.write("                         <a href=\"http://localhost:8080/webminor1/logout\">Log Out</a>\n");
      out.write("                     </li>         \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("        <div class=\"over\">\n");
      out.write("        <div class=\"header-content\">\n");
      out.write("            <div class=\"header-content-inner\">\n");
      out.write("                <h1>Get Your Appointment for Best Doctors here</h1>\n");
      out.write("                <hr>\n");
      out.write("                <p>This web site is to help people in getting the doctors appointment quickly and find the best doctors at one spot</p>\n");
      out.write("                <a href=\"#quick\" class=\"btn btn-primary btn-xl page-scroll\">Get Appointment now</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <section class=\"bg-primary\" id=\"quick\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8 col-lg-offset-2 text-center\">\n");
      out.write("                    <h2 class=\"section-heading\">Get a basic appointment here instently</h2>\n");
      out.write("                    <hr class=\"light\">\n");
      out.write("                    <p class=\"text-faded\">If you like getting things fast and need just a reguler checkup you can simply apply here and we will make an appointment with a doctor without any unimportant detail filling</p>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-default btn-xl\">Get Appointment!</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section id=\"detail\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 text-center\">\n");
      out.write("                    <h2 class=\"section-heading\">Get Special Appointment</h2>\n");
      out.write("                    <hr class=\"primary\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row loc\">\n");
      out.write("                <div class=\"col-lg-3 text-center\">\n");
      out.write("                    <div class=\"service-box\">\n");
      out.write("                        <a href=\"http://localhost:8080/webminor1/appointmentform/requestandresponse.jsp\"><button class=\"btn btn-primary btn-lg\">Checkout Responses</button></a>\n");
      out.write("                        <p class=\"text-muted\">Checkout responses for your previous requests.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 text-center\">\n");
      out.write("                    <div class=\"service-box\">\n");
      out.write("                        <a href=\"http://localhost:8080/webminor1/appointmentform/appointmentform.jsp\"> <button class=\"btn btn-warning btn-lg\">Get Appointment</button></a>\n");
      out.write("                        <p class=\"text-muted\">Fill The form and get Appointment now.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 text-center\">\n");
      out.write("                    <div class=\"service-box\">\n");
      out.write("                        <i class=\"fa fa-4x fa-heart wow bounceIn text-primary\" data-wow-delay=\".3s\"></i>\n");
      out.write("                        <button class=\"btn btn-info btn-lg\">All Doctors</button>\n");
      out.write("                        <p class=\"text-muted\">View All Doctors and their Id to fill a Appointment request form.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section class=\"no-padding\" id=\"bestdoc\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row no-gutter\">\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                    <a href=\"#\" class=\"portfolio-box\">\n");
      out.write("                        <img src=\"img/portfolio/1.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                        <div class=\"portfolio-box-caption\">\n");
      out.write("                            <div class=\"portfolio-box-caption-content\">\n");
      out.write("                                <div class=\"project-category text-faded\">\n");
      out.write("                                    Category\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"project-name\">\n");
      out.write("                                    Project Name\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                    <a href=\"#\" class=\"portfolio-box\">\n");
      out.write("                        <img src=\"img/portfolio/2.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                        <div class=\"portfolio-box-caption\">\n");
      out.write("                            <div class=\"portfolio-box-caption-content\">\n");
      out.write("                                <div class=\"project-category text-faded\">\n");
      out.write("                                    Category\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"project-name\">\n");
      out.write("                                    Project Name\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                    <a href=\"#\" class=\"portfolio-box\">\n");
      out.write("                        <img src=\"img/portfolio/3.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                        <div class=\"portfolio-box-caption\">\n");
      out.write("                            <div class=\"portfolio-box-caption-content\">\n");
      out.write("                                <div class=\"project-category text-faded\">\n");
      out.write("                                    Category\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"project-name\">\n");
      out.write("                                    Project Name\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                    <a href=\"#\" class=\"portfolio-box\">\n");
      out.write("                        <img src=\"img/portfolio/4.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                        <div class=\"portfolio-box-caption\">\n");
      out.write("                            <div class=\"portfolio-box-caption-content\">\n");
      out.write("                                <div class=\"project-category text-faded\">\n");
      out.write("                                    Category\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"project-name\">\n");
      out.write("                                    Project Name\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                    <a href=\"#\" class=\"portfolio-box\">\n");
      out.write("                        <img src=\"img/portfolio/5.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                        <div class=\"portfolio-box-caption\">\n");
      out.write("                            <div class=\"portfolio-box-caption-content\">\n");
      out.write("                                <div class=\"project-category text-faded\">\n");
      out.write("                                    Category\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"project-name\">\n");
      out.write("                                    Project Name\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                    <a href=\"#\" class=\"portfolio-box\">\n");
      out.write("                        <img src=\"img/portfolio/6.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                        <div class=\"portfolio-box-caption\">\n");
      out.write("                            <div class=\"portfolio-box-caption-content\">\n");
      out.write("                                <div class=\"project-category text-faded\">\n");
      out.write("                                    Category\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"project-name\">\n");
      out.write("                                    Project Name\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <aside class=\"bg-dark\">\n");
      out.write("        <div class=\"container text-center\">\n");
      out.write("            <div class=\"call-to-action\">\n");
      out.write("                <h2>Free Download at Start Bootstrap!</h2>\n");
      out.write("                <a href=\"#\" class=\"btn btn-default btn-xl wow tada\">Download Now!</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </aside>\n");
      out.write("\n");
      out.write("    <section id=\"contact\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8 col-lg-offset-2 text-center\">\n");
      out.write("                    <h2 class=\"section-heading\">Let's Get In Touch!</h2>\n");
      out.write("                    <hr class=\"primary\">\n");
      out.write("                    <p>Ready to start your next project with us? That's great! Give us a call or send us an email and we will get back to you as soon as possible!</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-lg-offset-2 text-center\">\n");
      out.write("                    <i class=\"fa fa-phone fa-3x wow bounceIn\"></i>\n");
      out.write("                    <p>8871799482</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 text-center\">\n");
      out.write("                    <i class=\"fa fa-envelope-o fa-3x wow bounceIn\" data-wow-delay=\".1s\"></i>\n");
      out.write("                    <p><a href=\"aksha.gupta.ak.ak@gmail.com\">akshay.gupta.ak.ak@gmail.com</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Plugin JavaScript -->\n");
      out.write("    <script src=\"js/jquery.easing.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.fittext.js\"></script>\n");
      out.write("  \n");
      out.write("    <!-- Custom Theme JavaScript -->\n");
      out.write("    <script src=\"js/creative.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
