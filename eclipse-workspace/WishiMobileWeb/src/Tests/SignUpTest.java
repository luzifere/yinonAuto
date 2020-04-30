package Tests;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObejecs.BasePage;
import PageObejecs.SignUpPage;




@Listeners(Tests.Listener.class)
public class SignUpTest extends BaseTest1
{
	@Test(priority = 2,groups={"sanity-group"})
	public void FillEmailWitoutShtudel()
	{
		SignUpPage signup = new SignUpPage(driver);
		signup.doSignUp("yinon542244243.wishi.com", "inon bb av", "ab1565");
		signup.PleasEnterValidEmail();
		signup.ClickClose();
		
		
	} 
	
	@Test(priority = 3,groups={"sanity-group"})
	public void FillEmailWithoutDotCom()
	{
		
		SignUpPage signup = new SignUpPage(driver);
		signup.doSignUp("yinon@542244243wishi", "inon bb av", "ab1565");
		signup.PleasEnterValidEmail1();
		signup.ClickClose();
		
		
	}
	
	@Test(priority = 4,groups={"sanity-group"})
	public void FillPsswordWithLessthan6Characters()
	{
		
		SignUpPage signup = new SignUpPage(driver);
		signup.doSignUp("yinon@542244243.wishi", "inon bb av", "ab");
		signup.Must6Characters();
		signup.ClickClose();
		
	} 
	@Test(priority = 5,groups={"sanity-group"})
	public void FillNameWithWrongcarecters()
	{
		
		SignUpPage signup = new SignUpPage(driver);
		signup.doSignUp("yinon@542244243.wishi", "@@@@@@ ######", "ab1565");
		signup.invalidCharacters();
		signup.ClickClose();
		
	} 
	
	@Test(priority = 6,groups={"sanity-group"})
	public void DoSignUp()
	{
		SignUpPage signup = new SignUpPage(driver);
		Random num = new Random();
		int number = 3560000;
		for (int counter = 5800000; counter<=10000000;counter++)
			number = num.nextInt(700000);
		signup.doSignUp("wishitestyinon@wishitest.com" + number, "inon bb av", "ab1565");
		signup.LetsGetStylingBuutton();
		signup.close();
	}
}
