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
		for (int counter = 5800; counter<=100000;counter++)
			number = num.nextInt(7000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi","wishitestftt@wishi.com" + number, "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWorkheart();
		best.ClickBodyType();
		best.ClickHoeToWorkoutfit();
		best.ClickFamle();
		best.fillBirthday("12121985");
		best.SelectCheapButtonID();
		sign.Sleep(150);
		best.SelectCheapButtonID();
		sign.Sleep(150);
		best.Selectinspiration();
		sign.Sleep(150);
		best.ClickNextbutton();
		sign.Sleep(150);
		best.SelectBrands();
		best.ClickNextbutton();
		Assert.assertTrue(sign.ElementEnable("//viewProfileButtonID"));
		driver.resetApp();
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void BestMatchMale() throws MalformedURLException
	{
		BaseTest.capabileties();
		Random num = new Random();
		int number = 35600;
		for (int counter = 5800; counter<=100000;counter++)
			number = num.nextInt(7000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi","wishitestftt@wishi.com" + number, "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWorkheart();
		best.ClickBodyType();
		best.ClickHoeToWorkoutfit();
		best.ClickMale();
		best.fillBirthday("12121985");
		best.SelectCheapButtonID();
		sign.Sleep(150);
		best.SelectExpensiveButtonID();
		sign.Sleep(150);
		best.Selectinspiration();
		sign.Sleep(150);
		best.ClickNextbutton();
		sign.Sleep(150);
		best.SelectBrands();
		best.ClickNextbutton();
		sign.Sleep(150);
		Assert.assertTrue(sign.ElementEnable("//viewProfileButtonID"));
		driver.resetApp();
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void BestMatchFeMaleNrmal() throws MalformedURLException
	{
		BaseTest.capabileties();
		Random num = new Random();
		int number = 35600;
		for (int counter = 5800; counter<=100000;counter++)
			number = num.nextInt(7000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi","wishitestftt@wishi.com" + number, "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWorkheart();
		best.ClickBodyType();
		best.ClickHoeToWorkoutfit();
		best.ClickFamle();
		best.fillBirthday("12121985");
		best.SelectNormal();
		sign.Sleep(150);
		best.SelectNormal();
		sign.Sleep(150);
		best.Selectinspiration();
		sign.Sleep(150);
		best.ClickNextbutton();
		sign.Sleep(150);
		best.SelectBrands();
		best.ClickNextbutton();
		sign.Sleep(150);
		Assert.assertTrue(sign.ElementEnable("//viewProfileButtonID"));
		driver.resetApp();
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void BestMatchFeMaleExpensive() throws MalformedURLException
	{
		BaseTest.capabileties();
		Random num = new Random();
		int number = 35600;
		for (int counter = 5800; counter<=100000;counter++)
			number = num.nextInt(7000);

		SignUpPage sign = new SignUpPage(driver);
		sign.ClickSignUpEmail();
		sign.doSignUpClear("wishsi", "wishsi","wishitestftt@wishi.com" + number, "123456");
		sign.Sleep(150);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickHoeToWorkheart();
		best.ClickBodyType();
		best.ClickHoeToWorkoutfit();
		best.ClickFamle();
		best.fillBirthday("12121985");
		best.SelectCheapButtonID();
		sign.Sleep(150);
		best.SelectExpensiveButtonID();
		sign.Sleep(150);
		best.Selectinspiration();
		sign.Sleep(150);
		best.ClickNextbutton();
		sign.Sleep(150);
		best.SelectBrands();
		best.ClickNextbutton();
		sign.Sleep(150);
		Assert.assertTrue(sign.ElementEnable("//viewProfileButtonID"));
		driver.resetApp();
	}
}
