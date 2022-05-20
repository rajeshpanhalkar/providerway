package KeywordPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeOutExample {
	@BeforeClass
	public void launchbrowser() {
		System.out.println("Browser is launched");
	}
	@AfterClass
public void closebrowser() {
	System.out.println("Browser is closed");
}
	@BeforeMethod
	public void login() {
		System.out.println("Log in is successfull");
	}
	@AfterMethod
	public void logout() {
		System.out.println("log out is successfull");
	}
	@Test(priority=1 ,timeOut=5000)
	public void openhomepage() throws InterruptedException {
		Thread.sleep(2500);
		System.out.println("Homepage is open");
	}
	@Test(priority=2 ,invocationCount=5)
	public void openvideopage() {
		System.out.println("Videopage is open");
	}
	@Test(priority=3)
	public void opennotificationpage() {
		System.out.println("Notificationpage is open");
	}
}
