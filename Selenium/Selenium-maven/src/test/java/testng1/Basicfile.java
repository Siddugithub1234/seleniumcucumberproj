package testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basicfile {
  @Test
  public void f() {
	  System.out.println("Suite file");
	  String ch="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium\\jar\\chromedriver_win32\\chromedriver.exe";
		String url="http://demoaut.com";
		System.setProperty("webdriver.chrome.driver", ch);
		WebDriver xpathtest = new ChromeDriver();
		xpathtest.get(url);
		String uname="//td[2]/input";
		String pwd="//tr[3]/td[2]/input";
		String submit="//div/input";
		String home="//a[contains(@href,'mercurytours.php']";
		xpathtest.findElement(By.xpath(uname)).sendKeys("tamil");
		xpathtest.findElement(By.xpath(pwd)).sendKeys("123");
		xpathtest.findElement(By.xpath(submit)).click();
		xpathtest.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		xpathtest.findElement(By.xpath(home)).click();
  }
}
