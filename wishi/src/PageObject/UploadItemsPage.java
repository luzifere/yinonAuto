package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadItemsPage extends BasePage {

	public UploadItemsPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//div [@class = 'sign-in-container']")
	WebElement LoginPage;
	@FindBy(xpath="//div//p[text()[contains(.,'Log In')]]")
	WebElement btnLogin;

	@FindBy(xpath="//div//input[@id='signInEmail']")
	WebElement userName;
	
	@FindBy(xpath="//div//input[@id='signInPass']")
	WebElement password;
	
	@FindBy(xpath="//div//input[@value='Log in']")
	WebElement LoginButtonOfModel; 
	
	@FindBy(xpath="//div //span[text()[contains(.,'+ Add Item')]]")
	WebElement AddItemButton;
	
	@FindBy(xpath="//div //input[@id='file']")
	WebElement SelectItem;
	
	@FindBy(xpath="//div//input[@id='brandNameAddItem']")
	WebElement Brand;
	
	@FindBy(xpath="//div//input[@id='submit']")
	WebElement SubmitItem;
	
	public void ClickLoginButton() 
	{
		click(btnLogin);
	}
	
	public void doLogin(String user,String pass)
	{
		filltext(userName, user);
		filltext(password, pass);
		click(LoginButtonOfModel);			
	} 
	
	public void ClickAddItem() 
	{
		click(AddItemButton);
	}
	
	public void SelectItem (String text)
	{
		filltext(SelectItem, text);
	}
	public void SelectCategory(String category)
    {
    	String CategoryElemet = ("(//div//svg-image)[Text1]");
    	CategoryElemet = CategoryElemet.replace("Text1", category);
    	WebElement CategoryTabs = driver.findElement(By.xpath(CategoryElemet));
    	click(CategoryTabs);
    }
	public void FillBrand(String text)
	{
		filltext(Brand,text);
	}
	public void SubmitItem() 
	{
		click(SubmitItem);
	}

}
