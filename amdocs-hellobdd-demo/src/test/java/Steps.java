
@Given("there is a hello object")


public class Steps{
	      
	 private Hello hello;
	 private String actualResponse,expectedResponse;
	
	
public void there_is_a_hello_object() {
    // Write code here that turns the phrase above into concrete actions
	
	  hello =new Hello();
	  
	  
         throw new cucumber.api.PendingException();
         }
    //
         @When("I invoke the sayHello method")
         public void i_invoke_the_sayHello_method() {
    //         // Write code here that turns the phrase above into concrete actions
             actualResponse=hello.sayhello();  
        	 
        	 throw new cucumber.api.PendingException();
                 }
    //
                 @Then("I expect {string} as the response")
                 public void i_expect_as_the_response(String string) {
    //                 // Write code here that turns the phrase above into concrete actions
                         throw new cucumber.api.PendingException();
                         }
    //
    //
}