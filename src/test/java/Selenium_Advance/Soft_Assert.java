package selenium_Advance;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Soft_Assert {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws IOException {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Swag Lab";
		System.out.println("Title is " + actualTitle);
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualTitle, expectedTitle);
		
		// run below script after assert fail
		System.out.println("assert pass");
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(".\\screenshot\\image5.png");
		FileHandler.copy(scr, destination);
		
		
		//softassert.assertAll(); //>>>>if error in soft assert it will show always write end of the test
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
