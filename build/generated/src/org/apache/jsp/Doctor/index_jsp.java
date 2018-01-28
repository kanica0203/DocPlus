package org.apache.jsp.Doctor;

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <title>One Doctor App</title>\n");
      out.write("    <!-- BOOTSTRAP CORE STYLE CSS -->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- FLEXSLIDER CSS -->\n");
      out.write("<link href=\"assets/css/flexslider.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- CUSTOM STYLE CSS -->\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\" />    \n");
      out.write("  <!-- Google\tFonts -->\n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css' />\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("    ");

        try{
        if(!(boolean)session.getAttribute("isvalid"))
            response.sendRedirect("../logf.html");
        }
        catch(Exception ex){
            response.sendRedirect("../logf.html");        
        }
        
    
      out.write("  \n");
      out.write("  \n");
      out.write(" <div class=\"navbar navbar-inverse navbar-fixed-top \" id=\"menu\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"><img class=\"logo-custom\" src=\"assets/img/logo180-50.png\" alt=\"\"  data-scroll-reveal=\"enter from the left after 0.5s\"  /></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbar-collapse collapse move-me\"  data-scroll-reveal=\"enter from the right after 0.5s\" >\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li ><a href=\"#home\">HOME</a></li>\n");
      out.write("                     <li><a href=\"#BOOK\">BOOK</a></li>\n");
      out.write("                    <li><a href=\"#DOCTORS-sec\">DOCTORS</a></li>\n");
      out.write("                     <li><a href=\"#SERVICES-sec\">SERVICES</a></li>\n");
      out.write("                     <li ><a href=\"http://localhost:8080/webminor1/logout\">LOGOUT</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("      <!--NAVBAR SECTION END-->\n");
      out.write("       <div class=\"home-sec\" id=\"home\" >\n");
      out.write("           <div class=\"overlay\">\n");
      out.write(" <div class=\"container\">\n");
      out.write("           <div class=\"row text-center \" >\n");
      out.write("           \n");
      out.write("               <div class=\"col-lg-12\">\n");
      out.write("               \n");
      out.write("                <div class=\"flexslider set-flexi\" id=\"main-section\" >\n");
      out.write("                    <ul class=\"slides\" data-scroll-reveal=\"enter from the bottom after 0.8s\" >\n");
      out.write("                        <!-- Slider 01 -->\n");
      out.write("                        <li>\n");
      out.write("                              <h3>Welcome to Doctor's hub</h3>\n");
      out.write("                           <h1>Hello Dr. ");
out.println(session.getAttribute("Name"));
      out.write("</h1>\n");
      out.write("                            <a  href=\"#BOOK\" class=\"btn btn-info btn-lg\" >\n");
      out.write("                                Make Appointment now\n");
      out.write("                            </a>\n");
      out.write("                             <a  href=\"#SERVICES-sec\" class=\"btn btn-success btn-lg\" >\n");
      out.write("                               See Our Best Services\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- End Slider 01 -->\n");
      out.write("                        \n");
      out.write("                        <!-- Slider 02 -->\n");
      out.write("                        <li>\n");
      out.write("                            <h3>Be Approchable</h3>\n");
      out.write("                           <h1>Get well approched</h1>\n");
      out.write("                             <a  href=\"#BOOK\" class=\"btn btn-primary btn-lg\" >\n");
      out.write("                               Make Appointment now\n");
      out.write("                            </a>\n");
      out.write("                             <a  href=\"#SERVICES-sec\" class=\"btn btn-danger btn-lg\" >\n");
      out.write("                                See Our Best Services\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- End Slider 02 -->\n");
      out.write("                        \n");
      out.write("                        <!-- Slider 03 -->\n");
      out.write("                        <li>\n");
      out.write("                            <h3>Delivering Quality Services</h3>\n");
      out.write("                           <h1>Provide a concurrent time table</h1>\n");
      out.write("                             <a  href=\"#BOOK\" class=\"btn btn-default btn-lg\" >\n");
      out.write("                                Make Appointment now\n");
      out.write("                            </a>\n");
      out.write("                             <a  href=\"#SERVICES-sec\" class=\"btn btn-info btn-lg\" >\n");
      out.write("                               See Our Best Services\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- End Slider 03 -->\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("               </div>\n");
      out.write("                </div>\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("       </div>\n");
      out.write("       <!--HOME SECTION END-->   \n");
      out.write("    <div  class=\"tag-line\" >\n");
      out.write("         <div class=\"container\">\n");
      out.write("           <div class=\"row  text-center\" >\n");
      out.write("           \n");
      out.write("               <div class=\"col-lg-12\">\n");
      out.write("               \n");
      out.write("        <h2 data-scroll-reveal=\"enter from the bottom after 1.0s\" ><i class=\"fa fa-circle-o-notch\"></i> One Doctor hub App <i class=\"fa fa-circle-o-notch\"></i> </h2>\n");
      out.write("                   </div>\n");
      out.write("               </div>\n");
      out.write("             </div>      \n");
      out.write("    </div>\n");
      out.write("    <!--HOME SECTION TAG LINE END-->   \n");
      out.write("         <div id=\"BOOK\" class=\"container set-pad\" >\n");
      out.write("             <div class=\"row text-center\">\n");
      out.write("                 <div class=\"col-lg-8 col-lg-offset-2  \">\n");
      out.write("                     <h1 data-scroll-reveal=\"enter from the bottom after 0.2s\"  class=\"header-line\">Make appoointment </h1>\n");
      out.write("                     <p data-scroll-reveal=\"enter from the bottom after 0.3s\" >\n");
      out.write("                           View you current time table and make an appointment instentelly in the fastest possible way.\n");
      out.write("                           This will help you to manage your future time in verry less time.\n");
      out.write("                     </p>\n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("             <!--/.HEADER LINE END-->\n");
      out.write("\n");
      out.write("\n");
      out.write("           <div class=\"row\" >\n");
      out.write("                 <div class=\"col-lg-4 \" data-scroll-reveal=\"enter from the bottom after 0.4s\">\n");
      out.write("                     <div class=\"about-div\">\n");
      out.write("                     <i class=\"icon-round-border\" ></i>\n");
      out.write("                   <h3>Appointments Table</h3>\n");
      out.write("                 <hr/>\n");
      out.write("                       <hr/>\n");
      out.write("                   <p>\n");
      out.write("                     Before you Make a new Appointment for a patient better checkout your appointment table (DateWise).\n");
      out.write("                   </p>\n");
      out.write("                       <a href=\"appointmenlist.jsp\" class=\"btn btn-info btn-set\"  >CHECK OUT </a>\n");
      out.write("                </div>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"col-lg-4\" data-scroll-reveal=\"enter from the bottom after 0.5s\">\n");
      out.write("                     <div class=\"about-div\">\n");
      out.write("                     <i class=\"fa fa-bolt fa-4x icon-round-border\" ></i>\n");
      out.write("                   <h3 >Make A Appointment.</h3>\n");
      out.write("                 <hr />\n");
      out.write("                       <hr />\n");
      out.write("                   <p>\n");
      out.write("                       Confirm a Patients Request and update you Appointment table instently.\n");
      out.write("                   </p>\n");
      out.write("                       <a href=\"appointmenlist.jsp\" class=\"btn btn-info btn-set\"  >BOOK NOW</a>\n");
      out.write("                </div>\n");
      out.write("                   </div>\n");
      out.write("                 <div class=\"col-lg-4\" data-scroll-reveal=\"enter from the bottom after 0.6s\">\n");
      out.write("                     <div class=\"about-div\">\n");
      out.write("                     <i class=\"fa fa-magic fa-4x icon-round-border\" ></i>\n");
      out.write("                   <h3 >Surgery</h3>\n");
      out.write("                 <hr />\n");
      out.write("                       <hr />\n");
      out.write("                   <p >\n");
      out.write("                      Book a whole day for surgery.\n");
      out.write("                   </p>\n");
      out.write("                       <a href=\"appointmenlist.jsp\" class=\"btn btn-info btn-set\"  >BOOK NOW</a>\n");
      out.write("                </div>\n");
      out.write("                   </div>\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("   <!-- FEATURES SECTION END-->\n");
      out.write("    <div id=\"DOCTORS-sec\" >\n");
      out.write("    <div class=\"container set-pad\">\n");
      out.write("             <div class=\"row text-center\">\n");
      out.write("                 <div class=\"col-lg-8 col-lg-offset-2 \">\n");
      out.write("                     <h1 data-scroll-reveal=\"enter from the bottom after 0.1s\" class=\"header-line\">OUR BEST DOCTOR </h1>\n");
      out.write("                     <p data-scroll-reveal=\"enter from the bottom after 0.3s\">\n");
      out.write("                    Doctor Who also use our app and are very successful and also satisfied with our services. \n");
      out.write("                         </p>\n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("             <!--/.HEADER LINE END-->\n");
      out.write("\n");
      out.write("           <div class=\"row\" >\n");
      out.write("                 <div class=\"col-lg-4\" data-scroll-reveal=\"enter from the bottom after 0.4s\">\n");
      out.write("                     <div class=\"faculty-div\">\n");
      out.write("                     <img src=\"assets/img/doc/1.jpg\"  class=\"img-rounded\" />\n");
      out.write("                   <h3 >HIMESHU SHUKLA </h3>\n");
      out.write("                 <hr/>\n");
      out.write("                         <h4>EYE <br />TREATMENt</h4>\n");
      out.write("                   <p >\n");
      out.write("                       Dr. himanshu shukla is best eye doctor in india and use our app for his appointment.\n");
      out.write("                   </p>\n");
      out.write("                </div>\n");
      out.write("                   </div>\n");
      out.write("                 <div class=\"col-lg-4 \" data-scroll-reveal=\"enter from the bottom after 0.5s\">\n");
      out.write("                     <div class=\"faculty-div\">\n");
      out.write("                     <img src=\"assets/img/doc/2.jpg\"  class=\"img-rounded\" />\n");
      out.write("                   <h3 >MITESH KUMAR</h3>\n");
      out.write("                 <hr />\n");
      out.write("                         <h4>Enginering <br /> Department</h4>\n");
      out.write("                   <p >\n");
      out.write("                       Lorem ipsum dolor sit amet, consectetuer adipiscing elit.\n");
      out.write("                        Aenean commodo .\n");
      out.write("                   </p>\n");
      out.write("                </div>\n");
      out.write("                   </div>\n");
      out.write("               <div class=\"col-lg-4\" data-scroll-reveal=\"enter from the bottom after 0.6s\">\n");
      out.write("                     <div class=\"faculty-div\">\n");
      out.write("                     <img src=\"assets/img/doc/3.jpg\" class=\"img-rounded\" />\n");
      out.write("                   <h3 >AMAN GUPTA</h3>\n");
      out.write("                 <hr />\n");
      out.write("                         <h4>Management <br /> Department</h4>\n");
      out.write("                   <p >\n");
      out.write("                       Lorem ipsum dolor sit amet, consectetuer adipiscing elit.\n");
      out.write("                        Aenean commodo . \n");
      out.write("                       \n");
      out.write("                   </p>\n");
      out.write("                </div>\n");
      out.write("                   </div>\n");
      out.write("                 \n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("    <!-- FACULTY SECTION END-->\n");
      out.write("      <div id=\"SERVICES-sec\" class=\"container set-pad\">\n");
      out.write("             <div class=\"row text-center\">\n");
      out.write("                 <div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("                     <h1 data-scroll-reveal=\"enter from the bottom after 0.1s\" class=\"header-line\">Our Services</h1>\n");
      out.write("                     <p data-scroll-reveal=\"enter from the bottom after 0.3s\">\n");
      out.write("                         We provide best services of time management of doctor as well as to patient to find the doctors for making the hospital process easy.\n");
      out.write("                     </p>\n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("             <!--/.HEADER LINE END-->\n");
      out.write("\n");
      out.write("\n");
      out.write("           <div class=\"row set-row-pad\" >\n");
      out.write("           <div class=\"col-lg-6\" data-scroll-reveal=\"enter from the bottom after 0.4s\" >\n");
      out.write("               <img src=\"assets/img/hosp.jpg\" class=\"img-thumbnail\" style=\"width: 600px\" />\n");
      out.write("           </div>\n");
      out.write("               <div class=\"col-lg-4\">\n");
      out.write("                   <div class=\"panel-group\" id=\"accordion\">\n");
      out.write("                        <div class=\"panel panel-default\" data-scroll-reveal=\"enter from the bottom after 0.5s\">\n");
      out.write("                            <div class=\"panel-heading\" >\n");
      out.write("                                <h4 class=\"panel-title\">\n");
      out.write("                                    <a data-toggle=\"collapse\"  href=\"#collapse1\" data-parent=\"#accordion\">\n");
      out.write("                                  <strong> 350+ </strong> DOCTORS \n");
      out.write("                                    </a>\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapse1\" class=\"panel-collapse collapse\" style=\"height: 0px;\">\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <p>There are doctors from india , pakistan bhuttan who use our app</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel panel-default\" data-scroll-reveal=\"enter from the bottom after 0.7s\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h4 class=\"panel-title\">\n");
      out.write("                                    <a data-toggle=\"collapse\"  href=\"#collapse2\" data-parent=\"#accordion\">\n");
      out.write("                                      <strong>   250+</strong> Patients Registerd \n");
      out.write("                                    </a>\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapse2\" class=\"panel-collapse collapse\" style=\"height: 0px;\">\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <p>\n");
      out.write("                                   There are many patient satisfied with our services which are permanently registered on our app.\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel panel-default\" data-scroll-reveal=\"enter from the bottom after 0.9s\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h4 class=\"panel-title\">\n");
      out.write("                                    <a data-toggle=\"collapse\"  href=\"#collapse3\" data-parent=\"#accordion\">\n");
      out.write("                                        <strong>   100+</strong> App Manager\n");
      out.write("                                    </a>\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapse3\" class=\"panel-collapse collapse\"  style=\"height: 0px;\">\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <p>\n");
      out.write("                                    There are 100's of techiqual and non techniquele team to manage the app currently.\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                   <div class=\"alert alert-info\" data-scroll-reveal=\"enter from the bottom after 1.1s\" >\n");
      out.write("                       <span style=\"font-size:40px;\">\n");
      out.write("                          <strong> 2500 + </strong> \n");
      out.write("                           <hr />\n");
      out.write("                           Appointment handling.\n");
      out.write("                       </span>\n");
      out.write("                   </div>\n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("      <!-- COURSES SECTION END-->\n");
      out.write(" <div class=\"container\">\n");
      out.write("             <div class=\"row set-row-pad\"  >\n");
      out.write("    <div class=\"col-lg-4  col-lg-offset-1\" data-scroll-reveal=\"enter from the bottom after 0.4s\">\n");
      out.write("\n");
      out.write("                    <h2 ><strong>Our Location </strong></h2>\n");
      out.write("        <hr />\n");
      out.write("                    <div >\n");
      out.write("                        <h4>B.30/3 Raj Harsh Colony</h4>\n");
      out.write("                        <h4>India.</h4>\n");
      out.write("                        <h4><strong>Call:</strong> 8871799482 </h4>\n");
      out.write("                        <h4><strong>Email: </strong>akshay2golu@gmail.com</h4>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"col-lg-4 col-lg-offset-1 \" data-scroll-reveal=\"enter from the bottom after 0.4s\">\n");
      out.write("\n");
      out.write("                    <h2 ><strong>Social Conectivity </strong></h2>\n");
      out.write("        <hr />\n");
      out.write("                    <div >\n");
      out.write("                        <a href=\"#\">  <img src=\"assets/img/Social/facebook.png\" alt=\"\" /> </a>\n");
      out.write("                     <a href=\"#\"> <img src=\"assets/img/Social/google-plus.png\" alt=\"\" /></a>\n");
      out.write("                     <a href=\"#\"> <img src=\"assets/img/Social/twitter.png\" alt=\"\" /></a>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("             </div>\n");
      out.write("                 </div>\n");
      out.write("    <div id=\"footer\">\n");
      out.write("          &copy 2016 Akshay Gupta | All Rights Reserved |  <a href=\"http://akshay2golu@gmail.com\" style=\"color: #fff\">Design by : Akshay Gupta</a>\n");
      out.write("    </div>\n");
      out.write("     <!-- FOOTER SECTION END-->\n");
      out.write("    <!--  Jquery Core Script -->\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("    <!--  Core Bootstrap Script -->\n");
      out.write("    <script src=\"assets/js/bootstrap.js\"></script>\n");
      out.write("    <!--  Flexslider Scripts --> \n");
      out.write("         <script src=\"assets/js/jquery.flexslider.js\"></script>\n");
      out.write("     <!--  Scrolling Reveal Script -->\n");
      out.write("    <script src=\"assets/js/scrollReveal.js\"></script>\n");
      out.write("    <!--  Scroll Scripts --> \n");
      out.write("    <script src=\"assets/js/jquery.easing.min.js\"></script>\n");
      out.write("    <!--  Custom Scripts --> \n");
      out.write("         <script src=\"assets/js/custom.js\"></script>\n");
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
