<%-- 
    Document   : requestandresponse
    Created on : 1 Mar, 2016, 2:35:05 PM
    Author     : akshay
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../Doctor/assets/css/bootstrap.css" rel="stylesheet" />
    </head>
    <body>
        <link rel="stylesheet" href="../Doctor/assets//table_example-1/table.css" type="text/css"/>
       <%
           ResultSet rs=null;
           Statement st=null;     
           try{ 
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DPA", "root", "akshay");
                st = con.createStatement();                
                rs=st.executeQuery("select * from Apprequest,Doctor where Apprequest.docid=Doctor.docid and patid="+session.getAttribute("patid"));
        
                }
                catch(Exception ex){}
              
       %>
<div class="nav navbar"> <h1 style="text-align: center">See your Previous request and responses</h1></div>
        <div class="CSS_Table_Example" style="width:1300px;height:50px;">
            <h1 class="header">Pending Request</h1>
            <table >
                <tr> 
                    <td>
                        Doctor
                    </td>
                    <td >
                        Problem
                    </td>
                    <td>
                       Date
                    </td>    
                </tr>
                <%while(rs.next()){%>
                <tr>
                    <td><%= rs.getString("Dname")+"("+rs.getString("Doctor.docid")+")"%></td>
                    <td><%= rs.getString("preblem")%></td>
                    <td><%= rs.getString("ptime")%></td>
                </tr>
                <%}%>
            </table>
            <%
                rs=st.executeQuery("select * from Appointment1,Doctor where Appointment1.docid=Doctor.docid and patid="+session.getAttribute("patid"));
            %>
            <h1 class="header">Confirmed Request</h1>
             <table >
                <tr> 
                    <td>
                        Doctor
                    </td>
                    <td >
                        Problem
                    </td>
                    <td>
                       Date
                    </td>    
                </tr>
                <%while(rs.next()){%>
                <tr>
                    <td><%= rs.getString("Dname")+"("+rs.getString("Doctor.docid")+")"%></td>
                    <td><%= rs.getString("preblem")%></td>
                    <td><%= rs.getString("ptime")%></td>
                </tr>
                <%}%>
            </table>
        </div>

    </body>
</html>
