package seleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumday1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// WebDriverWait wait=new WebDriverWait(driver,10);
		// wait.until(ExceptedConditions.VisibilityOfAllElemnet("Locator"));

		driver.get("https://www.flipkart.com");
		driver.getTitle();
		driver.get("https://www.flipkart.com");
		driver.getPageSource();
		driver.findElement(null);
		driver.findElements(null);
		driver.close();
		driver.quit();
		driver.getWindowHandle();
		driver.getWindowHandles();
		driver.switchTo();
		driver.navigate();
		
	}
}