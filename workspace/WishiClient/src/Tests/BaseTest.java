package Tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest 
{
	static IOSDriver <IOSElement>driver;
	public static  IOSDriver <IOSElement> capabileties() throws MalformedURLException   
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		//if (device.equals("emulator"))
		//{
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
		//	}
		//else if (device.equals("real"))
		//{
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		//}

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"IOS");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
		cap.setCapability(MobileCapabilityType.APP,"/Users/yinonwishi/Desktop/UICatalog.app");
		driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub") ,cap);
		return driver;
	}
	@BeforeTest()
	public void setup() throws MalformedURLException
	{
		capabileties();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
