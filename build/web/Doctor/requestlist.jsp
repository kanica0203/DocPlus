<%-- 
    Document   : requestlist
    Created on : 28 Feb, 2016, 11:40:31 PM
    Author     : akshay
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="assets/css/bootstrap.css" rel="stylesheet" />
    </head>
    <body>
        <link rel="stylesheet" href="assets/table_example-1/table.css" type="text/css"/>
            <%
                String timestamp="";
                ResultSet rs=null;
                try{
                    int time=Integer.parseInt(request.getParameter("time"));
                        String timestr = "";
                    if (time< 10) {
                        timestr += "0" + time+"0000";
                    } else {
                        timestr += time+"0000";
                    }
                timestamp=request.getParameter("date")+timestr;
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DPA", "root", "akshay");
                Statement st = con.createStatement();                
                rs=st.executeQuery("select patname,preblem,patid,pnone,ptime from Apprequest where docid="+session.getAttribute("docid")+" and ptime=\'"+timestamp+"\'");
              // out.println("select patname,preblem,patid,pnone,ptime from Apprequest where docid="+session.getAttribute("docid")+" and ptime=\'"+timestamp+"\'");
                }
                catch(Exception ex){} 
               // out.println(timestamp);
%>
<div class="nav navbar"> <h1 style="text-align: center">Requesets for This slot is</h1></div>
        <div class="CSS_Table_Example" style="width:1300px;height:50px;">
            <table >
                <tr> 
                    <td>
                        Patient Name
                    </td>
                    <td >
                        Problem
                    </td>
                    <td>
                        Confirm
                    </td>    
                </tr>
                <%while(rs.next()){%>
                <td><%= rs.getString(1)%></td>
                <td><%= rs.getString(2)%></td>
                <td><form method="post" action="http://localhost:8080/webminor1/confirmrequest"><div style="top: -1000px;position:absolute"><input type="text" value="<%= rs.getString(3)%>" name="patid"><input type="text" value="<%= rs.getString(2)%>" name="problem"><input type="text" value="<%= rs.getString(4)%>" name="phone"><input type="text" value="<%= rs.getString(5)%>" name="time"></div><input  type="submit" class="btn btn-success" value="Confirm"></form></td>
                <%}%>
            </table>
        </div>
    </body>
</html>
