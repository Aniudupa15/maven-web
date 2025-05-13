package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello from My Web App!</h1>");
        out.println("<p>This is running on Azure</p>");
        out.println("<a href='/my-web-app/'>Back to Home</a>");
        out.println("</body></html>");
    }
}