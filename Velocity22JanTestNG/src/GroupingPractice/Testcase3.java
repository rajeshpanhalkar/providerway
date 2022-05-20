package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase3 {
	@BeforeClass(alwaysRun=true)
	public void launchbrowser() {
		System.out.println("Browser is launched");
	}
	@AfterClass(alwaysRun=true)
	public void closebrowser() {
	System.out.println("Browser is closed");
	}
	@Test(groups="smoke")
	public void test7() {
		System.out.println("Test7");
	}
	@Test(groups="functional")
	public void test8() {
		System.out.println("Test8");
	}
	@Test(groups={"smoke","regression"})
	public void test9() {
		System.out.println("Test9");}

}
