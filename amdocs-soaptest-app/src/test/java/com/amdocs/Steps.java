package com.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;

public class Steps {
  private Hello hello;
  private HelloService helloPort;
  private String actualResponse;
	@Given("the hello soap apiis up and running")
	   public void createHelloSOAPObject() {
		      helloPort=new HelloService();
		      hello=helloPort.getHello();
		  // System.out.println("steeeep1");
		   
		   
		   
	   }
	
	@When("I invoke the soap api at url {string}")
	public void createHelloSOAPObject(String wsdlurl)
	{
	   actualResponse=hello.sayHello();
	}
	
	
	@Then("I expect the response {string}")
	public void testResponse(String expectedResponse)
	{
		assertEquals(expectedResponse,actualResponse);
	}
}
