package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.HideKeyboardStrategy;

public class BookingPage extends BasePage
{

	public BookingPage(AppiumDriver<WebElement> _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div//span[text()[contains(.,'My Bookings')]]")
	WebElement BookBtn;


	@FindBy(xpath="//div [@class='action-btn can-submit']")
	WebElement Applay;

	@FindBy(xpath="//div [@class='filter-icon']")
	WebElement FilterIcon;

	@FindBy(xpath="//div//span[text()[contains(.,'Book A Stylist')]]")
	WebElement BookStylisk;


	@FindBy(xpath="//input[@id='mobSearch']")
	WebElement SearchBar;

	@FindBy(xpath="//div[@class='img-box']")
	WebElement SearchBarButton;

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

	@FindBy(xpath="//button[@class='fix-bookMe ng-scope']")
	WebElement SelectStylist;

	@FindBy(xpath="(//div[@class='entry-sub ng-binding'])[1]")
	WebElement SelectUnlimited;

	@FindBy(xpath="//div[text()[contains(.,'Apply')]]")
	WebElement ClickApllay;

	@FindBy(xpath="//span[text()[contains(.,'Remove promo code')]]")
	WebElement RemovePromoCode;

	@FindBy(xpath="(//div[@class='filter-name ng-binding'])[1]")
	WebElement SelectService;

	@FindBy(xpath="//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")
	WebElement PromoCode;

	@FindBy(xpath="//div[@class='closeXRight']")
	WebElement CloseBtnCheckout;

	@FindBy(xpath="//input[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty']")
	WebElement FirstNameCheckout;

	@FindBy(xpath="(//div//input[@class='form-control'])[2]")
	WebElement LastNameCheckout;

	@FindBy(xpath="//button[@class='mobileBookme_payment_form_button']")
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
	@FindBy(xpath="//input[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty']")
	WebElement NameField;
	@FindBy(xpath="//li[@id='typeahead-251-2959-option-0']")
	WebElement StylistInLIst;


	public void ClickName() 
	{
		driver.findElement(By.xpath("//div[@id='card-element']")).click();
		/*
		click(FirstNameCheckout);
		Sleep(200);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		Sleep(300);
		*/
	}
	public void ClickMyBooking() 
	{
		click(BookBtn);	
	}
	public void ClickSearchButton() 
	{	
		Sleep(100);
		click(SearchBarButton);	
	}

	public void SearchStylist(String name) 
	{  
		click(SearchBarButton);
		click(SearchBar);
		filltext(SearchBar, name);
		Sleep(200);
		//driver.findElement(By.xpath("//ul[@class='dropdown-menu ng-isolate-scope']//a")).click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();	
		//driver.hideKeyboard();
	}
	public void UseCodCoopon(String promocod) 
	{ 
		ExplicityWaitIsClickable(By.xpath("//div[@class='mobile_use_promo']"));
		filltext(PromoCode,promocod);
		driver.findElement(By.xpath("//span[@class='apply_promo_code']")).click();
	}

	public void SelectStylist() 
	{	
		Sleep(100);
		click(TitleOfStylist);
	}

	public void BookStylist() 
	{	Sleep(200);
	driver.findElement(By.xpath("//button//p[@class='ng-binding ng-scope']")).click();
	Sleep(100);
	//click(SelectStylist);	
	}

	public void CloseCheckout() 
	{		
		click(CloseBtnCheckout);	
	}

	public void FilterIcon() 
	{		
		Sleep(100);
		click(FilterIcon);	
	}

	public void ClickBookingstylist() 
	{
		click(BookStylisk);		
	}	
	public void ClickCard() 
	{
		click(CardNaumber);		
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
		Sleep(100);
		click(ClickApllay);	
	}
	public void ClickFinishCheckout() 
	{	
		click(FinishCheckout);
		Sleep(100);
	}

	public void SelectService() 
	{	
		Sleep(100);
		click(SelectService);	
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
	public void FillCardNumber()
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.NUMPAD4).perform();
		act.sendKeys(Keys.NUMPAD2).perform();
		act.sendKeys(Keys.NUMPAD4).perform();
		act.sendKeys(Keys.NUMPAD2).perform();
		act.sendKeys(Keys.NUMPAD4).perform();
		act.sendKeys(Keys.NUMPAD2).perform();
		act.sendKeys(Keys.NUMPAD4).perform();
		act.sendKeys(Keys.NUMPAD2).perform();
		act.sendKeys(Keys.NUMPAD4).perform();
		act.sendKeys(Keys.NUMPAD2).perform();
		act.sendKeys(Keys.NUMPAD4).perform();
		act.sendKeys(Keys.NUMPAD2).perform();
		act.sendKeys(Keys.NUMPAD4).perform();
		act.sendKeys(Keys.NUMPAD2).perform();
		act.sendKeys(Keys.NUMPAD4).perform();
		act.sendKeys(Keys.NUMPAD2).perform();
		act.sendKeys(Keys.NUMPAD4).perform();
		act.sendKeys(Keys.NUMPAD2).perform();
		act.sendKeys(Keys.NUMPAD4).perform();
		act.sendKeys(Keys.NUMPAD2).perform();
		act.sendKeys(Keys.NUMPAD4).perform();
		act.sendKeys(Keys.NUMPAD2).perform();
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
		Sleep(100);
	}
	public void ClickTakeYourStyleQuiz() 
	{
		Sleep(100);
		click(TakeYourStyleQuiz);
	}
	public void ClickPayButton() 
	{
		click(PayButton);

	}


}
