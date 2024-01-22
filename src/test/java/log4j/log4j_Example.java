package log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class log4j_Example {
	static WebDriver driver;
	
	public static void main(String[] args) {
	
	Logger logger = LogManager.getLogger(log4j_Example.class);
	DOMConfigurator.configure("log4j.xml");
	PropertyConfigurator.configure("log4j.properties");
	
	logger.info("browser open");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	logger.info("open google");
	driver.get("google.com");
	
	logger.info("close Browser");
	driver.close();

}
}