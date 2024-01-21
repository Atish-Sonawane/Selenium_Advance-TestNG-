package Selenium_Advance;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Group_Combine {
	
	@Test(groups= {"bike","ebike"})
	public void bike() {
		System.out.println("bike");

	}
	@Test(groups= {"bike","ecar"})
	public void bike1() {
		System.out.println("bike1");

	}
	@Test(groups= {"ebike"})
	public void bike2() {
		System.out.println("bike2");

	}

}
