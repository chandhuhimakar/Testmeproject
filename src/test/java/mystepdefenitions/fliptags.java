package mystepdefenitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class fliptags {
	@Given("application is running")
	public void application_is_running() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	    System.out.println("Flipkar page displayed");
	}

	@Then("user login")
	public void user_login() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		System.out.println("successful login");
	}

	@Given("User searching with code")
	public void user_searching_with_code() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("search for product");
	}

	@Then("user able to add to cart")
	public void user_able_to_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("add to cart");
	}

	@Given("user able to see the items count on cart")
	public void user_able_to_see_the_items_count_on_cart() {
	    // Write code here that turns the phrase above into concrete actions
	  // throw new cucumber.api.PendingException();
		System.out.println("cart page displayed ");
	}

	@Then("user decides to remove an item")
	public void user_decides_to_remove_an_item() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("item removed ");
	}

	@Given("user has active order")
	public void user_has_active_order() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		System.out.println("tracker");
	}

	@Then("User Verifies the statusof the order")
	public void user_Verifies_the_statusof_the_order() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("order messge");
	}

}
