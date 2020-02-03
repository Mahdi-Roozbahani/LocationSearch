package com;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


public class LocalSearchServletInitializer extends SpringBootServletInitializer{

	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	         return application.sources(LocalSearchApplication.class);
	    }
}
