package sk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class csdd 
{
	WebDriver driver;
	@Given("url of testmeapp {string}")
	public void url_of_testmeapp(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String chromePath = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium\\jar\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
		
	}

	@When("user enters {string} as username")
	public void user_enters_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("user enters {string} as firstname")
	public void user_enters_as_firstname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("firstName")).sendKeys(string);
	}

	@When("user enters {string} as lastname")
	public void user_enters_as_lastname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("lastName")).sendKeys(string);
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("user enters {string} as confirmpassword")
	public void user_enters_as_confirmpassword(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass_confirmation")).sendKeys(string);
		
	}

	@When("user enters male as gender")
	public void user_enters_male_as_gender() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("gender")).click();
	}

	@When("user enters {string} as email")
	public void user_enters_as_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("emailAddress")).sendKeys(string);
	}

	@When("user enters {string} as mobilenumber")
	public void user_enters_as_mobilenumber(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("mobileNumber")).sendKeys(string);
	}

	@When("user enters {string} as DOB")
	public void user_enters_as_DOB(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("dob")).sendKeys(string);
	}

	@When("user enters {string} as address")
	public void user_enters_as_address(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("address")).sendKeys(string);
	}

	@When("user select {string}")
	public void user_select(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("securityQuestion")).sendKeys(string);
	}

	@When("user enters {string} as answer")
	public void user_enters_as_answer(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("answer")).sendKeys(string);
	}

	
	@Then("Quit Browser")
	public void quit_Browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//driver.close();
	}

}
