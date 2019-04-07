package Tests;

import java.net.MalformedURLException;
import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.BookingPage;
import PageObjects.LoginPage;
import PageObjects.SignUpPage;



@Listeners(Tests.Listener.class)

public class BestMutchStylistTests extends BaseTestStylist 
{
	
	@Test(priority = 3,groups={"sanity-group"})
	public void BestMatchFamle()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("oren@wishi.me", "123456");
		booking.ClickLoginButton();
		booking.Sleep(500);
		LoginPage.DismissAlert();
		booking.Sleep(500);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickNextbutton();
		best.ClickMale();
		best.ClickNextbutton();
		best.ClickBack();
		best.ClickMale();
		best.ClickFamle();
		best.ClickNextbutton();
		best.SelectBodyType("Petite");
		best.ClickNextbutton();
		best.ClickBack();
		best.SelectBodyType("Pregnant");
		best.ClickNextbutton();
		best.SelectLoveIt("1");
		best.SelectSOMETIMES("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.ClickNextbutton();
		best.ClickBack();
		best.SelectSOMETIMES("2");
		best.ClickNextbutton();
		//best.ClickBack();
		//best.ClickHellNoButton();
		best.SelectBrands("A.L.C");
		best.SelectBrands("Free People");
		best.SelectBrands("Armani");
		best.SelectBrands("Chloe");
		best.SelectBrands("H&M");
		best.ClickNextbutton();
		best.AcceptAlert();
		//best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		best.WaitElementDisplay(By.xpath("//*[@name='My Bookings']"));
		Assert.assertTrue(best.ElementEnable("//*[@name='My Bookings']"));
		driver.resetApp();
	}
	@Test(priority = 5,groups={"sanity-group"})
	public void BestMatchMale()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("oren@wishi.me", "123456");
		booking.ClickLoginButton();
		booking.Sleep(500);
		LoginPage.DismissAlert();
		booking.Sleep(500);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickNextbutton();
		best.ClickFamle();
		best.ClickNextbutton();
		best.ClickBack();
		best.ClickFamle();
		best.ClickMale();
		best.ClickNextbutton();
		best.SelectBodyType("Petite");
		best.ClickNextbutton();
		best.ClickBack();
		best.SelectBodyType("Pregnant");
		best.ClickNextbutton();
		best.SelectLoveIt("1");
		best.SelectSOMETIMES("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.ClickNextbutton();
		best.ClickBack();
		best.SelectSOMETIMES("2");
		best.ClickNextbutton();
		//best.ClickBack();
		//best.ClickHellNoButton();
		best.SelectBrands("A.L.C");
		best.SelectBrands("GAP");
		best.SelectBrands("Armani");
		best.SelectBrands("Calvin Klein");
		best.SelectBrands("H&M");
		best.ClickNextbutton();
		best.AcceptAlert();
		//best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		best.WaitElementDisplay(By.xpath("//*[@name='My Bookings']"));
		Assert.assertTrue(best.ElementEnable("//*[@name='My Bookings']"));
		driver.resetApp();
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void BestMatchFluID()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("oren@wishi.me", "123456");
		booking.ClickLoginButton();
		booking.Sleep(500);
		LoginPage.DismissAlert();
		booking.Sleep(500);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickNextbutton();
		best.ClickMale();
		best.ClickNextbutton();
		best.ClickBack();
		best.ClickMale();
		best.ClickSelfIdentityButtonID();
		best.ClickNextbutton();
		best.SelectBodyType("Petite");
		best.ClickNextbutton();
		best.ClickBack();
		best.SelectBodyType("Pregnant");
		best.ClickNextbutton();
		best.SelectLoveIt("1");
		best.SelectSOMETIMES("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.ClickNextbutton();
		best.ClickBack();
		best.SelectSOMETIMES("2");
		best.ClickNextbutton();
		//best.ClickBack();
		//best.ClickHellNoButton();
		best.SelectBrands("A.L.C");
		best.SelectBrands("Free People");
		best.SelectBrands("Armani");
		best.SelectBrands("Chloe");
		best.SelectBrands("H&M");
		best.ClickNextbutton();
		best.AcceptAlert();
		//best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		best.WaitElementDisplay(By.xpath("//*[@name='My Bookings']"));
		Assert.assertTrue(best.ElementEnable("//*[@name='My Bookings']"));
		driver.resetApp();
	}
	@Test(priority = 1,groups={"sanity-group"})
	public void BestMatchFluIDAndMale()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("oren@wishi.me", "123456");
		booking.ClickLoginButton();
		booking.Sleep(500);
		LoginPage.DismissAlert();
		booking.Sleep(500);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickNextbutton();
		best.ClickSelfIdentityButtonID();
		best.ClickNextbutton();
		best.ClickBack();
		best.ClickMale();
		best.ClickNextbutton();
		best.SelectBodyType("Petite");
		best.ClickNextbutton();
		best.ClickBack();
		best.SelectBodyType("Pregnant");
		best.ClickNextbutton();
		best.SelectLoveIt("1");
		best.SelectSOMETIMES("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.ClickNextbutton();
		best.ClickBack();
		best.SelectSOMETIMES("2");
		best.ClickNextbutton();
		//best.ClickBack();
		//best.ClickHellNoButton();
		best.SelectBrands("A.L.C");
		best.SelectBrands("Free People");
		best.SelectBrands("Armani");
		best.SelectBrands("Chloe");
		best.SelectBrands("H&M");
		best.ClickNextbutton();
		best.AcceptAlert();
		//best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		best.WaitElementDisplay(By.xpath("//*[@name='My Bookings']"));
		Assert.assertTrue(best.ElementEnable("//*[@name='My Bookings']"));
		driver.resetApp();
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void BestMatchFemaleAndMale()
	{
		BookingPage booking = new BookingPage(driver);
		booking.Sleep(250);
		booking.ClickLoginStart();
		booking.LoginStylistApp("oren@wishi.me", "123456");
		booking.ClickLoginButton();
		booking.Sleep(500);
		LoginPage.DismissAlert();
		booking.Sleep(500);
		PageObjects.BestMutch best = new PageObjects.BestMutch(driver);
		best.ClickNextbutton();
		best.ClickSelfIdentityButtonID();
		best.ClickNextbutton();
		best.ClickBack();
		best.ClickMale();
		best.ClickNextbutton();
		best.SelectBodyType("Petite");
		best.ClickNextbutton();
		best.ClickBack();
		best.SelectBodyType("Pregnant");
		best.ClickNextbutton();
		best.SelectLoveIt("1");
		best.SelectSOMETIMES("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.SelectHELLONO("2");
		best.ClickNextbutton();
		best.ClickBack();
		best.SelectSOMETIMES("2");
		best.ClickNextbutton();
		//best.ClickBack();
		//best.ClickHellNoButton();
		best.SelectBrands("A.L.C");
		best.SelectBrands("Free People");
		best.SelectBrands("Armani");
		best.SelectBrands("Chloe");
		best.SelectBrands("H&M");
		best.ClickNextbutton();
		best.AcceptAlert();
		//best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		best.WaitElementDisplay(By.xpath("//*[@name='My Bookings']"));
		Assert.assertTrue(best.ElementEnable("//*[@name='My Bookings']"));
		driver.resetApp();
	}
}
