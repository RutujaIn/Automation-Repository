package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {  //run as cucumber

	@Given("^Application is up & running$") //same pattern defined in Feature & will execute method when feature is run
	public void application_is_up_running() throws Throwable {
	    
		System.out.println("Application is up & running");
	}

	@When("^I enter valid credentials$")//cucumber supports BDD
	public void i_enter_valid_credentials() throws Throwable {
		
		System.out.println("I enter valid credentials");

	}
	    

	@Then("^I should be logged in successfully$")
	public void i_should_be_logged_in_successfully() throws Throwable {
		
		System.out.println("I should be logged in successfully");
	}
	
	@When("^I enter (.*?) & (.*?) on login page$")
	public void i_enter_rutujainamdar_test_acv_on_login_page(String username,String password ) throws Throwable {
		System.out.println("Enter username="+username);
		System.out.println("Enter password="+password);
	   
	}


}
