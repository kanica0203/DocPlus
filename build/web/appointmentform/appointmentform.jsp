<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Appointment Request List</title>

	<!---------- CSS ------------>
        <link rel="stylesheet" type="text/css" href="./css/style.css"></link>

</head>

<body>
    <%     
        Statement st=null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DPA", "root", "akshay");
        st = con.createStatement();
        }
        catch(Exception ex){}
        ResultSet rs= st.executeQuery("select docid from Doctor");
  %>
    <!--BEGIN #signup-form -->
    <div id="request-form">
        
        <!--BEGIN #subscribe-inner -->
        <div id="signup-inner">
        
        	<div class="clearfix" id="header">
        
                <h1>Fill The Form To Make An Appointment Request</h1>
            </div>
			<p>Please complete the fields below correctly to request for and appointment and you will be shown the best possible appointment.</p>

            
            <form method="post" action="http://localhost:8080/webminor1/appointmentform/DoctorsOption.jsp">
            	
                <p>

                <label for="name">Patient Name *</label>
                <input id="name" type="text" name="pname" value="<%= session.getAttribute("Name")%>" required=""/>
                </p>
                
                <p>
                <label for="Problem">Problem</label>
                <input id="problem" type="text" name="problem" value="" />
                </p>
                
                <p>
                    <lable for="Doctor">Preffered Doctor Id</lable><br/>
                    <select name="docid">
                       <%while(rs.next()){%>
                       <option><%= rs.getString(1)%></option>
                        <%}%>
                    </select> 
                </p>
                
                <p>
                 <label for="phone">Phone</label>
                <input id="phone" type="text" name="phone" value="" />
                </p>
                
                <p>
                <label for="dateint">Time</label>
                <input id="ptime" type="text" name="dateint" value="" />
                </p>
                
                <p>
                <button id="submit" type="submit">Submit</button>
                </p>
                
            </form>
            
		<div id="required">
		<p>* Required Fields<br/></p>
		</div>
             </div>
        
        <!--END #signup-inner -->
        </div>
        
    <!--END #signup-form -->   
    </div>

</body>
</html>
