package Tests.system;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class IosAppium 
{
	IOSDriver <IOSElement>driver;
	public IOSDriver <IOSElement> capabileties() throws MalformedURLException  
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
		IOSDriver <IOSElement>driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub") ,cap);
		return driver;


	}

}
