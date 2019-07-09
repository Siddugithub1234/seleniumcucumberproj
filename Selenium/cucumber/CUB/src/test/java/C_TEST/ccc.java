package C_TEST;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ccc {
	Person saun=new Person();
	@Given("Saun is {int} meters away from Lucia")
	public void saun_is_meters_away_from_Lucia(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   saun.setDistance(int1);
	}

	@When("Saun shouts {string}")
	public void saun_shouts(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    saun.setMessage(string);
	}

	@Then("Lucia listens to the message")
	public void lucia_listens_to_the_message() {
	    // Write code here that turns the phrase above into concrete actions
	    String message=saun.getMessage();
	    Assert.assertEquals("Free Coffee", message);
	}
	@Then("Lucia cannot listen to the message")
	public void lucia_cannot_listen_to_the_message() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
