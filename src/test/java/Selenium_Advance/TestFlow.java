package Selenium_Advance;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFlow {
	WebDriver driver;

	@BeforeSuite
	@Parameters({ "browsername", "url" })
	public void beforesuite(@Optional("IE") String browser, String url) {
		switch (browser) {
		case "chrome":
			driver.get(url);
			break;
		case "Firefox":
			driver.get(url);
			break;
		case "IE":
			driver.get(url);
			break;

		}
		System.out.println("in Before suit");

	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("in Before class");
	}

	@BeforeMethod
	public void beforemethod() {
		WebDriverManager.chromedriver().setup();
		// driver.get(url);
		System.out.println("in Before method");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("in Before test");
	}

	@Test
	public void test() {
		System.out.println("in test");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("in after test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("in after method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("in after class");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("in after suit");
	}

}
