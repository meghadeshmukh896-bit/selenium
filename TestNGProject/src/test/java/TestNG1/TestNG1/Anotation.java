package TestNG1.TestNG1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotation {
	@Test

	public void h() {
		System.out.println("Testing");
	}

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method");
	}

	@AfterTest
	public void Test() {
		System.out.println("Test Method");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("After method");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}
}
