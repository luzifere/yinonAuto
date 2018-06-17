package PageObjects;

import java.util.HashMap;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.touch.offset.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSTouchAction;

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
		sk.sendKeys(text);
	}
	public void filltextclear(WebElement sk ,String text) 
	{
		Sleep(200);
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

	public boolean ElementDisplay(String elementString) 
	{		
		WebElement webElement= driver.findElement(By.xpath(elementString));
		//webElement.isDisplayed();
		if(webElement.isDisplayed()) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean ElementEnable(String elementString) 
	{		
		WebElement webElement= driver.findElement(By.xpath(elementString));
		return webElement.isEnabled();
		//if(webElement.isEnabled()) 
		//{
		//	return true;
		//	}
		//	else 
		///	{
		//	return false;
		//}

	}
	public boolean ElementDisplayed(String elementString) 
	{		
		WebElement webElement= driver.findElement(By.xpath(elementString));
		return webElement.isDisplayed();
	}
	
	
	
	
	
	public void WaitElementClickable(By by) 
	{		
		WebElement myDynamicElement = (new WebDriverWait(driver, 80))
		.until(ExpectedConditions.elementToBeClickable(by));
		myDynamicElement.click();
	}
	public void WaitElementNotDisplay(By by) 
	{		
		Boolean myDynamicElement = (new WebDriverWait(driver, 80))
				.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(by)));
	}
	public void WaitElementDisplay (By by) 
	{		
		WebElement myDynamicElement = (new WebDriverWait(driver, 80))
		.until(ExpectedConditions.presenceOfElementLocated(by));
		//return myDynamicElement.isDisplayed();
	}
	
	
	
	public void clear (WebElement el) 
	{
		el.clear();
	}
	public void clickEnter () 
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER);
	}

	public void clicktTab () 
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB);
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
	public static void ExplicityWaitIsVisibilety(By by) 
	{ for (int i=0;i<10;i++) 
		try 
	{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement element = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			element.isDisplayed();
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
	public void ContextToWebView() 
	{

		while (true) 
		{
			try

			{Set<String> contexName1 = driver.getContextHandles();
			for(String webview : contexName1) 
			{
				System.out.println(webview);
				if (webview.contains("WEBVIEW"))
				{
					System.out.println(webview);
					driver.context(webview); 
					return;
				}
			}
			Sleep(300);
			}
			catch (Exception e) 
			{
				ContextToWebView();
			}
		}
	}
	public void ContextTonativView() 
	{

		while (true) 
		{
			try

			{Set<String> contexName1 = driver.getContextHandles();
			for(String webview : contexName1) 
			{
				System.out.println(webview);
				if (webview.contains("NATIVE_APP"))
				{
					System.out.println(webview);
					driver.context(webview); 
					return;
				}
			}
			Sleep(300);
			}
			catch (Exception e) 
			{
				ContextTonativView();
			}





			//String webview = driver.getContext();
			//while (webview!= "")
			//{
			//System.out.println(webview);
			//driver.context(webview);
			//	Sleep(500);
			//	Set<String> ContexName = driver.getContextHandles();
			//	for (String Contex : ContexName)
			//	{
			//	System.out.println(Contex);
			//	if (Contex.contains("WEBVIEW"))
			//	{
			//	System.out.println(Contex);
			//	driver.context(Contex);
			//	}
			//}
			//}
		}


	}
	public void switchWindow() 
	{
		this.winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) 
		{
			driver.switchTo().window(winHandle);
		}
	}

	public void returnToWindow() 
	{
		driver.close();
		driver.switchTo().window(winHandleBefore);
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
	public static void DismissAlert() 
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver,2);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
	public void CheckIfElementEnabled(String  elementString) 
	{
		WebElement webElement= driver.findElement(By.xpath(elementString));
		if(webElement.isEnabled())
		{
			System.out.print("Element is enabled. Take your action.\n");
		}
		else
		{
			System.out.print("Element is disabled. Take your action.\n");
		}
	}

	public void scrollDownXpath()
	{
		/*
		org.openqa.selenium.Dimension size = BasePage.driver.manage ().window ().getSize ();
		int startX = size.getWidth () / 2;
		int startY = size.getHeight () / 2;
		int endX = 0;
		int endY = (int) (startY * -1 * 0.75);
		IOSTouchAction press = new IOSTouchAction(driver);
		press.press(PointOption.point(startX, startY)).moveTo(PointOption.point (endX, endY)).release ().perform ();
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
	}
	public void scrollUp()
	{
		/*
		org.openqa.selenium.Dimension size = BasePage.driver.manage ().window ().getSize ();
		int startX = size.getWidth () / 2;
		int startY = size.getHeight () / 2;
		int endX = 0;
		int endY = (int) (startY * 1 * 0.75);
		IOSTouchAction press = new IOSTouchAction(driver);
		press.press(PointOption.point(startX, startY)).moveTo(PointOption.point (endX, endY)).release ().perform ();
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "up");
		js.executeScript("mobile: scroll", scrollObject);
	}

	public void ScrollLeft() 
	{
		org.openqa.selenium.Dimension size = BasePage.driver.manage ().window ().getSize ();
		int startX = size.getWidth () / 3;
		int startY = size.getHeight () / 3;
		int endX = 0;
		int endY = (int) (startY * -1 * 0.75);
		IOSTouchAction press = new IOSTouchAction(driver);
		press.press(PointOption.point(startX, startY)).moveTo(PointOption.point (endY,endX)).release ().perform ();
	}
	public void SelectImage1(int x,int y) 
	{
		IOSTouchAction press = new IOSTouchAction(driver);
		press.press(PointOption.point(x,y)).perform();
	}
	public void SelectImage2(int x,int y) 
	{
		IOSTouchAction press = new IOSTouchAction(driver);
		press.longPress(PointOption.point(x,y)).perform();
	}
	public void SelectImage3(int x,int y) 
	{
		IOSTouchAction press = new IOSTouchAction(driver);
		press.tap(PointOption.point(x,y)).perform();
	}	

	public void stam(int x,int y)
	{

		IOSTouchAction press = new IOSTouchAction(driver);
		press.tap(PointOption.point(x,y)).perform();	
	}


}







