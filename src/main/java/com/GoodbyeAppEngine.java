package com;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
@WebServlet(
	    name = "GoodbyeAppEngine",
	    urlPatterns = {"/goodbye"}
	)

public class GoodbyeAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
	Gson gson = new Gson();
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    response.getWriter().print("Goodbye App Engine - Class SE!\r\n");

  }
  
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) {
	  
  }
  
  
  
}
