package StepDefinition;

import Pages.practice2page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class practice2stepdefinition {
	practice2page pg=new practice2page();

	@Given("user is on homepage")
	public void user_is_on_homepage() throws InterruptedException {
	    pg.url();
	}

	@When("user clicks on courses")
	public void user_clicks_on_courses() throws InterruptedException {
	    pg.courseselection();
	}

	@When("user clicks on demo site")
	public void user_clicks_on_demo_site() throws InterruptedException{
		pg.navigate_to_demo_site();
	}

	@Then("user is navigated to other site and can click on the other site")
	public void user_is_navigated_to_other_site_and_can_click_on_the_other_site() throws InterruptedException{
		pg.windownavigation();
	}


}
