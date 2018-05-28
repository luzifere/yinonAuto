package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class QuizPage extends BasePage 
{

	public QuizPage(AppiumDriver<WebElement> _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="Stylists")
	WebElement StylistTab;
	@FindBy(id="PhoneTextField")
	WebElement PhoneField;
	@FindBy(id="Search your country")
	WebElement SearchCountry;
	@FindBy(id="ShowStateButtonID")
	WebElement ShowState;
	@FindBy(id="back")
	WebElement BackButton;
	@FindBy(id="Not Now")
	WebElement NotNow;
	@FindBy(id="TopPlusButtonID")
	WebElement topplus;
	@FindBy(id="DressPlusButtonID")
	WebElement dressplus;
	@FindBy(id="JeansPlusButtonID")
	WebElement jeansplus;
	@FindBy(id="ShoesPlusButtonID")
	WebElement shoesplus;
	@FindBy(id="TopMinusButtonID")
	WebElement topminus;
	@FindBy(id="DressMinusButtonID")
	WebElement dressminus;
	@FindBy(id="JeansMinusButtonID")
	WebElement jeansminus;
	@FindBy(id="ShoesMinusButtonID")
	WebElement shoesminus;
	@FindBy(id="NextButtonID")
	WebElement NextButtonID;
	@FindBy(id="add_full_body_photo")
	WebElement AddFullBody;
	@FindBy(id="Add 3 items")
	WebElement AddItems;

	public void SelectTab(String event)
	{
		String QwizElemet = ("Text1");
		QwizElemet = QwizElemet.replace("Text1", event);
		WebElement QwizTabs = driver.findElement(By.id(QwizElemet));
		Sleep(250);
		click(QwizTabs);
	}
	public void SelectColor(String event)
	{
		String ColorElemet = ("Text1");
		ColorElemet = ColorElemet.replace("Text1", event);
		WebElement colorTabs = driver.findElement(By.id(ColorElemet));
		Sleep(250);
		click(colorTabs);
	}
	public void SelectJeans(String event)
	{
		String JeansElemet = ("Text1");
		JeansElemet = JeansElemet.replace("Text1", event);
		WebElement JeansTabs = driver.findElement(By.id(JeansElemet));
		Sleep(250);
		click(JeansTabs);
	}
	public void SelectCC(String event)
	{
		String CCElemet = ("Text1");
		CCElemet = CCElemet.replace("Text1", event);
		WebElement CCTabs = driver.findElement(By.id(CCElemet));
		Sleep(250);
		click(CCTabs);
	}
	public void SelectHighlights(String event)
	{
		String HighlightsElemet = ("Text1");
		HighlightsElemet = HighlightsElemet.replace("Text1", event);
		WebElement HighlightsTabs = driver.findElement(By.id(HighlightsElemet));
		Sleep(250);
		click(HighlightsTabs);
	}
	public void SelectCategory(String event)
	{
		String CategoryElemet = ("Text1");
		CategoryElemet = CategoryElemet.replace("Text1", event);
		WebElement CategoryTabs = driver.findElement(By.id(CategoryElemet));
		Sleep(250);
		click(CategoryTabs);
	}
	public void ClickTopPlus() 
	{		
		//Sleep(150);
		click(topplus);
		//Sleep(150);
	}
	
	public void ClickBackButton() 
	{		
		//Sleep(150);
		click(BackButton);
		//Sleep(150);
	}
	public void ClickStylistTab() 
	{		
		//Sleep(150);
		click(StylistTab);
		//Sleep(150);
	}
	public void ClickJeansPlus() 
	{		
		//Sleep(150);
		click(jeansplus);
		//Sleep(150);
	}
	public void ClickDressPlus() 
	{		
		//Sleep(150);
		click(dressplus);
		//Sleep(150);
	}
	public void ClickShoesPlus() 
	{		
		//Sleep(150);
		click(shoesplus);
		//Sleep(150);
	}
	public void ClickTopMinus() 
	{		
		//Sleep(150);
		click(topminus);
		//Sleep(150);
	}
	public void ClickJeansMinus() 
	{		
		//Sleep(150);
		click(jeansminus);
		//Sleep(150);
	}
	public void ClickDressMinus() 
	{		
		//Sleep(150);
		click(dressminus);
		//Sleep(150);
	}
	public void ClickShoesMinus() 
	{		
		//Sleep(150);
		click(shoesminus);
		//Sleep(150);
	}
	public void ClickNOtNow() 
	{		
		Sleep(150);
		click(NotNow);
		Sleep(250);
	}
	public void ClickNextw() 
	{		
		//Sleep(150);
		click(NextButtonID);
		//Sleep(150);
	}
	public void ClickAddFullBody() 
	{		
		//Sleep(150);
		click(AddFullBody);
		//Sleep(150);
	}
	public void ClickAddItems() 
	{		
		//Sleep(150);
		click(AddItems);
		//Sleep(150);
	}
	public void ClickShowState() 
	{		
		//Sleep(150);
		click(ShowState);
		//Sleep(150);
	}
	public void FillSearchCountry(String text) 
	{
		filltext(SearchCountry, text);
		Sleep(250);
	}
	public void SelectCountry(String event) 
	{		
		Sleep(150);
		String StylistElemet = ("text");
		StylistElemet = StylistElemet.replace("text", event);
		WebElement StylistButton = driver.findElement(By.xpath(StylistElemet));
		Sleep(250);
		System.out.println(StylistButton);
		click(StylistButton);
	}
	public void FillPhoneField(String text) 
	{
		filltext(PhoneField, text);
		Sleep(250);
	}
}
