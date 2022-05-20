package AutomationProgramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatoreByCustomizedXPath {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar Files\\chromedriver_win32(99)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//BasicXpath
	driver.findElement(By.xpath("//input[@data-testid='royal-email']"));
	//xpath by using text()
	driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	//Xpath with starts-with
	driver.findElement(By.xpath("//input[starts-with(@aria-label,'Email address or')]"));
	//Xpath by contain
	driver.findElement(By.xpath("//input[contains(@aria-lable,' or phone']"));
	//Xpath by logical operator ==>and,or
	driver.findElement(By.xpath("//input[@type='text'and@name='lastname']"));
}
}
