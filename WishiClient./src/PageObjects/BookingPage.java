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
		Sleep(350);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Love all your ideas!']"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(350);
		elements.get(count-1).click();
		Sleep(650);

	}
	public void ClickLoveOutfit() 
	{
		Sleep(350);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='I love this outfit']"));
		System.out.println(elements);
		int count=elements.size();
		Sleep(350);
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(350);
		elements.get(count-1).click();
		Sleep(650);

	}
	public void ClickCreateLook() 
	{
		Sleep(350);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Create Look']"));
		System.out.println(elements);
		int count=elements.size();
		Sleep(350);
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		elements.get(count-1).click();
		Sleep(650);

	}
	public void ClickReviseLookStylist() 
	{
		Sleep(350);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Revise Look']"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(350);
		elements.get(count-1).click();
		Sleep(650);
	}
	public void SelectImageForRevise2(String image)
	{
		Sleep(350);
		String ImageElemet = ("(//*[@name='ReviseImageID'])[text1]");
		ImageElemet = ImageElemet.replace("text1", image);
		WebElement ImageButton = driver.findElement(By.xpath(ImageElemet));
		click(ImageButton);
		Sleep(650);
	} 
	public void SelectImageForRevise()
	{
		Sleep(350);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='ReviseImageID']"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(350);
		elements.get(count-1).click();
		Sleep(650);
	}
	public void ClickReviseLookClient() 
	{
		Sleep(350);
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
		Sleep(350);
		elements.get(count-1).click();
		Sleep(650);

	}
	public void ClickSendReviseClient() 
	{
		Sleep(350);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='SendButtonID']"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(350);
		elements.get(count-1).click();
		Sleep(650);

	}
	public void ClickEndSession() 
	{
		Sleep(350);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='End Session']"));
		System.out.println(elements);
		int count=elements.size();
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(350);
		elements.get(count-1).click();
		Sleep(650);
	}
	public void ApproveEndSession() 
	{
		Sleep(350);
		List<WebElement> elements= driver.findElements(By.xpath("//*[@name='YesThanksButtonID']"));
		System.out.println(elements);
		int count=elements.size();
		Sleep(650);
		String last =	elements.get(count-1).getText();
		System.out.println(last);
		Sleep(350);
		elements.get(count-1).click();
		Sleep(650);

	}

	public void FillDescription(String description ) 
	{
		Sleep(350);
		filltext(MBDescription, description);
		Sleep(350);
	}
	public void FillLookDescription(String description ) 
	{
		Sleep(350);
		filltext(LookDescription, description);
		Sleep(350);
	}
	public void ClickSendMoodBoard() 
	{		
		Sleep(350);
		click(SendMoodBoard);
		Sleep(1000);
	}
	public void ClickSendReviseClient1() 
	{		
		Sleep(350);
		click(SendButtonClient);
		Sleep(600);
	}
	public void ClickSendEndSession() 
	{		
		Sleep(350);
		click(SendEndSession);
		Sleep(600);
	}
	public void ClickLookSaveButton()
	{		
		Sleep(350);
		click(LookSaveButton);
		Sleep(1000);
	}
	public void RateStylist()
	{		
		Sleep(350);
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
		Sleep(350);
		click(ChatButton);
		Sleep(350);
	}
	public void ClickToolBarDone() 
	{		
		Sleep(350);
		click(ToolBarDone);
		Sleep(350);
	}
	public void ClickSave() 
	{		
		Sleep(350);
		click(Save);
		Sleep(350);
	}
	public void ClickUpArrow() 
	{		
		Sleep(500);
		click(UpArrow);
		Sleep(200);
	}
	public void ClickShop() 
	{		
		Sleep(350);
		click(Shop);
		Sleep(350);
	}
	public void ClickCreateMoodBoardButton()
	{		
		Sleep(350);
		click(CreateMoodBoardButton);
		Sleep(350);
	}
	public void ClickCreateLookButton()
	{		
		Sleep(350);
		click(CreateLook);
		Sleep(350);
	}
	public void ClickCloseButton() 
	{		
		Sleep(350);
		click(CloseButton);
		Sleep(350);
	}

	public void ClickLoginStart() 
	{
		Sleep(350);
		click(LoginStart);
		Sleep(350);
	}
	public void LoginStylistApp(String user ,String password ) 
	{
		Sleep(350);
		filltext(UserNAme, user);
		filltext(Password, password);
		Sleep(350);
	}
	public void ClickLoginButton() 
	{
		Sleep(350);
		click(LoginButton);
		Sleep(350);
	}
	public void ClickCloseOnBoarding() 
	{
		Sleep(350);
		click(CloseOnBoarding);
		Sleep(350);
	}
	public void ClickBackButton() 
	{
		Sleep(350);
		click(BackButton);
		Sleep(350);
	}
	public void ClickChatTab() 
	{
		Sleep(350);
		click(ChatTab);
		Sleep(350);
	}
	public void ClickcChatTab() 
	{
		Sleep(350);
		click(ChatTab);
		Sleep(350);
	}
	public void Clickclose_menu4Button() 
	{		
		Sleep(350);
		click(close_menu4Button);
		Sleep(350);
	}

}
