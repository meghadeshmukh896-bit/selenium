package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamicCode.ParentClass;

public class SimpleAlerts extends ParentClass {

	public static void main(String[] args) throws InterruptedException {
		launch_browser("chrome");
		Hiturl("https://demo.automationtesting.in/Alerts.html");

		////Simple alert
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		Alert al1 = driver.switchTo().alert();
		Thread.sleep(1000);
		al1.accept();

		System.out.println("=======Confirmation alert========");
		/////Confirmantion alerts
		driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]")).click();
		driver.findElement(By.xpath("//button[text()=\"click the button to display a confirm box \"]")).click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(1000);
		alert1.accept();
		// alert1.dismiss();
		// WebElement text = driver.findElement(By.cssSelector("p#demo"));
		// System.out.println(text.getText());

		WebElement txt = driver.findElement(By.cssSelector("p#demo"));
		System.out.println("you pressed ok:" + txt.getText());

		////Prompt alerts

		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[1]")).click();
		driver.findElement(By.xpath("//button[text()=\"click the button to demonstrate the prompt box \"]")).click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.sendKeys("Hello Google");
		alert2.accept();
		WebElement txt1 = driver.findElement(By.xpath("//p[@id=\"demo1\"]"));
		System.out.println("you pressed cancle:" + txt1.getText());
	}

}
