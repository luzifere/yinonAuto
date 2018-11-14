package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class SettingPage extends BasePage
{

	public SettingPage(AppiumDriver<WebElement> _driver) 
	{
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="SettingsBarButtonID")
	WebElement SettingButton;
	@FindBy(id="Me")
	WebElement MeTab;
	@FindBy(id="Edit Style")
	WebElement EditStyleTab;
	@FindBy(id="Fit")
	WebElement BodyTypeTab;
	@FindBy(id="Style")
	WebElement Style;
	@FindBy(id="Height")
	WebElement Height;
	@FindBy(id="Clothing Size")
	WebElement Size;
	@FindBy(id="Top")
	WebElement TopOfSize;
	@FindBy(id="Jeans")
	WebElement JeansOfSize;
	@FindBy(id="Dress")
	WebElement DressOfSize;
	@FindBy(id="Shoes")
	WebElement ShoesOfSize;
	@FindBy(id="Highlights")
	WebElement Highlights;
	@FindBy(id="Preferences")
	WebElement Preferences;
	@FindBy(id="Heels")
	WebElement Heels;
	@FindBy(id="Fit - Top")
	WebElement FitTop;
	@FindBy(id="Fit - Bottom")
	WebElement FitBottom;
	@FindBy(id="Jeans")
	WebElement Jeans;
	@FindBy(id="Fabrics")
	WebElement Fabric;
	@FindBy(id="BudgetCellID")
	WebElement Budget;
	@FindBy(id="Colors & Prints")
	WebElement Color;
	@FindBy(id="Jewelry")
	WebElement Jewelry;
	@FindBy(id="Comfort Zone")
	WebElement Zone;
	@FindBy(id="Brands")
	WebElement Brands;
	@FindBy(id="Social Media")
	WebElement SocialMedia;
	@FindBy(id="DoneButtonID")
	WebElement DoneOfPicker;
	@FindBy(id="Done")
	WebElement Done;
	@FindBy(id="Toolbar Done Button")
	WebElement ToolBarDone;
	@FindBy(id="back")
	WebElement BackButton;
	@FindBy(id="PinterestTextFieldID")
	WebElement Printerest;
	@FindBy(id="InstagramTextFieldID")
	WebElement Instegram;
	@FindBy(id="FacebookTextFieldID")
	WebElement Facbook;
	@FindBy(id="Retake Your Style Match")
	WebElement Retake;
	
	
	
	public void SelectFromPicker(String Picker)
    {
		Sleep(400);
    	String PickerElemet = ("Text1");
    	PickerElemet = PickerElemet.replace("Text1", Picker);
    	WebElement PickerTabs = driver.findElement(By.id(PickerElemet));
    	Sleep(200);
    	click(PickerTabs);
    }
	public void SelectFromPickerColor(String Picker)
    {
		Sleep(400);
    	String PickerElemet = ("(//*[@name='Text1'])[2]");
    	PickerElemet = PickerElemet.replace("Text1", Picker);
    	WebElement PickerTabs = driver.findElement(By.xpath(PickerElemet));
    	Sleep(200);
    	click(PickerTabs);
    }
	public void SelectFromPickerJeans(String Picker)
    {
		Sleep(400);
		/*
    	String PickerElemet = ("(//*[@name='Text1'])[1]");
    	PickerElemet = PickerElemet.replace("Text1", Picker);
    	WebElement PickerTabs = driver.findElement(By.id(PickerElemet));
    	Sleep(200);
    	click(PickerTabs);
    	*/
		String PlusElemet = ("(//*[@name='Text1'])[1]");
		PlusElemet = PlusElemet.replace("Text1", Picker);
		WebElement PlusTabs = driver.findElement(By.xpath(PlusElemet));
		Sleep(200);
		click(PlusTabs);
    }
	public void SelectFromPickerFabric(String Picker)
    {
		Sleep(400);
    	String PickerElemet = ("(//*[@name='Text1'])");
    	PickerElemet = PickerElemet.replace("Text1", Picker);
    	WebElement PickerTabs = driver.findElement(By.xpath(PickerElemet));
    	Sleep(200);
    	click(PickerTabs);
    }
	
	public void ClickMeTab() 
	{		
		Sleep(200);
		click(MeTab);
		Sleep(200);
	}
	public void ClickBackButton() 
	{		
		Sleep(200);
		click(BackButton);
		Sleep(200);
	}
	public void ClickDoneOfPicker() 
	{		
		Sleep(200);
		click(DoneOfPicker);
		Sleep(200);
	}
	public void ClickRetake() 
	{		
		Sleep(200);
		click(Retake);
		Sleep(200);
	}
	
	public void ClickDone() 
	{		
		Sleep(200);
		click(Done);
		Sleep(200);
	}
	public void ClickToolBarDone() 
	{		
		Sleep(200);
		click(ToolBarDone);
		Sleep(200);
	}
	public void ClickSettingButton() 
	{		
		Sleep(200);
		click(SettingButton);
		Sleep(200);
	}
	public void ClickEditStyleTab() 
	{		
		Sleep(200);
		click(EditStyleTab);
		Sleep(250);
	}
	public void ClickBodyTypeTab() 
	{		
		Sleep(200);
		click(BodyTypeTab);
		Sleep(200);
	}
	public void ClickStyle() 
	{		
		Sleep(200);
		click(Style);
		Sleep(200);
	}
	public void ClickHeight() 
	{		
		Sleep(200);
		click(Height);
		Sleep(200);
	}
	public void ClickSize() 
	{		
		Sleep(200);
		click(Size);
		Sleep(200);
	}
	public void ClickTopSize() 
	{		
		Sleep(200);
		click(TopOfSize);
		Sleep(200);
	}
	public void ClickJeansSize() 
	{		
		Sleep(200);
		click(JeansOfSize);
		Sleep(200);
	}
	public void ClickDressSize() 
	{		
		Sleep(200);
		click(DressOfSize);
		Sleep(200);
	}
	public void ClickSoesSize() 
	{		
		Sleep(200);
		click(ShoesOfSize);
		Sleep(200);
	}
	public void ClickHighlights() 
	{		
		Sleep(200);
		click(Highlights);
		Sleep(200);
	}
	public void ClickPreferences() 
	{		
		Sleep(200);
		click(Preferences);
		Sleep(200);
	}
	public void ClickHeels() 
	{		
		Sleep(200);
		click(Heels);
		Sleep(200);
	}
	public void ClickFitTop() 
	{		
		Sleep(200);
		click(FitTop);
		Sleep(200);
	}
	
	public void ClickFitBottom() 
	{		
		Sleep(200);
		click(FitBottom);
		Sleep(200);
	}
	public void ClickJeans() 
	{		
		Sleep(200);
		click(Jeans);
		Sleep(200);
	}
	public void ClickFabric() 
	{		
		Sleep(200);
		click(Fabric);
		Sleep(200);
	}
	public void ClickBudget() 
	{		
		Sleep(250);
		click(Budget);
		Sleep(250);
	}
	public void ClickColor() 
	{		
		Sleep(200);
		click(Color);
		Sleep(200);
	}
	public void ClickJewelry() 
	{		
		Sleep(200);
		click(Jewelry);
		Sleep(200);
	}
	public void ClickZone() 
	{		
		Sleep(200);
		click(Zone);
		Sleep(200);
	}
	public void ClickBrands() 
	{		
		Sleep(200);
		click(Brands);
		Sleep(200);
	}
	public void ClickSocialMedia() 
	{		
		Sleep(200);
		click(SocialMedia);
		Sleep(200);
	}
	public void SelectJeans(String event)
    {
    	String JeansElemet = ("Text1");
    	JeansElemet = JeansElemet.replace("Text1", event);
    	WebElement JeansTabs = driver.findElement(By.id(JeansElemet));
    	click(JeansTabs);
    }
	public void ClearPrinterest() 
	{
		clear(Printerest);
	}
	public void ClearInstegram() 
	{
		clear(Instegram);
	}
	public void ClearFacbook() 
	{
		clear(Facbook);
	}
	public void FillPrinterest(String text)
	{
		filltext(Printerest,text);
	}
	public void FillInstegram(String text)
	{
		filltext(Instegram,text);
	}
	public void FillFacbook(String text)
	{
		filltext(Facbook,text);
	}

}
