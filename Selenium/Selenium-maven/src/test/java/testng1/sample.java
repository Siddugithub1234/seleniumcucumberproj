package testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample {
	public int priority;
@BeforeClass
public void OpenPage() {
	System.out.println("Open browser");
}
@AfterClass
public void closeBrowser() {
	System.out.println("Close browser");
}
@BeforeMethod
public void release() {
	System.out.println("Inside initialize");
}
@AfterMethod
public void ReleaseResource() {
	System.out.println("Inside release resource");
}
@Test(priority=2)
public void test1() {
	System.out.println("Inside test1");
}
@Test(priority=1)
public void test2() {
	System.out.println("Inside test2");
}
@Test(priority=3)
public void test3() {
	System.out.println("Inside test3");
}
}

