5package TestNGParameters;

import org.testng.annotations.Test;

public class NewTest {
	
	
  @BeforeSuite
  public void @BeforeSuite() {
	  System.out.println("Before Suite");
  }
  @BeforeTest
  public void @BeforeTest() {
	  System.out.println("Before Test");
  }
  @BeforeClass
  public void @BeforeClass() {
	  System.out.println("Before Class");
  }
  @BeforeMethod
  public void @BeforeMethod() {
	  System.out.println("Before Method");
  }
  @Test
  public void @Test() {
	  System.out.println("Test Method");
  }
  @AfterMethod
  public void @AfterMethod() {
	  System.out.println("After method");
  }
  @AfterClass
  public void @AfterClass() {
	  System.out.println("After Class");
  }
  @AfterTest
  public void @AfterTest() {
	  System.out.println("After Test");
  }
  @AfterSuite
  public void @AfterSuite() {
	  System.out.println("After Suite");
  }
}
