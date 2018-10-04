package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage 
{
	@FindBy(xpath="//div[@class='logged-in-header-container ng-scope']//div[@class='get-your-style']")
	WebElement SignUpEmail;
	
	@FindBy(xpath="//div//input[@id='signUpEmail']")
	WebElement userName;
	@FindBy(xpath="//div//input[@id='signUpPass']")
	WebElement password;
	@FindBy(xpath="//div//input[@id='signUpFirstName']")
	WebElement FirstName;
	@FindBy(xpath="//div//input[@id='signUpLastName']")
	WebElement LastName;
	@FindBy(xpath="//div//input[@class='sign-up-btn ng-scope']")
	WebElement SignUpBtn;
	@FindBy(xpath="//div//div[@class='closeXLeft ng-scope']")
	WebElement CloseBtn;
	@FindBy(xpath="//div[@class='closeXRight']")
	WebElement CloseBtnofdeails;
	@FindBy(xpath="//div[contains(text(), 'Male')]")
	WebElement MaleField;
	@FindBy(xpath="//div[@class='fb ng-binding ng-isolate-scope']")
	WebElement ConnectWithFB;
	@FindBy(xpath="//div//input[@id='email']")
	WebElement UserOfFacbook;
	
	@FindBy(xpath="//div//input[@id='pass']")
	WebElement PassOfFacbook;
	
	@FindBy(xpath="//div//input[@value='Log In']")
	WebElement LoginButtonOfFacbook;
	public SignUpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void doSignUp(String user,String firstname,String lastname,String pass)
	{
		ExplicityWaitIsClickable(By.xpath("//div//input[@id='signUpEmail']"));
		Sleep(100);
		filltext(userName, user);
		Sleep(100);
		filltext(FirstName, firstname);
		Sleep(100);
		filltext(LastName, lastname);
		Sleep(100);
		filltext(password, pass);
		Sleep(100);
		click(SignUpBtn);			
	} 
	public void ClickOnSignUpEmail() 
	{
		click(SignUpEmail);	
	}
	
	public void FillUsernName(String user)
	{
		filltext(userName, user);		
	}
	
	public void FillFirstName(String firstname)
	{
		filltext(FirstName, firstname);		
	} 
	
	public void FillLastName(String lastname)
	{
		filltext(LastName, lastname);		
	} 
	
	public void FillPassword(String pass)
	{
		filltext(password, pass);		
	}
	public void ClickOnSignUp() 
	{
		click(SignUpBtn);	
	}
	
	public void ClickClose() 
	{
		click(CloseBtn);	
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
		click(ConnectWithFB);	
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
