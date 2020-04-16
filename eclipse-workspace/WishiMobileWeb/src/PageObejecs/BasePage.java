package PageObejecs;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BasePage 
{
	public static String winHandleBefore;
	
	static AndroidDriver<AndroidElement> driver;
	public BasePage(AndroidDriver<AndroidElement> _driver)
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
	/*
	public boolean ElementDisplay(String elementString) 
	{		
		ElementIsDisplyed(elementString);

		return true;
	}
	*/
	public static void ExplicityWaitIsClickable(WebElement elementString) 
	{ 
		{
			try

			{

				for (int i=0;i<3;i++) 
					try 
				{
						WebDriverWait wait = new WebDriverWait(driver, 10);
						WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementString));
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
			catch(Exception e)
			{	
				System.err.println("\nError : ExplicityWaitIsClickable failed\n");	
			}
		}
	}
	public static void ExplicityWaitIsDisplayed(WebElement elementString) 
	{ 
		{
			try

			{

				for (int i=0;i<3;i++) 
					try 
				{
						WebDriverWait wait = new WebDriverWait(driver, 35);
						WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementString));
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
			catch(Exception e)
			{	
				System.err.println("\nError : ExplicityWaitIsClickable failed\n");	
			}
		}
	}
	public void clickEnter () 
	{
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
		//((AndroidDriver<AndroidElement>) driver).pressKeyCode(AndroidKeyCode.ENTER);//(new KeyEvent(AndroidKey.ENTER));
		//Actions act = new Actions(driver);
		//act.sendKeys(Keys.ENTER);
	}
	public void clicktTab () 
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB);
	}
	public static boolean isatpage(WebElement element)  
	{
		try 
		{
			ExplicityWaitIsClickable(element);
			return true;
		}
		catch (Exception errorMessage)
		{
			System.out.println(errorMessage);
			return false;
		}
	}
	public boolean isElementPresent(String locatorKey) {
		   try {
			   WebElement webElement= driver.findElement(By.xpath(locatorKey));
		       return true;
		   } catch (org.openqa.selenium.NoSuchElementException e) {
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
	public void returnToWindowdefault() {
		//driver.close();
		driver.switchTo().defaultContent();
	}

	public void scrollDown()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,450)", "");
	}
	public void returnToWindow() {
		//driver.close();
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
	public void waitForPageLoaded() {
		ExpectedCondition<Boolean> expectation = new
				ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
			}
		};
		try {
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(expectation);
		} catch (Throwable error) {
			Assert.fail("Timeout waiting for Page Load Request to complete.");
		}
	}
	public void WaitElementDisplay (WebElement firstName) 
	{		
		(new WebDriverWait(driver, 60))
				.until(ExpectedConditions.visibilityOf(firstName));
	}
	public static void r ()throws IOException
	{
		String folder_name ="/Users/yinonwishi/Downloads/screenshoots";
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		SimpleDateFormat df=new SimpleDateFormat("dd-mm-yyyy__hh_mm_ssaa");
		new File(folder_name).mkdir();
		String file_name=df.format(new Date())+".png";
		FileUtils.copyFile(scrFile, new File(folder_name+ "/"+file_name));
	}
	public static void TakeScreenShot() throws IOException 
	{
		/*
		Random num = new Random();
		int number = 35600;
		for (int counter = 58000; counter<=100000;counter++)
			number = num.nextInt(7000);

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		File target = new File ("/Users/yinonwishi/Downloads/screenshoots/"+number+".png");
		try {
			FileUtils.copyFile(scrFile,target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(target);
	}
		 */

		String folder_name ="/Users/yinonwishi/Downloads/screenshoots";
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		SimpleDateFormat df=new SimpleDateFormat("dd-mm-yyyy__hh_mm_ssaa");
		new File(folder_name).mkdir();
		String file_name=df.format(new Date())+".png";
		FileUtils.copyFile(scrFile, new File(folder_name+ "/"+file_name));
	}
	public void Switch_to_strype () 
	{
		WebElement fr = driver.findElement(By.xpath("//iframe[@title='Secure payment input frame']"));
		driver.switchTo().frame(fr);

	}
	public static boolean ElementDisplay(WebElement elementString) 
	{	
		WebElement webElement= (elementString);

		if(!webElement.isDisplayed())
		{
			return false;
		}
		return true;
		//return ElementIsDisplyed(elementString);
	}
	public void close () 
	{
		Sleep(150);
		driver.close();
	}
}
