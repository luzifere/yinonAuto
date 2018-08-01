package WishiTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BookingPage;
import PageObject.LoginPage;
import PageObject.SignUpPage;

public class SignUpByFacbook extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void SignUpWithFacbookWrongUserName()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.ConnectWithFB();
		signup.Sleep(200);
		signup.switchWindow();
		driver.manage().window().maximize();		
		signup.FillusernameOfFacbook("luzifere11@gmail.com");
		signup.FillPasswordOfFacbook("inonab1565");
		signup.ClickLoginButtonOfFacbook();
		Assert.assertTrue(signup.ElementDisplay("//div[@class='fsl fwb fcb']"));
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void SignUpWithFacbookWitOutEmail()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.FillPasswordOfFacbook("inon44ab1565");
		signup.ClickLoginButtonOfFacbook();
		Assert.assertTrue(signup.ElementDisplay("//div[@class='fsl fwb fcb']"));
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void SignUpWithFacbookWitOutPassword()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.FillusernameOfFacbook("luzifere@gmail.com");
		signup.ClickLoginButtonOfFacbook();
		Assert.assertTrue(signup.ElementDisplay("//div[@class='fsl fwb fcb']"));
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void SignUpWithFacbookWrongPassword()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.FillusernameOfFacbook("luzifere@gmail.com");
		signup.FillPasswordOfFacbook("inon44ab1565");
		signup.ClickLoginButtonOfFacbook();
		Assert.assertTrue(signup.ElementDisplay("//div[@class='fsl fwb fcb']"));
	}
	@Test(priority = 5,groups={"sanity-group"})
	public void SignUpWithFacbook()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.FillusernameOfFacbook("luzifere@gmail.com");
		signup.FillPasswordOfFacbook("inonab1565");
		signup.ClickLoginButtonOfFacbook();
		signup.Sleep(3);
		signup.switchWindow();
		Assert.assertTrue(signup.ElementDisplay("//div//span[text()[contains(.,'My Bookings')]]"));
		driver.quit();

	}


}
