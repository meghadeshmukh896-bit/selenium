package dynamicCode;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ParentClass {
	public static WebDriver driver;

	public static void launch_browser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		}
		System.out.println("The Browser launch is as:" + browser);
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	}

	public static void Hiturl(String url) {
		driver.get(url);
		System.out.println("The title of webPage is" + driver.getTitle());
	}

	public static void ScreenShots(String foldername, String Screenshotsname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		/// "./foldername/Screenshotname.png".
		File target = new File("./" + foldername + "/" + Screenshotsname + ".png");
		FileHandler.copy(Source, target);
		System.out.println("The Browser screenshots is here:");
	}

	public static void KeyboardAction() {
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_UP).build().perform();
	}

	public static void MouseAction(By loactor) {
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(loactor);
		act.moveToElement(element).click().build().perform();
		// act.moveToElement(element).contextClick().build().perform();
		// act.moveToElement(element).click().sendKeys("345266").doubleClick();
	}

	public static void DragAndDrop(By loactor, By loactor1, By loactor2) {
		WebElement IF = driver.findElement(loactor);
		driver.switchTo().frame(IF);
		Actions act = new Actions(driver);

		WebElement drag = driver.findElement(loactor1);
		WebElement drop = driver.findElement(loactor2);

		// act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		// act.dragAndDrop(drag, drop).build().perform();
		// act.clickAndHold(drag).release(drop).build().perform();

	}

	public static void SliderAction(By loactor1, By loactor2) {
		WebElement IF = driver.findElement(loactor1);
		driver.switchTo().frame(IF);
		Actions act = new Actions(driver);
		WebElement Slider = driver.findElement(loactor2);
		act.moveToElement(Slider).clickAndHold().moveByOffset(400, 0).release().release().build().perform();
		act.clickAndHold(Slider).moveByOffset(-100, 0).release().build().perform();
		act.dragAndDropBy(Slider, 100, 0).build().perform();
	}
}
