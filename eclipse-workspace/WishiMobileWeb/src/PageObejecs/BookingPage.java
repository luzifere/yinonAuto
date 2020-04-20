package PageObejecs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;

public class BookingPage extends BasePage
{
	/*
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

	@FindBy(xpath="//span[text()[contains(.,'Stylists')]]")
	WebElement BookStylisk;


	@FindBy(xpath="//div[@class='search-bar pull-left']")
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

	@FindBy(xpath="//div[@class='next-btn']")
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

	@FindBy(xpath="(//button[@class='mobileBookme_payment_form_button'])[1]")
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
	@FindBy(xpath="//label[@for='miniRadio']")
	WebElement Mini;
	@FindBy(xpath="//label[@for='majorRadio']")
	WebElement Major;
	@FindBy(xpath="//div[@class='box mini-box']/..//button[@class='get-your-style']")
	WebElement StartedMini;
	@FindBy(xpath="//div[@class='box major-box']/..//button[@class='get-your-style']")
	WebElement StartedMajor;


	public void SelectMini() 
	{
		try

		 {
			WaitElementDisplay(By.xpath("//label[@for='miniRadio']"));
			click(Mini);
			WaitElementDisplay(By.xpath("//div[text()[contains(.,'40')]]"));
			Sleep(300);
			scrollDown();
			WaitElementDisplay(By.xpath("//div[@class='box mini-box']/..//button[@class='get-your-style']"));
			click(StartedMini);
			WaitElementDisplay(By.xpath("//h3[text()[contains(.,'Typically responds within')]]"));

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
			WaitElementDisplay(By.xpath("//div[text()[contains(.,'90')]]"));
			Sleep(300);
			scrollDown();
			WaitElementDisplay(By.xpath("//div[@class='box major-box']/..//button[@class='get-your-style']"));
			click(StartedMajor);
			WaitElementDisplay(By.xpath("//h3[text()[contains(.,'Typically responds within')]]"));

		 }catch(Exception e){


			 System.out.println("\nError : SelectMajor failed\n");

		 }

	}
	public void ClickName() 
	{
		//click(FirstNameCheckout);
		driver.findElement(By.xpath("//div[@id='card-element']")).click();
		/*
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		Sleep(200);
		act.sendKeys(Keys.TAB).perform();

		//Sleep(300);
	}
	public void ClickMyBooking() 
	{
		click(BookBtn);	
	}
	public void ClickSearchButton() 
	{	
		Sleep(300);
		//click(SearchBarButton);	
		driver.findElement(By.xpath("//div[@class='search-bar ']")).click();
	}

	public void SearchStylist(String name) 

	{  
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

		//driver.findElement(By.xpath("//div[@class='search-bar pull-left']")).click();
		driver.findElement(By.xpath("//div//input[@type='text']")).sendKeys(name);
		WaitElementDisplay(By.xpath("//li//a[@class='ng-binding ng-scope']"));
		driver.findElement(By.xpath("//li//a[@class='ng-binding ng-scope']")).click();
		Sleep(300);
		//WaitElementDisplay(By.xpath("//div[@class='name-city ng-binding']"));
	}
	public void UseCodCoopon(String promocod) 
	{ 
		//click(FirstNameCheckout);
		//ExplicityWaitIsClickable(By.xpath("//div[@class='mobile_use_promo']"));
		driver.findElement(By.xpath("//span[@class='mobile_use_promo']")).click();
		filltext(PromoCode,promocod);
		driver.hideKeyboard();
		driver.findElement(By.xpath("(//button[@class='btn mobileBookme_payment_form_button'])[1]")).click();
		WaitElementDisplay(By.xpath("(//button[@class='mobileBookme_payment_form_button'])[1]"));

		//Actions act = new Actions(driver);
		//act.sendKeys(Keys.ENTER).perform();
	}

	public void SelectStylist() 
	{		
		click(TitleOfStylist);
		Sleep(300);


	}

	public void BookStylist() 
	{	Sleep(300);
		WaitElementDisplay(By.xpath("//div[@class='next-btn']"));
		Sleep(100);
		click(SelectStylist);
		Sleep(300);
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
		Sleep(250);
		filltext(CardNaumber, number);
	}
	public void FillCardDate(String date )
	{
		Sleep(250);
		filltext(DateOfCard, date);
	}
	public void FillCardCVC(String cvc)
	{
		Sleep(250);
		filltext(CVCCard, cvc);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();

		Sleep(250);
		//driver.pressKeyCode(AndroidKeyCode.KEYCODE_TAB, AndroidKeyMetastate.META_SHIFT_ON);
		//driver.pressKeyCode(AndroidKeyCode.KEYCODE_TAB, AndroidKeyMetastate.META_SHIFT_ON);
		//driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER, AndroidKeyMetastate.META_SHIFT_ON);
		driver.switchTo().defaultContent();
		//Sleep(250);
		driver.findElement(By.xpath("(//button[@class='btn mobileBookme_payment_form_button ng-binding'])")).click();
		Sleep(250);
		driver.findElement(By.xpath("(//button[@class='btn mobileBookme_payment_form_button ng-binding'])")).click();

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
	 */
	public BookingPage(AndroidDriver<AndroidElement> _driver) {
		super(_driver);
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
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement promocodeField;
	@FindBy(xpath="//a[@class='add-code']")
	WebElement promocode;
	@FindBy(xpath="(//button[@class='btn btn-dark'])[1]")
	WebElement promocodesubmit;
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
	@FindBy(xpath="//label[@for='cleanout']")
	WebElement cleanoutGoal;
	@FindBy(xpath="//label[@for='major']")
	WebElement MajorGoal;

	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement MIniPlan;
	@FindBy(xpath="(//button[@type='button'])[4]")
	WebElement MajorPlan;
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement MajorPlanOfCleanOut;
	@FindBy(xpath="//p[text()[contains(.,'You successfully booked')]]")
	WebElement quizheader;
	@FindBy(xpath="//span[@class='d-block d-sm-none']")
	WebElement bookstylistprofile;
	@FindBy(xpath="//button[@class='d-none d-sm-flex btn btn-dark']")
	WebElement paymentbutton;
	@FindBy(xpath="//button[@title='Collapse Widget']")
	WebElement chatbutton;
	@FindBy(xpath="//div[text()[contains(.,'Total')]]/..//div[text()[contains(.,'0')]]")
	WebElement total_0;

	@FindBy(xpath="(//div[text()[contains(.,'BEST MATCH')]]/..//div[text()[contains(.,'Mini')]])[2]")
	WebElement minibest;
	@FindBy(xpath="//p[text()[contains(.,'Mini package')]]")
	WebElement minipackage;
	@FindBy(xpath="(//div[text()[contains(.,'BEST MATCH')]]/..//div[text()[contains(.,'Major')]])[2]")
	WebElement majorbest;
	@FindBy(xpath="//p[text()[contains(.,'Major package')]]")
	WebElement majorpackage;
	@FindBy(xpath="//div[text()[contains(.,'Closet clean out package')]]")
	WebElement cleanoutpackage;
	@FindBy(xpath="//div[text()[contains(.,'Add Credit Card')]]")
	WebElement addCC;
	@FindBy(xpath="(//button[text()[contains(.,'Confirm')]])[1]")
	WebElement confirm;
	@FindBy(xpath="(//button[text()[contains(.,'complete booking')]])[1]")
	WebElement complatebooking;
	@FindBy(xpath="//button[@class='btn btn-warning']")
	WebElement letsgo;
	@FindBy(xpath="//div//a[text()[contains(.,'My Style Sessions')]]")
	WebElement mySessions;
	@FindBy(xpath="//div[@class='channel ng-scope']")
	WebElement channel;





	public void MyBookingDisplay() 
	{
		try 
		{		
			ExplicityWaitIsDisplayed(stylist);				
		}

		catch(Exception e){


			System.err.println("\nError : MyBookingDisplay failed\n");
			throw e;

		}

	}
	
	public void ClickComplateBooking() 
	{
		try

		{
			ExplicityWaitIsClickable(complatebooking);

		}catch(Exception e){


			System.err.println("\nError : ClickComplateBooking failed\n");
			throw e;

		}
		WaitElementDisplay(letsgo);
		Assert.assertTrue(ElementDisplay(letsgo));
	}
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
	public void Clickonfirm() 
	{
		try

		{
			ExplicityWaitIsClickable(confirm);

		}catch(Exception e){


			System.err.println("\nError : Clickonfirm failed\n");
			throw e;

		}

	}
	public void ClickaddCC() 
	{
		try

		{
			ExplicityWaitIsClickable(addCC);

		}catch(Exception e){


			System.err.println("\nError : ClickaddCC failed\n");
			throw e;

		}

	}
	public void AssertTotalIs0() 
	{
		try

		{
			WaitElementDisplay(total_0);
			Assert.assertTrue(ElementDisplay(total_0));

		}catch(Exception e){


			System.err.println("\nError : AssertTotalIs0 failed\n");
			throw e;

		}

	}

	public void ClickPromoCode() 
	{
		try

		{
			ExplicityWaitIsClickable(promocode);

		}catch(Exception e){


			System.err.println("\nError : ClickPromoCode failed\n");
			throw e;

		}

	}
	public void FillPromoCode(String code) 
	{
		try

		{
			filltext(promocodeField,code);

		}catch(Exception e){


			System.err.println("\nError : FillPromoCode failed\n");
			throw e;

		}

	}
	public void ClickSubmitPromoCode() 
	{
		try

		{
			ExplicityWaitIsClickable(promocodesubmit);

		}catch(Exception e){


			System.err.println("\nError : ClickSubmitPromoCode failed\n");
			throw e;

		}

	}
	public void BookStylistProfile() 
	{
		try

		{
			Sleep(300);
			ExplicityWaitIsClickable(bookstylistprofile);

		}catch(Exception e){


			System.err.println("\nError : BookStylistProfile failed\n");
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
			scrollDown();
			ExplicityWaitIsClickable(MIniPlan);

		}catch(Exception e){


			System.err.println("\nError : ClickMIniPlan failed\n");
			throw e;

		}
		WaitElementDisplay(minipackage);
		Assert.assertTrue(ElementDisplay(minipackage));

	}

	public void QuizPresent() 
	{
		try

		{
			Assert.assertTrue(ElementDisplay(quizheader));

		}catch(Exception e){


			System.err.println("\nError : QuizPresent failed\n");
			throw e;

		}

	}

	public void ClickMajorPlan() 
	{
		try

		{
			scrollDown();
			ExplicityWaitIsClickable(MajorPlan);

		}catch(Exception e){


			System.err.println("\nError : ClickMajorPlan failed\n");
			throw e;

		}
		WaitElementDisplay(majorpackage);
		Assert.assertTrue(ElementDisplay(majorpackage));

	}
	public void ClickMajorPlanOfCleanOut() 
	{
		try

		{
			scrollDown();
			ExplicityWaitIsClickable(MajorPlanOfCleanOut);

		}catch(Exception e){


			System.err.println("\nError : ClickMajorPlanOfCleanOut failed\n");
			throw e;

		}
		WaitElementDisplay(cleanoutpackage);
		Assert.assertTrue(ElementDisplay(cleanoutpackage));

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
		WaitElementDisplay(minibest);
		Assert.assertTrue(ElementDisplay(minibest));

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
		WaitElementDisplay(majorbest);
		Assert.assertTrue(ElementDisplay(majorbest));

	}
	public void ClickCleanOutGoal() 
	{
		try

		{
			ExplicityWaitIsClickable(cleanoutGoal);

		}catch(Exception e){


			System.err.println("\nError : ClickCleanOutGoal failed\n");
			throw e;

		}
		WaitElementDisplay(majorbest);
		Assert.assertTrue(ElementDisplay(majorbest));

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
			Sleep(300);

		}catch(Exception e){


			System.err.println("\nError : ClickSubScription failed\n");

		}

	}
	public void SearchStylist(String name,String lastname) 

	{  
		try

		{

			WaitElementDisplay(SearchBar);
			ExplicityWaitIsClickable(SearchBar);
			filltext(TextBar, name+" "+lastname);			
			List<AndroidElement> list = driver.findElements(By.cssSelector(".select__menu>div>div"));
			System.out.println(list.size());

			for(AndroidElement el: list) {
				if(el.getText().equalsIgnoreCase(name+" "+lastname)) {
					ExplicityWaitIsClickable(el);
					break;
				}
				System.out.println(el.getText());
			}


		}catch(Exception e){


			System.err.println("\nError : SearchStylist failed\n");

		}

	}
	public void MySessionDisplay() 
	{
		try 
		{
			for(int i = 0; i < 15; i++) 
			{
				if(ElementDisplay(channel))
				{
					break;
				}
				
				else if(!ElementDisplay(channel)) 
				{
					ExplicityWaitIsClickable(stylist);
					ExplicityWaitIsClickable(mySessions);
					Sleep(300);
					RefreshPage();
					
				}
					
			}
		}

		catch(Exception e){


			System.err.println("\nError : MySessionDisplay failed\n");
			throw e;

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
			Sleep(50);
			switchWindow();
			ExplicityWaitIsClickable(confirm);
			ExplicityWaitIsDisplayed(complatebooking);



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
