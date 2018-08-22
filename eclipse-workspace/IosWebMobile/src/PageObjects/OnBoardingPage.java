package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumDriver;

public class OnBoardingPage extends BasePage
{

	public OnBoardingPage(AppiumDriver<WebElement> _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="(//div[@class='connect-email'])")
	WebElement SignUpEmail;
	@FindBy(xpath="//input[@id='exampleInput']")
	WebElement birthdayField;
	@FindBy(xpath="//div//input[@placeholder='Country']")
	WebElement Country;
	@FindBy(xpath="//div//input[@placeholder='City']")
	WebElement City;
	@FindBy(xpath="//div//button[@class='save-and-next']")
	WebElement NextButton;
	@FindBy(xpath="//div[@class='btn-back']")
	WebElement BackButtonOfStyle;
	@FindBy(xpath="//div[@class='closeXRight']")
	WebElement CloseButtonOfStyle;
	@FindBy(xpath="//div//button[@type='submit']")
	WebElement AddPhotoButton;
	@FindBy(xpath="//div[@class='match-more-stylists']")
	WebElement MorestylistBUtton;
	@FindBy(xpath="//nav//div//span[@class='inner-credentials ng-binding credentials-mob']")
	WebElement ProfileButton;
	@FindBy(xpath="//div//li//a[text()[contains(.,'Log Out')]]")
	WebElement LogOut;
	
	@FindBy(xpath="//label[@for='on-boarding-gender-male']")
	WebElement Male;
	@FindBy(xpath="//label[@for='on-boarding-gender-female']")
	WebElement FamleMale;
	public void ClickOnSignUpEmail() 
	{
		click(SignUpEmail);	
	}
	public void ClickMale() 
	{
		Sleep(250);
		ExplicityWaitIsClickable(By.xpath("//div[@class='gender-icon'][text()[contains(.,'Male')]]"));
		//click(Male);
	}
	public void ClickFaMale() 
	{
		ExplicityWaitIsClickable(By.xpath("//div[@class='gender-icon'][text()[contains(.,'Female')]]"));
		//click(FamleMale);
	}
	public void SelectGender(String gender)
    {
    	String GenderElemet = ("//div[@class='gender-icon'][text()[contains(.,'Male')]]");
    	GenderElemet = GenderElemet.replace("Male", gender);
    	WebElement GenderButton = driver.findElement(By.xpath(GenderElemet));
    	Sleep(300);
    	click(GenderButton);
    } 
public void FillBirthday()
	
	{
		click(birthdayField);	
	}
	public void FillCountry(String country)
	
	{
		click(Country);
		filltext(Country, country);		
	}
	public void FillCity(String city)
	{
		click(City);
		filltext(City, city);		
	}
	public void ClickNext() 
	{
		click(NextButton);	
		Sleep(150);
	}
	
	
	public void SelectBrands1(String brand)
    {
    	String BrandElemet = ("//label[@for='br_text1']");
    	BrandElemet = BrandElemet.replace("text1", brand);
    	WebElement BrandButton = driver.findElement(By.xpath(BrandElemet));
    	click(BrandButton);
    } 
	
	public void SelectInspiration(String inspiration)
    {
    	String GoalElemet = ("(//input[@type='checkbox'])[text1]");
    	GoalElemet = GoalElemet.replace("text1", inspiration);
    	WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
    	click(GoalButton);
    } 

	public void ClickBacktOfStyle() 
	{
		click(BackButtonOfStyle);	
	}
	public void ClickClosetOfStyle() 
	{
		BasePage.ExplicityWaitIsClickable(By.xpath("//div[@class='closeXRight']"));
		click(CloseButtonOfStyle);	
	}
	public void ClickAddPhotoButton()
	{
		click(AddPhotoButton);	
	}
	public void ClickMoreStylists() 
	{
		Sleep(150);
		click(MorestylistBUtton);	
	}
	public void ClickOnProfileButton() 
	{   	
   		click(ProfileButton);	
	}
    public void ClickOnLogOut() 
	{
		click(LogOut);	
	}

}
