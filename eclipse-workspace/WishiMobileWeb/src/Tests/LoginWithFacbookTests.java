package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObejecs.LoginPages;
import PageObejecs.LoginPages2;




@Listeners(Tests.Listener.class)
public class LoginWithFacbookTests extends BaseTest1
{
	@Test(priority = 1,groups={"sanity-group"})
	public void LoginWithFacbookWrongUserName()
	{
		LoginPages2 login = new LoginPages2(driver);
		login.waitForPageLoaded();
		login.Sleep(200);
		String winhandleBefore = driver.getWindowHandle();
		login.ClickLoginButton();
		login.Sleep(200);
		login.ClickLoginWithFacbook();
		login.Sleep(300);
		login.switchWindow();
		//login.RefreshPage();
		login.FillusernameOfFacbook("yinonwishifb1@gmail.com");
		login.FillPasswordOfFacbook("Wishime1");
		login.ClickLoginButtonOfFacbook();
		driver.switchTo().window(winhandleBefore);
		login.MyBookingDisplay();
		login.close();

	}
}
