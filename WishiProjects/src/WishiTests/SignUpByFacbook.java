package WishiTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BookingPage;
import PageObject.LoginPage;
import PageObject.SignUpPage;
@Listeners(WishiTests.Listener.class)
public class SignUpByFacbook extends BaseTest
{
	@Test(priority = 5,groups={"sanity-group"})
	public void SignUpWithFacbook()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.waitForPageLoaded();
		//signup.Sleep(1000);
		String winhandleBefore = driver.getWindowHandle();
		signup.ClickOnSignUpEmail();
		signup.ConnectWithFB();
		signup.Sleep(200);
		signup.switchWindow();
		driver.manage().window().maximize();
		signup.FillusernameOfFacbook("yinonwishi@gmail.com");
		signup.FillPasswordOfFacbook("inonab1565");
		signup.ClickLoginButtonOfFacbook();
		signup.Sleep(300);
		driver.switchTo().window(winhandleBefore);
		//signup.switchWindow();
		Assert.assertTrue(signup.ElementDisplay("//div//span[text()[contains(.,'My Bookings')]]"));
		driver.quit();

	}


}
