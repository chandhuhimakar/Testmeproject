package mystepdefenitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Logindefinition {
	@Given("TestMe App is Lanched")
	public void testme_App_is_Lanched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Application lanched");
	}

	@When("user click enter credentials")
	public void user_click_enter_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("values");
	}

}
