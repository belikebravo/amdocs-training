 package com.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps{
	      
	
	
	 private Hello hello;
	 private String actualResponse;
	
	 @Given("there is a hello object")

 
public void there_is_a_hello_object() {
    // Write code herSe that turns the phrase above into concrete actions
	
	  hello = new Hello();
	  
	  
        // throw new cucumber.api.PendingException();
         }
    //
         @When("I invoke the sayHello method")
         public void i_invoke_the_sayHello_method() {
    //         // Write code here that turns the phrase above into concrete actions
             actualResponse=hello.sayHello();  
        	 
        	// throw new cucumber.api.PendingException();
                 }
    //
                 @Then("I expect {string} as the response")
                 public void i_expect_as_the_response(String expectedResponse) {
    //                 // Write code here that turns the phrase above into concrete actions
                        assertEquals(expectedResponse,actualResponse);
                	// throw new cucumber.api.PendingException();
                         }
    //
    //
}