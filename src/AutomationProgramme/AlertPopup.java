package AutomationProgramme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Jar Files\\chromedriver_win32(99)\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Alert alert = driver.switchTo().alert();
	String message = alert.getText();
	System.out.println(message);
	alert.accept();
	driver.close();
}
}
