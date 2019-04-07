package WishiTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BookingPage;
import PageObject.LoginPage;
import PageObject.SignUpPage;
@Listeners(WishiTests.Listener.class)
public class SignUpByFacbook extends BaseTest
{
	@Test(priority = 5,groups={"sanity-group"})
	public void SignUpWithFacbook()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.waitForPageLoaded();
		//signup.Sleep(1000);
		String winhandleBefore = driver.getWindowHandle();
		signup.ClickOnSignUpEmail();
		signup.WaitElementDisplay(By.xpath("//div[@class='fb ng-binding ng-isolate-scope']"));
		signup.ConnectWithFB();
		signup.ConnectWithFB();
		signup.Sleep(200);
		signup.switchWindow();
		//driver.manage().window().maximize();
		signup.FillusernameOfFacbook("yinonwishifb@gmail.com");
		signup.FillPasswordOfFacbook("Wishime1");
		signup.ClickLoginButtonOfFacbook();
		//driver.findElement(By.xpath("(//div//button[@type='submit'])[1]")).click();
		signup.Sleep(300);
		driver.switchTo().window(winhandleBefore);
		//signup.switchWindow();
		Assert.assertTrue(signup.ElementDisplay("//div//span[text()[contains(.,'My Bookings')]]"));
		signup.Sleep(300);
		signup.close();

	}


}
