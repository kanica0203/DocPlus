<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title>One Doctor App</title>
    <!-- BOOTSTRAP CORE STYLE CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    
     <!-- FLEXSLIDER CSS -->
<link href="assets/css/flexslider.css" rel="stylesheet" />
    <!-- CUSTOM STYLE CSS -->
    <link href="assets/css/style.css" rel="stylesheet" />    
  <!-- Google	Fonts -->
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css' />
</head>
<body >
    <%
        try{
        if(!(boolean)session.getAttribute("isvalid"))
            response.sendRedirect("../logf.html");
        }
        catch(Exception ex){
            response.sendRedirect("../logf.html");        
        }
        
    %>  
  
 <div class="navbar navbar-inverse navbar-fixed-top " id="menu">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#"><img class="logo-custom" src="assets/img/logo180-50.png" alt=""  data-scroll-reveal="enter from the left after 0.5s"  /></a>
            </div>
            <div class="navbar-collapse collapse move-me"  data-scroll-reveal="enter from the right after 0.5s" >
                <ul class="nav navbar-nav navbar-right">
                    <li ><a href="#home">HOME</a></li>
                     <li><a href="#BOOK">BOOK</a></li>
                    <li><a href="#DOCTORS-sec">DOCTORS</a></li>
                     <li><a href="#SERVICES-sec">SERVICES</a></li>
                     <li ><a href="http://localhost:8080/webminor1/logout">LOGOUT</a></li>
                </ul>
            </div>
           
        </div>
    </div>
      <!--NAVBAR SECTION END-->
       <div class="home-sec" id="home" >
           <div class="overlay">
 <div class="container">
           <div class="row text-center " >
           
               <div class="col-lg-12">
               
                <div class="flexslider set-flexi" id="main-section" >
                    <ul class="slides" data-scroll-reveal="enter from the bottom after 0.8s" >
                        <!-- Slider 01 -->
                        <li>
                              <h3>Welcome to Doctor's hub</h3>
                           <h1>Hello Dr. <%out.println(session.getAttribute("Name"));%></h1>
                            <a  href="#BOOK" class="btn btn-info btn-lg" >
                                Make Appointment now
                            </a>
                             <a  href="#SERVICES-sec" class="btn btn-success btn-lg" >
                               See Our Best Services
                            </a>
                        </li>
                        <!-- End Slider 01 -->
                        
                        <!-- Slider 02 -->
                        <li>
                            <h3>Be Approchable</h3>
                           <h1>Get well approched</h1>
                             <a  href="#BOOK" class="btn btn-primary btn-lg" >
                               Make Appointment now
                            </a>
                             <a  href="#SERVICES-sec" class="btn btn-danger btn-lg" >
                                See Our Best Services
                            </a>
                        </li>
                        <!-- End Slider 02 -->
                        
                        <!-- Slider 03 -->
                        <li>
                            <h3>Delivering Quality Services</h3>
                           <h1>Provide a concurrent time table</h1>
                             <a  href="#BOOK" class="btn btn-default btn-lg" >
                                Make Appointment now
                            </a>
                             <a  href="#SERVICES-sec" class="btn btn-info btn-lg" >
                               See Our Best Services
                            </a>
                        </li>
                        <!-- End Slider 03 -->
                    </ul>
                </div>
            </div>
                
               </div>
                </div>
           </div>
           
       </div>
       <!--HOME SECTION END-->   
    <div  class="tag-line" >
         <div class="container">
           <div class="row  text-center" >
           
               <div class="col-lg-12">
               
        <h2 data-scroll-reveal="enter from the bottom after 1.0s" ><i class="fa fa-circle-o-notch"></i> One Doctor hub App <i class="fa fa-circle-o-notch"></i> </h2>
                   </div>
               </div>
             </div>      
    </div>
    <!--HOME SECTION TAG LINE END-->   
         <div id="BOOK" class="container set-pad" >
             <div class="row text-center">
                 <div class="col-lg-8 col-lg-offset-2  ">
                     <h1 data-scroll-reveal="enter from the bottom after 0.2s"  class="header-line">Make appoointment </h1>
                     <p data-scroll-reveal="enter from the bottom after 0.3s" >
                           View you current time table and make an appointment instentelly in the fastest possible way.
                           This will help you to manage your future time in verry less time.
                     </p>
                 </div>
             </div>
             <!--/.HEADER LINE END-->


           <div class="row" >
                 <div class="col-lg-4 " data-scroll-reveal="enter from the bottom after 0.4s">
                     <div class="about-div">
                     <i class="icon-round-border" ></i>
                   <h3>Appointments Table</h3>
                 <hr/>
                       <hr/>
                   <p>
                     Before you Make a new Appointment for a patient better checkout your appointment table (DateWise).
                   </p>
                       <a href="appointmenlist.jsp" class="btn btn-info btn-set"  >CHECK OUT </a>
                </div>
                   </div>
                   <div class="col-lg-4" data-scroll-reveal="enter from the bottom after 0.5s">
                     <div class="about-div">
                     <i class="fa fa-bolt fa-4x icon-round-border" ></i>
                   <h3 >Make A Appointment.</h3>
                 <hr />
                       <hr />
                   <p>
                       Confirm a Patients Request and update you Appointment table instently.
                   </p>
                       <a href="appointmenlist.jsp" class="btn btn-info btn-set"  >BOOK NOW</a>
                </div>
                   </div>
                 <div class="col-lg-4" data-scroll-reveal="enter from the bottom after 0.6s">
                     <div class="about-div">
                     <i class="fa fa-magic fa-4x icon-round-border" ></i>
                   <h3 >Surgery</h3>
                 <hr />
                       <hr />
                   <p >
                      Book a whole day for surgery.
                   </p>
                       <a href="appointmenlist.jsp" class="btn btn-info btn-set"  >BOOK NOW</a>
                </div>
                   </div>
                 
                 
               </div>
             </div>
   <!-- FEATURES SECTION END-->
    <div id="DOCTORS-sec" >
    <div class="container set-pad">
             <div class="row text-center">
                 <div class="col-lg-8 col-lg-offset-2 ">
                     <h1 data-scroll-reveal="enter from the bottom after 0.1s" class="header-line">OUR BEST DOCTOR </h1>
                     <p data-scroll-reveal="enter from the bottom after 0.3s">
                    Doctor Who also use our app and are very successful and also satisfied with our services. 
                         </p>
                 </div>
             </div>
             <!--/.HEADER LINE END-->

           <div class="row" >
                 <div class="col-lg-4" data-scroll-reveal="enter from the bottom after 0.4s">
                     <div class="faculty-div">
                     <img src="assets/img/doc/1.jpg"  class="img-rounded" />
                   <h3 >HIMESHU SHUKLA </h3>
                 <hr/>
                         <h4>EYE <br />TREATMENt</h4>
                   <p >
                       Dr. himanshu shukla is best eye doctor in india and use our app for his appointment.
                   </p>
                </div>
                   </div>
                 <div class="col-lg-4 " data-scroll-reveal="enter from the bottom after 0.5s">
                     <div class="faculty-div">
                     <img src="assets/img/doc/2.jpg"  class="img-rounded" />
                   <h3 >MITESH KUMAR</h3>
                 <hr />
                         <h4>Enginering <br /> Department</h4>
                   <p >
                       Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
                        Aenean commodo .
                   </p>
                </div>
                   </div>
               <div class="col-lg-4" data-scroll-reveal="enter from the bottom after 0.6s">
                     <div class="faculty-div">
                     <img src="assets/img/doc/3.jpg" class="img-rounded" />
                   <h3 >AMAN GUPTA</h3>
                 <hr />
                         <h4>Management <br /> Department</h4>
                   <p >
                       Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
                        Aenean commodo . 
                       
                   </p>
                </div>
                   </div>
                 
               </div>
             </div>
        </div>
    <!-- FACULTY SECTION END-->
      <div id="SERVICES-sec" class="container set-pad">
             <div class="row text-center">
                 <div class="col-lg-8 col-lg-offset-2">
                     <h1 data-scroll-reveal="enter from the bottom after 0.1s" class="header-line">Our Services</h1>
                     <p data-scroll-reveal="enter from the bottom after 0.3s">
                         We provide best services of time management of doctor as well as to patient to find the doctors for making the hospital process easy.
                     </p>
                 </div>
             </div>
             <!--/.HEADER LINE END-->


           <div class="row set-row-pad" >
           <div class="col-lg-6" data-scroll-reveal="enter from the bottom after 0.4s" >
               <img src="assets/img/hosp.jpg" class="img-thumbnail" style="width: 600px" />
           </div>
               <div class="col-lg-4">
                   <div class="panel-group" id="accordion">
                        <div class="panel panel-default" data-scroll-reveal="enter from the bottom after 0.5s">
                            <div class="panel-heading" >
                                <h4 class="panel-title">
                                    <a data-toggle="collapse"  href="#collapse1" data-parent="#accordion">
                                  <strong> 350+ </strong> DOCTORS 
                                    </a>
                                </h4>
                            </div>
                            <div id="collapse1" class="panel-collapse collapse" style="height: 0px;">
                                <div class="panel-body">
                                    <p>There are doctors from india , pakistan bhuttan who use our app</p>
                                </div>
                            </div>
                        </div>
                        <div class="panel panel-default" data-scroll-reveal="enter from the bottom after 0.7s">
                            <div class="panel-heading">
                                <h4 class="panel-title">
                                    <a data-toggle="collapse"  href="#collapse2" data-parent="#accordion">
                                      <strong>   250+</strong> Patients Registerd 
                                    </a>
                                </h4>
                            </div>
                            <div id="collapse2" class="panel-collapse collapse" style="height: 0px;">
                                <div class="panel-body">
                                    <p>
                                   There are many patient satisfied with our services which are permanently registered on our app.
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="panel panel-default" data-scroll-reveal="enter from the bottom after 0.9s">
                            <div class="panel-heading">
                                <h4 class="panel-title">
                                    <a data-toggle="collapse"  href="#collapse3" data-parent="#accordion">
                                        <strong>   100+</strong> App Manager
                                    </a>
                                </h4>
                            </div>
                            <div id="collapse3" class="panel-collapse collapse"  style="height: 0px;">
                                <div class="panel-body">
                                    <p>
                                    There are 100's of techiqual and non techniquele team to manage the app currently.
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                   <div class="alert alert-info" data-scroll-reveal="enter from the bottom after 1.1s" >
                       <span style="font-size:40px;">
                          <strong> 2500 + </strong> 
                           <hr />
                           Appointment handling.
                       </span>
                   </div>
               </div>
             </div>
      <!-- COURSES SECTION END-->
 <div class="container">
             <div class="row set-row-pad"  >
    <div class="col-lg-4  col-lg-offset-1" data-scroll-reveal="enter from the bottom after 0.4s">

                    <h2 ><strong>Our Location </strong></h2>
        <hr />
                    <div >
                        <h4>B.30/3 Raj Harsh Colony</h4>
                        <h4>India.</h4>
                        <h4><strong>Call:</strong> 8871799482 </h4>
                        <h4><strong>Email: </strong>akshay2golu@gmail.com</h4>
                    </div>


                </div>
                 <div class="col-lg-4 col-lg-offset-1 " data-scroll-reveal="enter from the bottom after 0.4s">

                    <h2 ><strong>Social Conectivity </strong></h2>
        <hr />
                    <div >
                        <a href="#">  <img src="assets/img/Social/facebook.png" alt="" /> </a>
                     <a href="#"> <img src="assets/img/Social/google-plus.png" alt="" /></a>
                     <a href="#"> <img src="assets/img/Social/twitter.png" alt="" /></a>
                    </div>
                    </div>
             </div>
                 </div>
    <div id="footer">
          &copy 2016 Akshay Gupta | All Rights Reserved |  <a href="http://akshay2golu@gmail.com" style="color: #fff">Design by : Akshay Gupta</a>
    </div>
     <!-- FOOTER SECTION END-->
    <!--  Jquery Core Script -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!--  Core Bootstrap Script -->
    <script src="assets/js/bootstrap.js"></script>
    <!--  Flexslider Scripts --> 
         <script src="assets/js/jquery.flexslider.js"></script>
     <!--  Scrolling Reveal Script -->
    <script src="assets/js/scrollReveal.js"></script>
    <!--  Scroll Scripts --> 
    <script src="assets/js/jquery.easing.min.js"></script>
    <!--  Custom Scripts --> 
         <script src="assets/js/custom.js"></script>
</body>
</html>
