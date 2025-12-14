package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamicCode.ParentClass;

public class DragAndDropActionClass extends ParentClass {

	public static void main(String[] args) {
		launch_browser("chrome");
		Hiturl("https://jqueryui.com/draggable/");
		WebElement IF = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(IF);
		Actions act = new Actions(driver);
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		act.dragAndDrop(drag, drop).build().perform();
		// act.clickAndHold(drag).release(drop).build().perform();
	}

}
