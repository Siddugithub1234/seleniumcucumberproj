package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tamil {
  String var="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium\\jar\\chromedriver_win32\\chromedriver.exe";
  String url="http://www.demoaut.com";
  WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", var);
		driver=new ChromeDriver();
		driver.get(url);
		System.out.println("Welcome to testng");
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		System.out.println("After testng");
	}
	@BeforeMethod
	public void home() {
		driver.findElement(By.linkText("Home")).click();
		System.out.println("Inside before method");
	}
	@AfterMethod
	public void exe() {
		System.out.println("inside after method");
	}
  @Test
  public void f() {
	 String exptitle="Welcome: Mercury Tours";
	 String actTitle=driver.getTitle();
	 Assert.assertEquals(exptitle, actTitle);
	 System.out.println("Inside test");
  }
  public void sign() {
	  driver.findElement(By.linkText("SIGN-ON")).click();
  }
  @Test
  public void reg() throws InterruptedException {
	  driver.findElement(By.linkText("REGISTER")).click();
	  driver.findElement(By.name("firstName")).sendKeys("s");
	  driver.findElement(By.name("lastName")).sendKeys("d");
	  driver.findElement(By.name("email")).sendKeys("sam@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("bdc123");
	  driver.findElement(By.name("confirmPassword")).sendKeys("bdc123");
	  driver.findElement(By.name("register")).click();
	  Thread.sleep(3000);
  } 
 // public void support1() {
	//  driver.findElement(By.linkText("SUPPORT")).click();
  //}
  //public void contact() {
	//  driver.findElement(By.linkText("CONTACT")).click();
  //}
}