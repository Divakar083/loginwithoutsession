package com.example.loginmodule;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "dashboard", value = "/dashboard")
public class Dashboard extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);


        String name = (String) session.getAttribute("name");
        String u_name = (String) session.getAttribute("u_name");

        resp.setContentType("text/html");
        resp.getWriter().println("Your name is " + name);
        resp.getWriter().println("<br>");
        resp.getWriter().println("Your username is " + u_name);
    }
}
