package ActionClass;

import org.openqa.selenium.By;

import dynamicCode.ParentClass;

public class AllActionClasses extends ParentClass {

	public static void main(String[] args) {
		launch_browser("chrome");
		Hiturl("https://jqueryui.com/slider/");
		MouseAction(By.xpath("//a[text()=\"Themes\"]"));
		SliderAction(By.cssSelector("iframe.demo-frame"), By.xpath("//span[@tabindex=\"0\"]"));
		DragAndDrop(By.cssSelector("iframe.demo-frame"), By.cssSelector("div#draggable"),
				By.cssSelector("div#droppable"));
	}

}
