package PageObjects;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Page extends BasePage 
{

	public Page(IOSDriver<IOSElement> _driver) {
		super(_driver);
	}
	public void clickDatePicker() 
	{
		driver.findElementByAccessibilityId("Date Picker").click();
	}
}