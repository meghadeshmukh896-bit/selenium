import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		///Locators
		// Id
		driver.findElement(By.id("amnHalfCard"));
		driver.findElement(By.id("sec-overlay"));

		// name
		driver.findElement(By.name("google-signin-client_id"));
		driver.findElement(By.name("theme-color"));

		// className

		driver.findElement(By.className("cell-body-textinput"));

		// LinkText
		driver.findElement(By.linkText("https//www.google-analytics.com"));
		driver.findElement(By.linkText("https://touch.myntra.com"));

		// partialInk
		driver.findElement(By.partialLinkText("apple-touch-icon"));
		driver.findElement(By.partialLinkText("android-touch-icon"));

		// TagName
		driver.findElements(By.tagName("itemprop"));
		driver.findElements(By.tagName("oncontextmenu"));

		// CSS Selector
		///tagName and id_value
		///tagName#id_value
		driver.findElement(By.cssSelector("div#sec-overlay"));
		driver.findElement(By.cssSelector("div#sec-container"));

		///tagName and valueofClass
		driver.findElement(By.cssSelector("div.cell-body-textinput"));
		driver.findElement(By.cssSelector("div.cell-body-textinput"));

		// TagName and attribute
		// TagName[attribute="value"]

		driver.findElement(By.cssSelector("link[rel=\"profile\"]"));
		driver.findElement(By.cssSelector("meta[name=\"twitter:description\"]"));

		// TagName and multiple attribute
		// TagName[attribute="value"][attribute="value"][attribute="value"]

		driver.findElement(
				By.cssSelector("meta[name=\"twitter:description\"][name=\"twitter:image\"][type=\"text/javascript\"]"));

	}

}
