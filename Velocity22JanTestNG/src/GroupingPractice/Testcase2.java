package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase2 {

	@BeforeClass(alwaysRun=true)
	public void launchbrowser() {
		System.out.println("Browser is launched");
	}
	@AfterClass(alwaysRun=true)
	public void closebrowser() {
	System.out.println("Browser is closed");
	}
	@Test(groups="smoke")
	public void test4() {
		System.out.println("Test4");
	}
	@Test(groups="functional")
	public void test5() {
		System.out.println("Test5");
	}
	@Test(groups={"smoke","regression"})
	public void test6() {
		System.out.println("Test6");}
}
