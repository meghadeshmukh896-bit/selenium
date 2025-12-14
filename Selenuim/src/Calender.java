import org.openqa.selenium.By;

import dynamicCode.ParentClass;

public class Calender extends ParentClass {

	public static void main(String[] args) {
		launch_browser("chrome");
		Hiturl("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[text()=\"OK\"]"));

	}

}
