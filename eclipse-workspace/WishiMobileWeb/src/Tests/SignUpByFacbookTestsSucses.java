package Tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;





@Listeners(Tests.Listener.class)
public class SignUpByFacbookTestsSucses extends BaseTest1
{
	@Test(priority = 5,groups={"sanity-group"})
	public void SignUpWithFacbook()
	{
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		signup.waitForPageLoaded();
		//signup.Sleep(1000);
		String winhandleBefore = driver.getWindowHandle();
		signup.ClickOnSignUpEmail();
		signup.ConnectWithFB();	
		signup.Sleep(200);
		signup.switchWindow();
		signup.FillusernameOfFacbook("yinonwishifb1@gmail.com");
		signup.FillPasswordOfFacbook("Wishime1");
		signup.ClickLoginButtonOfFacbook();
		signup.Sleep(300);
		driver.switchTo().window(winhandleBefore);
		signup.LetsGetStylingBuutton();
		signup.close();
	}

}
