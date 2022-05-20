package KeywordPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountWithThreadpoolSize {
@Test(invocationCount=5 ,threadPoolSize=5)
public void openbrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar Files\\chromedriver_win32(101)\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.close();
}
}
