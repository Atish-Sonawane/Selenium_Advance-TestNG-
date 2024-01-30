package extentReport;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenerateExtentReport {
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;
	WebDriver driver;

	@BeforeTest
	public void setExtent() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/Report/myReport.html");

		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Functional Report");
		htmlReporter.config().setTheme(Theme.DARK);

		report = new ExtentReports();
		report.attachReporter(htmlReporter);

		report.setSystemInfo("hostname", "LocalHost");
		report.setSystemInfo("OS", "Windows");
		report.setSystemInfo("Tester Name", "Atish");
		report.setSystemInfo("Browser", "Chrome");
	}

	@AfterTest
	public void endReport() {
		 report.flush();
	}

	@BeforeMethod
	public void startReport() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
	}

	@Test
	public void extentReportsDemo() {

		test = report.createTest("TitleValidation");

		String title = driver.getTitle();
		if (title.equals("Google")) {
			test.log(Status.PASS, "Navigated to the specified URL ");
		} else {
			test.log(Status.FAIL, "Test Failed");
		}
	}

	@Test
	public void Titletest() {
		test = report.createTest("TitleValidation1");

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");

	}

	@Test
	public void LogoTest() {
		test = report.createTest("Logo Validation");
		boolean status = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(status);

	}

	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "Test case failed is" + result.getName());
			test.log(Status.FAIL, "Test case failed is" + result.getThrowable());

			String screenshotPath = GenerateExtentReport.getScreenShot(driver, result.getName());

			test.addScreenCaptureFromPath(screenshotPath);
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test case skipped is " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.SKIP, "Test case passed is " + result.getName());
		}
		driver.close();

	}

	public static String getScreenShot(WebDriver driver, String screenshotName) throws IOException {

		String dateName = new SimpleDateFormat("yyyyMMddmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		String Destination = System.getProperty("user.dir") + "/Screenshot/" + screenshotName + dateName + ".png";
		File finalDestination = new File(Destination);
		FileUtils.copyFile(source, finalDestination);
		return Destination;

	}

}
