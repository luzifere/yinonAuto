package draft;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObejecs.LoginPages2;
import Tests.BaseTest1;
import Tests.Listener;




@Listeners(Tests.Listener.class)
public class LoginWithFacbookTestsFail extends BaseTest1
{
	@Test(priority = 2,groups={"sanity-group"})
	public void LoginWithFacbookWrongUserName()
	{
		LoginPages2 login = new LoginPages2(driver);	
		login.FillusernameOfFacbook("yinonwuuishifb@gmail.com");
		login.FillPasswordOfFacbook("Wishime1");
		login.scrollDown();
		login.ClickLoginButtonOfFacbook();
		login.Sleep(200);
		login.WaitElementDisplay(By.xpath("//div[@class='_5yd0 _2ph- _5yd1']"));
		Assert.assertTrue(login.ElementDisplay("//div[@class='_5yd0 _2ph- _5yd1']"));
	}
	@Test(priority = 1,groups={"sanity-group"})
	public void LoginWithFacbookWrongPassword()
	{
		LoginPages2 login = new LoginPages2(driver);
		login.ClickLoginButton();
		login.Sleep(200);
		login.ClickLoginWithFacbook();
		login.Sleep(400);
		login.switchWindow();
		login.FillusernameOfFacbook("yinonwishifb@gmail.com");
		login.FillPasswordOfFacbook("inon44ab1565");
		login.ClickLoginButtonOfFacbook();
		login.Sleep(200);
		//login.WaitElementDisplay(By.xpath("//div[@class='_5yd0 _2ph- _5yd1']"));
		//Assert.assertTrue(login.ElementDisplay("//div[@class='_5yd0 _2ph- _5yd1']"));
	}
}
