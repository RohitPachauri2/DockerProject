package StepDefinition;

import Pages.practice1page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class practice1stepdefinition {

	practice1page p=new practice1page();
	@Given("user is on the home page")
	public void user_is_on_the_home_page() throws InterruptedException {
	    p.url();
	}

	@When("user enters values {string} and {string} and {string} in different input boxes")
	public void user_enters_values_different_input_boxes(String string, String string2, String string3) throws InterruptedException {
	    
		p.inputs(string,string2,string3);
	}

	@Then("user is able to enter values in them successfully")
	public void user_is_able_to_enter_values_in_them_successfully() throws InterruptedException{
	    p.dynamicbutton();
	    p.alerts();
	    p.datepicker();
	}



}
