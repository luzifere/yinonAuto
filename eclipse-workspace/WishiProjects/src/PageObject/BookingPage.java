package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BookingPage extends BasePage
{
	public BookingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div//span[text()[contains(.,'My Bookings')]]")
	WebElement BookBtn;
	
	@FindBy(xpath="//span[text()[contains(.,'Book A Stylist')]]")
	WebElement BookStylist;

	@FindBy(xpath="//a//div[text()[contains(.,'Start 7 day free trial')]]")
	WebElement MemberShip;
	@FindBy(xpath="//a//div[text()[contains(.,'Single session')]]")
	WebElement Single;

	@FindBy(xpath="//div[@ng-click='ok()']")
	WebElement Applay;

	@FindBy(xpath="//div//span[text()[contains(.,'Book A Stylist')]]")
	WebElement BookStylisk;


	@FindBy(xpath="//div//input[@type='text']")
	WebElement SearchBar;

	@FindBy(xpath="//div//input[@placeholder='Add Promo Code']")                     
	WebElement SearchInput;

	@FindBy(xpath="//label//div[text()[contains(.,'Gender')]]")
	WebElement Gender;


	@FindBy(xpath="//div [text()[contains(.,'Female')]]")
	WebElement Femaile;

	@FindBy(xpath="//div//ul[@class='dropdown-menu ng-isolate-scope']")
	WebElement Dropdown;

	@FindBy(xpath="//div[@class='name-city ng-binding']")
	WebElement TitleOfStylist;

	@FindBy(xpath="//div//button[@class='stickyButton ng-binding']")
	WebElement SelectStylist;

	@FindBy(xpath="//div[text()[contains(.,'Style Session / Every Month')]]")
	WebElement SelectUnlimited;

	@FindBy(xpath="//div[@class='filterPopPage ng-scope']//div [text()[contains(.,'Apply')]]")
	WebElement ClickApllay;

	@FindBy(xpath="//span[text()[contains(.,'Remove promo code')]]")
	WebElement RemovePromoCode;

	@FindBy(xpath="(//div[@class='filter-name ng-binding'])[1]")
	WebElement SelectService;

	@FindBy(xpath="//div//input[@class='no-border bgTransparent ng-pristine ng-valid ng-empty ng-touched']")
	WebElement PromoCode;

	@FindBy(xpath="//div[@class='closeXRight']")
	WebElement CloseBtnCheckout;

	@FindBy(xpath="(//div//input[@class='form-control'])[1]")
	WebElement FirstNameCheckout;

	@FindBy(xpath="(//div//input[@class='form-control'])[2]")
	WebElement LastNameCheckout;

	@FindBy(xpath="//div//button[@class='payment_form_button space-8']")
	WebElement FinishCheckout;

	@FindBy(xpath="//div[@class='thank-u-btn']")
	WebElement TakeYourStyleQuiz;

	@FindBy(css ="[name='cardnumber']")
	WebElement CardNaumber;

	@FindBy(css="[name='exp-date']")
	WebElement DateOfCard;

	@FindBy(css="[name='cvc']")
	WebElement CVCCard;

	@FindBy(xpath="//button[@class='payment_form_button ng-binding']")
	WebElement PayButton;
	
	public void ClickMyBooking() 
	{
		click(BookBtn);	
	}
	public void SearchStylist(String name) 

	{  
		WaitElementDisplay(By.xpath("//div//input[@type='text']"));
		Sleep(300);
		click(SearchBar);
		filltext(SearchBar, name);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Sleep(300);
	}
	public void UseCodCoopon(String promocod) 
	{ 
		click(FirstNameCheckout);
		ExplicityWaitIsClickable(By.xpath("//div//input[@class='no-border bgTransparent ng-pristine ng-valid ng-empty ng-touched']"));
		filltext(PromoCode,promocod);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}

	public void SelectStylist() 
	{		
		click(TitleOfStylist);
		Sleep(300);
		
		
	}

	public void SelectMemberShip() 
	{	
		click(MemberShip);	
	}

	public void SelectSingle() 
	{	
		click(Single);	
	}
	public void BookStylist() 
	{	
		click(SelectStylist);	
	}
	public void CloseCheckout() 
	{		
		click(CloseBtnCheckout);	
	}

	public void ClickBookingstylist() 
	{
		click(BookStylist);		
	}	

	public void ClickGender() 
	{		
		click(Gender);	
	}
	public void Clickfemaile() 
	{		
		click(Femaile);	
	}
	public void ClickApplay() 
	{		
		click(Applay);	
	}
	public void ClickFinishCheckout() 
	{	
		click(FinishCheckout);
		Sleep(300);
	}

	public void SelectService() 
	{	
		Sleep(30);
		click(SelectService);
		Sleep(150);
		
	}
	public void SelectUnlimited() 
	{	
		click(SelectUnlimited);	
	}
	public void ClickFirstName() 
	{	
		click(ClickApllay);	
	}
	public void ClickLastName() 
	{	
		click(ClickApllay);	
	}
	public void ClickApllay() 
	{	
		click(ClickApllay);	
	}
	public void FillFirstName(String firstname)
	{
		filltext(FirstNameCheckout, firstname);
	}
	public void FillLastName(String lastname)
	{
		filltext(LastNameCheckout, lastname);
	}
	public void FillCardNumber(String number)
	{
		filltext(CardNaumber, number);
	}
	public void FillCardDate(String date )
	{
		filltext(DateOfCard, date);
	}
	public void FillCardCVC(String cvc)
	{
		filltext(CVCCard, cvc);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();
		Sleep(50);
	}
	public void ClickTakeYourStyleQuiz() 
	{
		Sleep(300);
		click(TakeYourStyleQuiz);
	}
	public void ClickPayButton() 
	{
		click(PayButton);

	}
}

