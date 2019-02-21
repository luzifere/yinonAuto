package PageObejecs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BestMatchPage extends BasePage
{
	//Elements


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
	@FindBy(xpath="//div//button[@class='btn-start']")
	WebElement ContinueButton;

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
	@FindBy(xpath="//button[@class='btn-std btn-next']")
	WebElement MeetMyMatch;



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
		click(ContinueButton);
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


}





