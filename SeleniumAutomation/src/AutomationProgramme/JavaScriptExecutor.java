package AutomationProgramme;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar Files\\chromedriver_win32(99)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//driver.get("https://www.rediff.com/");
//driver.manage().window().maximize();
////driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//WebElement user = driver.findElement(By.xpath("//div[text()='LATEST']"));
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//JavascriptExecutor js = ((JavascriptExecutor) driver);
////js.executeScript("arguments[0].style.border='3px solid red'",user);
////js.executeScript("alert('"+"this is alert popup"+"')");
//js.executeScript("scroll(0,1000)");
//Thread.sleep(2000);
//js.executeScript("scroll(0,500)");
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement DisclaimerBtn = driver.findElement(By.xpath("//a[text()='Disclaimer']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", DisclaimerBtn);
	}
}
