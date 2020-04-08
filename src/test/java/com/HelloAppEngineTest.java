package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HelloAppEngineTest {
    private String base_url;

    // Setup environment - called before any test method
    @Before
    public void setUp() throws java.net.MalformedURLException {
    	base_url = "http://localhost:8080/";
    }
    
    // Release environment - called after any test method
    @After
    public void tearDown() {
    	base_url = null;
    }
    
    // Basic Test
    @Test
    public void testBasic() throws URISyntaxException {
    	// Hello App Engine
    	HelloAppEngine appEngineController = new HelloAppEngine();
        String result = appEngineController.getTest();
        assertEquals(result, "Hello App Engine - Class SE!");
    }
    
    // Test response
    @Test
    public void firstByeTest() throws URISyntaxException {
        // Goodbye App Engine
        RestTemplate restTemplate = new RestTemplate();
        
        URI uri = new URI(base_url + "goodbye/byeTest");
     
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");  
        String inputRequest = "Goodbye There";
        HttpEntity<Object> request = new HttpEntity<>(inputRequest, headers); // using http protocol 
        ResponseEntity<String> resultURI = restTemplate.exchange(uri, HttpMethod.POST,request, String.class);
         
        //Verify request succeed
        assertEquals(200, resultURI.getStatusCodeValue());
        assertTrue(resultURI.getBody().contains("Goodbye There"));
        assertEquals(resultURI.getBody(),"Goodbye There");
    }
    
    // Test response
    @Test
    public void secondByeTest() throws URISyntaxException {
        // Second page test
        RestTemplate restTemplate = new RestTemplate();
        
        URI uri = new URI(base_url+ "/goodbye/byeMahdiTest");
     
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");  
        String inputRequest = "Mahdi";
        HttpEntity<Object> request = new HttpEntity<>(inputRequest, headers);
        ResponseEntity<String> resultURI = restTemplate.exchange(uri, HttpMethod.POST,request,String.class);
         
        //Verify request succeed
        assertEquals(200, resultURI.getStatusCodeValue());
        assertTrue(resultURI.getBody().contains("Mahdi"));
    }    

}
