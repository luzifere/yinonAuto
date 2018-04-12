package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class SearchPage extends BasePage 
{

	public SearchPage(AppiumDriver<WebElement> _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@name='closeButtonID']")
	WebElement CloseButton;
	@FindBy(id="search button")
	WebElement SearchButton;
	@FindBy(id="closeButtonID")
	WebElement CloseSearch;
	@FindBy(id="clearButtonID")
	WebElement ClearSearch;
	@FindBy(id="searchTextFieldID")
	WebElement searchTextField;
	//@FindBy(xpath="//*[@name='stylistNameLabelID']")
	@FindBy(id="stylistNameLabelID")
	WebElement StylistName;
	@FindBy(xpath="//*[@name='viewProfileID']")
	WebElement viewProfileID;
	
	
	public void ClickCloseButton() 
	{		
		//Sleep(150);
		click(CloseButton);
		//Sleep(150);
	}
	public void ClickSearch() 
	{		
		//Sleep(150);
		click(SearchButton);
		//Sleep(150);
	}
	public void ClickCloseSearch() 
	{		
		//Sleep(150);
		click(CloseSearch);
		//Sleep(150);
	}
	public void ClickClearSearch() 
	{		
		//Sleep(150);
		click(ClearSearch);
		//Sleep(150);
	}
	public void SelectStylist() 
	{		
		//Sleep(150);
		click(StylistName);
		//Sleep(150);
	}
	public void SelectviewProfileID() 
	{		
		//Sleep(150);
		click(viewProfileID);
		//Sleep(150);
	}
	public void FillStylist(String stylist) 
	{
		filltext(searchTextField,stylist);
	}

}
