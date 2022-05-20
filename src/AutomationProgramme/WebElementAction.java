package AutomationProgramme;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAction {
public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Jar Files\\chromedriver_win32(99)\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000); 
	//sendkeys
	//WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
	//username.sendKeys("Rajesh");
	//WebElement pass = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
	//pass.sendKeys("12345");
	//Thread.sleep(5000);
	//click
	//WebElement clickbtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	//clickbtn.click();
	//Thread.sleep(5000);
	//WebElement femalbtn = driver.findElement(By.xpath("//input[@value='1']"));
	//femalbtn.click();
//	WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
	//if(username.isEnabled()==true) {
		//username.sendKeys("Rajesh");
//	}
	//else {
		//System.out.println("username is disabled");
//	}
//	WebElement clickbtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	//clickbtn.click();
	//Thread.sleep(5000);
	//WebElement dis = driver.findElement(By.xpath("//option[text()='Select your pronoun']"));
	//if(dis.isEnabled()==true) {
		//System.out.println("field is enabled");
	//}
	//else {System.out.println("field is disabled");
	
	//}
//	WebElement imgdis = driver.findElement(By.xpath("//img[@alt='Facebook']"));
	//if(imgdis.isDisplayed()==true) {
		//System.out.println("Image is displayed");
//	}
	//else {
		//System.out.println("Image is not displayed");
//	}
	//WebElement clickbtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	//clickbtn.click();
//	Thread.sleep(5000);
//	WebElement rdbtn = driver.findElement(By.xpath("//input[@value='1']"));
	//rdbtn.click();
	
	//System.out.println(rdbtn.isSelected()+"  username element is selectable");
	//getText()
	//String actualText = driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).getText();
//	Thread.sleep(2000); 
	//String expectedText="Sign Up";
//	if(actualText.equals(expectedText)) {
	//	System.out.println("Test script is pass");
//	}
	//else {
		//System.out.println("Test script is fail");
//	}
	//String actualTitle = driver.findElement(By.xpath("//a[text()='Watch']")).getAttribute("Title");
	//String expectedTitle="Browse our Watch videos.";
	//if(actualTitle.equals(expectedTitle)) {
		//System.out.println("Test script is pass");
	//}else {
		//System.out.println("Test script is Fail");
	//}
	//List<WebElement> footerlinks = driver.findElements(By.xpath("//ul[starts-with(@class,'uiList pageFooterLinkList')]/li/a"));
	//System.out.println(footerlinks.size());
	//for(int i=0;i<footerlinks.size();i++) {
		//String links = footerlinks.get(i).getAttribute("href");
	//	String Text=footerlinks.get(i).getText();
		//System.out.println(i+" "+Text+"==> "+links);
//	}
	
	List<WebElement> footerlinks = driver.findElements(By.xpath("//ul[starts-with(@class,'uiList pageFooterLinkList')]/li/a"));
	
	System.out.println(footerlinks.size());
	
	for(int i=0;i<footerlinks.size();i++) {
		String link = footerlinks.get(i).getAttribute("href");
		String Text = footerlinks.get(i).getText();
	
	System.out.println(i+" "+Text +" ==>"+link);}
	
	
	
	
	
	
	
}
}
