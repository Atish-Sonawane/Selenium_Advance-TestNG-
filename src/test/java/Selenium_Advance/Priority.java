package selenium_Advance;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1,enabled=false)
	public void test06() {
		System.out.println("Inside test method 0");
	}
	@Test(priority=1)
	public void test01() {
		System.out.println("Inside test method 1");
	}
	@Test(priority=0)
	public void test02() {
		System.out.println("Inside test method 2");
	}
	@Test(priority=-1)
	public void test03() {
		System.out.println("Inside test method 3");
	}

}
