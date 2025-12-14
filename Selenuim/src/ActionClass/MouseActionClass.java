package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamicCode.ParentClass;

public class MouseActionClass extends ParentClass {

	public static void main(String[] args) {
		launch_browser("chrome");
		Hiturl("https://facebook.com/");
		Actions act = new Actions(driver);
		WebElement FS = driver.findElement(By.cssSelector("input#email"));
		act.moveToElement(FS).click().build().perform();
		// act.moveToElement(FS).contextClick().build().perform();
		// act.moveToElement(FS).click().sendKeys("345266").doubleClick();
	}
}