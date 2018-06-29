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
	//@FindBy(xpath="//*[@name='up-arrow']")
	@FindBy(id="up-arrow")
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
	
	//@FindBy(xpath="//*[@name='Create Mood Board']")
	@FindBy(id="Create Mood Board")
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
	//@FindBy(xpath="//*[@name='Submit']")
	@FindBy(id="Submit")
	WebElement Submit;

	public void ClickLoveItem() 
	{
		Sleep(170);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Love all your ideas!']"));
		//List<WebElement> elements= driver.findElements(By.id("Love all your ideas!"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(170);
		elements.get(count-1).click();
		Sleep(200);
		WaitElementDisplay(By.id("WriteMessageID"));
	}
	public void ClickLoveOutfit() 
	{
		Sleep(170);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='I love this outfit']"));
		//List<WebElement> elements= driver.findElements(By.id("I love this outfit"));
		System.out.println(elements);
		int count=elements.size();
		Sleep(170);
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(170);
		elements.get(count-1).click();
		Sleep(200);
		WaitElementDisplay(By.id("WriteMessageID"));
	}
	public void ClickCreateLook() 
	{
		Sleep(170);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Create Look']"));
		//List<WebElement> elements= driver.findElements(By.id("Create Look"));
		System.out.println(elements);
		int count=elements.size();
		Sleep(170);
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		elements.get(count-1).click();
		Sleep(500);

	}
	public void ClickReviseLookStylist() 
	{
		Sleep(170);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Revise Look']"));
		//List<WebElement> elements= driver.findElements(By.id("Revise Look"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(170);
		elements.get(count-1).click();
		Sleep(500);
	}
	public void SelectImageForRevise2(String image)
	{
		Sleep(170);
		String ImageElemet = ("(//*[@name='ReviseImageID'])[text1]");
		ImageElemet = ImageElemet.replace("text1", image);
		WebElement ImageButton = driver.findElement(By.xpath(ImageElemet));
		click(ImageButton);
		Sleep(500);
	} 
	public void SelectImageForRevise()
	{
		Sleep(170);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='ReviseImageID']"));
		//List<WebElement> elements= driver.findElements(By.id("ReviseImageID"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(170);
		elements.get(count-1).click();
		Sleep(500);
	}
	public void ClickReviseLookClient() 
	{
		Sleep(170);
		scrollUp();
		scrollUp();
		scrollUp();
		scrollDownXpath();
		scrollDownXpath();
		scrollDownXpath();
		scrollDownXpath();
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name=concat('I', \"'\", 'd like to revise the look')]"));
		//List<WebElement> elements= driver.findElements(By.id("I', \\\"'\\\", 'd like to revise the look"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(170);
		elements.get(count-1).click();
		Sleep(500);

	}
	public void ClickSendReviseClient() 
	{
		Sleep(170);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='SendButtonID']"));
		//List<WebElement> elements= driver.findElements(By.id("SendButtonID"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(170);
		elements.get(count-1).click();
		Sleep(500);

	}
	public void ClickEndSession() 
	{
		Sleep(170);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='End Session']"));
		//List<WebElement> elements= driver.findElements(By.id("End Session"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(170);
		elements.get(count-1).click();
		Sleep(500);
	}
	public void ApproveEndSession() 
	{
		Sleep(170);
		//List<WebElement> elements= driver.findElements(By.xpath("//*[@name='YesThanksButtonID']"));
		List<WebElement> elements= driver.findElements(By.id("YesThanksButtonID"));
		System.out.println(elements);
		int count=elements.size();
		Sleep(500);
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(170);
		elements.get(count-1).click();
		Sleep(500);
		WaitElementDisplay(By.xpath("//*[@name='Rating']"));
	}

	public void FillDescription(String description ) 
	{
		Sleep(170);
		filltext(MBDescription, description);
		Sleep(170);
	}
	public void FillLookDescription(String description ) 
	{
		Sleep(170);
		filltext(LookDescription, description);
		Sleep(170);
	}
	public void ClickSendMoodBoard() 
	{		
		Sleep(170);
		click(SendMoodBoard);
		Sleep(150);
		//WaitElementNotDisplay(By.xpath("//*[@name='Send Mood Board']"));
		WaitElementDisplay(By.id("BackButton"));
	}
	public void ClickSendReviseClient1() 
	{		
		Sleep(170);
		click(SendButtonClient);
		Sleep(500);
	}
	public void ClickSendEndSession() 
	{		
		Sleep(170);
		click(SendEndSession);
		Sleep(500);
	}
	public void ClickLookSaveButton()
	{		
		Sleep(170);
		click(LookSaveButton);
		WaitElementDisplay(By.id("BackButton"));
	}
	public void ClickReviseLookSaveButton()
	{		
		Sleep(170);
		click(LookSaveButton);
		WaitElementDisplay(By.id("My Bookings"));
	}
	public void RateStylist()
	{		
		Sleep(170);
		click(RateStylist);
		Sleep(700);
	}
	public void ClickSubmit()
	{		
		Sleep(200);
		click(Submit);
		WaitElementDisplay(By.id("WriteMessageID"));
		//Sleep(700);
	}
	public void ClickChatButton()
	{		
		Sleep(170);
		click(ChatButton);
		Sleep(170);
	}
	public void ClickToolBarDone() 
	{		
		Sleep(170);
		click(ToolBarDone);
		Sleep(170);
	}
	public void ClickSave() 
	{		
		Sleep(170);
		click(Save);
		Sleep(170);
	}
	public void ClickUpArrow() 
	{		
		Sleep(500);
		click(UpArrow);
		Sleep(200);
	}
	public void ClickShop() 
	{		
		Sleep(170);
		click(Shop);
		Sleep(170);
		//WaitElementDisplay(By.xpath("(//*[@name='itemCellID'])[1]"));
	}
	public void ClickCreateMoodBoardButton()
	{		
		Sleep(170);
		click(CreateMoodBoardButton);
		Sleep(170);
	}
	public void ClickCreateLookButton()
	{		
		Sleep(170);
		click(CreateLook);
		Sleep(170);
	}
	public void ClickCloseButton() 
	{		
		Sleep(170);
		click(CloseButton);
		Sleep(170);
	}

	public void ClickLoginStart() 
	{
		Sleep(170);
		click(LoginStart);
		Sleep(170);
	}
	public void LoginStylistApp(String user ,String password ) 
	{
		Sleep(170);
		filltext(UserNAme, user);
		filltext(Password, password);
		Sleep(170);
	}
	public void ClickLoginButton() 
	{
		Sleep(170);
		click(LoginButton);
		Sleep(170);
	}
	public void ClickCloseOnBoarding() 
	{
		Sleep(170);
		click(CloseOnBoarding);
		Sleep(170);
	}
	public void ClickBackButton() 
	{
		Sleep(170);
		click(BackButton);
		Sleep(170);
	}
	public void ClickChatTab() 
	{
		Sleep(170);
		click(ChatTab);
		Sleep(170);
	}
	public void ClickcChatTab() 
	{
		Sleep(170);
		click(ChatTab);
		Sleep(170);
	}
	public void Clickclose_menu4Button() 
	{		
		Sleep(170);
		click(close_menu4Button);
		Sleep(170);
	}

}
