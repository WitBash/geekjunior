package com.boshko.geekjunior.hw6;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet {
    private String message;

    public void init() throws ServletException{
        message = "Hello World!";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        try {
            out.println("<h1>" + message + "</h1>");
        } finally {
            out.close();
        }

    }

    public void destroy() {
    }
}
