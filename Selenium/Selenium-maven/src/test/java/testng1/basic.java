package testng1;


import org.testng.annotations.Test;

public class basic {
	
  @Test(dataProvider="dp", dataProviderClass=DaProvi.class)
  public void test1(Integer a, String b) {
	  System.out.println("Client testing: Data(" +a +","+"String is"+" -"+b+")");
  }
  @Test(dataProvider="dp", dataProviderClass=DaProvi.class)
  public void test2(Integer c, String d) {
	  System.out.println("Client testing: Data(" +c +","+"String is"+" -"+d+")");
  }
  
}
