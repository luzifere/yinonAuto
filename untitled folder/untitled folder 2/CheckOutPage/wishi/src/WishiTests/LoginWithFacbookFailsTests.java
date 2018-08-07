package WishiTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BookingPage;
import PageObject.LoginPage;

public class LoginWithFacbookFailsTests extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void LoginWitoutUserAndPassword ()
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.WaitElementDisplay(By.xpath("//div[@class='fb ng-binding ng-isolate-scope']"));
		login.ClickLoginWithFacbook();
		login.Sleep(300);
		driver.manage().window().maximize();
		login.switchWindow();
		login.ClickLoginButtonOfFacbook();
		Assert.assertTrue(login.ElementDisplay("//div[@class='fsl fwb fcb']"));
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void LoginWitoutUser ()
	{
		LoginPage login = new LoginPage(driver);
		login.RefreshPage();
		login.switchWindow();
		login.FillPasswordOfFacbook("inonab1565");
		login.ClickLoginButtonOfFacbook();
		Assert.assertTrue(login.ElementDisplay("//div[@class='fsl fwb fcb']"));
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void LoginWitoutPassword()
	{
		LoginPage login = new LoginPage(driver);
		login.RefreshPage();
		login.switchWindow();
		login.FillusernameOfFacbook("luzifere@gmail.com");
		login.ClickLoginButtonOfFacbook();
		Assert.assertTrue(login.ElementDisplay("//div[@class='fsl fwb fcb']"));
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void LoginWithFacbookWrongPassword()
	{
		LoginPage login = new LoginPage(driver);
		login.switchWindow();
		login.FillusernameOfFacbook("luzifere@gmail.com");
		login.FillPasswordOfFacbook("inonakjhgjhgb1565");
		login.ClickLoginButtonOfFacbook();
		//login.ClickLoginButtonOfFacbook();
		Assert.assertTrue(login.ElementDisplay("//div[@class='fsl fwb fcb']"));
	}
	@Test(priority = 5,groups={"sanity-group"})
	public void LoginWithFacbookWrongUserName ()
	{
		LoginPage login = new LoginPage(driver);
		login.switchWindow();
		login.FillusernameOfFacbook("luzifere@gmail.com");
		login.FillPasswordOfFacbook("inonakjhgjhgb1565");
		login.ClickLoginButtonOfFacbook();
		//login.ClickLoginButtonOfFacbook();
		Assert.assertTrue(login.ElementDisplay("//div[@class='fsl fwb fcb']"));
		//driver.quit();

	}

}
