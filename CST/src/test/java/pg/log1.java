package pg;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class log1 {
	WebDriver driver;
	@Before
	public void init() {
		System.out.println("In before scenario");
		String path="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium\\jar\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver,LoginPage.class);
	}
	@After
	public void destroy() {
		 System.out.println("In after scenario");
		 //driver.close();
	}
	@Given("url of demowebshop {string}")
	public void url_of_demowebshop(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(string);
	    Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	}

	@When("user en {string} as username")
	public void user_en_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("Email")).sendKeys(string);
	}

	@When("user en {string} as password")
	public void user_en_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Password")).sendKeys(string);
	}

	@Then("user in webshop")
	public void user_in_webshop() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}
}
