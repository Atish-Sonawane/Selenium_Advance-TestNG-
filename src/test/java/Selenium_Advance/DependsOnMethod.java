package Selenium_Advance;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void login()
	{
		System.out.println("Code to login AUT");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void dashboard()
	{
		System.out.println("dashboard");
	}
	
	@Test(dependsOnMethods= {"dashboard"})
	public void logout()
	{
		System.out.println("logout");
	}
	

}
