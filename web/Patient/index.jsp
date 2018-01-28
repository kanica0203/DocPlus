<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Patient-<%= session.getAttribute("Name")%></title>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">

    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/creative.css" type="text/css">

    <style>
        .loc{
            position: relative;
            left:140px;
        }
        
    </style>
</head>

<body id="page-top">
    <%
         try{
        if((boolean)request.getSession().getAttribute("isvalid"))
            response.sendRedirect("../logf.html");
        }
        catch(Exception ex){
            response.sendRedirect("../logf.html");        
        }
        
    %>
    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
           <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
               <a class="navbar-brand page-scroll" href="#page-top">Hello Mr. <%out.println(request.getSession().getAttribute("Name"));%></a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="#quick">Quick Apoi</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#detail">Detailed Apoi</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#bestdoc">Best Doctors</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#contact">Contact us</a>
                    </li>
                     <li>
                         <a href="http://localhost:8080/webminor1/logout">Log Out</a>
                     </li>         
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <header>
        <div class="over">
        <div class="header-content">
            <div class="header-content-inner">
                <h1>Get Your Appointment for Best Doctors here</h1>
                <hr>
                <p>This web site is to help people in getting the doctors appointment quickly and find the best doctors at one spot</p>
                <a href="#quick" class="btn btn-primary btn-xl page-scroll">Get Appointment now</a>
            </div>
        </div>
        </div>
    </header>

    <section class="bg-primary" id="quick">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">Get a basic appointment here instently</h2>
                    <hr class="light">
                    <p class="text-faded">If you like getting things fast and need just a reguler checkup you can simply apply here and we will make an appointment with a doctor without any unimportant detail filling</p>
                    <a href="#" class="btn btn-default btn-xl">Get Appointment!</a>
                </div>
            </div>
        </div>
    </section>

    <section id="detail">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Get Special Appointment</h2>
                    <hr class="primary">
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row loc">
                <div class="col-lg-3 text-center">
                    <div class="service-box">
                        <a href="http://localhost:8080/webminor1/appointmentform/requestandresponse.jsp"><button class="btn btn-primary btn-lg">Checkout Responses</button></a>
                        <p class="text-muted">Checkout responses for your previous requests.</p>
                    </div>
                </div>
                <div class="col-lg-3 text-center">
                    <div class="service-box">
                        <a href="http://localhost:8080/webminor1/appointmentform/appointmentform.jsp"> <button class="btn btn-warning btn-lg">Get Appointment</button></a>
                        <p class="text-muted">Fill The form and get Appointment now.</p>
                    </div>
                </div>
                <div class="col-lg-3 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-heart wow bounceIn text-primary" data-wow-delay=".3s"></i>
                        <button class="btn btn-info btn-lg">All Doctors</button>
                        <p class="text-muted">View All Doctors and their Id to fill a Appointment request form.</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="no-padding" id="bestdoc">
        <div class="container-fluid">
            <div class="row no-gutter">
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <img src="img/portfolio/1.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Category
                                </div>
                                <div class="project-name">
                                    Project Name
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="clearfix"></div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <img src="img/portfolio/2.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Category
                                </div>
                                <div class="project-name">
                                    Project Name
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <img src="img/portfolio/3.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Category
                                </div>
                                <div class="project-name">
                                    Project Name
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <img src="img/portfolio/4.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Category
                                </div>
                                <div class="project-name">
                                    Project Name
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <img src="img/portfolio/5.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Category
                                </div>
                                <div class="project-name">
                                    Project Name
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="#" class="portfolio-box">
                        <img src="img/portfolio/6.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Category
                                </div>
                                <div class="project-name">
                                    Project Name
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
            </div>
        </div>
    </section>

    <aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
                <h2>Free Download at Start Bootstrap!</h2>
                <a href="#" class="btn btn-default btn-xl wow tada">Download Now!</a>
            </div>
        </div>
    </aside>

    <section id="contact">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">Let's Get In Touch!</h2>
                    <hr class="primary">
                    <p>Ready to start your next project with us? That's great! Give us a call or send us an email and we will get back to you as soon as possible!</p>
                </div>
                <div class="col-lg-4 col-lg-offset-2 text-center">
                    <i class="fa fa-phone fa-3x wow bounceIn"></i>
                    <p>8871799482</p>
                </div>
                <div class="col-lg-4 text-center">
                    <i class="fa fa-envelope-o fa-3x wow bounceIn" data-wow-delay=".1s"></i>
                    <p><a href="aksha.gupta.ak.ak@gmail.com">akshay.gupta.ak.ak@gmail.com</a></p>
                </div>
            </div>
        </div>
    </section>

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="js/jquery.easing.min.js"></script>
    <script src="js/jquery.fittext.js"></script>
  
    <!-- Custom Theme JavaScript -->
    <script src="js/creative.js"></script>

</body>

</html>
