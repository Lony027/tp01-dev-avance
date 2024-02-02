package com.example.tp01;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        String name = request.getParameter("name");
        if (name != null && !name.isEmpty()) {
            out.println("<h1>" + message + "</h1>");
            out.println("<h1>" + name + "</h1>");
        } else {
            out.println("<form method='post' action='hello-servlet'>");
            out.println("<input type='text' name='name' />");
            out.println("<input type='submit' value='Submit' />");
            out.println("</form>");
        }
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }

    public void destroy() {
    }
}