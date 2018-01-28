/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class log extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException, ServletException
             {
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password=request.getParameter("password");
        HttpSession ses=request.getSession();   
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DPA", "root", "akshay");
        Statement st = con.createStatement();
        ResultSet jdbc1 = st.executeQuery("select * from Doctor");
        PrintWriter pw=response.getWriter();
        while(jdbc1.next()){
            if(jdbc1.getString("uname").equals(username)&&jdbc1.getString("password").equals(password)){
                ses.setAttribute("Name", jdbc1.getString("Dname"));
                ses.setAttribute("docid",Integer.parseInt(jdbc1.getString("docid")));
                ses.setAttribute("dateint",0);
                ses.setAttribute("isvalid", true);
                response.sendRedirect("Doctor/index.jsp");
                break;
            }
          }
          ResultSet jdbc2 = st.executeQuery("select * from Patient");
        while(jdbc2.next()){
            if(jdbc2.getString("uname").equals(username)&&jdbc2.getString("password").equals(password)){
                ses.setAttribute("Name", jdbc2.getString("Pname"));
                ses.setAttribute("patid",Integer.parseInt(jdbc2.getString("patid")));
                ses.setAttribute("isvalid", false);
                response.sendRedirect("Patient");
                break;
            }
          }
       response.sendRedirect("index.jsp");
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
