package Tests;

import java.net.MalformedURLException;
import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.SignUpPage;



@Listeners(Tests.Listener.class)

public class BestMutch extends BaseTest 
{
	
	@Test(priority = 1,groups={"sanity-group"})
	public void BestMatchFamle()
	{
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.Sleep(200);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttyaya.best@wishi.com", "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickNextbutton();
		best.ClickMale();
		best.ClickBacklCient();
		best.ClickFamle();
		best.SelectBodyType("FIT");
		best.ClickNextbutton();
		best.ClickBacklCient();
		best.SelectBodyType("TALL");
		best.ClickNextbutton();
		best.ClickLoveItButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickSomtimesButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBacklCient();
		best.ClickLoveItButton();
		best.ClickSomtimesButton();
		best.ClickBacklCient();
		best.ClickSomtimesButton();
		best.ClickSomtimesButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickNextbutton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.SelectBrands("All Saints");
		best.ClickNextbutton();
		/*
		best.WaitElementDisplay(By.xpath("//*[@name='So, to recap ']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='female']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='Fit, Tall']"));
		//Assert.assertTrue(best.ElementDisplay("//*[@name='Fit, Tall']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='All Saints']"));
		best.ClickNextbutton();
		*/
		best.WaitElementDisplay(By.xpath("//*[@name='Your Stylists Match!']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='Your Stylists Match!']"));		
		driver.resetApp();
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void BestMatchFluid()
	{
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.Sleep(200);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttyaya.best@wishi.com", "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickNextbutton();
		best.ClickFamle();
		best.ClickBacklCient();
		best.ClickSelfIdentityButtonID();
		best.SelectBodyType("FIT");
		best.ClickNextbutton();
		best.ClickBacklCient();
		best.SelectBodyType("TALL");
		best.ClickNextbutton();
		best.ClickLoveItButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickSomtimesButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBacklCient();
		best.ClickLoveItButton();
		best.ClickSomtimesButton();
		best.ClickBacklCient();
		best.ClickSomtimesButton();
		best.ClickSomtimesButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickNextbutton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.SelectBrands("All Saints");
		best.ClickNextbutton();
		/*
		best.WaitElementDisplay(By.xpath("//*[@name='So, to recap ']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='Fluid']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='Fit, Tall']"));
		//Assert.assertTrue(best.ElementDisplay("//*[@name='Fit, Tall']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='best.SelectBrands(\"All Saints\");']"));
		best.ClickNextbutton();
		*/
		best.WaitElementDisplay(By.xpath("//*[@name='Your Stylists Match!']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='Your Stylists Match!']"));		
		driver.resetApp();
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void BestMatchMale()
	{
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.Sleep(200);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttyaya.best@wishi.com", "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickNextbutton();
		best.ClickFamle();
		best.ClickBacklCient();
		best.ClickMale();
		best.ClickLoveItButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickSomtimesButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBacklCient();
		best.ClickLoveItButton();
		best.ClickSomtimesButton();
		best.ClickBacklCient();
		best.ClickSomtimesButton();
		best.ClickSomtimesButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.SelectBrands("GAP");
		best.ClickNextbutton();
		/*
		best.WaitElementDisplay(By.xpath("//*[@name='So, to recap ']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='Male']"));
		Assert.assertFalse(best.isElementPresent("//*[@name='Fit, Tall']"));
		//Assert.assertTrue(best.ElementDisplay("//*[@name='Fit, Tall']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='GAP']"));
		best.ClickNextbutton();
		*/
		best.WaitElementDisplay(By.xpath("//*[@name='Your Stylists Match!']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='Your Stylists Match!']"));		
		driver.resetApp();
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void BestMatchHellNo()
	{
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.Sleep(200);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttyaya.best@wishi.com", "123456");
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
		best.SelectBodyType("TALL");
		best.ClickNextbutton();
		best.ClickLoveItButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickSomtimesButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickSomtimesButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickSomtimesButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickNextbutton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickBacklCient();
		best.ClickHellNoButton();
		best.ClickNextbutton();
		/*
		best.WaitElementDisplay(By.xpath("//*[@name='So, to recap ']"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Female')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Fit')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'60% - Classic, 40% - Edgy')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'GAP')]]"));
		*/
		best.WaitElementDisplay(By.xpath("//*[@name='Your Stylists Match!']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='Your Stylists Match!']"));		
		driver.resetApp();
	}
}
