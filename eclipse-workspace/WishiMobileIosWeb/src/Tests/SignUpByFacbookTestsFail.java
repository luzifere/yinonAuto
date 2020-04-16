package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(Tests.Listener.class)
public class SignUpByFacbookTestsFail extends BaseTest37
{
	//
	@Test(priority = 2,groups={"sanity-group"})
	public void SignUpWithFacbookWitOutEmail()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.ClickOnSignUpEmail();
		signup.ConnectWithFB();
		signup.Sleep(200);
		signup.switchWindow();
		signup.FillPasswordOfFacbook("inon44ab1565");
		signup.scrollDown();
		signup.ClickLoginButtonOfFacbook();
		signup.Sleep(200);
		signup.WaitElementDisplay(By.xpath("//div[@class='_5yd0 _2ph- _5yd1']"));
		Assert.assertTrue(signup.ElementDisplay("//div[@class='_5yd0 _2ph- _5yd1']"));
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void SignUpWithFacbookWitOutPassword()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.FillusernameOfFacbook("luzifere@gmail.com");
		signup.scrollDown();
		signup.ClickLoginButtonOfFacbook();
		signup.Sleep(200);
		signup.WaitElementDisplay(By.xpath("//div[@class='_5yd0 _2ph- _5yd1']"));
		Assert.assertTrue(signup.ElementDisplay("//div[@class='_5yd0 _2ph- _5yd1']"));
	}
	@Test(priority = 5,groups={"sanity-group"})
	public void SignUpWithFacbookWrongUserName ()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.Sleep(200);
		signup.FillusernameOfFacbook("kjbkjnkjnkjn@gmail.com");
		signup.FillPasswordOfFacbook("inonab1565");
		signup.scrollDown();
		signup.ClickLoginButtonOfFacbook();
		signup.Sleep(200);
		signup.WaitElementDisplay(By.xpath("//div[@class='_5yd0 _2ph- _5yd1']"));
		Assert.assertTrue(signup.ElementDisplay("//div[@class='_5yd0 _2ph- _5yd1']"));
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void SignUpWithFacbookWrongPassword ()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);	
		signup.Sleep(200);
		signup.FillusernameOfFacbook("luzifere@gmail.com");
		signup.FillPasswordOfFacbook("inonab441565");
		signup.Sleep(200);
		signup.scrollDown();
		signup.ClickLoginButtonOfFacbook();
		signup.Sleep(200);
		signup.WaitElementDisplay(By.xpath("//div[@class='_5yd0 _2ph- _5yd1']"));
		Assert.assertTrue(signup.ElementDisplay("//div[@class='_5yd0 _2ph- _5yd1']"));
		
	}

}
