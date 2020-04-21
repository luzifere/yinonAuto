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
	//Elements

/*
	public BestMatchPage(AndroidDriver<AndroidElement> _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="(//div[@class='fld-select'])[1]")
	WebElement Mount;
	@FindBy(xpath="//div//a[@class='back-btn']")
	WebElement Back;
	@FindBy(xpath="(//div//a[@class='back-btn'])[1]")
	WebElement Back1;
	@FindBy(xpath="//input[@type='tel']")
	WebElement Age;
	@FindBy(xpath="(//div[@class='fld-select'])[2]")
	WebElement Day;
	@FindBy(xpath="(//div[@class='fld-select'])[3]")
	WebElement Year;
	@FindBy(xpath="//button[@class='d-none d-sm-flex btn btn-warning']")
	WebElement LetsGetStylingBuutton;

	@FindBy(xpath="//div//label[@for='g_1']")
	WebElement Female;

	@FindBy(xpath="//div//label[@for='g_2']")
	WebElement Male;

	@FindBy(xpath="//div//label[@for='g_3']")
	WebElement SelfIdentity;

	@FindBy(xpath="//div//button[text()[contains(.,'NEXT')]]")
	WebElement NextButton;
	@FindBy(xpath="(//div//button[text()[contains(.,'Next')]])[2]")
	WebElement TagsNextButton;
	@FindBy(xpath="//div//button[text()[contains(.,'Skip')]]")
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
	@FindBy(xpath="//a[text()[contains(.,'Petite')]]")
	WebElement Petit;

	@FindBy(xpath="//a[text()[contains(.,'Plus Size')]]")
	WebElement PlusSize;

	@FindBy(xpath="//a[text()[contains(.,'Postpartum')]]")
	WebElement Postpartum;

	@FindBy(xpath="//a[text()[contains(.,'Models')]]")
	WebElement Models;

	@FindBy(xpath="//div//a[text()[contains(.,'VIEW MORE STYLISTS')]]")
	WebElement ViewMoreStylist;
	@FindBy(xpath="//div//button[@class='get-your-style']")
	WebElement StartHere;
	@FindBy(xpath="//div[@class='get-your-style ng-binding']")
	WebElement GetStyle;
	
	@FindBy(xpath="//button[@class='btn btn-warning']")
	WebElement MeetMyMatch;
	@FindBy(xpath="//div[text()[contains(.,'Your Stylists Match!')]]")
	WebElement YourStylistMatch;



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
	public void SelectBodyType(String inspiration)
	{
		try
		 
		 {
			String GoalElemet = ("//div//label[@for='t_text1']");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			WaitElementDisplay(By.xpath("//div//label[@for='t_0']"));
			Sleep(100);
			click(GoalButton);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : SelectBodyType failed\n");
			
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
		 
			
			 System.err.println("\nError : SelectLoveIt failed\n");
			
		 }
	}
	public void SelectLoveIt(String inspiration)
	{
		try
		 
		 {
			Sleep(100);
			String GoalElemet = ("(//span[text()[contains(.,'LOVE IT!')]])[text1]");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			//WaitElementDisplay(By.xpath("(//span[text()[contains(.,'LOVE IT!')]])[2]"));
			Sleep(100);
			click(GoalButton);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : SelectLoveIt failed\n");
			
		 }
		
	}
	public void SelectHELLONO(String inspiration)
	{
		try
		 
		 {
			Sleep(100);
			String GoalElemet = ("(//span[text()[contains(.,'HELL NO!')]])[text1]");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			//WaitElementDisplay(By.xpath("(//span[text()[contains(.,'LOVE IT!')]])[2]"));
			Sleep(100);
			click(GoalButton);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : SelectLoveIt failed\n");
			
		 }
		
	}
	public void SelectSOMETIMES(String inspiration)
	{
		try
		 
		 {
			Sleep(100);
			String GoalElemet = ("(//span[text()[contains(.,'SOMETIMES')]])[text1]");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			//WaitElementDisplay(By.xpath("(//span[text()[contains(.,'LOVE IT!')]])[2]"));
			Sleep(100);
			click(GoalButton);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : SelectLoveIt failed\n");
			
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
	public void SelectInspiration(String inspiration)
	{
		
		String GoalElemet = ("(//span[@class='img-wrapper'])[text1]");
		GoalElemet = GoalElemet.replace("text1", inspiration);
		WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
		WaitElementDisplay(By.xpath("(//span[@class='img-wrapper'])[1]"));
		Sleep(100);
		click(GoalButton);
	} 
	public void Selectbrands(String inspiration)
	{
		Sleep(250);
		//WaitElementDisplay(By.xpath("(//div[@class='brand-item ng-scope'])[1]"));
		String GoalElemet = ("(//div[@class='brand-item ng-scope'])[text1]");
		GoalElemet = GoalElemet.replace("text1", inspiration);
		WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
		WaitElementDisplay(By.xpath("(//div[@class='brand-item ng-scope'])[1]"));
		Sleep(100);
		click(GoalButton);
	} 
	public void SelectTags(String inspiration)
	{
		String GoalElemet = ("//a[text()[contains(.,'text1')]]");
		GoalElemet = GoalElemet.replace("text1", inspiration);
		WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
		WaitElementDisplay(By.xpath("//a[text()[contains(.,'Petite')]]"));
		Sleep(100);
		click(GoalButton);
	}
	public void ClickontinueButton() 
	{	
		Sleep(250);
		scrollDown();
		click(LetsGetStylingBuutton);
		Sleep(250);
		//WaitElementDisplay(By.xpath("//*[@name='Allow']"));
	}
	public void ClickMoreStylistsButton() 
	{	
		Sleep(250);
		click(ViewMoreStylist);
		Sleep(250);
		//WaitElementDisplay(By.xpath("//*[@name='Allow']"));
	}


	public void ClickFamle() 
	{
		Sleep(250);
		click(Female);
		Sleep(250);
	}
	public void ClickSelfIdentityButtonID() 
	{
		Sleep(250);
		click(SelfIdentity);
		Sleep(250);
	}
	
	public void ClickMale() 
	{
		Sleep(250);
		click(Male);
		Sleep(250);
	}
	public void ClickStartHere() 
	{
		Sleep(250);
		WaitElementDisplay(By.xpath("//div//button[@class='get-your-style']"));
		click(StartHere);
		Sleep(250);
	}
	public void ClickGetStyle() 
	{
		Sleep(250);
		click(GetStyle);
		Sleep(250);
	}

	public void SelectCheapButtonID() 
	{
		Sleep(250);
		click(LowBudget);
		Sleep(250);
	}
	public void SelectCheapButtonID2() 
	{
		Sleep(250);
		click(LowBudget2);
		Sleep(250);
	}
	public void SelectNormal() 
	{
		Sleep(250);
		click(MiddleBudget);
		Sleep(250);
	}
	public void SelectNormal2() 
	{
		Sleep(250);
		click(MiddleBudget2);
		Sleep(250);
	}
	public void SelectExpensiveButtonID() 
	{
		Sleep(250);
		click(Expensive1);
		Sleep(250);
	}
	public void SelectExpensiveButtonID2() 
	{
		Sleep(250);
		click(Expensive1_1);
		Sleep(250);
	}
	
	public void ClickNextbutton() 
	{
		Sleep(250);
		click(NextButton);
		Sleep(250);
	}
	public void ClickTagsNextButton() 
	{
		Sleep(250);
		click(TagsNextButton);
		Sleep(250);
	}
	public void ClickSkipbutton() 
	{
		Sleep(250);
		click(SkipButton);
		Sleep(250);
	}
	public void ClickBack() 
	{
		Sleep(250);
		click(Back);
		Sleep(250);
	}
	public void ClickBackBrands() 
	{
		Sleep(250);
		WaitElementDisplay(By.xpath("(//div//a[@class='back-btn'])[1]"));
		click(Back1);
		Sleep(250);
	}
	public void FillAge (String text) 
	{
		Sleep(250);
		filltext(Age,text);
		Sleep(250);
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
	*/
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
	@FindBy(xpath="(//button[@id='styling-button'])[1]")	
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
	public void SelectInspiration(String inspiration)
	{
		try
		 
		 {
		 
			String GoalElemet = ("(//span[@class='img-wrapper'])[text1]");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			WaitElementDisplay(By.xpath("(//span[@class='img-wrapper'])[1]"));
			Sleep(100);
			click(GoalButton);
		 
		 }catch(Exception e)
		{
			 System.err.println("\nError : SelectInspiration failed\n");
			 throw e;
			
		 }

		
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
	public void SelectTags(String inspiration)
	{
		try
		 
		 {
			String GoalElemet = ("//a[text()[contains(.,'text1')]]");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			WaitElementDisplay(By.xpath("//a[text()[contains(.,'Petite')]]"));
			Sleep(100);
			click(GoalButton);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : SelectTags failed\n");
			 throw e;
			
		 }
		
	}
	public void SelectBodyType(String inspiration)
	{
		try
		 
		 {
			String GoalElemet = ("//div//label[@for='t_text1']");//div//label[@for='t_0']
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			WaitElementDisplay(By.xpath("//div//label[@for='t_0']"));
			Sleep(100);
			click(GoalButton);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : SelectBodyType failed\n");
			 throw e;
			
		 }
		
	}
	public void SelectLoveIt(String inspiration)
	{
		try
		 
		 {
			//scrollDown();
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
			//scrollDown();
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
			//scrollDown();
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
	public void FillAge (String text) 
	{
		try
		 
		 {

			WaitElementDisplay(By.xpath("//input[@type='tel']"));
			Sleep(100);
			filltext(Age,text);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : FillAge failed\n");
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

	public void SelectCheapButtonID() 
	{
		try
		 
		 {

			WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'$50-$100')]]"));
			Sleep(100);
			click(LowBudget);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : SelectCheapButtonID failed\n");
			  throw e;
			
		 }
	}
	public void SelectCheapButtonID2() 
	{
		try
		 
		 {

			WaitElementDisplay(By.xpath("(//div//a[text()[contains(.,'$50-$100')]])[2]"));
			Sleep(100);
			click(LowBudget2);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : SelectCheapButtonID2 failed\n");
			  throw e;
			
		 }
		
	}
	public void SelectNormal() 
	{
		try
		 
		 {

			WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'$100-$400')]]"));
			Sleep(100);
			click(MiddleBudget);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : SelectNormal failed\n");
			  throw e;
			
		 }
	}
	public void SelectNormal2() 
	{
		try
		 
		 {

			WaitElementDisplay(By.xpath("(//div//a[text()[contains(.,'$100-$400')]])[2]"));
			Sleep(100);
			click(MiddleBudget2);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : SelectNormal2 failed\n");
			  throw e;
			
		 }
		
	}
	public void SelectExpensiveButtonID() 
	{
		try
		 
		 {
			WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'$400-$1,000')]]"));
			Sleep(100);
			click(Expensive1);
			Sleep(100);

		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : SelectExpensiveButtonID failed\n");
			  throw e;
			
		 }
	}
	public void SelectExpensiveButtonID2() 
	{
		try
		 
		 {

			WaitElementDisplay(By.xpath("(//div//a[text()[contains(.,'$400-$1,000')]])[2]"));
			Sleep(100);
			click(Expensive1_1);
			Sleep(100);

		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : SelectExpensiveButtonID2 failed\n");
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





