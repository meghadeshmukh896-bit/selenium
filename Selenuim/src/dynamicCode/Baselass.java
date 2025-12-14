package dynamicCode;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Baselass {

	public static WebDriver driver;

	public static void launch_browser(String browser) {
		if (browser.equalsIgnoreCase("chrome"))

		{
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox"))
			;
		{
			driver = new FirefoxDriver();
		}

		if (browser.equalsIgnoreCase("edge"))
			;
		{

			driver = new EdgeDriver();
		}
		// System.out.println("The Browser launch is as:" + browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

	}

	public static void Hiturl(String url) {
		driver.get(url);
		System.out.println("The title of webPage is" + driver.getTitle());
	}

	public static void ScreenShots(String Filname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./screenshot/chrome.png");
		FileHandler.copy(Source, target);

	}

}
