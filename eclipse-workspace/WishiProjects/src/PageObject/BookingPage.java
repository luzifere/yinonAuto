package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BookingPage extends BasePage
{
	public BookingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div//span[text()[contains(.,'My Style Sessions')]]")
	WebElement MyStyleSessions;
	@FindBy(xpath="//div//span[text()[contains(.,'Stylists')]]")
	WebElement stylist;

	@FindBy(xpath="//a[text()[contains(.,'Stylists')]]")
	WebElement BookStylist;

	@FindBy(xpath="//label[@for='miniRadio']")
	WebElement Mini;
	@FindBy(xpath="//label[@for='majorRadio']")
	WebElement Major;
	@FindBy(xpath="(//label[@class='form-check-label'])[1]")
	WebElement Subscription;
	@FindBy(xpath="(//label[@class='form-check-label'])[2]")
	WebElement OneTime;

	@FindBy(xpath="//div[@ng-click='ok()']")
	WebElement Applay;

	@FindBy(xpath="//div//span[text()[contains(.,'Book A Stylist')]]")
	WebElement BookStylisk;
	@FindBy(xpath="//div[@class='big-box mini-top']//button[@class='get-your-style black-btn']")
	WebElement StartedMini;
	@FindBy(xpath="//div[@class='big-box major-top']//button[@class='get-your-style black-btn']")
	WebElement StartedMajor;

	@FindBy(xpath="//div[@class='select__control css-yk16xz-control']")
	WebElement SearchBar;

	@FindBy(xpath="//input[@id='react-select-2-input']")
	WebElement TextBar;

	@FindBy(xpath="//div//input[@placeholder='Add Promo Code']")                     
	WebElement SearchInput;

	@FindBy(xpath="//label//div[text()[contains(.,'Gender')]]")
	WebElement Gender;


	@FindBy(xpath="//div [text()[contains(.,'Female')]]")
	WebElement Femaile;

	@FindBy(xpath="//div//ul[@class='dropdown-menu ng-isolate-scope']")
	WebElement Dropdown;

	@FindBy(xpath="//li//a[@class='ng-binding ng-scope']")
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
	WebElement PromoCode;//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']

	@FindBy(xpath="//div[@class='closeXRight']")
	WebElement CloseBtnCheckout;

	@FindBy(xpath="(//div//input[@class='form-control ng-pristine ng-untouched ng-not-empty ng-valid ng-valid-required'])[1]")
	WebElement FirstNameCheckout;

	@FindBy(xpath="(//div//input[@class='form-control'])[2]")
	WebElement LastNameCheckout;

	@FindBy(xpath="//div//button[@class='payment_form_button space-8']")
	WebElement FinishCheckout;

	@FindBy(xpath="//div[@class='thank-u-btn']")
	WebElement TakeYourStyleQuiz;

	@FindBy(xpath="//div[@class='thank-u-btn']")
	WebElement BookStylisButton;

	@FindBy(css ="[name='cardnumber']")
	WebElement CardNaumber;

	@FindBy(css="[name='exp-date']")
	WebElement DateOfCard;

	@FindBy(css="[name='cvc']")
	WebElement CVCCard;

	@FindBy(xpath="//button[@class='payment_form_button ng-binding']")
	WebElement PayButton;
	@FindBy(xpath="//div[@class='deal-btn ng-binding ng-scope']")
	WebElement Next;

	@FindBy(xpath="//label[@for='mini']")
	WebElement MIniGoal;
	@FindBy(xpath="//label[@for='mini']")
	WebElement MajorGoal;

	@FindBy(xpath="(//button[@type='button'])[1]")
	WebElement MIniPlan;
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement MajorPlan;
	@FindBy(xpath="//div[@class='stylist-chat-header ']")
	WebElement chatheader;
	@FindBy(xpath="//span[@class='d-none d-sm-block']")
	WebElement bookstylistprofile;
	@FindBy(xpath="//button[@class='d-none d-sm-flex btn btn-dark']")
	WebElement paymentbutton;
	@FindBy(xpath="//button[@title='Collapse Widget']")
	WebElement chatbutton;




	public void ClickPaymentButton() 
	{
		try

		{
			ExplicityWaitIsClickable(paymentbutton);

		}catch(Exception e){


			System.err.println("\nError : ClickPaymentButton failed\n");
			throw e;

		}

	}

	public void BookStylistProfile() 
	{
		try

		{
			if (chatbutton.isDisplayed())
			{
				ExplicityWaitIsClickable(chatbutton);
			}
			
			ExplicityWaitIsClickable(bookstylistprofile);

		}catch(Exception e){


			System.err.println("\nError : ClickMIniPlan failed\n");
			throw e;

		}

	}

	public void ClickStylistHeader() 
	{
		try

		{
			ExplicityWaitIsClickable(stylist);

		}catch(Exception e){


			System.err.println("\nError : ClickStylistHeader failed\n");
			throw e;

		}

	}

	public void ClickMIniPlan() 
	{
		try

		{
			ExplicityWaitIsClickable(MIniPlan);

		}catch(Exception e){


			System.err.println("\nError : ClickMIniPlan failed\n");
			throw e;

		}

	}

	public void ChatPresent() 
	{
		try

		{
			Assert.assertTrue(ElementDisplay(chatheader));

		}catch(Exception e){


			System.err.println("\nError : ChatPresent failed\n");
			throw e;

		}

	}

	public void ClickMajorPlan() 
	{
		try

		{
			ExplicityWaitIsClickable(MajorPlan);

		}catch(Exception e){


			System.err.println("\nError : ClickMajorPlan failed\n");
			throw e;

		}

	}

	public void ClickMIniGoal() 
	{
		try

		{
			ExplicityWaitIsClickable(MIniGoal);

		}catch(Exception e){


			System.err.println("\nError : ClickMIniGoal failed\n");
			throw e;

		}

	}

	public void ClickMajorGoal() 
	{
		try

		{
			ExplicityWaitIsClickable(MajorGoal);

		}catch(Exception e){


			System.err.println("\nError : ClickMajorGoal failed\n");
			throw e;

		}

	}
	public void ClickBookStylisButton() 
	{
		try

		{
			ExplicityWaitIsClickable(BookStylisButton);

		}catch(Exception e){


			System.err.println("\nError : ClickMyBooking failed\n");
			throw e;

		}

	}
	public void ClickMyStyleSessions() 
	{
		try

		{
			ExplicityWaitIsClickable(MyStyleSessions);

		}catch(Exception e){


			System.err.println("\nError : ClickMyStyleSessions failed\n");

		}

	}

	public void ClickSubScription() 
	{
		try

		{
			//Sleep(300);
			ExplicityWaitIsClickable(Subscription);

		}catch(Exception e){


			System.err.println("\nError : ClickSubScription failed\n");

		}

	}
	public void ClickOneTime() 
	{
		try

		{
			Sleep(300);
			ExplicityWaitIsClickable(OneTime);

		}catch(Exception e){


			System.err.println("\nError : ClickSubScription failed\n");

		}

	}
	public void SearchStylist(String name) 

	{  
		try

		{
			WaitElementDisplay(SearchBar);
			Sleep(300);
			//click(SearchBar);
			ExplicityWaitIsClickable(SearchBar);
			filltext(TextBar, name);
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ENTER).perform();
			Sleep(300);

		}catch(Exception e){


			System.err.println("\nError : SearchStylist failed\n");

		}

	}
	public void UseCodCoopon(String promocod) 
	{ 
		try

		{
			//click(FirstNameCheckout);
			//ExplicityWaitIsClickable(By.xpath("//div//input[@class='no-border bgTransparent ng-pristine ng-valid ng-empty ng-touched']"));
			//driver.findElement(By.xpath("(//div//input[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty'])[1]")).click();
			//driver.findElement(By.xpath("//div//input[@class='no-border bgTransparent ng-pristine ng-valid ng-empty ng-touched']")).click();
			driver.findElement(By.xpath("//input[@id='coupon-element']")).click();
			driver.findElement(By.xpath("//input[@id='coupon-element']")).sendKeys(promocod);

			//filltext(PromoCode,promocod);
			Sleep(300);
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ENTER).perform();

		}catch(Exception e){


			System.out.println("\nError : UseCodCoopon failed\n");

		}

	}

	public void SelectStylist() 
	{	
		try

		{
			click(TitleOfStylist);
			Sleep(300);
			scrollDown();
			WaitElementDisplay(By.xpath("//div[@class='deal-btn ng-binding ng-scope']"));
			click(Next);


		}catch(Exception e){


			System.out.println("\nError : SelectStylist failed\n");

		}



	}

	public void SelectMini() 
	{
		try

		{
			WaitElementDisplay(By.xpath("//label[@for='miniRadio']"));
			click(Mini);
			WaitElementDisplay(By.xpath("//div[@class='big-box mini-top']//button[@class='get-your-style black-btn']"));
			click(StartedMini);
			WaitElementDisplay(By.xpath("//div[@class='payment-title ng-scope']"));

		}catch(Exception e){


			System.out.println("\nError : SelectMini failed\n");

		}

	}

	public void SelectMajor() 
	{	
		try

		{
			WaitElementDisplay(By.xpath("//label[@for='majorRadio']"));
			click(Major);	
			WaitElementDisplay(By.xpath("//div[@class='big-box major-top']//button[@class='get-your-style black-btn']"));
			click(StartedMajor);
			WaitElementDisplay(By.xpath("//div[@class='payment-title ng-scope']"));		 
		}catch(Exception e){


			System.out.println("\nError : SelectMajor failed\n");

		}

	}
	public void BookStylist() 
	{	
		try

		{
			ExplicityWaitIsClickable(SelectStylist);

		}catch(Exception e){


			System.out.println("\nError : BookStylist failed\n");

		}

	}
	public void CloseCheckout() 
	{		
		try

		{
			ExplicityWaitIsClickable(CloseBtnCheckout);

		}catch(Exception e){


			System.out.println("\nError : SelectSingle failed\n");

		}

	}

	public void ClickBookingstylist() 
	{
		try

		{
			ExplicityWaitIsClickable(BookStylist);		


		}catch(Exception e){


			System.out.println("\nError : ClickBookingstylist failed\n");

		}
	}	

	public void ClickGender() 
	{	
		try

		{
			click(Gender);	


		}catch(Exception e){


			System.out.println("\nError : ClickGender failed\n");

		}

	}
	public void Clickfemaile() 
	{		
		try

		{
			click(Femaile);	


		}catch(Exception e){


			System.out.println("\nError : Clickfemaile failed\n");

		}

	}
	public void ClickApplay() 
	{	
		try

		{
			click(Applay);


		}catch(Exception e){


			System.out.println("\nError : ClickApplay failed\n");

		}

	}
	public void ClickFinishCheckout() 
	{	
		try

		{
			WaitElementDisplay(By.xpath("//div//button[@class='payment_form_button space-8']"));
			Sleep(300);
			click(FinishCheckout);
			Sleep(300);


		}catch(Exception e){


			System.out.println("\nError : ClickFinishCheckout failed\n");

		}

	}

	public void SelectService() 
	{	
		try

		{
			Sleep(30);
			click(SelectService);
			Sleep(150);


		}catch(Exception e){


			System.out.println("\nError : SelectService failed\n");

		}


	}
	public void SelectUnlimited() 
	{	
		try

		{
			click(SelectUnlimited);


		}catch(Exception e){


			System.out.println("\nError : SelectUnlimited failed\n");

		}

	}
	public void ClickFirstName() 
	{	
		try

		{
			click(ClickApllay);


		}catch(Exception e){


			System.out.println("\nError : ClickFirstName failed\n");

		}

	}
	public void ClickLastName() 
	{	
		try

		{
			click(ClickApllay);


		}catch(Exception e){


			System.out.println("\nError : ClickLastName failed\n");

		}

	}
	public void ClickApllay() 
	{	
		try

		{
			click(ClickApllay);


		}catch(Exception e){


			System.out.println("\nError : ClickApllay failed\n");

		}
	}
	public void FillFirstName(String firstname)
	{
		try

		{
			filltext(FirstNameCheckout, firstname);


		}catch(Exception e){


			System.out.println("\nError : FillFirstName failed\n");

		}

	}
	public void FillLastName(String lastname)
	{
		try

		{
			filltext(LastNameCheckout, lastname);


		}catch(Exception e){


			System.out.println("\nError : FillLastName failed\n");

		}

	}
	public void FillCardNumber(String number)
	{
		try

		{
			Sleep(150);
			filltext(CardNaumber, number);


		}catch(Exception e){


			System.out.println("\nError : FillCardNumber failed\n");

		}

	}
	public void FillCardDate(String date )
	{
		try

		{
			Sleep(150);
			filltext(DateOfCard, date);


		}catch(Exception e){


			System.out.println("\nError : FillCardDate failed\n");

		}

	}
	public void FillCardCVC(String cvc)
	{
		try

		{
			Sleep(150);
			filltext(CVCCard, cvc);
			//Sleep(300);
			Actions act = new Actions(driver);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();
			Sleep(50);


		}catch(Exception e){


			System.out.println("\nError : FillCardCVC failed\n");

		}

	}
	public void ClickTakeYourStyleQuiz() 
	{
		try

		{
			Sleep(300);
			click(TakeYourStyleQuiz);


		}catch(Exception e){


			System.out.println("\nError : ClickTakeYourStyleQuiz failed\n");

		}

	}
	public void ClickPayButton() 
	{
		try

		{
			click(PayButton);


		}catch(Exception e){


			System.out.println("\nError : ClickPayButton failed\n");

		}


	}
}

