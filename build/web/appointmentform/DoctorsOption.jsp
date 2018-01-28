<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.io.*"  %>
<%@ page import="java.net.*"  %>
<%@ page import="java.util.*"  %>

<%-- 
    Document   : appointmenlist
    Created on : 20 Feb, 2016, 5:34:09 PM
    Author     : akshay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Appointment</title>
        <link href="../Doctor/assets/css/bootstrap.css" rel="stylesheet" />
        <style>
            .nav{
                background-color: turquoise;
            }
            body{
                background-image: url("../images/images.jpg");
                background-repeat: no-repeat;
                background-size: cover;
                background-attachment: fixed;
            }
            .CSS_Table_Example{
                position: relative;
                left:35px;
            }
           
            .btnmak{
                position:relative;
                top:1100px;
                left:550px;
            }
        </style>
        <link rel="stylesheet" href="../Doctor/assets/table_example-1/table.css" type="text/css"/>
       <%! static String make(String date){
        String ans="";
        for(int i=0;i<date.length();i++){
                if(! (date.charAt(i)=='-'))
                   ans+=(char)date.charAt(i);
            }
            return ans+"0000";
            }
          static String make2(int i){
               String cmpstr = "";
                    if (i < 10) {
                        cmpstr += "0" + i;
                    } else {
                        cmpstr += i;
                    }
                    return cmpstr;
            }
       %>
        <%
           session.setAttribute("docid", request.getParameter("docid"));
            session.setAttribute("Name", request.getParameter("pname"));
            session.setAttribute("problem", request.getParameter("problem"));
            session.setAttribute("phone", request.getParameter("phone"));
            
           ResultSet rs = null;
           String Dateshowing="";
           
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DPA", "root", "akshay");
                Statement st = con.createStatement();
                rs=st.executeQuery("select ADDDATE(curdate(),"+request.getParameter("dateint")+")");
                rs.next();
                Dateshowing=rs.getString(1);
                String query="select atime from Doctor,Appointment1 where Doctor.docid=Appointment1.docid and month(curdate())=month(atime) and year(curdate())=year(atime) and day(ADDDATE(curdate(),"+request.getParameter("dateint")+"))=day(atime) and Doctor.docid=" +  request.getParameter("docid");
                rs = st.executeQuery(query);
            } catch (Exception ex) {
            }
            String output[] = new String[24];
            String cmpstr="";
            while (rs.next()) {
                for (int i = 0; i < 24; i++) {
                    cmpstr = "";
                    if (i < 10) {
                        cmpstr += "0" + i;
                    } else {
                        cmpstr += i;
                    }
                    if (rs.getString("atime").substring(11, 13).equals(cmpstr)) {
                        output[i] = rs.getString("atime");
                        break;
                    }
                }
            }
        %>
    </head>
    <body>
        <div class="nav navbar"> <h1 style="text-align: center">Take a look at your appointment on <%= Dateshowing%> Dr.<%= request.getParameter("docid")%></h1></div>
        <div class="CSS_Table_Example" style="width:1300px;height:150px;">
            <table >
                <tr> 
                    <td>
                        Time
                    </td>
                    <td>
                        Request
                    </td>
                </tr>
                <%
                    for (int i = 0; i < output.length; i++) {
                %><tr><%
                        if(output[i]==null)
                        { 
                           %><td><% out.println(i+":00"); %></td><%
                               %><form action="http://localhost:8080/webminor1/Makerequest"><td><div style="position: absolute;left: -1000px;"><input type="number" value="<%=make(Dateshowing+""+make2(i))%>" name='timesta'></div> <input type="submit" class="btn btn-success" value="Request Slot"></td></form><%    
                        }
                        else{
                           %><td><%= output[i] %></td><%
                               %><td><button class="btn btn-block" disabled="true"> Filled </button></td><%
                        }
                                    
                    %></tr><%}%>
            </table>
        </div>
            <a href="appointmentform.jsp"> <button class="btn btn-info btn-lg btnmak" >See another Doctor</button></a>
    </body>
</html>