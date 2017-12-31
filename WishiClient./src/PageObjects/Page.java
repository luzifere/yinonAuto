package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Page extends BasePage 
{

	public Page(IOSDriver<IOSElement> _driver) {
		super(_driver);
	}
	@FindBy(xpath="//div//span[text()[contains(.,'My Bookings')]]")
	WebElement BookBtn;
	public void clickDatePicker() 
	{
		driver.findElementByAccessibilityId("email sign up").click();
		
		
	}
}