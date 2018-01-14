package Tests.system;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends BaseChrome {
	@Test()
	public static void Login() throws MalformedURLException, InterruptedException 
	{
		AndroidDriver<AndroidElement> driver =Capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://stage.wishi.me/app/");
		driver.findElement(By.xpath("//div//p[@class='header-link-text']")).click();
		driver.findElement(By.xpath("//div//input[@id='signInEmail']")).sendKeys("yinon@wishi.me");
		driver.findElement(By.xpath("//div//input[@id='signInPass']")).sendKeys("156523784");
		driver.findElement(By.xpath("//div//input[@value='Log in']")).click();
		
	}
}
