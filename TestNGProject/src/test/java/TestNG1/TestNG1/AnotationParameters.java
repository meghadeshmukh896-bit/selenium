package TestNG1.TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnotationParameters {
	@Test(priority = 0, enabled = true, invocationCount = 3)
	public void LaunchBrowser() {
		System.out.println("Launch Browser");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test(priority = 1, enabled = true, invocationCount = 1)
	public void Hiturl(String url) {
		System.out.println("Hiturl");

		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
	}

	@Test(description = "Search", priority = 4, enabled = false)
	public void Search112() {
		System.out.println("Search");

	}

}