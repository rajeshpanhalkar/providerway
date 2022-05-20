package AutomationProgramme;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {
public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar Files\\chromedriver_win32(99)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.next.co.uk/");
//	//how to hover the element
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.findElement(By.xpath("//div[@id='onetrust-close-btn-container']/button")).click();
//	List<WebElement> links = driver.findElements(By.xpath("//ul[@data-testid='snail-trail-container']/li/a"));
//	for(int i=0;i<links.size();i++) {
//		WebElement link = links.get(i);
//		Actions action=new Actions(driver);
//		action.moveToElement(link).build().perform();
//		System.out.println(link.getText());}
//		Thread.sleep(2000);
//		//how to handle resizable element
//		driver.get("https://jqueryui.com/resizable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement resizable = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
//		Actions action1=new Actions(driver);
//		action1.dragAndDropBy(resizable, 100, 50).build().perform();
	//drag and drop
//	driver.get("https://jqueryui.com/droppable/");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.manage().deleteAllCookies();
//	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//	driver.switchTo().frame(frame);
//	WebElement dragg = driver.findElement(By.xpath("//div[@id='draggable']"));
//	WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
//	Actions action1=new Actions(driver);
//	Thread.sleep(2000);
//	action1.dragAndDrop(dragg, drop).build().perform();
	//right click
//	driver.get("https://deluxe-menu.com/popup-mode-sample.html");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.manage().deleteAllCookies();
//	WebElement img = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
//	Actions action1=new Actions(driver);
//	Thread.sleep(2000);
//	action1.contextClick(img).build().perform();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	WebElement user= driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
	Actions action1=new Actions(driver);
	Thread.sleep(2000);
	action1.keyDown(user,Keys.SHIFT).sendKeys("rajesh").keyUp(Keys.SHIFT).build().perform();
	
	
	
	
	}
}

