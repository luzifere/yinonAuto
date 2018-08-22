package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.BestMutch;
import PageObjects.LoginPage;
import PageObjects.SettingPage;
import PageObjects.SignUpPage;



@Listeners(Tests.Listener.class)

public class EditStyleForMenTests extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void DoSignUp()
	{
		Random num = new Random();
		int number = 35600;
		for (int counter = 5800; counter<=100000;counter++)
			number = num.nextInt(7000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestftt@wishi.com" , "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickMale();
		best.fillBirthday("45");
		best.ClickNextbutton();
		best.SelectNormal();
		sign.Sleep(150);
		best.SelectNormal();
		sign.Sleep(800);
		best.Selectinspiration();
		sign.Sleep(200);
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		sign.Sleep(200);
		best.SelectBrands();
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		best.CheckIfElementEnabled("//*[@name='viewProfileButtonID']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='viewProfileButtonID']"));
		best.scrollDownXpath();
		best.ClickMoreStylistsButton();
		best.Sleep(500);
		BestMutch.AcceptAlert();
		best.Sleep(500);
		BestMutch.AcceptAlert();
		//best.SelectImage2(250,450);
		SettingPage setting = new SettingPage(driver);
		setting.ClickMeTab();
		setting.ClickSettingButton();
		setting.ClickEditStyleTab();
	}
	//@Test(priority = 2,groups={"sanity-group"})
	public void EditStyle() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.ClickStyle();
		setting.SelectFromPicker("Sporty");
		setting.SelectFromPicker("Bold");
		setting.ClickDoneOfPicker();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		//setting.CheckIfElementEnabled("//*[@name='Sporty, Bold']");
		//String style = driver.findElement(By.xpath("//*[@name='Sporty, Bold']")).getText();
		//System.out.print(style);
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Sporty, Bold']"));
	}
	@Test(priority = 5,groups={"sanity-group"})
	public void EditBodyType() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.ClickBodyTypeTab();
		setting.SelectFromPicker("Athletic");
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		//setting.CheckIfElementEnabled("//*[@name='Sporty, Bold']");
		//String fit = driver.findElement(By.xpath("//*[@name='Athletic']")).getText();
		//	System.out.print(fit);
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Athletic']"));
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void EditHeight() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.ClickHeight();
		setting.SelectFromPicker("Tall");
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Tall']"));
		//setting.ClickHighlights();
		//setting.SelectFromPicker("Arms");
		//setting.ClickDoneOfPicker();
		//setting.ClickPreferences();
		//setting.SelectFromPicker("Healthy mix of both");
		//setting.ClickHeels();
		//setting.SelectFromPicker("Always");
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void EditSize() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.ClickSize();
		setting.ClickTopSize();
		setting.SelectFromPicker("XS");
		setting.ClickJeansSize();
		setting.SelectFromPicker("24");
		setting.ClickDressSize();
		setting.SelectFromPicker("S");
		setting.ClickSoesSize();
		setting.SelectFromPicker("5");
		setting.ClickDone();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Top:XS, Jeans:24, Dress:S, Shoes:5']"));
	}
	@Test(priority = 6,groups={"sanity-group"})
	public void EditFitTop() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.ClickFitTop();
		setting.SelectFromPicker("Loose");
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Loose']"));
	}
	@Test(priority = 7,groups={"sanity-group"})
	public void EditFitBottom() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.ClickFitBottom();
		setting.SelectFromPicker("Straight");
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Straight']"));
		//setting.ClickJeans();
		//setting.SelectJeans("Flair");
		//setting.SelectJeans("Skinny");
		//setting.ClickDone();
		//setting.ClickFabric();
		//setting.SelectFromPicker("Fur");
		//setting.SelectFromPicker("Wool");
		//	setting.ClickDoneOfPicker();
		//setting.scrollDownXpath();
	}
	@Test(priority = 8,groups={"sanity-group"})
	public void EditBudget() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.Sleep(200);
		setting.ClickBudget();
		setting.SelectFromPicker("2");
		setting.SelectFromPicker("0");
		setting.SelectFromPicker("0");
		setting.ClickToolBarDone();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		setting.Sleep(600);
		Assert.assertTrue(setting.ElementDisplay("//*[@value='200']"));
	}
	@Test(priority = 9,groups={"sanity-group"})
	public void EditColor() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.ClickColor();
		setting.SelectFromPicker("Black");
		setting.SelectFromPicker("Green");
		setting.ClickDoneOfPicker();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		Assert.assertTrue(setting.ElementEnable("//*[@name='Black']"));
	}
	@Test(priority = 10,groups={"sanity-group"})
	public void EditJewelry() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.ClickJewelry();
		setting.SelectFromPicker("Silver");
		setting.SelectFromPicker("Black");
		setting.ClickDoneOfPicker();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Silver, Black']"));
	}
	@Test(priority = 11,groups={"sanity-group"})
	public void EditZone() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.ClickZone();
		setting.SelectFromPicker("Close to my style");
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		setting.scrollDownXpath();
		setting.scrollDownXpath();
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Close to my style']"));
	}
	@Test(priority = 12,groups={"sanity-group"})
	public void EditBrands() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.scrollDownXpath();
		setting.ClickBrands();
		setting.SelectFromPicker("GAP");
		setting.ClickDoneOfPicker();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		setting.scrollDownXpath();
		setting.scrollDownXpath();
		Assert.assertTrue(setting.ElementDisplay("//*[contains(@name,'GAP')]"));
	}
	@Test(priority = 13,groups={"sanity-group"})
	public void EditSocialMedia() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.scrollDownXpath();
		setting.scrollDownXpath();
		setting.ClickSocialMedia();
		setting.FillPrinterest("printrest");
		setting.ClickDone();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		setting.scrollDownXpath();
		setting.scrollDownXpath();
		Assert.assertTrue(setting.ElementEnable("//*[@name='setting_pinterestboard']"));
		setting.ClickSocialMedia();
		setting.ClearPrinterest();
		setting.FillInstegram("instegram");
		setting.ClickDone();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		setting.scrollDownXpath();
		setting.scrollDownXpath();
		Assert.assertTrue(setting.ElementEnable("//*[@name='setting_instagram']"));
		setting.ClickSocialMedia();
		setting.ClearInstegram();
		setting.FillFacbook("facbook");
		setting.ClickDone();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		setting.scrollDownXpath();
		setting.scrollDownXpath();
		Assert.assertTrue(setting.ElementEnable("//*[@name='setting_facebook']"));
		setting.ClickBackButton();
		//setting.ClickBrands();
		//	setting.SelectImage2(177,741);
		//setting.ClickDoneOfPicker();
		//setting.ClickSocialMedia();
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Settings']"));
		driver.resetApp();


	}

}
