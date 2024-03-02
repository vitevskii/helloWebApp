package com.vitevskii.gradle.helloWebApp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class SayHelloServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name = request.getParameter("name");
    if (name == null) {
      name = "Joe Doe";
    }
    request.setAttribute("name", name);
    request.getRequestDispatcher("hello.jsp").forward(request, response);
  }
}
