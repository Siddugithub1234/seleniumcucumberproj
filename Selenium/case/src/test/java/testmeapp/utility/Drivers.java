package testmeapp.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Drivers {
	public static WebDriver getDriver(String Browsername) {
		if(Browsername.equals("ie")) {
			String iepath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium\\jar\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", iepath);
			return new InternetExplorerDriver();
		}
		if(Browsername.equals("chrome")) {
			String chromepath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium\\jar\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromepath);
			return new ChromeDriver();
		}
		else
			return null;
	}
}
