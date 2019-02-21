package Tests;


import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(Tests.Listener.class)

public class StartHereFFacbookTests extends BaseTest 
{
	@Test(priority =6,groups={"sanity-group"})
	public void StartHereMaleTests()
	{
		String winhandleBefore = driver.getWindowHandle();
		PageObejecs.SignUpPage signup = new PageObejecs.SignUpPage(driver);
		Random num = new Random();
		int number = 3560000;
		for (int counter = 5800000; counter<=10000000;counter++)
			number = num.nextInt(700000);
		PageObejecs.BestMatchPage best = new PageObejecs.BestMatchPage(driver);
		best.ClickStartHere();
		best.ClickontinueButton();
		best.ClickFamle();
		best.ClickBack();
		best.ClickMale();
		best.SelectLoveIt("1");
		best.ClickBack();
		best.SelectHELLONO("1");
		best.SelectSOMETIMES("2");
		best.ClickBack();
		best.SelectHELLONO("2");
		best.SelectLoveIt("3");
		best.ClickBack();
		best.SelectLoveIt("3");
		best.SelectSOMETIMES("4");
		best.ClickBack();
		best.SelectSOMETIMES("4");
		best.SelectSOMETIMES("5");
		best.ClickBack();
		best.SelectHELLONO("5");
		best.SelectLoveIt("6");
		best.ClickBack();
		best.SelectHELLONO("6");
		best.ClickSkipbutton2("1");
		best.ClickBack();
		best.SelectHELLONO("7");
		best.SelectHELLONO("8");
		best.ClickBack();
		best.SelectHELLONO("8");
		best.SelectLoveIt("9");
		best.ClickBack();
		best.SelectHELLONO("9");
		best.SelectHELLONO("10");
		best.ClickBackBrands();
		best.SelectHELLONO("10");
		best.Selectbrands("1");
		/*
		best.ClickNextbutton();
		best.WaitElementDisplay(By.xpath("//div//h1[text()[contains(.,'So, to reacp ')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'Male')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'60% - Classic, 40% - Edgy')]]"));
		Assert.assertTrue(best.ElementDisplay("//span[text()[contains(.,'GAP')]]"));
		*/
		best.ClickMeetMyMatch();
		signup.ConnectWithFB();
		signup.ConnectWithFB();
		signup.Sleep(200);
		signup.switchWindow();
		//driver.manage().window().maximize();
		signup.FillusernameOfFacbook("avivitab1@gmail.com");
		signup.FillPasswordOfFacbook("300401031");
		signup.ClickLoginButtonOfFacbook();
		//driver.findElement(By.xpath("(//div//button[@type='submit'])[1]")).click();
		signup.Sleep(300);
		driver.switchTo().window(winhandleBefore);
		//signup.switchWindow();
		
		best.WaitElementDisplay(By.xpath("//div//button[text()[contains(.,'SEE MORE')]]"));
		Assert.assertTrue(best.ElementDisplay("//div//button[text()[contains(.,'SEE MORE')]]"));
		best.Sleep(300);
		driver.close();

	}
}
