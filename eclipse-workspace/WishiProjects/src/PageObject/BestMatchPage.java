package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class BestMatchPage extends BasePage
{
	//Elements


	@FindBy(xpath="(//div[@class='fld-select'])[1]")
	WebElement Mount;
	@FindBy(xpath="(//a[@class='back-btn'])[2]")
	WebElement Back;
	@FindBy(xpath="//input[@type='tel']")
	WebElement Age;
	@FindBy(xpath="(//div[@class='fld-select'])[2]")
	WebElement Day;
	@FindBy(xpath="(//div[@class='fld-select'])[3]")
	WebElement Year;
	@FindBy(xpath="//div//button[@class='btn-start']")
	WebElement ContinueButton;
	@FindBy(xpath="(//div//button[@class='get-your-style hidden-sm hidden-xs'])[1]")	
	//@FindBy(xpath="//div[text()[contains(.,'GET STARTED >')]]")
	WebElement StartHere;
	@FindBy(xpath="//div[@class='get-your-style ng-binding']")
	WebElement GetStyle;


	@FindBy(xpath="//div//label[@for='g_1']")
	WebElement Female;

	@FindBy(xpath="//button[@class='btn-std btn-next']")
	WebElement MeetMyMatch;

	@FindBy(xpath="//div//label[@for='g_2']")
	WebElement Male;

	@FindBy(xpath="//div//label[@for='g_3']")
	WebElement SelfIdentity;
	@FindBy(xpath="(//div//button[text()[contains(.,'Next')]])[1]")
	WebElement TagsNextButton;
	@FindBy(xpath="//div//button[text()[contains(.,'NEXT')]]")
	WebElement NextButton;
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

	@FindBy(xpath="//div//button[text()[contains(.,'SEE MORE')]]")
	WebElement ViewMoreStylist;
	






	public BestMatchPage(WebDriver driver) {
		super(driver);
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
			
		 }

		
	} 
	public void Selectbrands(String inspiration)
	{
		try
		 
		 {
		 
			String GoalElemet = ("(//div[@class='brand-item ng-scope'])[text1]");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			WaitElementDisplay(By.xpath("(//div[@class='brand-item ng-scope'])[1]"));
			Sleep(100);
			click(GoalButton);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : Selectbrands failed\n");
			
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
	public void ClickontinueButton() 
	{	
		try
		 
		 {
			WaitElementDisplay(By.xpath("//div//button[@class='btn-start']"));
			Sleep(100);
			click(ContinueButton);
			Sleep(100);
			//WaitElementDisplay(By.xpath("//*[@name='Allow']"));
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : ClickontinueButton failed\n");
			
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
			
		 }
		
	}


	public void ClickFamle() 
	{
		try
		 
		 {
			WaitElementDisplay(By.xpath("//div//label[@for='g_1']"));
			Sleep(100);
			click(Female);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickFamle failed\n");
			
		 }
	}
		public void ClickMeetMyMatch() 
		{
			try
			 
			 {
				WaitElementDisplay(By.xpath("//button[@class='btn-std btn-next']"));
				scrollDown();
				Sleep(100);
				click(MeetMyMatch);
				Sleep(100);
			 
			 }catch(Exception e){
			 
				
				  System.err.println("\nError : ClickMeetMyMatch failed\n");
				
			 }
		
	}
	public void ClickSelfIdentityButtonID() 
	{
		try
		 
		 {
		 
			WaitElementDisplay(By.xpath("//div//label[@for='g_3']"));
			Sleep(100);
			click(SelfIdentity);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : ClickSelfIdentityButtonID failed\n");
			
		 }
		
	}
	public void ClickBack() 
	{
		try
		 
		 {
			Sleep(100);
			click(Back);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickBack failed\n");
			
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
			
		 }
	}
	public void ClickMale() 
	{
		try
		 
		 {

			WaitElementDisplay(By.xpath("//div//label[@for='g_2']"));
			Sleep(100);
			click(Male);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickMale failed\n");
			
		 }
		
	}
	public void ClickStartHere() 
	{
		try
		 
		 {

			WaitElementDisplay(By.xpath("(//div//button[@class='get-your-style hidden-sm hidden-xs'])[1]"));
			//WaitElementDisplay(By.xpath("//div[text()[contains(.,'GET STARTED >')]]"));
			Sleep(100);
			click(StartHere);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickStartHere failed\n");
			
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
			
		 }
	}

	public void ClickNextbutton() 
	{
		try
		 
		 {
			WaitElementDisplay(By.xpath("//div//button[text()[contains(.,'NEXT')]]"));
			click(NextButton);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickNextbutton failed\n");
			
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
	


}





