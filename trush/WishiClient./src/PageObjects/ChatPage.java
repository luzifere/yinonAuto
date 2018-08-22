package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ChatPage extends BasePage {

	public ChatPage(AppiumDriver<WebElement> _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@name='LoginStart']")
	WebElement LoginStart;
	@FindBy(xpath="//*[@name='Username']")
	WebElement UserNAme;
	@FindBy(xpath="//*[@name='Password']")
	WebElement Password;
	@FindBy(xpath="//*[@name='LoginButton']")
	WebElement LoginButton;
	@FindBy(xpath="//*[@name='CloseOnBoarding']")
	WebElement CloseOnBoarding;
	@FindBy(id="Chat")
	WebElement ChatTab;	
	@FindBy(xpath="//*[@name='CloseOnBoarding']")
	WebElement TitleOfStylist;
	@FindBy(xpath="//*[@name='CloseOnBoarding']")
	WebElement TitleOfClient;
	@FindBy(xpath="//*[@name='ChatButton']")
	WebElement ChatButton;
	@FindBy(id="close_menu4")
	WebElement close_menu4Button;
	@FindBy(xpath="//*[@name='WriteMessage']")
	WebElement WriteMessage;
	@FindBy(xpath="//*[@name='SendButton']")
	WebElement SendButton;
	@FindBy(xpath="//*[@name='WriteMessageID']")
	WebElement WriteMessageClient;
	@FindBy(xpath="//*[@name='sendButtonID']")
	WebElement SendButtonClient;

	public void ClickLoginStart() 
	{
		click(LoginStart);
	}
	public void LoginStylistApp(String user ,String password ) 
	{
		filltext(UserNAme, user);
		filltext(Password, password);
	}
	public void ClickLoginButton() 
	{
		click(LoginButton);
	}
	public void ClickCloseOnBoarding() 
	{
		click(CloseOnBoarding);
	}
	public void ClickChatTab() 
	{
		click(ChatTab);
	}
	public void SelectStylist(String stylist)
    {
	Sleep(250);
    	String StylistElemet = ("text");
    	StylistElemet = StylistElemet.replace("text", stylist);
    	WebElement StylistButton = driver.findElement(By.xpath(StylistElemet));
    	Sleep(250);
    	click(StylistButton);
    }
	public void SelectTab(String tab)
    {
	Sleep(250);
    	String TabElemet = ("text");
    	TabElemet = TabElemet.replace("text", tab);
    	WebElement TabButton = driver.findElement(By.xpath(TabElemet));
    	Sleep(250);
    	click(TabButton);
    }
	public boolean ChatDisplay(String chattext)
    {
    	String ChetElement = ("//*[@name='test1']");
    	ChetElement = ChetElement.replace("test1", chattext);
    	WebElement Chat = driver.findElement(By.xpath(ChetElement));
    	Chat.toString();
    	ElementDisplay(ChetElement);
    	return true;
    }
    public void ClickSendButton() 
	{
		click(SendButton);
	}
    public void ClickSendButtonClient() 
	{
		click(SendButtonClient);
	}
    public void Clickclose_menu4Button() 
	{
		click(close_menu4Button);
	}
    public void FillMessage(String text) 
	{
		filltext(WriteMessage, text);
	}
    public void FillMessageClient(String text) 
	{
		filltext(WriteMessageClient, text);
	}
    public void ClickcChatTab() 
	{
		click(ChatTab);
    	//driver.findElementByAccessibilityId("Chat").click();
	}

}
