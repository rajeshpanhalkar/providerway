package AutomationProgramme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabels {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar Files\\chromedriver_win32(99)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	int rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
	int columns=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
	System.out.println(rows);
	System.out.println(columns);
	for(int r=1;r<=rows;r++) {
		for(int c=1;c<=columns;c++) {
			String value = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
			System.out.print("==>"+value);
		}
		System.out.println();
	}
}
}
