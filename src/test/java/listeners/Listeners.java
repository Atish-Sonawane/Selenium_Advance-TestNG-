package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {
	public void onTestStart(ITestResult tr) {
		System.out.println("test started");
	}

	public void onTestFailure(ITestResult tr) {
		System.out.println("test failed");
	}

	public void onTestSkip(ITestResult tr) {
		System.out.println("test skip");
	}

	public void onTestSuccess(ITestResult tr) {
		System.out.println("test pass");
	}

}
