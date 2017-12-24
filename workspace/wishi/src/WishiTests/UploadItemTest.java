package WishiTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.UploadItemsPage;

public class UploadItemTest extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoLogin() 
	{
		LoginPage login = new LoginPage(driver);
		login.ClickLoginButton();
		login.doLogin("yinon@wishi.me", "156523784");
		login.Sleep(200);
	}	
	@Test(priority = 2,groups={"sanity-group"})
	public void Uploaditem()
	{
		UploadItemsPage add =new UploadItemsPage(driver);
		add.ClickAddItem();
		add.SelectItem("C:\\Users\\Vali\\Desktop\\8.PNG");
		add.SelectCategory("2");
		add.FillBrand("nike");
		add.clickEnter();
		add.SubmitItem();
		Assert.assertTrue(add.ElementDisplay("//div//p[text()[contains(.,'Your image has been uploaded successfully.')]]"));
	}
}
