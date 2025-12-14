package seleniumAutomation;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import dynamicCode.ParentClass;

public class JavascriptExecuter extends ParentClass {

	public static void main(String[] args) throws IOException, InterruptedException {

		launch_browser("chrome");
		Hiturl("https://www.facebook.com/");
		ScreenShots("screenshots", "");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript();

		///scrolldown
		js.executeScript("window.scrollBy(0,400);");

		ScreenShots("screenshots", "ScrollDown300");

		///scrollUp
		js.executeScript("window.scrollBy(500,0);");
		ScreenShots("screenshots", "ScrollUp");
		// Thread.sleep(2000);

		js.executeScript("window.scrollTO(10,0);");
		ScreenShots("screenshots", "normalView");
		// Thread.sleep(2000);

		js.executeScript("window.histroy.go();");
		ScreenShots("screenshots", "back");

		js.executeScript("window.histroy.back();");
		ScreenShots("screenshots", "back");
		// Thread.sleep(2000);

		js.executeScript("window.histroy.forward();");
		ScreenShots("screenshots", "forward");
		// Thread.sleep(2000);

		js.executeScript("window.location.relod();");
		ScreenShots("screenshots", "Refresh");
		// Thread.sleep(2000);

		js.executeScript("window.close()");

	}

}
