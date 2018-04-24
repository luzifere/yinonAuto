package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class BookingPage extends BasePage {

	public BookingPage(AppiumDriver<WebElement> _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@name='up-arrow']")
	WebElement UpArrow;
	
	@FindBy(xpath="//*[@name='Love all your ideas!'][1]")
	WebElement LoveIteme;
	
	@FindBy(xpath="//*[@name='Send Mood Board']")
	WebElement SendMoodBoard;
	
	@FindBy(id="Toolbar Done Button")
	WebElement ToolBarDone;
	
	@FindBy(id="Add a description")//*[@value='Add a description']
	WebElement MBDescription;
	
	@FindBy(xpath="//*[@value='Add a description']")//*[@value='Add a description']
	WebElement LookDescription;
	@FindBy(id="Save")//*[@id='Chat']
	WebElement Save;
	
	@FindBy(xpath="//*[@name='  SHOP ']")
	WebElement Shop;
	
	@FindBy(id="Chat")//*[@id='Chat']
	WebElement ChatTab;
	
	@FindBy(xpath="//*[@name='Create Look']")
	WebElement CreateLook;
	
	@FindBy(xpath="//*[@name='Create Mood Board']")
	WebElement CreateMoodBoardButton;
	
	@FindBy(id="Chat")
	WebElement Chatbutton;
	
	@FindBy(xpath="//*[@name='LoginStart']")
	WebElement LoginStart;
	
	@FindBy(xpath="//*[@name='Username']")
	WebElement UserNAme;
	@FindBy(xpath="//*[@name='SAVE LOOK']")
	WebElement LookSaveButton;
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
	@FindBy(xpath="//*[@name='End Session']")
	WebElement EndSession;
	@FindBy(xpath="//*[@name='Send']")
	WebElement SendEndSession;
	@FindBy(xpath="//*[@name='Yes, thanks!']")
	WebElement ApproveEndSession;
	@FindBy(xpath="(//*[@name='Star grey'])[5]")
	WebElement RateStylist;
	@FindBy(xpath="//*[@name='Submit']")
	WebElement Submit;
	
	public void ClickLoveItem() 
	{
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Love all your ideas!']"));
		System.out.println(elements);
		int count=elements.size();
		elements.get(count-1).click();
		Sleep(250);

	}
	public void ClickLoveOutfit() 
	{
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='I love this outfit']"));
		System.out.println(elements);
		int count=elements.size();
		elements.get(count-1).click();
		Sleep(250);

	}
	public void ClickCreateLook() 
	{
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Create Look']"));
		System.out.println(elements);
		int count=elements.size();
		Sleep(250);
		elements.get(count-1).click();
		Sleep(250);

	}
	public void ClickReviseLook() 
	{
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name=concat('I', \"'\", 'd like to revise the look')]"));
		System.out.println(elements);
		int count=elements.size();
		elements.get(count-1).click();
		Sleep(250);

	}
	public void ClickEndSession() 
	{
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='End Session']"));
		System.out.println(elements);
		int count=elements.size();
		elements.get(count-1).click();
		Sleep(250);

	}
	public void ApproveEndSession() 
	{
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Yes, thanks!']"));
		System.out.println(elements);
		int count=elements.size();
		Sleep(500);
		elements.get(count-1).click();
		Sleep(250);

	}
	
	public void FillDescription(String description ) 
	{
		filltext(MBDescription, description);
	}
	public void FillLookDescription(String description ) 
	{
		filltext(LookDescription, description);
	}
	public void ClickSendMoodBoard() 
	{		
		Sleep(150);
		click(SendMoodBoard);
		Sleep(600);
	}
	public void ClickSendEndSession() 
	{		
		Sleep(150);
		click(SendEndSession);
		Sleep(600);
	}
	public void ClickLookSaveButton()
	{		
		Sleep(200);
		click(LookSaveButton);
		Sleep(600);
	}
	public void RateStylist()
	{		
		Sleep(200);
		click(RateStylist);
		Sleep(600);
	}
	public void ClickSubmit()
	{		
		Sleep(200);
		click(Submit);
		Sleep(600);
	}
	public void ClickChatButton()
	{		
		Sleep(150);
		click(ChatButton);
		//Sleep(150);
	}
	public void ClickToolBarDone() 
	{		
		Sleep(150);
		click(ToolBarDone);
		//Sleep(150);
	}
	public void ClickSave() 
	{		
		Sleep(250);
		click(Save);
		//Sleep(150);
	}
	public void ClickUpArrow() 
	{		
		Sleep(500);
		click(UpArrow);
		Sleep(200);
	}
	public void ClickShop() 
	{		
		Sleep(150);
		click(Shop);
		//Sleep(150);
	}
	public void ClickCreateMoodBoardButton()
	{		
		Sleep(150);
		click(CreateMoodBoardButton);
		//Sleep(150);
	}
	public void ClickCreateLookButton()
	{		
		Sleep(200);
		click(CreateLook);
		//Sleep(150);
	}
	public void ClickCloseButton() 
	{		
		//Sleep(150);
		click(CloseButton);
		//Sleep(150);
	}

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
		Sleep(150);
		click(ChatTab);
	}
	public void ClickcChatTab() 
	{
		click(ChatTab);
    	//driver.findElementByAccessibilityId("Chat").click();
	}
	public void Clickclose_menu4Button() 
	{		
		Sleep(200);
		click(close_menu4Button);
	}

}
