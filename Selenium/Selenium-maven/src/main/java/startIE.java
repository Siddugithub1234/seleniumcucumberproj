import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class startIE {
public static void main(String args[]) {
	System.out.println("maven");
	String chromepath1="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium\\jar\\chromedriver_win32\\chromedriver.exe";
	String url1="http://demoaut.com";
	System.setProperty("webdriver.chrome.driver", chromepath1);
	WebDriver tes=new InternetExplorerDriver();
	tes.get(url1);
}
}
