package draft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import PageObejecs.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPages extends BasePage
{
	@FindBy(xpath="//div [@class = 'sign-in-container']")
	WebElement LoginPage;

	@FindBy(xpath="//div[text()[contains(.,'Password is required.')]]")
	WebElement Passwordisrequired;

	@FindBy(xpath="//div[text()[contains(.,'Email is required.')]]")
	WebElement Emailisrequired;

	@FindBy(xpath="//a[text()[contains(.,'Log in')]]")
	WebElement btnLogin;

	@FindBy(xpath="//div//input[@id='email']")
	WebElement userName;

	@FindBy(xpath="//div//input[@id='password']")
	WebElement password;

	@FindBy(xpath="//div//button[@id='submit']")
	WebElement LoginButtonOfModel; 

	@FindBy(xpath="//div//input[@value='�����']")
	WebElement ButtonOfLogin;

	@FindBy(xpath="//div//button[@class='close']")
	WebElement ButtonOfCloseLogin;

	@FindBy(xpath="//div//input[@id='signInRemember']")
	WebElement RememberMe;

	@FindBy(xpath="//button[@id='facebookButton']")
	WebElement LoginWithFacbook;

	@FindBy(xpath="//div//input[@id='email']")
	WebElement UserOfFacbook;

	@FindBy(xpath="//div//input[@id='pass']")
	WebElement PassOfFacbook;

	@FindBy(xpath="//div[text()[contains(.,'Email is required')]]")
	WebElement EmaileRequired;
	@FindBy(xpath="//div[text()[contains(.,'Password is required')]]")
	WebElement PasswordRequired;
	@FindBy(xpath="//div[text()[contains(.,'The password you entered is incorrect')]]")
	WebElement PasswordIncorrect;
	@FindBy(xpath="//div[text()[contains(.,'Invalid email')]]")
	WebElement InvalidEmail;
	@FindBy(xpath="//div[text()[contains(.,'My Bookings')]]")
	WebElement mybooking;

	@FindBy(xpath="//div//input[@value='Log In']")
	WebElement LoginButtonOfFacbook;




	;

	public LoginPages(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}





	public void ClickLoginButton() 
	{
		{
			try

			{
				BasePage.ExplicityWaitIsClickable(btnLogin);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickLoginButton failed\n");	
				throw e;
			}
		}


	}
	public void EmaileRequired()
	{

		{
			{
				try

				{
					Assert.assertTrue(BasePage.ElementDisplay(EmaileRequired));

				}
				catch(Exception e)
				{	
					System.err.println("\nError : EmaileRequired failed\n");	
					throw e;
				}
			}


		}
	}
	public void PasswordRequired()
	{

		{
			{
				try

				{
					Assert.assertTrue(BasePage.ElementDisplay(PasswordRequired));

				}
				catch(Exception e)
				{	
					System.err.println("\nError : PasswordRequired failed\n");	
					throw e;
				}
			}


		}
	}
	public void PasswordIncorrect()
	{

		{
			{
				try

				{
					Assert.assertTrue(BasePage.ElementDisplay(PasswordIncorrect));

				}
				catch(Exception e)
				{	
					System.err.println("\nError : PasswordIncorrect failed\n");	
					throw e;
				}
			}


		}
	}
	public void InvalidEmail()
	{

		{
			{
				try

				{
					Assert.assertTrue(BasePage.ElementDisplay(InvalidEmail));

				}
				catch(Exception e)
				{	
					System.err.println("\nError : InvalidEmail failed\n");
					throw e;
				}
			}


		}
	}
	public void MyBookingDisplay()
	{

		{
			{
				try

				{
					Assert.assertTrue(BasePage.ElementDisplay(mybooking));

				}
				catch(Exception e)
				{	
					System.err.println("\nError : MyBookingDisplay failed\n");	
					throw e;
				}
			}


		}
	}	

	public void doLogin(String user,String pass)
	{
		{
			try

			{
				Sleep(250);
				filltext(userName, user);
				Sleep(250);
				filltext(password, pass);
				Sleep(300);
				click(LoginButtonOfModel);	
				Sleep(150);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : doLogin failed\n");	
				throw e;
			}
		}


	} 
	public void Fillusername(String user)
	{
		{
			try

			{
				filltext(userName, user);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : Fillusername failed\n");	
				throw e;
			}
		}


	} 

	public void FillusernameOfFacbook(String userfb)

	{
		{
			try

			{
				filltext(UserOfFacbook, userfb);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : FillusernameOfFacbook failed\n");	
				throw e;
			}
		}



	} 

	public void FillPasswordOfFacbook(String Passfb)
	{
		{
			try

			{
				filltext(PassOfFacbook, Passfb);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : FillPasswordOfFacbook failed\n");	
				throw e;
			}
		}


	} 

	public void Clearusername()
	{
		{
			try

			{
				clear(userName);		

			}
			catch(Exception e)
			{	
				System.err.println("\nError : Clearusername failed\n");	
				throw e;
			}
		}


	} 
	public void Fillpassword(String pass)
	{
		{
			try

			{
				filltext(password, pass);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : Fillpassword failed\n");	
				throw e;
			}
		}


	} 

	public void Clearpassword()
	{
		{
			try

			{
				clear(password);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : Clearpassword failed\n");	
				throw e;
			}
		}


	} 

	public void Clickloginbuttonn() 
	{
		{
			try

			{
				click(LoginButtonOfModel);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : Clickloginbuttonn failed\n");	
				throw e;
			}
		}


	}

	public void ClickLoginButtonOfFacbook() 
	{
		{
			try

			{
				BasePage.ExplicityWaitIsClickable(LoginButtonOfFacbook);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickLoginButtonOfFacbook failed\n");	
				throw e;
			}
		}


	}

	public void ClickLoginWithFacbook() 
	{
		{
			try

			{
				BasePage.ExplicityWaitIsClickable(LoginWithFacbook);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickLoginWithFacbook failed\n");	
				throw e;
			}
		}


	}



	public void Closebuttonoflogin() 
	{
		{
			try

			{
				click(ButtonOfCloseLogin);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : Closebuttonoflogin failed\n");	
				throw e;
			}
		}


	}

	public void SIgnrememberme() 
	{
		{
			try

			{
				click(RememberMe);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : SIgnrememberme failed\n");
				throw e;
			}
		}


	}

}