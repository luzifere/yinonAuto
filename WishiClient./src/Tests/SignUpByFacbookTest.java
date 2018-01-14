package Tests;

import org.testng.annotations.Test;

import PageObjects.FacbookPage;

public class SignUpByFacbookTest extends BaseTest
{
		@Test(priority = 1,groups={"sanity-group"})
	public void LoginWithFacbookWrongUserName()
	{
		FacbookPage loginf = new FacbookPage(driver);
		loginf.LoginWithFacbookWrongUserName();
	}
	@Test(priority = 2,groups={"sanity-group"})
	public void LoginWithFacbookWrongPassword()
	{
		FacbookPage loginf = new FacbookPage(driver);
		loginf.LoginWithFacbookWrongPassword();
	}
	@Test(priority = 4,groups={"sanity-group"})
	public void LoginWithFacbookWithoutUser()
	{
		FacbookPage loginf = new FacbookPage(driver);
		loginf.LoginWithFacbookWithoutUser();
	}
	@Test(priority = 3,groups={"sanity-group"})
	public void LoginWithFacbookWithoutPassword()
	{
		FacbookPage loginf = new FacbookPage(driver);
		loginf.LoginWithFacbookWrongPassword();
		
	}
	@Test(priority = 5,groups={"sanity-group"})
	public void DoLoginWithFacbook()
	{
		FacbookPage loginf = new FacbookPage(driver);
		loginf.DoLoginWithFacbook();
		loginf.Sleep(300);
		loginf.AcceptAlert();
		loginf.Sleep(200);
		loginf.AcceptAlert();
		driver.resetApp();
	}

}
