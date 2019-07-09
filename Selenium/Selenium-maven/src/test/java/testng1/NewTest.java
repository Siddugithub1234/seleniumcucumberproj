package testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  public int count=0;
  @BeforeClass
  public void HomePage() {
	  System.out.println("Wel to testng");
	  System.out.println("Opening browser--");
  }
  
  @AfterClass
  public void closeBrowser() {
	  System.out.println("Closing Browser");
  }
  @Test
  public void SignOn() {
	  System.out.println("Validating signin ");
  }
  @Test
  public void Reg() {
	  System.out.println("Validating register ");
  }
  @Test
  public void Support() {
	  System.out.println("Validating support ");
  }
  @Test
  public void Contact() {
	  System.out.println("Validating contact");
  }
  @BeforeMethod
  public void test1() {
	  System.out.println("method"+""+count++);
  }
  @AfterMethod
  public void tes() {
	  System.out.println("Support");
  }
}
