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
        <link href="assets/css/bootstrap.css" rel="stylesheet" />
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
            .btnnxt{
                position:relative;
                top:1080px;
                left:1230px;
            }
            .btnprev{
                position:relative;
                top:990px;
                left:50px;
            }
            .btnmak{
                position:relative;
                top:1030px;
                left:650px;
            }
        </style>
        <link rel="stylesheet" href="assets/table_example-1/table.css" type="text/css"/>
        <%! static String make(String date){
        String ans="";
        for(int i=0;i<date.length();i++){
                if(! (date.charAt(i)=='-'))
                   ans+=(char)date.charAt(i);
            }
            return ans;
            }       
       %>
        
        <%
            ResultSet rs = null;
            String Dateshowing="";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DPA", "root", "akshay");
                Statement st = con.createStatement();
                rs=st.executeQuery("select ADDDATE(curdate(),"+session.getAttribute("dateint")+")");
                rs.next();
                Dateshowing=rs.getString(1);
                String query="select Patient.pname,Patient.phone,atime,problem from Doctor,Patient,Appointment1 where Doctor.docid=Appointment1.docid and Patient.patid=Appointment1.patid and month(curdate())=month(atime) and year(curdate())=year(atime) and day(ADDDATE(curdate(),"+(int)session.getAttribute("dateint")+"))=day(atime) and Doctor.docid=" + (int) session.getAttribute("docid");
                rs = st.executeQuery(query);
            } catch (Exception ex) {
            }
            String output[][] = new String[24][4];
            while (rs.next()) {
                for (int i = 0; i < 24; i++) {
                    String cmpstr = "";
                    if (i < 10) {
                        cmpstr += "0" + i;
                    } else {
                        cmpstr += i;
                    }
                    if (rs.getString("atime").substring(11, 13).equals(cmpstr)) {
                        output[i][0] = rs.getString("Patient.pname");
                        output[i][1] = rs.getString("Patient.phone");
                        output[i][2] = rs.getString("atime");
                        output[i][3] = rs.getString("problem");
                        break;
                    }
                }
                
            }
        %>
    </head>
    <body>
        <div class="nav navbar"> <h1 style="text-align: center">Take a look at your appointment on <%= Dateshowing%> Dr.<%= session.getAttribute("Name")%></h1></div>
        <div class="CSS_Table_Example" style="width:1300px;height:150px;">
           
            
            
            <table >
                <tr> 
                    <td>
                        Patient
                    </td>
                    <td >
                        Patients phone
                    </td>
                    <td>
                        Time
                    </td>
                    <td>
                        Problem
                    </td>
                    <td>
                        See request
                    </td>
                </tr>
                <%
                    for (int i = 0; i < output.length; i++) {
                %><tr><%
                           for (int j = 0; j < output[i].length; j++) {
                    if (output[i][j] == null) {
                         if(j==2){
                    %><td class="emptydate"><%out.println(i+":00"); %></td><%   
                        }else{
                    %><td class="empty"><% out.println("Empty slot");%></td><%                 
                      }
                    }
                    else{%> 
                    <td> <% out.println(output[i][j]);%> </td>
                    <%}}
                    if(output[i][0]==null){
                    %>
                    <td><form action="http://localhost:8080/webminor1/Doctor/requestlist.jsp"><div style="position: absolute;left: -1000px;"><input type="number" value="<%= i%>" name='time'><input type="text" value="<%= make(Dateshowing)%>" name="date"></div> <input type="submit" class="btn btn-warning" value="Watch"></form></td>
                    <%}else{
                        %>
                        <td><button class="btn btn-success" disabled="true">Filled</button></td>
                    <%
                    }%>
                </tr><%}%>
                
            </table>
        </div>
                <form action="http://localhost:8080/webminor1/datefix"> <input type="submit" class="btn btn-danger btn-lg btnnxt" value="NextDay"><input type="number" value="1" style="text-indent: -1000px;" name="day"></form>
                        <a href=""> <button class="btn btn-info btn-lg btnmak" >ADD NEW</button></a>
                        <form action="http://localhost:8080/webminor1/datefix"><input type="submit" class="btn btn-danger btn-lg btnprev" value='PrevDay'><input type="number" value="-1" style="text-indent: -1000px;" name="day"></form>
    </body>
</html>