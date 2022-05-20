package AutomationProgramme;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class ListBoxAction {
public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Jar Files\\chromedriver_win32(99)\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shadi.com/");
	Thread.sleep(5000);
	WebElement okbtn = driver.findElement(By.xpath("//a[@class='join-btn']"));
	okbtn.click();
	Thread.sleep(2000);
	
	WebElement listbtn = driver.findElement(By.xpath("//select[@class='form-control']"));
	Select s=new Select(listbtn);
	Thread.sleep(2000);
	s.selectByVisibleText("Oct");
	WebElement dob = driver.findElement(By.xpath("//select[@id='dob_y']"));
	Select s1=new Select(dob);
	String getopt = s1.getFirstSelectedOption().getText();
	System.out.println(getopt);
	driver.get("https://www.facebook.com");
	WebElement birthyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select s2 = new Select(birthyear);
	List<WebElement> years = s.getOptions();
	System.out.println("Total Years in the list "+ years.size());
}
}
