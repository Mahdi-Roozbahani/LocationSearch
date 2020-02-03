package com;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping("/hello")
public class HelloAppEngine{

  @RequestMapping(value="/getItMan",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public String getMePlease(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    //response.setContentType("text/plain");
    //response.setCharacterEncoding("UTF-8");
    //response.getWriter().print("Hello App Engine - Class SE!\r\n");
    return "Hello App Engine - Class SE!\r\n";

  }
  
  @RequestMapping(value="/postItLocalSearch",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public String postMePlease(HttpServletRequest request, HttpServletResponse response) throws IOException {
	  Gson gson = new Gson();
	  String test = "Foooooo";
	  String studentName = request.getParameter("student1");
	  String outPut = "This is an example output from server";
	  return gson.toJson(outPut);
	  
	  
  }
  
}