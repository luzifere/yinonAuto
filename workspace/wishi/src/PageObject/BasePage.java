package PageObject;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,450)", "");
	}
	public void scrollUp()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-250)", "");
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

	public void returnToWindowdefault() {
		driver.close();
		driver.switchTo().defaultContent();
	}


}
