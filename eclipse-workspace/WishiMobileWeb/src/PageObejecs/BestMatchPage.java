package PageObejecs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BestMatchPage extends BasePage
{
	
	@FindBy(xpath="(//div[@class='fld-select'])[1]")
	WebElement Mount;
	@FindBy(xpath="//div[@class='mobile-back d-flex d-sm-none nav-item']")
	WebElement Back;
	@FindBy(xpath="//input[@type='tel']")
	WebElement Age;
	@FindBy(xpath="(//div[@class='fld-select'])[2]")
	WebElement Day;
	@FindBy(xpath="(//div[@class='fld-select'])[3]")
	WebElement Year;
	@FindBy(xpath="//div//button[@class='btn-start']")
	WebElement ContinueButton;
	@FindBy(xpath="(//button[@class='btn btn-dark'])[2]")	
	//@FindBy(xpath="//div[text()[contains(.,'GET STARTED >')]]")
	WebElement StartHere;
	@FindBy(xpath="//div[@class='get-your-style ng-binding']")
	WebElement GetStyle;
	@FindBy(xpath="//div//label[text()[contains(.,'Female')]]")
	WebElement Female;
	@FindBy(xpath="//button[@class='btn btn-warning']")
	WebElement MeetMyMatch;
	@FindBy(xpath="//div//label[text()[contains(.,'Male')]]")
	WebElement Male;
	@FindBy(xpath="//div//label[text()[contains(.,'Non Binary')]]")
	WebElement SelfIdentity;
	@FindBy(xpath="(//div//button[text()[contains(.,'Next')]])[1]")
	WebElement TagsNextButton;
	@FindBy(xpath="//div//button[text()[contains(.,'NEXT')]]")
	WebElement NextButton;
	@FindBy(xpath="(//button[text()[contains(.,'SKIP')]])[2]")
	WebElement SkipButton;
	@FindBy(xpath="//div//a[text()[contains(.,'$50-$100')]]")
	WebElement LowBudget;
	@FindBy(xpath="(//div//a[text()[contains(.,'$50-$100')]])[2]")
	WebElement LowBudget2;
	@FindBy(xpath="//div//a[text()[contains(.,'$100-$400')]]")
	WebElement MiddleBudget;
	@FindBy(xpath="(//div//a[text()[contains(.,'$100-$400')]])[2]")
	WebElement MiddleBudget2;

	@FindBy(xpath="//div//a[text()[contains(.,'$400-$1,000')]]")
	WebElement Expensive1;
	@FindBy(xpath="(//div//a[text()[contains(.,'$400-$1,000')]])[2]")
	WebElement Expensive1_1;

	@FindBy(xpath="//div//a[text()[contains(.,'$1,000+')]]")
	WebElement Expensive2;
	@FindBy(xpath="(//div//a[text()[contains(.,'$1,000+')]])[2]")
	WebElement Expensive2_1;
	@FindBy(xpath="//label[text()[contains(.,'Petite')]]")
	WebElement Petit;

	@FindBy(xpath="//label[text()[contains(.,'Plus Size')]]")
	WebElement PlusSize;

	@FindBy(xpath="//a[text()[contains(.,'Postpartum')]]")
	WebElement Postpartum;

	@FindBy(xpath="//a[text()[contains(.,'Models')]]")
	WebElement Models;

	@FindBy(xpath="//div//button[text()[contains(.,'SEE MORE')]]")
	WebElement ViewMoreStylist;
	
	@FindBy(xpath="//div[text()[contains(.,'Your Stylists Match!')]]")
	WebElement YourStylistMatch;
	
	@FindBy(xpath="(//button[text()[contains(.,'NEXT')]])[2]")
	WebElement next;
	
	@FindBy(xpath="//button[@class='btn btn-warning']")
	WebElement LetsGetStylingBuutton;
	@FindBy(xpath="//img[@class='filter-icon']")
	WebElement filtericon;
	@FindBy(xpath="//p[@class='retake']")
	WebElement retake;
	
	






	public BestMatchPage(AndroidDriver<AndroidElement> _driver) {
		super(driver);
	}


	public void ClicRetake() 
	{	
		try
		 
		 {
			ExplicityWaitIsClickable(retake);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : ClicRetake failed\n");
			 throw e;
			
		 }
		
	}
	public void ClicOnFilter () 
	{	
		try
		 
		 {
			ExplicityWaitIsClickable(filtericon);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : ClicOnFilter failed\n");
			 throw e;
			
		 }
		
	}
	
	public void selectMounts(int num)
	{
		Select mounts = new Select (driver.findElement(By.xpath("(//select[@ng-model='formData.month'])")));
		click(Mount);
		mounts.selectByIndex(num);
	}
	public void selectDays( int num)
	{
		Select days = new Select (driver.findElement(By.xpath("(//select[@ng-model='formData.day'])")));
		click(Day);
		days.selectByIndex(num);
	}
	public void selectYears(int num)
	{
		Select years = new Select (driver.findElement(By.xpath("(//select[@ng-model='formData.year'])")));
		click(Year);
		years.selectByIndex(num);
	}
	
	public void Selectbrands(String inspiration)
	{
		try
		 
		 {
		 
			String GoalElemet = ("//div[@id='text1']");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			WaitElementDisplay(GoalButton);
			Sleep(100);
			click(GoalButton);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : Selectbrands failed\n");
			 throw e;
			
		 }
		
	} 
	
	public void SelectLoveIt(String inspiration)
	{
		try
		 
		 {
			scrollDown();
			Sleep(200);
			String GoalElemet = ("(//label[text()[contains(.,'LOVE IT!')]])[text1]");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			//WaitElementDisplay(By.xpath("(//span[text()[contains(.,'LOVE IT!')]])[2]"));
			Sleep(100);
			click(GoalButton);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : SelectLoveIt failed\n");
			 throw e;
			
		 }
		
	}
	public void SelectHELLONO(String inspiration)
	{
		try
		 
		 {
			scrollDown();
			Sleep(200);
			String GoalElemet = ("(//label[text()[contains(.,'HELL NO!')]])[text1]");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			//WaitElementDisplay(By.xpath("(//span[text()[contains(.,'LOVE IT!')]])[2]"));
			Sleep(100);
			click(GoalButton);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : SelectLoveIt failed\n");
			 throw e;
			
		 }
		
	}
	public void SelectSOMETIMES(String inspiration)
	{
		try
		 
		 {
			scrollDown();
			Sleep(200);
			String GoalElemet = ("(//label[text()[contains(.,'SOMETIMES')]])[text1]");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			//WaitElementDisplay(By.xpath("(//span[text()[contains(.,'LOVE IT!')]])[2]"));
			Sleep(100);
			click(GoalButton);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : SelectLoveIt failed\n");
			 throw e;
			
		 }
		
	}
	public void ClickontinueButton() 
	{	
		try
		 
		 {
			ExplicityWaitIsClickable(LetsGetStylingBuutton);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : ClickontinueButton failed\n");
			 throw e;
			
		 }
		
	}
	public void ClickMoreStylistsButton() 
	{	
		try
		 
		 {
			Sleep(100);
			click(ViewMoreStylist);
			Sleep(100);
			//WaitElementDisplay(By.xpath("//*[@name='Allow']"));
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickMoreStylistsButton failed\n");
			  throw e;
			
		 }
		
	}


	public void ClickFamle() 
	{
		try
		 
		 {
			ExplicityWaitIsClickable(Female);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickFamle failed\n");
			  throw e;
			
		 }
	}
	public void ClickPlusSize() 
	{
		try
		 
		 {
			ExplicityWaitIsClickable(PlusSize);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickPlusSize failed\n");
			  throw e;
			
		 }
	}
	public void ClickPetit() 
	{
		try
		 
		 {
			ExplicityWaitIsClickable(Petit);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickPetit failed\n");
			  throw e;
			
		 }
	}
		public void ClickMeetMyMatch() 
		{
			try
			 
			 {
				WaitElementDisplay(MeetMyMatch);
				scrollDown();
				Sleep(100);
				click(MeetMyMatch);
				Sleep(100);
			 
			 }catch(Exception e){
			 
				
				  System.err.println("\nError : ClickMeetMyMatch failed\n");
				  throw e;
				
			 }
		
	}
	public void ClickSelfIdentityButtonID() 
	{
		try
		 
		 {
		 
			WaitElementDisplay(SelfIdentity);
			Sleep(100);
			click(SelfIdentity);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : ClickSelfIdentityButtonID failed\n");
			 throw e;
			
		 }
		
	}
	public void ClickBack() 
	{
		try
		 
		 {
			ExplicityWaitIsClickable(Back);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickBack failed\n");
			  throw e;
			
		 }
	}
	
	public void ClickMale() 
	{
		try
		 
		 {

			WaitElementDisplay(Male);
			Sleep(100);
			click(Male);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickMale failed\n");
			  throw e;
		 }
		
	}
	public void ClickStartHere() 
	{
		try
		 
		 {

			WaitElementDisplay(StartHere);
			Sleep(100);
			click(StartHere);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickStartHere failed\n");
			  throw e;
			
		 }
		
	}
	public void ClickGetStyle() 
	{
		try
		 
		 {

			Sleep(100);
			click(GetStyle);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickGetStyle failed\n");
			  throw e;
			
		 }
		
	}


	
	

	public void ClickNextbutton() 
	{
		try
		 
		 {
			ExplicityWaitIsClickable(next);

		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickNextbutton failed\n");
			  throw e;
			
		 }
	}
	public void ClickTagsNextButton() 
	{
		try
		 
		 {
			Sleep(100);
			click(TagsNextButton);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickTagsNextButton failed\n");
			  throw e;
			
		 }
		
	}
	public void ClickSkipbutton() 
	{
		try
		 
		 {
			Sleep(100);
			click(SkipButton);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickSkipbutton failed\n");
			  throw e;
			
		 }
		
	}
	
		public void ClickSkipbutton2(String inspiration)
		{
			try
			 
			 {
				String GoalElemet = ("(//div//button[text()[contains(.,'SKIP')]])[text1]");
				GoalElemet = GoalElemet.replace("text1", inspiration);
				WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
				//WaitElementDisplay(By.xpath("(//span[text()[contains(.,'LOVE IT!')]])[2]"));
				Sleep(100);
				click(GoalButton);
			 
			 }catch(Exception e){
			 
				
				 System.err.println("\nError : ClickSkipbutton2 failed\n");
				 throw e;
				
			 }
		}
		public void StylistPageDisplayed()
		{
			try
			 
			 {
				Assert.assertTrue(ElementDisplay(YourStylistMatch));
			 
			 }catch(Exception e){
			 
				
				 System.err.println("\nError : StylistPageDisplayed failed\n");
				 throw e;
				
			 }
		}
		
	



}





