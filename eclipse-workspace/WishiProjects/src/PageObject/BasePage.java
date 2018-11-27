package PageObject;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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

public class BasePage 
{
	static WebDriver driver;
	static String winHandleBefore;



	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

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

	public static boolean isnotatpage(String element)  
	{
		try 
		{
			ExplicityWaitIsvinibaleby(By.xpath(element));
			return true;
		}
		catch (Exception errorMessage)
		{
			return false;
		}
	}
	public void scrollDown()
	{
		Sleep(250);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,450)", "");
	}
	public void scrollUp()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-250)", "");
	}
	public void WaitElementDisplay (By by) 
	{		
		WebElement myDynamicElement = (new WebDriverWait(driver, 60))
		.until(ExpectedConditions.presenceOfElementLocated(by));
		//return myDynamicElement.isDisplayed();
	}
	public void WaitElementNotDisplay(By by) 
	{		
		Boolean myDynamicElement = (new WebDriverWait(driver, 80))
				.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(by)));
	}
	public void WaitElementClickable(By by) 
	{		
		WebElement myDynamicElement = (new WebDriverWait(driver, 80))
		.until(ExpectedConditions.elementToBeClickable(by));
		myDynamicElement.click();
	}

	public void click (WebElement el) 
	{
		el.click();
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
	
	
	
	
	
	public void SwitchToFrame(int num)
	{
		driver.switchTo().frame(num);
	}
	public void returnToWindowdefault() {
		driver.close();
		driver.switchTo().defaultContent();
	}
	
	
	
	
	
	
	
	

	public void ElementIsEnable (String  elementString) 
	{
		WebElement webElement= driver.findElement(By.xpath(elementString));
		webElement.isEnabled();
	}


	public boolean ElementEnable(String elementString) 
	{	
		ExplicityWaitIsClickable(By.xpath(elementString));
		ElementIsEnable(elementString);

		return true;
	}

	public void filltext(WebElement sk ,String text) 
	{
		sk.clear();
		sk.sendKeys(text);
	}

	public String GetText(WebElement we){
		Sleep(2);
		return we.getText();
	}
	public void RefreshPage()
	{
		driver.navigate().refresh();
	}
	public static void ExplicityWaitFraneToBeAvailable(By frameName)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));
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
	public static void ExplicityWaitFillText(By by,String data) 
	{ for (int i=0;i<10;i++) 
		try 
	{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			element.click();
			element.sendKeys(data);
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

	public static void ExplicityWaitIsvinibaleby(By by) 
	{{ for (int i=0;i<10;i++) 
		try 
	{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
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
	}
	
	
	
	




	public void switchWindow() 
	{
		this.winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) 
		{
			driver.switchTo().window(winHandle);
		}
	}

	public void returnToWindow() {
		driver.close();
		driver.switchTo().window(winHandleBefore);
	}
	
	
	
	
	
	
	
	
	
	
	public void Sleep(int sec){
		try {
			Thread.sleep(sec*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void GetFrame (String frame1)
	{
		List <WebElement> framesList = driver.findElements(By.xpath(frame1));
		for(WebElement frame:framesList)
		{
			frame.getAttribute("id");
			System.out.println(frame.getAttribute("id"));
		}
	}

	public void GetElemnts (String element){
		List<WebElement> list = driver.findElements(By.xpath(element));
		System.out.println("all the elements: ");
		for (WebElement el:list) 
		{
			System.out.println(el.getText());
		}
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
	public static void TakeScreenShot() throws IOException
	{
		/*
		Random num = new Random();
		int number = 35600;
		for (int counter = 58000; counter<=100000;counter++)
			number = num.nextInt(7000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		
		try {
			FileUtils.copyFile(scrFile, new File("/Users/yinonwishi/Downloads/screenshoots/"+number+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		String folder_name ="/Users/yinonwishi/Downloads/screenshoots/";
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		SimpleDateFormat df=new SimpleDateFormat("dd-mm-yyyy__hh_mm_ssaa");
		new File(folder_name).mkdir();
		String file_name=df.format(new Date())+".png";
		FileUtils.copyFile(scrFile, new File(folder_name+ "/"+file_name));
		
	}
	public static void quitDriver() 
	{
	    driver.quit();
	    driver = null;
	}
	public static void r ()throws IOException
	{
		String folder_name ="/Users/yinonwishi/Downloads/screenshoots/";
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		SimpleDateFormat df=new SimpleDateFormat("dd-mm-yyyy__hh_mm_ssaa");
		new File(folder_name).mkdir();
		String file_name=df.format(new Date())+".png";
		FileUtils.copyFile(scrFile, new File(folder_name+ "/"+file_name));
	}
	public void close () 
	{
		Sleep(150);
		driver.close();
	}
	public void ScrollTooElement(WebElement element) {


		while (true) 
		{
			if(!element.isDisplayed())
			{
				scrollDown();
				Sleep(500);

			}
			else 
			{
				element.click();
				break;
			}			

		}
	}
	

}
