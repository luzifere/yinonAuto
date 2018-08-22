package Tests.system;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basicsappium extends Baseappium {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		AndroidDriver<AndroidElement> driver =Capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
	}
}
