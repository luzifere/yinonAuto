package Tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dataProvider.ConfigFileReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest 
{
	ConfigFileReader configFileReader;
	AndroidDriver<AndroidElement> driver;
	public AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException 
	{
		
		configFileReader= new ConfigFileReader();
		DesiredCapabilities cap = new DesiredCapabilities();
		if (device.equals("emulator"))
		{
			
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus1");    
		}
		else if(device.equals("real"))
		{
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		}
		cap.setCapability(MobileCapabilityType.NO_RESET,true);
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		driver = new AndroidDriver<>(new URL ("http://127.0.0.1:4723/wd/hub") ,cap);
		return driver;

	}
	@BeforeTest()
	public void setup() throws MalformedURLException
	{
		Capabilities("real");
		driver.get(configFileReader.getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
