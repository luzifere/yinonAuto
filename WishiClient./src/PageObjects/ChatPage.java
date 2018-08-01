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
	@FindBy(id="Chat")//*[@id='Chat']
	WebElement ChatTab;
	@FindBy(id="ChatButton")//*[@id='Chat']
	WebElement Chatbutton;
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
	@FindBy(xpath="//*[@name='closeButtonID']")
	WebElement CloseButton;
	@FindBy(xpath="//*[@name='Send Message']")
	WebElement SendContact;
	@FindBy(xpath="//*[@name='ContactIconID']")
	WebElement ContactIcon;
	@FindBy(xpath="//*[@name='ContactMessageID']")
	WebElement ContactMessage;
	@FindBy(xpath="//*[@name='ContactButtonID']")
	WebElement ContactButton;

	public void ClickChatButton() 
	{		
		Sleep(250);
		click(ChatButton);
		Sleep(250);
	}
	
	public void OpenChat(String stylist)
	{
		Sleep(250);
		String StylistElemet = ("//*[@name='test1']");
		StylistElemet = StylistElemet.replace("test1", stylist);
		WebElement StylistButton = driver.findElement(By.xpath(StylistElemet));
		Sleep(250);
		System.out.println(StylistButton);
		click(StylistButton);
	}
	public void ClickContactButton() 
	{		
		Sleep(250);
		click(ContactButton);
		Sleep(250);
	}
	public void FillContactMessage(String text) 
	{		
		Sleep(250);
		filltext(ContactMessage,text);
		Sleep(250);
	}
	public void ClickContactIcon() 
	{		
		Sleep(250);
		click(ContactIcon);
		Sleep(250);
	}
	public void ClickSendContact() 
	{		
		Sleep(250);
		click(SendContact);
		WaitElementDisplay(By.id("WriteMessageID"));
	}
	public void ClickCloseButton() 
	{		
		Sleep(250);
		click(CloseButton);
		Sleep(250);
	}

	public void ClickLoginStart() 
	{
		Sleep(250);
		click(LoginStart);
		Sleep(250);
	}
	public void LoginStylistApp(String user ,String password ) 
	{
		Sleep(250);
		filltext(UserNAme, user);
		filltext(Password, password);
		Sleep(250);
	}
	public void ClickLoginButton() 
	{
		Sleep(250);
		click(LoginButton);
		Sleep(250);
	}
	public void ClickCloseOnBoarding() 
	{
		Sleep(250);
		click(CloseOnBoarding);
		Sleep(250);
	}
	public void ClickChatTab() 
	{
		Sleep(250);
		click(ChatTab);
		Sleep(250);
	}
	public void SelectStylist(String stylist)
	{
		Sleep(250);
		String StylistElemet = ("text");
		StylistElemet = StylistElemet.replace("text", stylist);
		WebElement StylistButton = driver.findElement(By.xpath(StylistElemet));
		Sleep(250);
		System.out.println(StylistButton);
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
		Sleep(250);
		String ChetElement = ("//*[@name='test1']");
		ChetElement = ChetElement.replace("test1", chattext);
		WebElement Chat = driver.findElement(By.xpath(ChetElement));
		Chat.toString();
		ElementDisplay(ChetElement);
		return true;
	}
	public void ClickSendButton() 
	{
		Sleep(250);
		click(SendButton);
		Sleep(250);
	}
	public void ClickSendButtonClient() 
	{
		Sleep(250);
		click(SendButtonClient);
		Sleep(250);
	}
	public void Clickclose_menu4Button() 
	{
		Sleep(250);
		click(close_menu4Button);
		Sleep(250);
	}
	public void FillMessage(String text) 
	{
		Sleep(250);
		filltext(WriteMessage, text);
		Sleep(250);
	}
	public void FillMessageClient(String text) 
	{
		Sleep(250);
		filltext(WriteMessageClient, text);
		Sleep(250);
	}
	public void ClickcChatTab() 
	{
		Sleep(250);
		click(ChatTab);
		//driver.findElementByAccessibilityId("Chat").click();
		Sleep(250);
	}

}
