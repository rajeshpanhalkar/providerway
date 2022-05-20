package AutomationProgramme;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar Files\\chromedriver_win32(99)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		String cururl=driver.getCurrentUrl();
		System.out.println(cururl);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.navigate().to("http://www.irctc.co.in");
		driver.navigate().to("http://www.oyorooms.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Dimension d=new Dimension(200,200);
		driver.manage().window().setSize(d);
		Point p=new Point(100,110);
		driver.manage().window().setPosition(p);
}
}
