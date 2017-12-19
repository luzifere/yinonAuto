package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpByFacbookTestsSucses extends BaseTest
{
	@Test(priority = 5,groups={"sanity-group"})
	public void SignUpWithFacbook()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.ConnectWithFB();
		signup.Sleep(200);
		signup.switchWindow();	
		signup.FillusernameOfFacbook("luzifere@gmail.com");
		signup.FillPasswordOfFacbook("inonab1565");
		signup.scrollDown();
		signup.ClickLoginButtonOfFacbook();
		signup.Sleep(300);
		signup.switchWindow();
		Assert.assertTrue(signup.ElementDisplay("//div//span[text()[contains(.,'Book A Stylist')]]"));
	}

}
