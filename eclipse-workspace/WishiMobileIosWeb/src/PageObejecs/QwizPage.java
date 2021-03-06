package PageObejecs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class QwizPage extends BasePage {

	public QwizPage(AndroidDriver<AndroidElement> _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div[@class='next-step-btn ng-scope']")
	WebElement NextOfEventButton;
	@FindBy(xpath="//div[@class='next-step-btn']")
	WebElement NextButton;
	@FindBy(xpath="//div[@class='next-step-btn blank']")
	WebElement SkipButton;
	@FindBy(xpath="//div[@class='back-btn']")
	WebElement BackButtonOfQwiz;
	@FindBy(xpath="//div[@class='back-btn back-btn-pref']//img")
	WebElement BackButtonOfQwiz2;
	@FindBy(xpath="//div//select[@name='budget--quiz']")
	WebElement Budget;
	@FindBy(xpath="//div//li//a[text()[contains(.,'Log Out')]]")
	WebElement LogOut;
	@FindBy(xpath="//nav//div//span[@class='inner-credentials ng-binding']")
	WebElement ProfileClientButton;
	
	public void FillNumberPhone(String phone)
	{
		WaitElementDisplay(By.xpath("//div//input[@type='text']"));
	driver.findElement(By.xpath("//div//input[@type='text']")).sendKeys(phone);
	}
	public void SelectTab(String event)
    {
    	String QwizElemet = ("//div//label[text()[contains(.,'Text1')]]");
    	QwizElemet = QwizElemet.replace("Text1", event);
    	WebElement QwizTabs = driver.findElement(By.xpath(QwizElemet));
    	click(QwizTabs);
    } 
	public void SelectColors(String color)
    {
    	String ColorElemet = ("//div//label[@for='color_Text1']");
    	ColorElemet = ColorElemet.replace("Text1", color);
    	WebElement ColorTabs = driver.findElement(By.xpath(ColorElemet));
    	click(ColorTabs);
    } 
	public void ClickPlus(String plus)
    {
    	String PlusElemet = ("(//div[@class='increase-size'])[Text1]");
    	PlusElemet = PlusElemet.replace("Text1", plus);
    	WebElement PlusTabs = driver.findElement(By.xpath(PlusElemet));
    	click(PlusTabs);
    } 
	public void ClickMinus(String minus)
    {
    	String MinusElemet = ("(//div[@class='decrease-size'])[Text1]");
    	MinusElemet = MinusElemet.replace("Text1", minus);
    	WebElement MinusTabs = driver.findElement(By.xpath(MinusElemet));
    	click(MinusTabs);
    } 
	public void SelectBrands(String brand)
    {
    	String BrandsElemet = ("//div//label[@for='brand_Text1']");
    	BrandsElemet = BrandsElemet.replace("Text1", brand);
    	WebElement BrandsTabs = driver.findElement(By.xpath(BrandsElemet));
    	click(BrandsTabs);
    }
	public void SelectBlouses(String brand)
    {
    	String BrandsElemet = ("//div//label[@for='Blouses_Text1']");
    	BrandsElemet = BrandsElemet.replace("Text1", brand);
    	WebElement BrandsTabs = driver.findElement(By.xpath(BrandsElemet));
    	click(BrandsTabs);
    }
	public void SelectBottoms(String brand)
    {
    	String BrandsElemet = ("//div//label[@for='Bottoms_Text1']");
    	BrandsElemet = BrandsElemet.replace("Text1", brand);
    	WebElement BrandsTabs = driver.findElement(By.xpath(BrandsElemet));
    	click(BrandsTabs);
    }
	public void SelectShoes(String brand)
    {
    	String BrandsElemet = ("//div//label[@for='Shoes_Text1']");
    	BrandsElemet = BrandsElemet.replace("Text1", brand);
    	WebElement BrandsTabs = driver.findElement(By.xpath(BrandsElemet));
    	click(BrandsTabs);
    }
	public void SelectBags(String brand)
    {
    	String BrandsElemet = ("//div//label[@for='Bags_Text1']");
    	BrandsElemet = BrandsElemet.replace("Text1", brand);
    	WebElement BrandsTabs = driver.findElement(By.xpath(BrandsElemet));
    	click(BrandsTabs);
    }
    	public void selectBudget(int num)
    	{
    		Select budget = new Select (driver.findElement(By.xpath("//div//select[@name='budget--quiz']")));
    		click(Budget);
    		budget.selectByIndex(num);
    	}
	public void ClickNextOfevent() 
	{
		click(NextOfEventButton);	
		Sleep(100);
	}
	public void ClickNext() 
	{
		click(NextButton);	
		Sleep(100);
	}
	public void ClickSkip() 
	{
		click(SkipButton);	
		Sleep(100);
	}
	public void ClickBack() 
	{
		click(BackButtonOfQwiz);
		Sleep(100);
	}
	public void ClickBack2() 
	{
		click(BackButtonOfQwiz2);
		Sleep(100);
	}
	public void ClickOnProfileClientButton() 
	{   	
   		click(ProfileClientButton);	
   		Sleep(100);
	}
    public void ClickOnLogOut() 
	{
		click(LogOut);
		Sleep(100);
	}
    

}
