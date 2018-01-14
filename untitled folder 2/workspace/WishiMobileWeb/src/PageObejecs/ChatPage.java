package PageObejecs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChatPage extends BasePage {

	public ChatPage(AndroidDriver<AndroidElement> _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div//form//textarea[@class='autoExpand ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")
	WebElement Chatfield;
	@FindBy(xpath="//div//form//button[@class='input_btn']")
	WebElement SendChatButton;
	@FindBy(xpath="//div//span[text()[contains(.,'My Bookings')]]")
	WebElement BookBtn;
	@FindBy(xpath="//nav//div//img")
	WebElement ProfileButton;
	@FindBy(xpath="//div//li//a[text()[contains(.,'Log Out')]]")
	WebElement LogOut;
	@FindBy(xpath="//nav//div//span[@class='inner-credentials ng-binding']")
	WebElement ProfileClientButton;
	
	public void FillChat(String text)
    {
    	filltext(Chatfield, text);
    }
    public void SendChat()
    {
    	click(SendChatButton);
    }
    public boolean ChatDisplay(String chattext)
    {
    	String ChetElement = ("//div[@class='msg_content ng-binding'][text()[contains(.,'test1')]]");
    	ChetElement = ChetElement.replace("test1", chattext);
    	WebElement Chat = driver.findElement(By.xpath(ChetElement));
    	Chat.toString();
    	ElementDisplay(ChetElement);
    	return true;
    }
    
    public void SelectUser(String user)
    {
    	String UserElemet = ("//div [text()[contains(.,'abarjel inon')]]");
    	UserElemet = UserElemet.replace("abarjel inon", user);
    	WebElement UserButton = driver.findElement(By.xpath(UserElemet));
    	Sleep(1000);
    	click(UserButton);
    }
    public void ClickMyBooking() 
	{
    	BasePage.ExplicityWaitIsClickable(By.xpath("//div//span[text()[contains(.,'My Bookings')]]"));
		click(BookBtn);	
	}
    public void ClickOnProfileButton2() 
	{
    	Sleep(250);
    	driver.findElement(By.xpath("//div//span[@class='inner-credentials ng-binding credentials-mob']")).click();
	}
    public void ClickOnProfileClientButton() 
	{  
    	Sleep(250);
    	driver.findElement(By.xpath("(//nav//div//img)[1]")).click();
   		//click(ProfileClientButton);	
	}
    public void ClickOnLogOut() 
	{
		click(LogOut);	
	}
    public void ClickOnProfileButtonOfClient() 
	{
    	Sleep(400);
    	WebElement Profile= driver.findElement(By.xpath(("//div//span[@class='inner-credentials ng-binding credentials-mob']")));
   		click(Profile);	
	}


}
