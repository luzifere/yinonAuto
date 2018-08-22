package PageObejecs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BookingPage extends BasePage
{

	public BookingPage(AndroidDriver<AndroidElement> _driver) {
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


	@FindBy(xpath="//div//input[@type='text']")
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

	@FindBy(xpath="//div[@class='thank-u-btn-mob']")
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



	public void ClickName() 
	{
		click(FirstNameCheckout);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		Sleep(300);
	}
	public void ClickMyBooking() 
	{
		click(BookBtn);	
	}
	public void ClickSearchButton() 
	{	
		//Sleep(300);
		//click(SearchBarButton);	
		driver.findElement(By.xpath("//img[@src='../images/search.png']")).click();
	}

	public void SearchStylist(String name) 

	{  /*
		Sleep(300);
		click(SearchBar);
		Sleep(300);
		filltext(SearchBar, name);
		Sleep(300);
		driver.findElement(By.xpath("//a[@title='Casey Huth']")).click();
		/*
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Sleep(300);
		*/
		driver.findElement(By.xpath("//div//input[@type='text']")).click();
		driver.findElement(By.xpath("//div//input[@type='text']")).sendKeys(name);
		WaitElementDisplay(By.xpath("//li[@class='uib-typeahead-match ng-scope active']"));
		driver.findElement(By.xpath("//li[@class='uib-typeahead-match ng-scope active']")).click();
		Sleep(300);
		//WaitElementDisplay(By.xpath("//div[@class='name-city ng-binding']"));
	}
	public void UseCodCoopon(String promocod) 
	{ 
		//click(FirstNameCheckout);
		ExplicityWaitIsClickable(By.xpath("//div[@class='mobile_use_promo']"));
		filltext(PromoCode,promocod);
		driver.hideKeyboard();
		driver.findElement(By.xpath("//span[@class='apply_promo_code']")).click();
		WaitElementDisplay(By.xpath("//button[@class='mobileBookme_payment_form_button']"));
		
		//Actions act = new Actions(driver);
		//act.sendKeys(Keys.ENTER).perform();
	}

	public void SelectStylist() 
	{		
		click(TitleOfStylist);
		Sleep(300);


	}

	public void BookStylist() 
	{	
		click(SelectStylist);	
	}

	public void CloseCheckout() 
	{		
		click(CloseBtnCheckout);	
	}

	public void FilterIcon() 
	{		
		Sleep(300);
		click(FilterIcon);	
		WaitElementDisplay(By.xpath("(//div[@class='entry-sub ng-binding'])[1]"));
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
		Sleep(300);
		click(ClickApllay);	
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
