package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class yahooStepDefination {

	@Given("^Open Chrome AND navigate to Yahoo$")
	public void open_Chrome_AND_navigate_to_Yahoo() throws Throwable {

	}

	@When("^Enter \"([^\"]*)\" Keyword$")
	public void enter_Keyword(String arg1) throws Throwable {
		System.out.println(arg1);
	}

	@Then("^Click on Yahoo Search button$")
	public void click_on_Yahoo_Search_button() throws Throwable {

	}

}
