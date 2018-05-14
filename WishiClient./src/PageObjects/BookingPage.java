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

	@FindBy(xpath="//*[@name='BackBarButtonID']")
	WebElement BackButton;

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
	@FindBy(xpath="//*[@name='SendButtonID']")
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
		Sleep(250);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Love all your ideas!']"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(250);
		elements.get(count-1).click();
		Sleep(500);

	}
	public void ClickLoveOutfit() 
	{
		Sleep(250);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='I love this outfit']"));
		System.out.println(elements);
		int count=elements.size();
		Sleep(250);
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(250);
		elements.get(count-1).click();
		Sleep(500);

	}
	public void ClickCreateLook() 
	{
		Sleep(250);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Create Look']"));
		System.out.println(elements);
		int count=elements.size();
		Sleep(250);
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		elements.get(count-1).click();
		Sleep(500);

	}
	public void ClickReviseLookStylist() 
	{
		Sleep(250);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Revise Look']"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(250);
		elements.get(count-1).click();
		Sleep(500);
	}
	public void SelectImageForRevise2(String image)
	{
		Sleep(250);
		String ImageElemet = ("(//*[@name='ReviseImageID'])[text1]");
		ImageElemet = ImageElemet.replace("text1", image);
		WebElement ImageButton = driver.findElement(By.xpath(ImageElemet));
		click(ImageButton);
		Sleep(500);
	} 
	public void SelectImageForRevise()
	{
		Sleep(250);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='ReviseImageID']"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(250);
		elements.get(count-1).click();
		Sleep(500);
	}
	public void ClickReviseLookClient() 
	{
		Sleep(250);
		scrollUp();
		scrollUp();
		scrollUp();
		scrollDownXpath();
		scrollDownXpath();
		scrollDownXpath();
		scrollDownXpath();
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name=concat('I', \"'\", 'd like to revise the look')]"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(250);
		elements.get(count-1).click();
		Sleep(500);

	}
	public void ClickSendReviseClient() 
	{
		Sleep(250);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='SendButtonID']"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(250);
		elements.get(count-1).click();
		Sleep(500);

	}
	public void ClickEndSession() 
	{
		Sleep(250);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='End Session']"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(250);
		elements.get(count-1).click();
		Sleep(500);
	}
	public void ApproveEndSession() 
	{
		Sleep(250);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='YesThanksButtonID']"));
		System.out.println(elements);
		int count=elements.size();
		Sleep(500);
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(250);
		elements.get(count-1).click();
		Sleep(500);

	}

	public void FillDescription(String description ) 
	{
		Sleep(250);
		filltext(MBDescription, description);
		Sleep(250);
	}
	public void FillLookDescription(String description ) 
	{
		Sleep(250);
		filltext(LookDescription, description);
		Sleep(250);
	}
	public void ClickSendMoodBoard() 
	{		
		Sleep(250);
		click(SendMoodBoard);
		Sleep(1000);
	}
	public void ClickSendReviseClient1() 
	{		
		Sleep(250);
		click(SendButtonClient);
		Sleep(600);
	}
	public void ClickSendEndSession() 
	{		
		Sleep(250);
		click(SendEndSession);
		Sleep(600);
	}
	public void ClickLookSaveButton()
	{		
		Sleep(250);
		click(LookSaveButton);
		Sleep(1000);
	}
	public void RateStylist()
	{		
		Sleep(250);
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
		Sleep(250);
		click(ChatButton);
		Sleep(250);
	}
	public void ClickToolBarDone() 
	{		
		Sleep(250);
		click(ToolBarDone);
		Sleep(250);
	}
	public void ClickSave() 
	{		
		Sleep(250);
		click(Save);
		Sleep(250);
	}
	public void ClickUpArrow() 
	{		
		Sleep(500);
		click(UpArrow);
		Sleep(200);
	}
	public void ClickShop() 
	{		
		Sleep(250);
		click(Shop);
		Sleep(250);
	}
	public void ClickCreateMoodBoardButton()
	{		
		Sleep(250);
		click(CreateMoodBoardButton);
		Sleep(250);
	}
	public void ClickCreateLookButton()
	{		
		Sleep(250);
		click(CreateLook);
		Sleep(250);
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
	public void ClickBackButton() 
	{
		Sleep(250);
		click(BackButton);
		Sleep(250);
	}
	public void ClickChatTab() 
	{
		Sleep(250);
		click(ChatTab);
		Sleep(250);
	}
	public void ClickcChatTab() 
	{
		Sleep(250);
		click(ChatTab);
		Sleep(250);
	}
	public void Clickclose_menu4Button() 
	{		
		Sleep(250);
		click(close_menu4Button);
		Sleep(250);
	}

}
