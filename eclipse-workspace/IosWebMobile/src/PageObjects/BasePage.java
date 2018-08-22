package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasePage 
{
	static AppiumDriver<WebElement>driver;
	static String winHandleBefore;
	public BasePage(AppiumDriver <WebElement> _driver)
	{	driver = _driver;
	PageFactory.initElements(_driver, this);
	}
	public void click (WebElement el) 
	{
		el.click();
	}
	public void filltext(WebElement sk ,String text) 
	{
		sk.clear();
		sk.sendKeys(text);
	}
	public void Sleep(int sec){
		try {
			Thread.sleep(sec*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void RefreshPage(AndroidDriver<AndroidElement> driver)
	{
		driver.navigate().refresh();
	}
	public void clear (WebElement el) 
	{
		el.clear();
	}
	public void ElementIsDisplyed (String  elementString) 
	{
		WebElement webElement= driver.findElement(By.xpath(elementString));
		webElement.isDisplayed();
	}
	public boolean ElementDisplay(String elementString) 
	{		
		ElementIsDisplyed(elementString);

		return true;
	}
	public static void ExplicityWaitIsClickable(By by) 
	{ for (int i=0;i<10;i++) 
		try 
	{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
			element.click();
			break;
	} 
	catch (Exception e) 
	{
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

	}
	}
	public static boolean isatpage(String element)  
	{
		try 
		{
			ExplicityWaitIsClickable(By.xpath(element));
			return true;
		}
		catch (Exception errorMessage)
		{
			System.out.println(errorMessage);
			return false;
		}
	}
	public void switchWindow() 
	{
		winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) 
		{
			driver.switchTo().window(winHandle);
			System.out.println("winHandleBefore: " +winHandleBefore);
			System.out.println("winHandle: " +winHandle);
		}
	}
	public void scrollDown()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,450)", "");
	}
	public void returnToWindow() {
		driver.close();
		driver.switchTo().window(winHandleBefore);
	}
	public void RefreshPage()
	{
		driver.navigate().refresh();
		Sleep(250);
	}
	public void SwitchToFrame(int num)
	{
		driver.switchTo().frame(num);
	}
	
	public static void AcceptAlert() 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver,2);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
}
