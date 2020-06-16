package Tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import dataProvider.ConfigFileReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest1 
{
	ConfigFileReader configFileReader;
	protected AndroidDriver<AndroidElement> driver;
	public AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException 
	{
		
		configFileReader= new ConfigFileReader();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.NO_RESET,true);
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		cap.setCapability("autoGrantPermissions", "true"); 
		cap.setCapability("autoAcceptAlerts", "true");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("w3c", false);
		cap.merge(chromeOptions);
		cap.setCapability("chromedriverExecutable","/Users/yinonwishi/Desktop/CromeDriver/chromedriver");

		driver = new AndroidDriver<>(new URL ("http://127.0.0.1:4723/wd/hub") ,cap);
		return driver;

	}
	@BeforeTest()
	public void setup() throws MalformedURLException
	{
		Capabilities();
		driver.get(configFileReader.getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
