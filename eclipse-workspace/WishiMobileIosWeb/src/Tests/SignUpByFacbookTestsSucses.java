package Tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(Tests.Listener.class)
public class SignUpByFacbookTestsSucses extends BaseTest37
{
	@Test(priority = 5,groups={"sanity-group"})
	public void SignUpWithFacbook()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.ClickOnSignUpEmail();

		signup.ConnectWithFB();
		signup.Sleep(200);
		signup.switchWindow();	
		signup.FillusernameOfFacbook("yinonwishifb@gmail.com");
		signup.FillPasswordOfFacbook("Wishime1");
		signup.scrollDown();
		signup.ClickLoginButtonOfFacbook();
		signup.Sleep(300);
		signup.switchWindow();
		Assert.assertTrue(signup.ElementDisplay("//div[text()[contains(.,'Your Stylist Match')]]"));
	}

}
