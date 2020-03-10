package WishiTests.draft;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BookingPage;
import PageObject.LoginPage;
import PageObject.SignUpPage;
import WishiTests.BaseTest;
import WishiTests.Listener;
@Listeners(WishiTests.Listener.class)
public class SignUpByFacbookfailes extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void SignUpWithFacbookWrongUserName()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.waitForPageLoaded();
		//signup.Sleep(1000);
		signup.ClickOnSignUpEmail();
		signup.WaitElementDisplay(By.xpath("//div[@class='fb ng-binding ng-isolate-scope']"));
		signup.Sleep(200);
		signup.ConnectWithFB();
		signup.Sleep(200);
		signup.switchWindow();
		//driver.manage().window().maximize();		
		signup.FillusernameOfFacbook("ariel@gmail.com");
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
		signup.Sleep(300);
		signup.close();
	}



}
