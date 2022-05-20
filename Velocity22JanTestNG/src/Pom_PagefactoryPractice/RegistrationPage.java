package Pom_PagefactoryPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegistrationPage {
//Declaration
	@FindBy (xpath="//img[@class='fb_logo _registrationPage__fbLogo img']") private WebElement reg_FBLogo;
	@FindBy (xpath="//a[text()='Already have an account?']") private WebElement already_account;
	@FindBy (xpath="//a[@title='Sign up for Facebook']") private WebElement signuplink;
	@FindBy (name="firstname") private WebElement firstName;
	@FindBy (name="email") private WebElement mob_email;
	@FindBy (name="lastname") private WebElement surname;
	@FindBy (name="reg_passwd__") private WebElement password;
	@FindBy (name="birthday_day") private WebElement birthdat;
	@FindBy (name="birthday_month") private WebElement birthmonth;
	@FindBy (name="birthday_year") private WebElement birthyear;
	@FindBy (xpath="//input[@value='2']") private WebElement gender_male;
	@FindBy (xpath="//input[@value='1']") private WebElement gender_female;
	@FindBy (name="websubmit") private WebElement submitbtn;
	
	
	//initialization==>we use constructor as public
	public RegistrationPage(WebDriver driver) {
       PageFactory.initElements(driver, this);
	}
	public void clickFacebookSignupLink() {
		signuplink.click();
	}
	public void verifyRegistrationPagefbLogo() {
		Assert.assertTrue(reg_FBLogo.isDisplayed(), "Registration page logo is display");
	}
}
