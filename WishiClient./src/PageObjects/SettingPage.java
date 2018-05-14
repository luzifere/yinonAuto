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
    	String PickerElemet = ("Text1");
    	PickerElemet = PickerElemet.replace("Text1", Picker);
    	WebElement PickerTabs = driver.findElement(By.id(PickerElemet));
    	click(PickerTabs);
    }
	
	public void ClickMeTab() 
	{		
		Sleep(150);
		click(MeTab);
		//Sleep(150);
	}
	public void ClickBackButton() 
	{		
		Sleep(150);
		click(BackButton);
		//Sleep(150);
	}
	public void ClickDoneOfPicker() 
	{		
		Sleep(150);
		click(DoneOfPicker);
		//Sleep(150);
	}
	
	public void ClickDone() 
	{		
		Sleep(150);
		click(Done);
		//Sleep(150);
	}
	public void ClickToolBarDone() 
	{		
		Sleep(150);
		click(ToolBarDone);
		//Sleep(150);
	}
	public void ClickSettingButton() 
	{		
		//Sleep(150);
		click(SettingButton);
		//Sleep(150);
	}
	public void ClickEditStyleTab() 
	{		
		Sleep(150);
		click(EditStyleTab);
		Sleep(250);
	}
	public void ClickBodyTypeTab() 
	{		
		Sleep(150);
		click(BodyTypeTab);
		//Sleep(150);
	}
	public void ClickStyle() 
	{		
		Sleep(150);
		click(Style);
		//Sleep(150);
	}
	public void ClickHeight() 
	{		
		Sleep(150);
		click(Height);
		//Sleep(150);
	}
	public void ClickSize() 
	{		
		Sleep(150);
		click(Size);
		//Sleep(150);
	}
	public void ClickTopSize() 
	{		
		Sleep(150);
		click(TopOfSize);
		//Sleep(150);
	}
	public void ClickJeansSize() 
	{		
		Sleep(150);
		click(JeansOfSize);
		//Sleep(150);
	}
	public void ClickDressSize() 
	{		
		Sleep(150);
		click(DressOfSize);
		//Sleep(150);
	}
	public void ClickSoesSize() 
	{		
		Sleep(150);
		click(ShoesOfSize);
		//Sleep(150);
	}
	public void ClickHighlights() 
	{		
		Sleep(150);
		click(Highlights);
		//Sleep(150);
	}
	public void ClickPreferences() 
	{		
		Sleep(150);
		click(Preferences);
		//Sleep(150);
	}
	public void ClickHeels() 
	{		
		Sleep(150);
		click(Heels);
		//Sleep(150);
	}
	public void ClickFitTop() 
	{		
		Sleep(150);
		click(FitTop);
		//Sleep(150);
	}
	
	public void ClickFitBottom() 
	{		
		Sleep(150);
		click(FitBottom);
		//Sleep(150);
	}
	public void ClickJeans() 
	{		
		Sleep(150);
		click(Jeans);
		//Sleep(150);
	}
	public void ClickFabric() 
	{		
		Sleep(150);
		click(Fabric);
		//Sleep(150);
	}
	public void ClickBudget() 
	{		
		Sleep(250);
		click(Budget);
		Sleep(250);
	}
	public void ClickColor() 
	{		
		Sleep(150);
		click(Color);
		//Sleep(150);
	}
	public void ClickJewelry() 
	{		
		Sleep(150);
		click(Jewelry);
		//Sleep(150);
	}
	public void ClickZone() 
	{		
		Sleep(150);
		click(Zone);
		//Sleep(150);
	}
	public void ClickBrands() 
	{		
		Sleep(150);
		click(Brands);
		//Sleep(150);
	}
	public void ClickSocialMedia() 
	{		
		Sleep(150);
		click(SocialMedia);
		//Sleep(150);
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
