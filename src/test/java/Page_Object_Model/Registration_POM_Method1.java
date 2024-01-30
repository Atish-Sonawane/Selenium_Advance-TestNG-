package page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration_POM_Method1 {
	WebDriver driver;

	Registration_POM_Method1(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	By RegLink = By.linkText("REGISTER");
	By FirstName = By.name("firstName");
	By LastName = By.name("lastName");
	By phone = By.name("phone");
	By email = By.name("userName");
	By address1 = By.name("address1");
	By city = By.name("city");
	By state = By.name("state");
	By country = By.name("country");
	By postalcode = By.name("postalCode");
	By username = By.name("email");
	By password = By.name("password");
	By confirmpassword = By.name("confirmPassword");
	By registerbtn = By.name("submit");

	public void clickRegLink() {
		driver.findElement(RegLink).click();
	}

	public void setFirstName(String fname) {
		driver.findElement(FirstName).sendKeys(fname);
	}
	public void setLastName(String lname) {
		driver.findElement(LastName).sendKeys(lname);
	}
	public void setPhone(String ph) {
		driver.findElement(phone).sendKeys(ph);
	}
	public void setEmail(String em) {
		driver.findElement(email).sendKeys(em);
	}
	public void setAddress1(String ad1) {
		driver.findElement(address1).sendKeys(ad1);
	}
	public void setCity(String ct) {
		driver.findElement(city).sendKeys(ct);
	}
	public void setState(String st) {
		driver.findElement(state).sendKeys(st);
	}
	public void setCountry(String cn) {
		WebElement con = driver.findElement(country);
		Select drop = new Select(con);
		drop.selectByVisibleText(cn);
	}
	public void setPostalCode(String pc) {
		driver.findElement(postalcode).sendKeys(pc);
	}
	public void setUserName(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void setConfirmPassword(String cpass) {
		driver.findElement(confirmpassword).sendKeys(cpass);
	}
	public void clickRegBtn() {
		driver.findElement(registerbtn).click();
	}
	
	
	
	
}
