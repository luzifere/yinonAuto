package WishiTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BestMatchPage;
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
		login.Sleep(200);
		String winhandleBefore = driver.getWindowHandle();
		login.ClickLoginButton();
		login.Sleep(200);
		login.ClickLoginWithFacbook();
		login.Sleep(300);
		login.switchWindow();
		login.FillusernameOfFacbook("yinonwishifb1@gmail.com");
		login.FillPasswordOfFacbook("Wishime1");
		login.ClickLoginButtonOfFacbook();
		driver.switchTo().window(winhandleBefore);
		login.MyBookingDisplay();
		login.close();
	}

}
