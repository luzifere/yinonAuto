package WishiTests;


import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.BasePage;
import PageObject.BestMatchPage;
import PageObject.BookingPage;
import PageObject.LoginPage;
import PageObject.OnBoardingPage2;
import PageObject.SignUpPage;

@Listeners(WishiTests.Listener.class)

public class RetakeExpensiveMaleMatchTests extends BaseTest 
{
	@Test(priority =6,groups={"sanity-group"})
	public void BMExpensiveMale()
	{
		LoginPage login = new LoginPage(driver);
		login.waitForPageLoaded();
		login.ClickLoginButton();
		login.doLogin("wishitesttr@wishi.com3807", "ab1565");
		Assert.assertTrue(login.ElementDisplay("//h2[text()[contains(.,'Style session - starting at $20')]]"));
		login.Sleep(300);
		driver.findElement(By.xpath("//div//a[text()[contains(.,' Retake Your Style Match')]]")).click();
		BestMatchPage best = new BestMatchPage(driver);
		//best.ClickontinueButton();
		best.ClickMale();
		best.ClickBack();
		best.ClickMale();
		best.FillAge("45");
		/*
		best.selectMounts(3);
		best.selectDays(16);
		best.selectYears(9);
		*/
		best.ClickNextbutton();
		best.ClickBack();
		best.ClickNextbutton();
		best.SelectExpensiveButtonID();
		best.ClickBack();
		best.SelectExpensiveButtonID();
		best.SelectExpensiveButtonID2();
		best.ClickBack();
		best.SelectExpensiveButtonID2();
		best.SelectInspiration("2");
		best.ClickTagsNextButton();
		best.ClickBack();
		best.ClickTagsNextButton();
		best.Selectbrands("2");
		best.ClickTagsNextButton();
		best.WaitElementDisplay(By.xpath("//div//button[text()[contains(.,'SEE MORE')]]"));
		//best.ClickMoreStylistsButton();
		OnBoardingPage2 ob = new OnBoardingPage2(driver);
		ob.Sleep(300);
		ob.close();

	}
}
