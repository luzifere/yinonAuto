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
		//look.CrateLook();
		BasePage.ExplicityWaitIsClickable(By.xpath("(//div//button[@class='create-look-btn ng-binding ng-scope'])[1]"));
		CrateLookPage.ExplicityWaitIsClickable(By.xpath("//div//li//a[text()[contains(.,'Shop')]]"));
		//look.SelectClass("Shop");
		CrateLookPage.ExplicityWaitIsClickable(By.xpath("(//DIV//IMG)[21]"));
		//look.SelectItem("[18]");
		look.DragDropItems("[21]");
		look.SelectItem("[23]");
		look.DragDropItems("[23]");
		look.SelectItem("[25]");
		look.DragDropItems("[25]");
		look.ClickSave();
		CrateLookPage.ExplicityWaitIsClickable(By.xpath("//div//textarea[@id='TextArea']"));
		//look.Sleep(20);
		look.FillDescription("test");
		CrateLookPage.ExplicityWaitIsClickable(By.xpath("//button[@class='save ng-binding']"));
		//look.ClickSaveOfDescription();
		Assert.assertTrue(look.ElementDisplay("//button[@class='input_btn']"));
		
		//look.Sleep(50);
		//look.ClickNewLook();
		//look.Sleep(20);
		
	}
	
	@Test(priority = 3,groups={"sanity-group"})
	public void PersonalShopping ()
	{
		CrateLookPage look = new CrateLookPage(driver);
		CrateLookPage.ExplicityWaitIsClickable(By.xpath("//div//button[@class='create-look-btn ng-binding']"));
		CrateLookPage.ExplicityWaitIsClickable(By.xpath("//div//li//a[text()[contains(.,'Shop')]]"));
		//look.SelectClass("Shop");
		BasePage.ExplicityWaitIsClickable(By.xpath("(//DIV//IMG)[21]"));
		//look.Sleep(30);
		look.SelectLayoutTabs("[2]");
		look.SelectItem("[21]");
		look.DragDropItems("[21]");
		look.SelectItem("[23]");
		look.DragDropItems("[23]");
		look.SelectItem("[25]");
		look.DragDropItems("[25]");
		look.ClickSave();
		look.ClickSaveOfDescription();
		look.ClickDescriptionPS();
		look.FillDescriptionPS("test");
		CrateLookPage.ExplicityWaitIsClickable(By.xpath("//button[@class='save ng-binding']"));
		//look.ClickSaveOfDescription();
		Assert.assertTrue(look.ElementDisplay("//button[@class='input_btn']"));
		
	}
	
	
	

}
