package Tests;

import java.net.MalformedURLException;
import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.SignUpPage;

public class BestMutch extends BaseTest 
{
	@Test(priority = 1,groups={"sanity-group"})
	public void BestMatchCheepFamle()
	{
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitest.best@wishi.com", "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickFamle();
		best.fillBirthday("12121985");
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
		best.CheckIfElementEnabled("//*[@name='viewProfileButtonID']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='viewProfileButtonID']"));
		driver.resetApp();
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void BestMatchFeMaleExpensive() throws MalformedURLException
	{
		BaseTest.capabileties();
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitest.best@wishi.com" , "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickFamle();
		best.fillBirthday("12121985");
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
		best.CheckIfElementEnabled("//*[@name='viewProfileButtonID']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='viewProfileButtonID']"));
		driver.resetApp();
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void BestMatchFeMaleNormal() throws MalformedURLException
	{
		BaseTest.capabileties();
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitest.best@wishi.com" , "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickFamle();
		best.fillBirthday("12121985");
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
		best.CheckIfElementEnabled("//*[@name='viewProfileButtonID']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='viewProfileButtonID']"));
		driver.resetApp();
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void BestMatchFeMaleCheepExpensive() throws MalformedURLException
	{
		BaseTest.capabileties();
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitest.best@wishi.com" , "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickFamle();
		best.fillBirthday("12121985");
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
		best.CheckIfElementEnabled("//*[@name='viewProfileButtonID']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='viewProfileButtonID']"));
		driver.resetApp();
	}
	@Test(priority = 5,groups={"sanity-group"})
	public void BestMatchExpensiveMale() throws MalformedURLException
	{
		BaseTest.capabileties();
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitest.best@wishi.com" , "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickMale();
		best.fillBirthday("12121985");
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
		best.CheckIfElementEnabled("//*[@name='viewProfileButtonID']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='viewProfileButtonID']"));
		driver.resetApp();
	}
	@Test(priority = 6,groups={"sanity-group"})
	public void BestMatchNormalMale() throws MalformedURLException
	{
		BaseTest.capabileties();
		Random num = new Random();
		int number = 35600;
		for (int counter = 50800; counter<=100000;counter++)
			number = num.nextInt(70000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitest.best@wishi.com" , "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickMale();
		best.fillBirthday("12121985");
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
		sign.doSignUpClear("wishsi", "wishsi",number+"wishitest.best@wishi.com" , "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickHoeToWork();
		best.ClickMale();
		best.fillBirthday("12121985");
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
		best.CheckIfElementEnabled("//*[@name='viewProfileButtonID']");
		Assert.assertTrue(sign.ElementEnable("//*[@name='viewProfileButtonID']"));
		driver.resetApp();
	}
}
