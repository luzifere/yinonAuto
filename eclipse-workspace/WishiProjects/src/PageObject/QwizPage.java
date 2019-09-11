package PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class QwizPage extends BasePage 
{

	public QwizPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div[@class='next-step-btn ng-scope']")
	WebElement NextOfEventButton;
	@FindBy(xpath="//button[@class='chat-link-btn onboarding-next-btn ']")
	WebElement NextButton;
	@FindBy(xpath="//div[@class='next-step-btn blank']")
	WebElement SkipButton;
	@FindBy(xpath="//div[@class='back-btn']//img")
	WebElement BackButtonOfQwiz;
	@FindBy(xpath="//div//select[@name='budget--quiz']")
	WebElement Budget;
	@FindBy(xpath="//div//li//a[text()[contains(.,'Log Out')]]")
	WebElement LogOut;
	@FindBy(xpath="//nav//div//span[@class='inner-credentials ng-binding']")
	WebElement ProfileClientButton;
	@FindBy(xpath="//input[@id='month-input']")
	WebElement Date;
	@FindBy(xpath="//div[@class='selected-flag']")
	WebElement Flag;
	@FindBy(xpath="//input[@type='tel']")
	WebElement Phone;
	@FindBy(xpath="//div[text()[contains(.,'Average')]]")
	WebElement Height;




	
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
	public void SelectBrands(String brand)
	{
		String BrandsElemet = ("//div//label[@for='brand_Text1']");
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
		WaitElementDisplay(By.xpath("//button[@class='chat-link-btn onboarding-next-btn ']"));
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

	public void FillDate(String text) 
	{
		Sleep(100);
		click(Date);
		filltext(Date,text);
		Sleep(100);
	}

	public void selectLocation(String cuntry)
	{
		click(Flag);
		Sleep(100);
		String PlusElemet = ("(//li[@class='country'])[Text1]");
		PlusElemet = PlusElemet.replace("Text1", cuntry);
		WebElement PlusTabs = driver.findElement(By.xpath(PlusElemet));
		click(PlusTabs);
		//Select mounts = new Select (driver.findElement(By.xpath("//ul[@class=' country-list']")));
		//mounts.selectByIndex(num);
	}
	
	public void FillNumberPhone(String phone)
	{
		WaitElementDisplay(By.xpath("//input[@type='tel']"));
		filltext(Phone,phone);
	}
	
	public void SelectHeight(String height ) 
	
	{                      
		String heightElemet = ("//div[text()[contains(.,'Text1')]]");
		heightElemet = heightElemet.replace("Text1", height);
		WebElement BrandsTabs = driver.findElement(By.xpath(heightElemet));
		click(BrandsTabs);
	}

}
