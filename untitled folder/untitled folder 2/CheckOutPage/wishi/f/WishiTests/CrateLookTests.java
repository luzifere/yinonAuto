package WishiTests;

import java.util.Random;

import javax.swing.LookAndFeel;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.CrateLookPage;
import PageObject.LoginPage;

public class CrateLookTests extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	   public void LoginAsStylist() 
		{
			LoginPage login = new LoginPage(driver);
			login.ClickLoginButton();
			Assert.assertTrue(login.ElementDisplay("//div//input[@value='Log in']"));
			login.doLogin("clea+4@wishi.me", "Wishime1");
			

		}
	@Test(priority = 2,groups={"sanity-group"})
	public void CrateRegularLook ()
	{
		CrateLookPage look = new CrateLookPage(driver);
		look.CrateLook();
		look.ClickShop();
		look.SelectItem("[5]");
		look.DragDropItems("[5]");
		look.SelectItem("[6]");
		look.DragDropItems("[6]");
		look.SelectItem("[7]");
		look.DragDropItems("[7]");
		look.ClickSave();
		driver.findElement(By.xpath("//textarea[@id='TextArea']")).click();
		//CrateLookPage.ExplicityWaitIsClickable(By.xpath("//div//textarea[@id='TextArea']"));
		driver.findElement(By.xpath("//textarea[@id='TextArea']")).sendKeys("test");
		//look.FillDescription("test");
		CrateLookPage.ExplicityWaitIsClickable(By.xpath("//button[@class='save ng-binding']"));
		Assert.assertTrue(look.ElementDisplay("//button[@class='input_btn']"));
		
	}
	
	@Test(priority = 3,groups={"sanity-group"})
	public void PersonalShopping ()
	{
		CrateLookPage look = new CrateLookPage(driver);
		look.ClickNewLook();
		look.ClickShop();
		look.SelectLayoutTabs("[2]");
		look.SelectItem("[5]");
		look.DragDropItems("[5]");
		look.SelectItem("[6]");
		look.DragDropItems("[6]");
		look.SelectItem("[7]");
		look.DragDropItems("[7]");
		look.ClickSave();
		look.ClickSaveOfDescription();
		look.ClickDescriptionPS();
		look.FillDescriptionPS("test");
		CrateLookPage.ExplicityWaitIsClickable(By.xpath("//button[@class='save ng-binding']"));
		//look.ClickSaveOfDescription();
		Assert.assertTrue(look.ElementDisplay("//button[@class='input_btn']"));
		driver.quit();

	}
	
	
	

}
