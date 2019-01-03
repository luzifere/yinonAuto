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
	
	@FindBy(xpath="//span[text()[contains(.,'Stylists')]]")
	WebElement BookStylist;

	@FindBy(xpath="//a//div[text()[contains(.,'Start 7 day free trial')]]")
	WebElement MemberShip;
	@FindBy(xpath="//a//div[text()[contains(.,'Single session')]]")
	WebElement Single;

	@FindBy(xpath="//div[@ng-click='ok()']")
	WebElement Applay;

	@FindBy(xpath="//div//span[text()[contains(.,'Book A Stylist')]]")
	WebElement BookStylisk;


	@FindBy(xpath="//div[@class='img-box']")
	WebElement SearchBar;
	
	@FindBy(xpath="//div//input[@type='text']")
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
		try
		 
		 {
			click(BookBtn);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickMyBooking failed\n");
			
		 }
			
	}
	public void SearchStylist(String name) 

	{  
		try
	 
	 {
		WaitElementDisplay(By.xpath("//div//input[@type='text']"));
		Sleep(300);
		click(SearchBar);
		filltext(TextBar, name);
		//Actions act = new Actions(driver);
		//act.sendKeys(Keys.ENTER).perform();
		Sleep(300);
	 
	 }catch(Exception e){
	 
		
		 System.out.println("\nError : SearchStylist failed\n");
		
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
			WaitElementDisplay(By.xpath("//a//div[text()[contains(.,'Single session')]]"));
		 
		 }catch(Exception e){
		 
			
			 System.out.println("\nError : SelectStylist failed\n");
			
		 }
		
		
		
	}

	public void SelectMemberShip() 
	{
		try
		 
		 {
			Sleep(250);
			click(MemberShip);
			Sleep(450);
		 
		 }catch(Exception e){
		 
			
			 System.out.println("\nError : SelectMemberShip failed\n");
			
		 }
		
	}

	public void SelectSingle() 
	{	
		try
		 
		 {
			click(Single);	
			Sleep(450);
		 
		 }catch(Exception e){
		 
			
			 System.out.println("\nError : SelectSingle failed\n");
			
		 }
		
	}
	public void BookStylist() 
	{	
		try
		 
		 {
			click(SelectStylist);
		 
		 }catch(Exception e){
		 
			
			 System.out.println("\nError : BookStylist failed\n");
			
		 }
			
	}
	public void CloseCheckout() 
	{		
		try
		 
		 {
			click(CloseBtnCheckout);
		 
		 }catch(Exception e){
		 
			
			 System.out.println("\nError : SelectSingle failed\n");
			
		 }
			
	}

	public void ClickBookingstylist() 
	{
		try
		 
		 {
			click(BookStylist);		

		 
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
			Sleep(300);
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

