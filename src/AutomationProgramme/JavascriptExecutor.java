package AutomationProgramme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Jar Files\\chromedriver_win32(99)\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement us = driver.findElement(By.xpath("//input[@name='email']"));
	org.openqa.selenium.JavascriptExecutor js= ((org.openqa.selenium.JavascriptExecutor)driver);
	js.executeScript("arguments[0].style.border='6px solid red'", us);
	//get title 
	String title = js.executeScript("return document.title").toString();
	System.out.println(title);
	
}
}
