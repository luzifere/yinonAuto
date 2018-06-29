package Tests;

import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.FacbookPage;
import PageObjects.FacbookPage2;

public class SignUpByFacbookTest2 extends BaseTest3
{
	@Test(priority = 1,groups={"sanity-group"})
	public void LoginWithFacbookWrongUserName()
	{
		FacbookPage2 loginf = new FacbookPage2(driver);
		loginf.LoginWithFacbookWrongUserName();
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void LoginWithFacbookWrongPassword()
	{
		FacbookPage2 loginf = new FacbookPage2(driver);
		loginf.LoginWithFacbookWrongPassword();
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void LoginWithFacbookWithoutUser()
	{
		FacbookPage2 loginf = new FacbookPage2(driver);
		loginf.LoginWithFacbookWithoutUser();
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void LoginWithFacbookWithoutPassword()
	{
		FacbookPage2 loginf = new FacbookPage2(driver);
		loginf.LoginWithFacbookWrongPassword();

	}
	@Test(priority = 5,groups={"sanity-group"})
	public void DoLoginWithFacbook()
	{
		FacbookPage2 loginf = new FacbookPage2(driver);
		loginf.DoLoginWithFacbook();
		loginf.Sleep(300);
		BasePage.AcceptAlert();
		loginf.Sleep(200);
		BasePage.AcceptAlert();
		driver.closeApp();
	}

}
