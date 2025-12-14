package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamicCode.ParentClass;

public class SliderActionClass extends ParentClass {

	public static void main(String[] args) {
		launch_browser("chrome");
		Hiturl("https://jqueryui.com/slider/");
		WebElement IF = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(IF);
		Actions act = new Actions(driver);
		WebElement Slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));
		act.moveToElement(Slider).clickAndHold().moveByOffset(400, 0).release().release().build().perform();
		act.clickAndHold(Slider).moveByOffset(-100, 0).release().build().perform();
		act.dragAndDropBy(Slider, 100, 0).build().perform();
	}

}
