package WishiTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BookingPage;
import PageObject.LoginPage;
@Listeners(WishiTests.Listener.class)
public class LoginWithFacbookTests extends BaseTest
{
	//String winhandleBefore = driver.getWindowHandle();
	@Test(priority = 1,groups={"sanity-group"})
	public void LoginWithFacbookWrongUserName()
	{
		LoginPage login = new LoginPage(driver);
		login.waitForPageLoaded();
		//login.Sleep(1000);
		String winhandleBefore = driver.getWindowHandle();
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//div[@class='fb ng-binding ng-isolate-scope']"));
		login.ClickLoginWithFacbook();
		login.Sleep(300);
		login.switchWindow();
		//driver.manage().window().maximize();	
		login.FillusernameOfFacbook("yinonwishi@gmail.com");
		login.FillPasswordOfFacbook("inonab1565");
		login.ClickLoginButtonOfFacbook();
		//login.Sleep(600);
		driver.switchTo().window(winhandleBefore);
		//login.switchWindow();
		login.WaitElementDisplay(By.xpath("//div//span[text()[contains(.,'My Bookings')]]"));
		Assert.assertTrue(login.ElementDisplay("//div//span[text()[contains(.,'My Bookings')]]"));
		driver.close();
	}

}