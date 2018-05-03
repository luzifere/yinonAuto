package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class BestMutch extends BasePage 
{

	public BestMutch(AppiumDriver<WebElement> _driver) 
	{
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@name='HowItWorksID']")
	WebElement how_it_workst;
	
	@FindBy(xpath="//*[@name='HowItWorksID']")
	WebElement BodyType;
	
	@FindBy(xpath="//*[@name='HowItWorksID']")
	WebElement how_it_works_outfit;
	
	@FindBy(xpath="//*[@name='FemaleButtonID']")
	WebElement FemaleButtonID;
	
	@FindBy(xpath="//*[@name='MaleButtonID']")
	WebElement MaleButtonID;
	
	@FindBy(xpath="//*[@name='BirthdayTextFieldID']")
	WebElement BirthdayTextFieldID;
	
	@FindBy(xpath="//*[@name='CheapButtonID']")
	WebElement CheapButtonID;
	
	@FindBy(xpath="//*[@name='NormalButtonID']")
	WebElement NormalButtonID;
	
	@FindBy(xpath="//*[@name='ExpensiveButtonID']")
	WebElement ExpensiveButtonID;
	
	@FindBy(xpath="//*[@name='SuperExpensiveButtonID']")
	WebElement SuperExpensiveButtonID;
	
	@FindBy(xpath="(//*[@name='InspireCellViewID'])[1]")
	WebElement inspiration;
	
	@FindBy(xpath="(//*[@name='BrandsCellViewID'])[2]")
	WebElement Brands;
	
	@FindBy(xpath="//*[@name='NextButtonID']")
	WebElement NextButtonID;
	
	@FindBy(xpath="(//*[@name='close_image'])[1]")
	WebElement close_image;
	
	@FindBy(id="ViewMoreStylistsButtonID")
	WebElement MoreStylistsButton;

	public void ClickMoreStylistsButton() 
	{	
		click(MoreStylistsButton);
	}
	public void ClickHoeToWork() 
	{	
		click(how_it_workst);
	}
	public void ClickBodyType() 
	{		
		Sleep(150);
		click(BodyType);
		Sleep(150);
	}
	public void ClickHoeToWorkoutfit() 
	{
		Sleep(150);
		click(how_it_works_outfit);
		Sleep(150);
	}
	public void ClickFamle() 
	{
		click(FemaleButtonID);
	}
	public void ClickMale() 
	{
		click(MaleButtonID);
	}
	public void fillBirthday(String text) 
	{
		filltext(BirthdayTextFieldID, text);
	}
	public void SelectCheapButtonID() 
	{
		click(CheapButtonID);
	}
	public void SelectNormal() 
	{
		click(NormalButtonID);
	}
	public void SelectExpensiveButtonID() 
	{
		click(ExpensiveButtonID);
	}
	public void Selectinspiration() 
	{
		click(inspiration);
	}
	public void SelectBrands() 
	{
		click(Brands);
	}
	public void ClickNextbutton() 
	{
		click(NextButtonID);
	}
	public void Clickclose_image() 
	{
		click(close_image);
	}
	
}
