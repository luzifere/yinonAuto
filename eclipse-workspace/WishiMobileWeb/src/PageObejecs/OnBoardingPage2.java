package PageObejecs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class OnBoardingPage2 extends BasePage
{

	public OnBoardingPage2(AndroidDriver<AndroidElement> _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="(//div[@class='connect-email'])")
	WebElement SignUpEmail;
	@FindBy(xpath="//div//select[@name='birthday_month']")
	WebElement Mount;
	@FindBy(xpath="//div//select[@name='birthday_day']")
	WebElement Day;
	@FindBy(xpath="//div//select[@name='birthday_year']")
	WebElement Year;
	@FindBy(xpath="//div//input[@placeholder='Country']")
	WebElement Country;
	@FindBy(xpath="//div//input[@placeholder='City']")
	WebElement City;
	@FindBy(xpath="//div//button[@class='save-and-next']")
	WebElement NextButton;
	@FindBy(xpath="//div[@class='btn-back']//img")
	WebElement BackButtonOfStyle;
	@FindBy(xpath="//div[@class='closeXRight']")
	WebElement CloseButtonOfStyle;
	@FindBy(xpath="//div//button[@type='submit']")
	WebElement AddPhotoButton;
	@FindBy(xpath="//div[@class='match-more-stylists']")
	WebElement MorestylistBUtton;
	@FindBy(xpath="//span[@class='inner-credentials ng-binding credentials-mob']")
	WebElement ProfileButton;
	@FindBy(xpath="//div//li//a[text()[contains(.,'Log Out')]]")
	WebElement LogOut;

	public void ClickOnSignUpEmail() 
	{
		click(SignUpEmail);	
	}
	public void SelectGender(String gender)
	{
		String GenderElemet = ("//div[@class='gender-icon'][text()[contains(.,'Male')]]");
		GenderElemet = GenderElemet.replace("Male", gender);
		WebElement GenderButton = driver.findElement(By.xpath(GenderElemet));
		click(GenderButton);
	} 
	public void selectMounts(int num)
	{
		Select mounts = new Select (driver.findElement(By.xpath("//div//select[@name='birthday_month']")));
		click(Mount);
		mounts.selectByIndex(num);
	}
	public void selectDays( int num)
	{
		Select days = new Select (driver.findElement(By.xpath("//div//select[@name='birthday_day']")));
		click(Day);
		days.selectByIndex(num);
	}
	public void selectYears(int num)
	{
		Select years = new Select (driver.findElement(By.xpath("//div//select[@name='birthday_year']")));
		click(Year);
		years.selectByIndex(num);
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
	public void SetDate() 
	{
		driver.findElement(By.xpath("//input[@id='exampleInput']")).click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ENTER).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();
	}



}
