package seleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://www.facebook.com");

		///email
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.click();
		email.sendKeys("Advil@12345");
		Thread.sleep(5000);
		email.clear();

		email.sendKeys("megha@12345");

		///Password
		WebElement password = driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]"));
		password.click();
		password.sendKeys("241125322");
		Thread.sleep(2000);
		////Login 
		WebElement Login = driver.findElement(By.xpath("//button[@id=\"loginbutton\"]"));
		System.out.println("The text present on login button is:" + Login.getText());
		System.out.println("The text entered by:" + email.getAttribute("id"));
		System.out.println("The x cordinates:" + Login.getLocation().x);
		System.out.println("The y cordinates:" + Login.getLocation().y);
		System.out.println("The y cordinates:" + Login.getSize());
		System.out.println("The y cordinates:" + Login.getTagName());
		System.out.println("The y cordinates:" + Login.isDisplayed());
		System.out.println("The y cordinates:" + Login.isEnabled());
		System.out.println("The y cordinates:" + Login.isEnabled());

		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
	}
}
