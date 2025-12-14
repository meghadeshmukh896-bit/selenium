package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamicCode.ParentClass;

public class KeyboardActionClass extends ParentClass {

	public static void main(String[] args) throws InterruptedException {
		launch_browser("chrome");
		Hiturl("https://in.linkedin.com/");

		///KeyBoard Action
		///KeyDown---page down

		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_UP).build().perform();

		act.click();
		WebElement email = driver.findElement(By.cssSelector("input#username"));
		email.click();
		email.sendKeys("megha@123");

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.TAB).build().perform();

	}

}