package C_TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;

public class Log {
	WebDriver driver;
	@Given("url of demowebshop {string}")
	public void url_of_demowebshop(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    String chpath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium\\jar\\chromedriver_win32\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", chpath);
	     driver = new ChromeDriver();
	    driver.get(string);
	}

	@When("user enters {string} as username")
	public void user_enters_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("Email")).sendKeys(string);
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Password")).sendKeys(string);
	}
	
	
	@Then("user is in webshop as {word}")
	public void user_is_in_webshop_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		Thread.sleep(3000);
	}
	//@Then("user is in webshop")
	//public void user_is_in_webshop() {
	    // Write code here that turns the phrase above into concrete actions
	   //driver.findElement(By.cssSelector("input[value='Log in']")).click();
	 //  Assert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());
	//}
	@Given("Admin of the test me app enters")
	public void admin_of_the_test_me_app_enters(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<List<String>> list=dataTable.asLists();
	    for(List<String> strings:list) {
	    	for(String s:strings) {
	    		System.out.print(s+"\t");
	    	}
	    	System.out.println("");
	    }
	}
}
