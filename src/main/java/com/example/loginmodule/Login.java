package com.example.loginmodule;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet(name ="login",value="/login")
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username="Divakar083";
        String name = "Divakar";
        String password="24263464";
        String u_name = req.getParameter("u_name");
        String pswrd = req.getParameter("pswrd");
        resp.setContentType("text/html");
        HttpSession s1 = req.getSession();
        if(u_name.equals(username)&&pswrd.equals(password)){
            //resp.getWriter().println("Login successfull");
            s1.setAttribute("name", name);
            s1.setAttribute("u_name", u_name);
            resp.sendRedirect("dashboard");
        }
        else{
            resp.getWriter().println("Login failed");
            resp.sendRedirect("login.html");
        }

    }
}
