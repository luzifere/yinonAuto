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
	@FindBy(xpath="//a[@class='vis']")
	WebElement Back;
	@FindBy(xpath="//input[@type='tel']")
	WebElement Age;
	@FindBy(xpath="(//div[@class='fld-select'])[2]")
	WebElement Day;
	@FindBy(xpath="(//div[@class='fld-select'])[3]")
	WebElement Year;
	@FindBy(xpath="//div//a[@class='btn-start']")
	WebElement ContinueButton;
	@FindBy(xpath="//div[@class='start']")
	WebElement StartHere;
	@FindBy(xpath="//div[@class='get-your-style ng-binding']")
	WebElement GetStyle;


	@FindBy(xpath="//div//button[text()[contains(.,'Female')]]")
	WebElement Female;

	@FindBy(xpath="//div//button[text()[contains(.,'Male')]]")
	WebElement Male;

	@FindBy(xpath="//div//button[text()[contains(.,'Self Identity')]]")
	WebElement SelfIdentity;
	@FindBy(xpath="(//div//button[text()[contains(.,'Next')]])[1]")
	WebElement TagsNextButton;
	@FindBy(xpath="//div//button[text()[contains(.,'Next')]]")
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
		
		String GoalElemet = ("(//span[@class='img-wrapper'])[text1]");
		GoalElemet = GoalElemet.replace("text1", inspiration);
		WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
		WaitElementDisplay(By.xpath("(//span[@class='img-wrapper'])[1]"));
		Sleep(100);
		click(GoalButton);
	} 
	public void Selectbrands(String inspiration)
	{
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
		WaitElementDisplay(By.xpath("//div//a[@class='btn-start']"));
		Sleep(100);
		click(ContinueButton);
		Sleep(100);
		//WaitElementDisplay(By.xpath("//*[@name='Allow']"));
	}
	public void ClickMoreStylistsButton() 
	{	
		Sleep(100);
		click(ViewMoreStylist);
		Sleep(100);
		//WaitElementDisplay(By.xpath("//*[@name='Allow']"));
	}


	public void ClickFamle() 
	{
		WaitElementDisplay(By.xpath("//div//button[text()[contains(.,'Female')]]"));
		Sleep(100);
		click(Female);
		Sleep(100);
	}
	public void ClickSelfIdentityButtonID() 
	{
		WaitElementDisplay(By.xpath("//div//button[text()[contains(.,'Self Identity')]]"));
		Sleep(100);
		click(SelfIdentity);
		Sleep(100);
	}
	public void ClickBack() 
	{
		Sleep(100);
		click(Back);
		Sleep(100);
	}
	public void FillAge (String text) 
	{
		WaitElementDisplay(By.xpath("//input[@type='tel']"));
		Sleep(100);
		filltext(Age,text);
		Sleep(100);
	}
	public void ClickMale() 
	{
		WaitElementDisplay(By.xpath("//div//button[text()[contains(.,'Male')]]"));
		Sleep(100);
		click(Male);
		Sleep(100);
	}
	public void ClickStartHere() 
	{
		WaitElementDisplay(By.xpath("//div[@class='start']"));
		Sleep(100);
		click(StartHere);
		Sleep(100);
	}
	public void ClickGetStyle() 
	{
		Sleep(100);
		click(GetStyle);
		Sleep(100);
	}

	public void SelectCheapButtonID() 
	{
		WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'$50-$100')]]"));
		Sleep(100);
		click(LowBudget);
		Sleep(100);
	}
	public void SelectCheapButtonID2() 
	{
		WaitElementDisplay(By.xpath("(//div//a[text()[contains(.,'$50-$100')]])[2]"));
		Sleep(100);
		click(LowBudget2);
		Sleep(100);
	}
	public void SelectNormal() 
	{
		WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'$100-$400')]]"));
		Sleep(100);
		click(MiddleBudget);
		Sleep(100);
	}
	public void SelectNormal2() 
	{
		WaitElementDisplay(By.xpath("(//div//a[text()[contains(.,'$100-$400')]])[2]"));
		Sleep(100);
		click(MiddleBudget2);
		Sleep(100);
	}
	public void SelectExpensiveButtonID() 
	{
		WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'$400-$1,000')]]"));
		Sleep(100);
		click(Expensive1);
		Sleep(100);
	}
	public void SelectExpensiveButtonID2() 
	{
		WaitElementDisplay(By.xpath("(//div//a[text()[contains(.,'$400-$1,000')]])[2]"));
		Sleep(100);
		click(Expensive1_1);
		Sleep(100);
	}

	public void ClickNextbutton() 
	{
		Sleep(100);
		click(NextButton);
		Sleep(100);
	}
	public void ClickTagsNextButton() 
	{
		Sleep(100);
		click(TagsNextButton);
		Sleep(100);
	}
	public void ClickSkipbutton() 
	{
		Sleep(100);
		click(SkipButton);
		Sleep(100);
	}
	


}





