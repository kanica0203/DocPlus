<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Dance Login</title>
    
        <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="Patient/css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <style>
body{
	margin: 0;
	padding: 0;
	background: #fff;
	color: #fff;
	font-family: Arial;
	font-size: 12px;
}

.body{
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
    background-size: cover;
	z-index: 0;
}

.grad{
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
	background: url(images/pic1.jpg);
    background-size: cover;
    z-index: 1;
	opacity: 1.0;
}

.header{
	position: absolute;
	top: calc(50% - 55px);
	left: 350px;
	z-index: 2;
}

.header div{
	float: left;
	color: #aaa;
	font-family: 'Exo', sans-serif;
	font-size: 35px;
	font-weight: 200;
}

.header div span{
	color: #5379fa !important;
}

.login{
	position: absolute;
	top: calc(50% - 75px);
	left: calc(50% - 50px);
	height: 150px;
	width: 350px;
	padding: 10px;
	z-index: 2;
}

.login input[type=text]{
	width: 250px;
	height: 30px;
	background: transparent;
	border: 1px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
}

.login input[type=password]{
	width: 250px;
	height: 30px;
	background: transparent;
	border: 1px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
	margin-top: 10px;
}


.login input[type=text]:focus{
	outline: none;
	border: 1px solid rgba(255,255,255,0.9);
}

.login input[type=password]:focus{
	outline: none;
	border: 1px solid rgba(255,255,255,0.9);
}
.loi{
    color: #080808;
    margin-top:10px; 
    width: 250px;
}
.mi{
    color: #080808;
    width: 250px;
}

.rn{
    position: absolute;
    z-index: 99;
    left: 637px;
    top:370px;
}
.msg{
    color: red;
    position: absolute;
   top: 60px;
}
    </style>

    
        <!--<script src="js/prefixfree.min.js"></script>-->
      
  </head>

  <body>
      <%
//          try{
//          if((boolean)request.getSession().getAttribute("isvalid"))
//              response.sendRedirect("Doctor");
//          else
//              response.sendRedirect("Patient");
//         }catch(Exception ex){}
      %>
    <div class="body"></div>
		<div class="grad"></div>
                <div class="container">
		<div class="header">
			<div>Doc Pat <span>App</span></div>
		</div>
		<br>
		<form class="login" method="post" action="http://localhost:8080/webminor1/log">
                    <input type="text" placeholder="username" name="username" id="email" required=""><br>
            <input type="password" placeholder="password" name="password" required=""><br>
            <input type="submit" value="Login" class="btn btn-warning btn-lg loi"><br><br>
               </form>  
           
                <a href="Register.html" class="rn"><button class="btn btn-danger btn-lg mi">Register now </button> </a>
                </div>
                <script src="Patient/js/bootstrap.js"></script>
            <script src="Patient/js/bootstrap.min.js"></script>
  </body>
</html>
