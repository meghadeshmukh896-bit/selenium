import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamicCode.ParentClass;

public class Demo1 extends ParentClass {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		ExtentSparkReporter esr = new ExtentSparkReporter(projectPath + "\\ReportsFile\\ReportGenrated\\");
		esr.config().setDocumentTitle("Automation Reports");
		esr.config().setReportName("Ecommers Reports");
		esr.config().setTheme(Theme.DARK);

		ExtentReports er = new ExtentReports();
		er.attachReporter(esr);

		/// Syetem.configuration
		er.setSystemInfo("os", "window");
		er.setSystemInfo("browser", "chrome");
		er.setSystemInfo("Domain", "Ecommers");
		er.setSystemInfo("Application", "myntra");
		er.setSystemInfo("Quality Analyst", "Divayni");
//		er.setSystemInfo("os", "Window");

		/// Create TestCase
		ExtentTest et = er.createTest("Launch_Browser");
		et.log(Status.INFO, "LaunchBrowser");

		ExtentTest et1 = er.createTest("Hiturl");
		et1.log(Status.PASS, "Pass Hit URL");

		ExtentTest et2 = er.createTest("Search Functionality");
		et2.log(Status.FAIL, "Fail Functionality");

		ExtentTest et3 = er.createTest("Send Data");
		et3.log(Status.SKIP, "Skip Send Data");

		launch_browser("chrome");

		Hiturl("https://www.myntra.com");
		er.flush();
	}

}
