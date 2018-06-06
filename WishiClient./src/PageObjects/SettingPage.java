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
	@FindBy(id="body_type")
	WebElement BodyTypeTab;
	@FindBy(id="bow_Icon")
	WebElement Style;
	@FindBy(id="height_icon")
	WebElement Height;
	@FindBy(id="roller_icon")
	WebElement Size;
	@FindBy(id="Top")
	WebElement TopOfSize;
	@FindBy(id="Jeans")
	WebElement JeansOfSize;
	@FindBy(id="Dress")
	WebElement DressOfSize;
	@FindBy(id="Shoes")
	WebElement ShoesOfSize;
	@FindBy(id="settings_highlights")
	WebElement Highlights;
	@FindBy(id="settings_preferences")
	WebElement Preferences;
	@FindBy(id="shoe_icon")
	WebElement Heels;
	@FindBy(id="blank_shirt")
	WebElement FitTop;
	@FindBy(id="long_pants")
	WebElement FitBottom;
	@FindBy(id="jeans_dark_settings")
	WebElement Jeans;
	@FindBy(id="fabric_settings")
	WebElement Fabric;
	@FindBy(id="dollar_icon")
	WebElement Budget;
	@FindBy(id="color_icon")
	WebElement Color;
	@FindBy(id="jewelry_icon")
	WebElement Jewelry;
	@FindBy(id="zone_icon")
	WebElement Zone;
	@FindBy(id="tag_icon")
	WebElement Brands;
	@FindBy(id="network_icon")
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
	
	
	
	public void SelectFromPicker(String Picker)
    {
		Sleep(200);
    	String PickerElemet = ("Text1");
    	PickerElemet = PickerElemet.replace("Text1", Picker);
    	WebElement PickerTabs = driver.findElement(By.id(PickerElemet));
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
