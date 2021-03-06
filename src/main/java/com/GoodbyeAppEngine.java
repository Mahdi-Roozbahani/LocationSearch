package com;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping("/goodbye")
public class GoodbyeAppEngine {

  @RequestMapping(value="/getItGoodbye",method = RequestMethod.GET)
  public String goodByeGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
	Gson gson = new Gson();
	String randString = "some random stuff";
	String test = gson.toJson(randString);
	String random = aRandomMethod();
    //response.setContentType("text/plain");
    //response.setCharacterEncoding("UTF-8");
    //response.getWriter().print("Goodbye App Engine - Class SE!\r\n");
    return "Goodbye App Engine - Class SE!\r\n";

  }
  
  @RequestMapping(value="/postItGoodBye",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public String doPost(HttpServletRequest request, HttpServletResponse response) {
	  String test = request.getParameter("getMeBody");
	  String byeMessage = "Bbye AppEngine";
	  return byeMessage;
  }  
  
  @RequestMapping(value="/byeTest",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public String doNewPost(@RequestBody String comingPost) {
	  String byeMessage = comingPost;
	  return byeMessage;
  }
  
  @RequestMapping(value="/byeMahdiTest",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public String mahdiPost(@RequestBody String comingPost) {
	  String byeMessage = comingPost;
	  return byeMessage;
  }
  
  String aRandomMethod() {
	  return "nothing";
  }
  
  
  
  
  
}
