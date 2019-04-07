package PageObejecs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPages extends BasePage
{
	@FindBy(xpath="//div//p[@class='header-link-text']")
	public WebElement LoginButton;
	@FindBy(xpath="//div//input[@id='signInEmail']")
	public WebElement UserName;
	@FindBy(xpath="//div//input[@id='signInPass']")
	public WebElement Password;
	@FindBy(xpath="//div//input[@value='Log in']")
	public WebElement LoginOfWizard;
	
	public LoginPages(AppiumDriver<WebElement> driver) {
		super(driver);
	}
		
	public void ClickLogin()
	{
	click(LoginButton);
	}
	public void DoLogin()
	{
		filltext(UserName, "yinon@wishi.me");
		filltext(Password, "156523784");
		click(LoginOfWizard);
	}
}