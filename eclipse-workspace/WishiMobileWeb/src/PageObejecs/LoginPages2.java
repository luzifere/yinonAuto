package PageObejecs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPages2 extends BasePage
{
	/*
	@FindBy(xpath="//div [@class = 'sign-in-container']")
	WebElement LoginPage;
	
	@FindBy(xpath="//div[text()[contains(.,'Password is required.')]]")
	WebElement Passwordisrequired;
	
	@FindBy(xpath="//div[text()[contains(.,'Email is required.')]]")
	WebElement Emailisrequired;
	
	@FindBy(xpath="//header//div[@class='log-in']")
	WebElement btnLogin;

	@FindBy(xpath="//div//input[@id='signInEmail']")
	WebElement userName;
	
	@FindBy(xpath="//div//input[@id='signInPass']")
	WebElement password;
	
	@FindBy(xpath="//div//input[@value='Sign in']")
	WebElement LoginButtonOfModel; 
			
	@FindBy(xpath="//div//input[@value='�����']")
	WebElement ButtonOfLogin;
	
	@FindBy(xpath="//div[@class='closeXLeft ng-scope']")
	WebElement ButtonOfCloseLogin;
	
	@FindBy(xpath="//div//input[@id='signInRemember']")
	WebElement RememberMe;
	
	@FindBy(xpath="//div[@class='sign-facebook']")
	WebElement LoginWithFacbook;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement UserOfFacbook;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement PassOfFacbook;
	
	@FindBy(xpath="//div//button[@name='login']")
	WebElement LoginButtonOfFacbook;
	*/
	
	public LoginPages2(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	/*	
	public void ClickLoginButton() 
	{
		click(btnLogin);
	}
	
	public void doLogin(String user,String pass)
	{
		filltext(userName, user);
		filltext(password, pass);
		click(LoginButtonOfModel);			
	} 
	public void Fillusername(String user)
	{
		filltext(userName, user);		
	} 
	
	public void FillusernameOfFacbook(String userfb)
	
	{
		ExplicityWaitIsClickable(UserOfFacbook);
		filltext(UserOfFacbook, userfb);		
	} 
	
	public void FillPasswordOfFacbook(String Passfb)
	{
		ExplicityWaitIsClickable(PassOfFacbook);
		filltext(PassOfFacbook, Passfb);		
	} 
	
	public void Clearusername()
	{
		clear(userName);		
	} 
	public void Fillpassword(String pass)
	{
		filltext(password, pass);		
	} 
	
	public void Clearpassword()
	{
		clear(password);		
	} 
	
	public void Clickloginbuttonn() 
	{
		click(LoginButtonOfModel);
	}
	
	public void ClickLoginButtonOfFacbook() 
	{
		click(LoginButtonOfFacbook);
	}
	
	public void ClickLoginWithFacbook() 
	{
		scrollDown();
		click(LoginWithFacbook);
	}
	
	
	
	public void Closebuttonoflogin() 
	{
		click(ButtonOfCloseLogin);
	}
	
	public void SIgnrememberme() 
	{
		click(RememberMe);
	}
	*/
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

	@FindBy(xpath="//div//input[@id='m_login_email']")
	WebElement UserOfFacbook;

	@FindBy(xpath="//div//input[@id='m_login_password']")
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
	
	@FindBy(xpath="//button[@value='Log In']")
	WebElement LoginButtonOfFacbook;
	



	;



	public void ClickLoginButton() 
	{
		{
			try

			{
				//click(btnLogin);
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
					Assert.assertTrue(ElementDisplay(EmaileRequired));

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
					Assert.assertTrue(ElementDisplay(PasswordRequired));

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
					Assert.assertTrue(ElementDisplay(PasswordIncorrect));

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
					Assert.assertTrue(ElementDisplay(InvalidEmail));

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
					ExplicityWaitIsDisplayed(mybooking);
					Assert.assertTrue(ElementDisplay(mybooking));

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