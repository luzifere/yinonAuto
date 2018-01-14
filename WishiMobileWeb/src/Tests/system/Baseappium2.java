package Tests.system;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseappium2 {

	public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException 
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		if (device.equals("emulator"))
		{
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
		}
		else if (device.equals("real"))
		{
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		}
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"IOS");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
		cap.setCapability(MobileCapabilityType.APP,"/Users/yinonwishi/Desktop/UICatalog.app");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL ("http://127.0.0.1:4723/wd/hub") ,cap);
		return driver;

	}

}
