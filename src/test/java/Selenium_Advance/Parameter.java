package Selenium_Advance;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {
	WebDriver driver;

	
	@BeforeClass
	@Parameters({"Browser","URL"})
	public void setup(@Optional("chrome")String browser1,String url) {
		System.out.println("Browser: "+ browser1);
		System.out.println("AUT Link: "+ url);
		WebDriverManager.chromedriver().setup();
		driver.get(url);
		
		
		
	}
	
	@Test
	public void test() {
		
		
	}
	
}
