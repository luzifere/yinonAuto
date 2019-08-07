package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObejecs.LoginPages2;




@Listeners(Tests.Listener.class)
public class LoginWithFacbookTests extends BaseTest1
{
	//@Test(priority = 2,groups={"sanity-group"})
	public void LoginWithFacbookWrongUserName()
	{
		LoginPages2 login = new LoginPages2(driver);	
		login.FillusernameOfFacbook("luzifere11@gmail.com");
		login.FillPasswordOfFacbook("inonab1565");
		login.scrollDown();
		login.ClickLoginButtonOfFacbook();
		login.WaitElementDisplay(By.xpath("//div[@class='_5yd0 _2ph- _5yd1']"));
		Assert.assertTrue(login.ElementDisplay("//div[@class='_5yd0 _2ph- _5yd1']"));
	}
	//@Test(priority = 1,groups={"sanity-group"})
	public void LoginWithFacbookWrongPassword()
	{
		LoginPages2 login = new LoginPages2(driver);
		login.ClickLoginButton();
		login.ClickLoginWithFacbook();
		login.Sleep(400);
		login.switchWindow();
		login.FillusernameOfFacbook("luzifere@gmail.com");
		login.FillPasswordOfFacbook("inon44ab1565");
		login.ClickLoginButtonOfFacbook();
		
		Assert.assertTrue(login.ElementDisplay("//div[@class='_5yd0 _2ph- _5yd1']"));
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void LoginWithFacbook()
	{
		LoginPages2 login = new LoginPages2(driver);
		login.ClickLoginButton();
		login.Sleep(200);
		login.ClickLoginWithFacbook();
		login.Sleep(200);
		login.switchWindow();	
		login.FillusernameOfFacbook("luzifere@gmail.com");
		login.FillPasswordOfFacbook("inonab1565");
		login.scrollDown();
		login.ClickLoginButtonOfFacbook();
		login.Sleep(300);
		login.switchWindow();
		Assert.assertTrue(login.ElementDisplay("//div[text()[contains(.,'Your Stylist Match')]]"));
	}

}
