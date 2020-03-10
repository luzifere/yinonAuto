package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignUpPage extends BasePage 
{
	@FindBy(xpath="//header//div[@class='get-your-style']")
	WebElement SignUpEmail;	
	@FindBy(xpath="//div//a[contains(text(), 'Sign up')]")
	WebElement SignButton;	
	@FindBy(xpath="//div//input[@id='email']")
	WebElement Email;
	@FindBy(xpath="//div//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//div//input[@id='name']")
	WebElement FullName;
	@FindBy(xpath="//div//input[@id='signUpFullName']")
	WebElement LastName;
	@FindBy(xpath="//button[@id='submit']")
	WebElement SignUpPUBtn;
	@FindBy(xpath="//button[@class='close']")
	WebElement CloseBtn;
	@FindBy(xpath="//div[@class='closeXRight']")
	WebElement CloseBtnofdeails;
	@FindBy(xpath="//div[contains(text(), 'Male')]")
	WebElement MaleField;
	@FindBy(xpath="//button[@id='facebookButton']")
	WebElement ConnectWithFB;
	@FindBy(xpath="//div//input[@id='email']")
	WebElement UserOfFacbook;
	@FindBy(xpath="//div//input[@id='pass']")
	WebElement PassOfFacbook;
	@FindBy(xpath="//div[contains(text(), 'Email is invalid')]")
	WebElement invalidemail;
	@FindBy(xpath="//div[contains(text(), 'Email is required')]")
	WebElement emailrequired;
	@FindBy(xpath="//div[contains(text(), 'Password must have at least 6 characters')]")
	WebElement must6characters;
	@FindBy(xpath="//div[contains(text(), 'You are using invalid characters')]")
	WebElement invalidcharacters;
	@FindBy(xpath="//div[contains(text(), 'please enter a valid email address')]")
	WebElement PleasEnterValidEmail;
	@FindBy(xpath="//div//input[@value='Log In']")
	WebElement LoginButtonOfFacbook;
	@FindBy(xpath="//button[@class='d-none d-sm-flex btn btn-warning']")
	WebElement LetsGetStylingBuutton;
	



	public SignUpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void doSignUpSH(String user,String firstname,String pass)
	{
		{
			try

			{

				//ExplicityWaitIsClickable(SignButton);
				WaitElementDisplay(FullName);
				click(FullName);
				Sleep(150);
				filltext(FullName, firstname);
				Sleep(150);
				filltext(Email, user);
				Sleep(150);
				filltext(password, pass);
				Sleep(150);
				clicktTab();
				click(SignUpPUBtn);			
			}
			catch(Exception e)
			{	
				System.err.println("\nError : doSignUpSH failed\n");	
				throw e;
			}
		}


	} 
	public void doSignUp(String user,String firstname,String pass)
	{
		{
			try

			{

				ExplicityWaitIsClickable(SignButton);
				WaitElementDisplay(FullName);
				click(FullName);
				Sleep(150);
				filltext(FullName, firstname);
				Sleep(150);
				filltext(Email, user);
				Sleep(150);
				filltext(password, pass);
				Sleep(150);
				clicktTab();
				click(SignUpPUBtn);			
			}
			catch(Exception e)
			{	
				System.err.println("\nError : doSignUp failed\n");	
				throw e;
			}
		}		
	} 
	public void ClickOnSignUpEmail() 
	{
		{
			try

			{
				click(SignButton);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickOnSignUpEmail failed\n");	
				throw e;
			}
		}


	}

	public void FillEmail(String user)
	{
		{
			try

			{
				filltext(Email, user);		


			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickMessageCounter failed\n");	
				throw e;
			}
		}

	}

	public void FillFullName(String firstname)
	{
		{
			try

			{
				filltext(FullName, firstname);	

			}
			catch(Exception e)
			{	
				System.err.println("\nError : FillFullName failed\n");	
				throw e;
			}
		}


	} 


	public void FillPassword(String pass)
	{
		{
			try

			{
				filltext(password, pass);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : FillPassword failed\n");	
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
					Assert.assertTrue(BasePage.ElementDisplay(emailrequired));

				}
				catch(Exception e)
				{	
					System.err.println("\nError : EmaileRequired failed\n");	
					throw e;
				}
			}


		}
	}
	public void ClickSignUpPopUp() 
	{
		{
			try

			{
				click(SignUpPUBtn);	


			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickSignUpPopUp failed\n");	
				throw e;
			}
		}

	}

	public void ClickClose() 
	{
		{
			try

			{
				click(CloseBtn);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickClose failed\n");	
				throw e;
			}
		}


	}

	public void Clickmale() 
	{
		click(MaleField);	
	}

	public void FillMale(String male)
	{
		filltext(MaleField, male);		
	}

	public void ClickClosedetails() 
	{
		click(CloseBtnofdeails);	
	}

	public void ConnectWithFB() 
	{
		Sleep(200);
		ExplicityWaitIsClickable(ConnectWithFB);	
	}

	public void FillusernameOfFacbook(String userfb)

	{

		filltext(UserOfFacbook, userfb);		
	} 

	public void FillPasswordOfFacbook(String Passfb)
	{
		filltext(PassOfFacbook, Passfb);		
	} 

	public void ClickLoginButtonOfFacbook() 
	{
		Sleep(200);
		click(LoginButtonOfFacbook);
	}
	public void invalidEmail() 
	{
		{
			try

			{
				Assert.assertTrue(SignUpPage.ElementDisplay(invalidemail));


			}
			catch(Exception e)
			{	
				System.err.println("\nError : invalidEmail failed\n");	
				throw e;
			}
		}
	}
	public void PleasEnterValidEmail() 
	{
		{
			try

			{
				Assert.assertTrue(SignUpPage.ElementDisplay(PleasEnterValidEmail));


			}
			catch(Exception e)
			{	
				System.err.println("\nError : invalidEmail failed\n");	
				throw e;
			}
		}
	}

	public void Must6Characters() 
	{
		{
			try

			{
				Assert.assertTrue(SignUpPage.ElementDisplay(must6characters));


			}
			catch(Exception e)
			{	
				System.err.println("\nError : Must6Characters failed\n");
				throw e;
			}
		}
	}
	public void invalidCharacters() 
	{
		{
			try

			{
				Assert.assertTrue(SignUpPage.ElementDisplay(invalidcharacters));


			}
			catch(Exception e)
			{	
				System.err.println("\nError : invalidCharacters failed\n");
				throw e;
			}
		}
		}
		public void LetsGetStylingBuutton() 
		{
			{
				try

				{
					Assert.assertTrue(SignUpPage.ElementDisplay(LetsGetStylingBuutton));


				}
				catch(Exception e)
				{	
					System.err.println("\nError : LetsGetStylingBuutton failed\n");	
					throw e;
				}
			}
	}

















}
