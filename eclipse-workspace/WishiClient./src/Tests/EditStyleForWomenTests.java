package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.BestMutch;
import PageObjects.LoginPage;
import PageObjects.SettingPage;
import PageObjects.SignUpPage;
import io.appium.java_client.MobileBy;



@Listeners(Tests.Listener.class)

public class EditStyleForWomenTests extends BaseTest4
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
		best.ClickNextbutton();
		best.ClickFamle();
		best.SelectBodyType("FIT");
		best.ClickNextbutton();
		best.ClickBacklCient();
		best.ClickNextbutton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickNextbutton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.SelectBrands("GAP");
		best.ClickNextbutton();
		best.WaitElementDisplay(By.xpath("//*[@name='So, to recap ']"));
		best.ClickNextbutton();
		sign.Sleep(200);
		best.CheckIfElementEnabled("//*[@name='Your Stylists Match!']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='Your Stylists Match!']"));
		best.scrollDownXpath();
		best.CloseBestMatch();
		best.Sleep(500);
		BestMutch.AcceptAlert();
		best.Sleep(500);
		BestMutch.AcceptAlert();
		//best.SelectImage2(250,450);
		SettingPage setting = new SettingPage(driver);
		setting.ClickMeTab();
		setting.ClickSettingButton();
	}
	//@Test(priority = 5,groups={"sanity-group"})
	public void EditStyle() 
	{
		SettingPage setting = new SettingPage(driver);
		//setting.ClickEditStyleTab();
		setting.ClickStyle();
		setting.Sleep(150);
		//setting.SelectFromPicker("Boho");
		setting.SelectFromPicker("Classic");
		setting.ClickDoneOfPicker();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		setting.Sleep(200);
		Assert.assertTrue(setting.ElementDisplay("//*[contains(@name, 'Bold') or contains(@name, 'Classic')]"));
	}
	//@Test(priority = 3,groups={"sanity-group"})
	public void EditBodyType() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.ClickBodyTypeTab();
		setting.SelectFromPicker("Reverse Triangle");
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Reverse Triangle']"));
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
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void EditSize() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.ClickEditStyleTab();
		setting.ClickSize();
		setting.ClickTopSize();
		setting.SelectFromPicker("XS");
		setting.ClickJeansSize();
		setting.SelectFromPicker("24");
		//setting.ClickDone();
		//setting.ClickSize();
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
	public void EditHighlights() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.ClickHighlights();
		setting.SelectFromPicker("Arms");
		setting.ClickDoneOfPicker();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Arms']"));
		setting.ClickPreferences();
		setting.SelectFromPicker("Healthy mix of both");
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Healthy mix of both']"));
	}
	@Test(priority = 7,groups={"sanity-group"})
	public void EditHeels() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.ClickHeels();
		setting.SelectFromPicker("Always");
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Always']"));
	}
	@Test(priority = 8,groups={"sanity-group"})
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
	}
	@Test(priority = 8,groups={"sanity-group"})
	public void EditJeans() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.scrollDownXpath();
		setting.ClickJeans();
		setting.SelectFromPickerJeans("Flair");
		//setting.SelectJeans("Skinny");
		setting.ClickDone();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		setting.scrollDownXpath();
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Flair']"));
	}
	@Test(priority = 9,groups={"sanity-group"})
	public void EditFabric() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.ClickEditStyleTab();
		setting.scrollDownXpath();
		setting.ClickFabric();
		setting.Sleep(200);
		setting.SelectFromPickerFabric("Fur");
		setting.ClickDoneOfPicker();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		setting.scrollDownXpath();
		Assert.assertTrue(setting.ElementEnable("//*[@name='Fur']"));
	}
	@Test(priority = 10,groups={"sanity-group"})
	public void EditBudget() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.scrollDownXpath();
		setting.ClickBudget();
		setting.SelectFromPicker("2");
		setting.SelectFromPicker("0");
		setting.SelectFromPicker("0");
		setting.ClickToolBarDone();
		//setting.ClickBackButton();
		//setting.ClickEditStyleTab();
		//setting.scrollDownXpath();
		//setting.Sleep(600);
		//Assert.assertTrue(setting.ElementDisplay("//*[@value='200']"));
	}
	@Test(priority = 11,groups={"sanity-group"})
	public void EditColor() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.scrollDownXpath();
		setting.ClickColor();
		setting.SelectFromPickerColor("Black");
		setting.SelectFromPickerColor("Green");
		setting.ClickDoneOfPicker();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		setting.scrollDownXpath();
		Assert.assertTrue(setting.ElementEnable("//*[@name='Black']"));
	}
	@Test(priority = 12,groups={"sanity-group"})
	public void EditJewelry() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.scrollDownXpath();
		setting.ClickJewelry();
		setting.SelectFromPicker("Silver");
		setting.ClickDoneOfPicker();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		setting.scrollDownXpath();
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Silver']"));
	}
	@Test(priority = 13,groups={"sanity-group"})
	public void EditZone() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.scrollDownXpath();
		setting.ClickZone();
		setting.SelectFromPicker("Close to my style");
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		setting.scrollDownXpath();
		setting.scrollDownXpath();
		Assert.assertTrue(setting.ElementDisplay("//*[@name='Close to my style']"));
	}
	//@Test(priority = 14,groups={"sanity-group"})
	public void EditBrands() 
	{
		SettingPage setting = new SettingPage(driver);
		setting.scrollDownXpath();
		setting.ClickBrands();
		setting.Sleep(200);
		driver.findElement(By.xpath("(//*[@name='BrandViewID'])[6]")).click();
		setting.Sleep(200);
		setting.ClickDoneOfPicker();
		setting.ClickBackButton();
		setting.ClickEditStyleTab();
		setting.scrollDownXpath();
		setting.scrollDownXpath();
		Assert.assertTrue(setting.ElementDisplay("//*[contains(@name,'Adidas')]"));
	}
	@Test(priority = 15,groups={"sanity-group"})
	public void EditSocialMedia() 
	{
		SettingPage setting = new SettingPage(driver);
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
		driver.resetApp();


	}

}
