package WishiTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BookingPage;
import PageObject.LoginPage;

public class LoginWithFacbookTests extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void LoginWithFacbookWrongUserName()
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.ClickLoginWithFacbook();
		login.Sleep(300);
		login.switchWindow();
		driver.manage().window().maximize();	
		login.FillusernameOfFacbook("luzifere11@gmail.com");
		login.FillPasswordOfFacbook("inonab1565");
		login.ClickLoginButtonOfFacbook();
		Assert.assertTrue(login.ElementDisplay("//div[@class='fsl fwb fcb']"));
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void LoginWithFacbookWrongPassword()
	{
		LoginPage login = new LoginPage(driver);
		login.FillusernameOfFacbook("luzifere@gmail.com");
		login.FillPasswordOfFacbook("inon44ab1565");
		login.ClickLoginButtonOfFacbook();
		Assert.assertTrue(login.ElementDisplay("//div[@class='fsl fwb fcb']"));
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void LoginWithFacbook()
	{
		LoginPage login = new LoginPage(driver);
		login.FillusernameOfFacbook("luzifere@gmail.com");
		login.FillPasswordOfFacbook("inonab1565");
		login.ClickLoginButtonOfFacbook();
		login.switchWindow();
		Assert.assertTrue(login.ElementDisplay("//div//span[text()[contains(.,'My Bookings')]]"));
		driver.quit();

	}

}
