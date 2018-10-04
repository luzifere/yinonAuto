package WishiTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.UploadItemsPage;
@Listeners(WishiTests.Listener.class)
public class UploadItemTest extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPage login = new LoginPage(driver);
		login.waitForPageLoaded();
		login.ClickLoginButton();
		login.doLogin("wishitesttt@wishi.com1472", "ab1565");
		login.Sleep(200);
	}	
	@Test(priority = 2,groups={"sanity-group"})
	public void Uploaditem()
	{
		UploadItemsPage add =new UploadItemsPage(driver);
		add.ClickAddItem();
		add.WaitElementDisplay(By.xpath("//div //input[@id='file']"));
		add.SelectItem("/Users/yinonwishi/Downloads/8.PNG");
		add.SelectCategory("1");
		add.FillBrand("nike");
		add.Sleep(150);
		add.clickEnter();
		add.SubmitItem();
		add.WaitElementDisplay(By.xpath("//div//p[text()[contains(.,'Your image has been uploaded successfully.')]]"));
		Assert.assertTrue(add.ElementDisplay("//div//p[text()[contains(.,'Your image has been uploaded successfully.')]]"));
		add.Sleep(300);
		add.close();
	}
}
