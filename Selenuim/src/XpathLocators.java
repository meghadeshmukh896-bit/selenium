import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

	public static void main(String[] args) {
		// div[@class="QSCKDh dLgFEE col-10-12"]
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//div[@class=\"QSCKDh dLgFEE col-10-12\"]"));

		driver.findElement(By.xpath("//div[@class=\"eq0K9s tBcEQe\"][@class=\"JlVUWm\"]"));

		driver.findElement(By.xpath("//div[@class=\"eq0K9s tBcEQe\" and @class=\"eq0K9s tBcEQe\"]"));

		driver.findElement(By.xpath("//div[@class=\"eq0K9s tBcEQe\" or @class=\"eq0K9s tBcEQe\"]"));

		driver.findElement(By.xpath("//div[contains(@class=\"yZCQWU\")]"));

		driver.findElement(By.xpath("//form[starts-with(@class=\"rcHWnF header-form-search\")]"));

		driver.findElement(By.xpath("//span[text()=\"Plus\"]"));

		/////parent and child Reletionship

		driver.findElement(By.xpath("//li[@class=\"sd-header-list\"]//a[@class=\"sd-header-link\"]"));
		driver.findElement(By.xpath(""));
	}

}
