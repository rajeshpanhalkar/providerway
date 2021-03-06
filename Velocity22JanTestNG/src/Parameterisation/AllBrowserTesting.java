package Parameterisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllBrowserTesting {
	WebDriver driver;
	@Parameters("browser")
@Test(priority=1)
public void CrossbrowserTesting(String browser) {
	if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar Files\\chromedriver_win32(101)\\chromedriver.exe\\");
		driver=new ChromeDriver();
	}else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar Files\\geckodriver\\geckodriver-v0.31.0-win64.zip\\");
		driver=new FirefoxDriver();
	}else {
		System.out.println("Wrong browser is selected");
	}
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Test(priority=2)
public void verifyCurrentUrl() {
	Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");
	Reporter.log("verifyCurrentUrl",true);
}
@Test(priority=3)
public void verifyPageTitle() {
	Assert.assertEquals(driver.getTitle(),"Facebook ? log in or sign up");
	Reporter.log("verifyPageTitle",true);
}
@Test(priority=4)
public void verifyUsernameField() {
	WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
	Assert.assertTrue(username.isDisplayed() );
	Assert.assertTrue(username.isEnabled() );
	username.sendKeys("rpanhalkar6@gmail.com");
}
@Test(priority=5)
public void verifyPasswordeField() {
	WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
	Assert.assertTrue( password.isDisplayed() );
	Assert.assertTrue( password.isEnabled() );
	 password.sendKeys("9689553891");
}
@Test(priority=6)
public void ClickLoginButton() {
	WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	Assert.assertTrue(LoginBtn.isEnabled());
	LoginBtn.click();
}


}
