package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	@Given("^Application is up and running$")
	public void application_is_up_and_running() throws Throwable {
	 System.out.println("Application is fully up and running");
	}

	@When("^User enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
		System.out.println("Enter username and password");
	}

	@Then("^Home page should be displayed$")
	public void home_page_should_be_displayed() throws Throwable {
	  System.out.println("Home page displayed successfully");
	}

//Feature2
@And("^User is logged in successfully$")
public void user_is_logged_in_successfully() throws Throwable {
	System.out.println("login successful");
}

@When("^User clicks on compose option$")
public void user_clicks_on_compose_option() throws Throwable {
	System.out.println("Clicked on compose button");
}

@And("^User enters (.*?) and (.*)$")
public void user_enters_techbodhi_gmail_com_and_Resume_for_job(String email, String subject) throws Throwable {
 System.out.println(email+""+subject);
}

@And("^User clicks on send button$")
public void user_clicks_on_send_button() throws Throwable {
	System.out.println("CLicked on send button");
}

@Then("^Compose window is closed$")
public void compose_window_is_closed() throws Throwable {
System.out.println("compose window is closed");
}

@And("^Message window pops up$")
public void message_window_pops_up() throws Throwable {
 System.out.println("Message window pops up");
}

}