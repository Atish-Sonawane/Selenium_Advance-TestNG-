package page_Object_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest {
	WebDriver driver;
	
	@Test
	public void verifyFlightReg() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//Registration_POM_Method1 RGpage = new Registration_POM_Method1(driver);  //for first method
		
		Registration_POM_Method1 RGpage = new Registration_POM_Method1(driver);  //second method always prefarable
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		RGpage.clickRegLink();
		RGpage.setFirstName("Test");
		RGpage.setLastName("dev");
		RGpage.setAddress1("address add1");
		RGpage.setCity("pune");
		RGpage.setCountry("INDIA");
		RGpage.setPhone("1234565432");
		RGpage.setEmail("Tester123@gmail.com");
		RGpage.setPostalCode("123456");
		RGpage.setState("maharashtra");
		RGpage.setUserName("Tester123");
		RGpage.setPassword("Tester@123");
		RGpage.setConfirmPassword("Tester@123");
		RGpage.clickRegBtn();
		
		Thread.sleep(3000);
		driver.close();
		
	}

	
}
