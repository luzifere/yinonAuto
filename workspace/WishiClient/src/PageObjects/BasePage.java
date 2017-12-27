package PageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class BasePage 
{
	static IOSDriver <IOSElement>driver;
	public BasePage(IOSDriver <IOSElement> _driver)
	{	driver = _driver;
	PageFactory.initElements(_driver, this);
	}

}
