package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void loginByEmail() {
		System.out.println("login by email");
		Assert.assertEquals("test@123", "test@123"); // true
	}

	@Test
	public void loginByFB() {
		System.out.println("login by Facebook");
		Assert.assertEquals("test@123", "Tester@123"); // False

	}

}
