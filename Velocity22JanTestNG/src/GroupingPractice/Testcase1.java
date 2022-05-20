package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	@BeforeTest(alwaysRun=true)
	public void openDB() {
		System.out.println("open database");
	}
	@AfterTest(alwaysRun=true)
	public void closeDB() {
		System.out.println("close database");
	}
	@BeforeClass(alwaysRun=true)
	public void launchbrowser() {
		System.out.println("Browser is launched");
	}
	@AfterClass(alwaysRun=true)
	public void closebrowser() {
	System.out.println("Browser is closed");
	}
	@Test(groups="smoke")
	public void test1() {
		System.out.println("Test1");
	}
	@Test(groups="functional")
	public void test2() {
		System.out.println("Test2");
	}
	@Test(groups={"smoke","regression"})
	public void test3() {
		System.out.println("Test3");
	}
}
