package page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration_POM_Method2 {
	WebDriver driver;

	Registration_POM_Method2(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(linkText="REGISTER")                    // Syntax 1
	WebElement RegLink;
	
	/* @FindBy(how=How.LINK_TEXT,using="REGISTER")  //syntax 2
	WebElement RegLink;  */
	
	@FindBy(name="firstName")
	WebElement FirstName;
	
	@FindBy(name="lastName")
	WebElement LastName;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="userName")
	WebElement email;
	
	@FindBy(name="address1")
	WebElement address1;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="country")
	WebElement country;
	
	@FindBy(name="postalCode")
	WebElement postalcode;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement confirmpassword;
	
	@FindBy(name="submit")
	WebElement registerbtn;
	


	public void clickRegLink() {
		RegLink.click();
	}

	public void setFirstName(String fname) {
		FirstName.sendKeys(fname);
	}
	public void setLastName(String lname) {
		LastName.sendKeys(lname);
	}
	public void setPhone(String ph) {
		phone.sendKeys(ph);
	}
	public void setEmail(String em) {
		email.sendKeys(em);
	}
	public void setAddress1(String ad1) {
		address1.sendKeys(ad1);
	}
	public void setCity(String ct) {
		city.sendKeys(ct);
	}
	public void setState(String st) {
		state.sendKeys(st);
	}
	public void setCountry(String cn) {
		WebElement con = country;
		Select drop = new Select(con);
		drop.selectByVisibleText(cn);
	}
	public void setPostalCode(String pc) {
		postalcode.sendKeys(pc);
	}
	public void setUserName(String uname) {
		username.sendKeys(uname);
	}
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	public void setConfirmPassword(String cpass) {
		confirmpassword.sendKeys(cpass);
	}
	public void clickRegBtn() {
		registerbtn.click();
	}
	
	
	
	
}
