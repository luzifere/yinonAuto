package draft;

import java.net.MalformedURLException;
import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.SignUpPage;
import Tests.BaseTest;



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
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttyaya.best@wishi.com", "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickNextbutton();
		best.ClickMale();
		best.ClickBack();
		best.ClickFamle();
		best.SelectBodyType("FIT");
		best.ClickNextbutton();
		best.ClickBack();
		best.SelectBodyType("TALL");
		best.ClickNextbutton();
		best.ClickLoveItButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickSomtimesButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBack();
		best.ClickLoveItButton();
		best.ClickSomtimesButton();
		best.ClickBack();
		best.ClickSomtimesButton();
		best.ClickSomtimesButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickNextbutton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		//best.ClickBack();
		//best.ClickHellNoButton();
		best.SelectBrands("all saints");
		best.ClickNextbutton();
		//best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='female']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='Fit, Tall']"));
		//Assert.assertTrue(best.ElementDisplay("//*[@name='Fit, Tall']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='all saints']"));
		best.ClickNextbutton();
		best.WaitElementDisplay(By.xpath("//*[@name='Your Stylists Match!']"));
		best.ClickNextbutton();
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
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttyaya.best@wishi.com", "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickNextbutton();
		best.ClickFamle();
		best.ClickBack();
		best.ClickSelfIdentityButtonID();
		best.SelectBodyType("2");
		best.ClickNextbutton();
		best.ClickBack();
		best.SelectBodyType("3");
		best.ClickNextbutton();
		best.ClickLoveItButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickSomtimesButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBack();
		best.ClickLoveItButton();
		best.ClickSomtimesButton();
		best.ClickBack();
		best.ClickSomtimesButton();
		best.ClickSomtimesButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickNextbutton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		//best.ClickBack();
		//best.ClickHellNoButton();
		best.SelectBrands("all saints");
		best.ClickNextbutton();
		//best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='Fluid']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='Fit, Tall']"));
		//Assert.assertTrue(best.ElementDisplay("//*[@name='Fit, Tall']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='all saints']"));
		best.ClickNextbutton();
		best.WaitElementDisplay(By.xpath("//*[@name='Your Stylists Match!']"));
		best.ClickNextbutton();
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
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttyaya.best@wishi.com", "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickNextbutton();
		best.ClickFamle();
		best.ClickBack();
		best.ClickMale();
		best.ClickLoveItButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickSomtimesButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBack();
		best.ClickLoveItButton();
		best.ClickSomtimesButton();
		best.ClickBack();
		best.ClickSomtimesButton();
		best.ClickSomtimesButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickNextbutton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickLoveItButton();
		best.ClickBack();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		//best.ClickBack();
		//best.ClickHellNoButton();
		best.SelectBrands("GAP");
		best.ClickNextbutton();
		//best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='Male']"));
		Assert.assertFalse(best.isElementPresent("//*[@name='Fit, Tall']"));
		//Assert.assertTrue(best.ElementDisplay("//*[@name='Fit, Tall']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='GAP']"));
		best.ClickNextbutton();
		best.WaitElementDisplay(By.xpath("//*[@name='Your Stylists Match!']"));
		best.ClickNextbutton();
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
		best.ClickNextbutton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.ClickHellNoButton();
		best.SelectBrands("2");
		best.ClickNextbutton();
		best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Female')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Fit')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'60% - Classic, 40% - Edgy')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'All saints')]]"));
		best.CheckIfElementEnabled("//*[@name='Your Stylists Match!']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='Your Stylists Match!']"));
		driver.resetApp();
	}
	@Test(priority = 22,groups={"sanity-group"})
	public void BestMatchFeMaleExpensive() throws MalformedURLException
	{
		BaseTest.capabileties();
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttya.best@wishi.com" , "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickFamle();
		best.fillBirthday("45");
		best.ClickNextbutton();
		best.SelectCheapButtonID();
		sign.Sleep(150);
		best.SelectExpensiveButtonID();
		sign.Sleep(150);
		best.Selectinspiration();
		sign.Sleep(200);
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		sign.Sleep(200);
		best.SelectTag("Petite");
		sign.Sleep(200);
		best.ClickNextTags();
		sign.Sleep(200);
		best.SelectBrands();
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		best.CheckIfElementEnabled("//*[@name='Your Stylists Match!']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='Your Stylists Match!']"));
		driver.resetApp();
	}
	@Test(priority = 23,groups={"sanity-group"})
	public void BestMatchFeMaleNormal() throws MalformedURLException
	{
		BaseTest.capabileties();
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttya.best@wishi.com" , "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickFamle();
		best.fillBirthday("45");
		best.ClickNextbutton();
		best.SelectNormal();
		sign.Sleep(150);
		best.SelectNormal();
		sign.Sleep(150);
		best.Selectinspiration();
		sign.Sleep(200);
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		sign.Sleep(200);
		best.SelectTag("Petite");
		sign.Sleep(200);
		best.ClickNextTags();
		sign.Sleep(200);
		best.SelectBrands();
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		best.CheckIfElementEnabled("//*[@name='Your Stylists Match!']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='Your Stylists Match!']"));
		driver.resetApp();
	}
	@Test(priority =24,groups={"sanity-group"})
	public void BestMatchFeMaleCheepExpensive() throws MalformedURLException
	{
		BaseTest.capabileties();
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttya.best@wishi.com" , "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickFamle();
		best.fillBirthday("45");
		best.ClickNextbutton();
		best.SelectCheapButtonID();
		sign.Sleep(150);
		best.SelectExpensiveButtonID();
		sign.Sleep(150);
		best.Selectinspiration();
		sign.Sleep(200);
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		sign.Sleep(200);
		best.SelectTag("Petite");
		sign.Sleep(200);
		best.ClickNextTags();
		sign.Sleep(200);
		best.SelectBrands();
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		best.CheckIfElementEnabled("//*[@name='Your Stylists Match!']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='Your Stylists Match!']"));
		driver.resetApp();
	}
	@Test(priority = 25,groups={"sanity-group"})
	public void BestMatchExpensiveMale() throws MalformedURLException
	{
		BaseTest.capabileties();
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttya.best@wishi.com" , "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickMale();
		best.fillBirthday("45");
		best.ClickNextbutton();
		best.SelectExpensiveButtonID();
		sign.Sleep(150);
		best.SelectExpensiveButtonID();
		sign.Sleep(150);
		best.Selectinspiration();
		sign.Sleep(200);
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		sign.Sleep(200);
		best.SelectBrands();
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		best.CheckIfElementEnabled("//*[@name='Your Stylists Match!']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='Your Stylists Match!']"));
		driver.resetApp();
	}
	@Test(priority = 26,groups={"sanity-group"})
	public void BestMatchNormalMale() throws MalformedURLException
	{
		BaseTest.capabileties();
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttya.best@wishi.com" , "123456");
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
		best.CheckIfElementEnabled("//*[@name='Your Stylists Match!']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='Your Stylists Match!']"));
		driver.resetApp();
	}
	@Test(priority = 7,groups={"sanity-group"})
	public void BestMatchCheepMale() throws MalformedURLException
	{
		BaseTest.capabileties();
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttya.best@wishi.com" , "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickMale();
		best.fillBirthday("45");
		best.ClickNextbutton();
		best.SelectCheapButtonID();
		sign.Sleep(150);
		best.SelectCheapButtonID();
		sign.Sleep(150);
		best.Selectinspiration();
		sign.Sleep(200);
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		sign.Sleep(200);
		best.SelectBrands();
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		best.CheckIfElementEnabled("//*[@name='Your Stylists Match!']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='Your Stylists Match!']"));
		driver.resetApp();
		best.WaitElementDisplay(By.id("signUpButton"));
	}
	@Test(priority = 8,groups={"sanity-group"})
	public void BestMatchSelfIdentity()
	{
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttya.best@wishi.com", "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickSelfIdentityButtonID();
		best.fillBirthday("45");
		best.ClickNextbutton();
		sign.Sleep(150);
		best.Selectinspiration();
		sign.Sleep(200);
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		best.CheckIfElementEnabled("//*[@name='Your Stylists Match!']");
		best.WaitElementDisplay(By.xpath("//*[@name='Your Stylists Match!']"));
		Assert.assertTrue(sign.ElementEnable("//*[@name='Your Stylists Match!']"));
		driver.resetApp();
	}
	@Test(priority = 11,groups={"sanity-group"})
	public void BestMatchCheepFamle()
	{
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitestbesttyaya.best@wishi.com", "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickFamle();
		best.fillBirthday("45");
		best.ClickNextbutton();
		best.SelectCheapButtonID();
		sign.Sleep(150);
		best.SelectCheapButtonID();
		sign.Sleep(150);
		best.Selectinspiration();
		sign.Sleep(200);
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		sign.Sleep(200);
		best.SelectTag("Petite");
		sign.Sleep(200);
		best.ClickNextTags();
		sign.Sleep(200);
		best.SelectBrands();
		best.CheckIfElementEnabled("//*[@name='NextButtonID']");
		best.ClickNextbutton();
		best.CheckIfElementEnabled("//*[@name='Your Stylists Match!']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='Your Stylists Match!']"));
		driver.resetApp();
	}
}
