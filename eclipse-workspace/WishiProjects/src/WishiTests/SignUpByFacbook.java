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
		signup.FillusernameOfFacbook("yinonwishifb1@gmail.com");
		signup.FillPasswordOfFacbook("Wishime1");
		signup.ClickLoginButtonOfFacbook();
		signup.Sleep(300);
		driver.switchTo().window(winhandleBefore);
		signup.LetsGetStylingBuutton();
		signup.close();

	}


}
