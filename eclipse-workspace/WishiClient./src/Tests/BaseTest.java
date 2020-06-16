package Tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import dataProvider.ConfigFileReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest 
{
	protected static AppiumDriver driver;
	protected static ConfigFileReader configFileReader;
	public static  AppiumDriver<WebElement>capabileties() throws MalformedURLException   
	{
		configFileReader= new ConfigFileReader();
		DesiredCapabilities cap = new DesiredCapabilities();
		//if (device.equals("emulator"))
		//{
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro Max");
		//	}
		//else if (device.equals("real"))
		//{
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		//}

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"IOS");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"13.4");
		//cap.setCapability("autoAcceptAlerts", true);
		//cap.setCapability("autoDismissAlerts", true);
		//cap.setCapability(MobileCapabilityType.UDID,"4acfefaa5a78272eb509b64a2f2efffabd0eda6c");
		//cap.setCapability(MobileCapabilityType.FULL_RESET,true);
		//cap.setCapability(MobileCapabilityType.NO_RESET,true);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
		cap.setCapability(MobileCapabilityType.APP,"/Users/yinonwishi/Desktop/Wishi.app");
		//cap.setCapability(IOSMobileCapabilityType.BUNDLE_ID,"com.Wishi.Wishi");
		 
		
		 /*
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"IOS");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.1.2");
		cap.setCapability(MobileCapabilityType.APP,"/Users/yinonwishi/Desktop/Wishi.ipa");
		cap.setCapability(MobileCapabilityType.UDID,"b5b85aa834a29d1e90a5a0e1400c955235431104");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
		cap.setCapability(IOSMobileCapabilityType.XCODE_ORG_ID,"6Q9ZW4BRCA");
		cap.setCapability(IOSMobileCapabilityType.XCODE_SIGNING_ID,"iPhone Developer");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 5000);
		//cap.setCapability("startIWDP", true);
*/
		try
		{
			driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub") ,cap);
		}
		catch (MalformedURLException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		return driver;
	}
	public static  AppiumDriver<WebElement>capabileties2() throws MalformedURLException   
	{
		configFileReader= new ConfigFileReader();
		DesiredCapabilities cap = new DesiredCapabilities();
		//if (device.equals("emulator"))
		//{
		///*
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone XS");
		//	}
		//else if (device.equals("real"))
		//{
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		//}

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"IOS");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.1");
		//cap.setCapability(MobileCapabilityType.UDID,"4acfefaa5a78272eb509b64a2f2efffabd0eda6c");
		//cap.setCapability(MobileCapabilityType.FULL_RESET,true);
		//cap.setCapability(MobileCapabilityType.NO_RESET,true);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
		cap.setCapability(MobileCapabilityType.APP,"/Users/yinonwishi/Desktop/Wishi-Stylist.app");
		//cap.setCapability(IOSMobileCapabilityType.BUNDLE_ID,"com.Wishi.Wishi");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 5000);
		cap.setCapability("startIWDP", true);
		
		// */
		/*
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"IOS");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.1.2");
		cap.setCapability(MobileCapabilityType.APP,"/Users/yinonwishi/Desktop/Wishi-Stylist.ipa");
		//cap.setCapability(MobileCapabilityType.APP, "/Users/yinonwishi/Library/Developer/Xcode/DerivedData/Wishi-Stylist-gmypwqjalcvhiugnlrbgvalidhmt/Build/Products/Debug-iphoneos/");
		cap.setCapability(MobileCapabilityType.UDID,"b5b85aa834a29d1e90a5a0e1400c955235431104");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
		cap.setCapability(IOSMobileCapabilityType.XCODE_ORG_ID,"6Q9ZW4BRCA");
		cap.setCapability(IOSMobileCapabilityType.XCODE_SIGNING_ID,"iPhone Developer");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 5000);
		//cap.setCapability("startIWDP", true);
		*/

		try
		{
			driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub") ,cap);
		}
		catch (MalformedURLException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		return driver;
	}
	@BeforeTest()
	public void setup() throws MalformedURLException
	{
		capabileties();

	}

}
