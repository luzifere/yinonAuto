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
	@FindBy(xpath="//*[@name='ArrowButtonID']")
	WebElement UpArrow;

	@FindBy(xpath="//*[@name='BackBarButtonID']")
	WebElement BackButton;

	@FindBy(xpath="//*[@name='Love all your ideas!'][1]")
	WebElement LoveIteme;

	@FindBy(xpath="//*[@name='Send']")
	WebElement SendMoodBoard;

	@FindBy(id="Toolbar Done Button")
	WebElement ToolBarDone;

	@FindBy(xpath="//*[@name='CollectionDescription']")
	WebElement CollectionDescription;
	@FindBy(xpath="(//*[@name='MBDescription'])[2]")
	WebElement MBDescription;

	@FindBy(xpath="//*[@name='LookDescription']")//*[@value='Add a description']
	WebElement LookDescription;
	@FindBy(xpath="//*[@name='description']")//*[@value='Add a description']
	WebElement Description;
	@FindBy(xpath="//*[@name='Save']")
	WebElement SaveDescription;
	@FindBy(xpath="//*[@name='SAVE']")
	WebElement SaveCollection;
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
	@FindBy(xpath="//*[@name='Save']")
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
	@FindBy(id="ClosePPCanvasID")
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
	@FindBy(xpath="//*[@name='FourButtonID']")
	WebElement FourButtonID;
	@FindBy(xpath="//*[@name='SixButtonID']")
	WebElement SixButtonID;
	@FindBy(xpath="//*[@name='TenButtonID']")
	WebElement TenButtonID;
	@FindBy(xpath="//*[@name='NoneButtonID']")
	WebElement NoneButtonID;
	@FindBy(xpath="//*[@name='DoneButtonID']")
	WebElement DoneButtonID;
	@FindBy(xpath="//*[@name='Next']")
	WebElement NextButtonID;
	@FindBy(xpath="//*[@name='MOODBOARDS']")
	WebElement MoodBordTab;
	@FindBy(xpath="//*[@name='MessageCounterViewID']")
	WebElement MessageCounter;
	@FindBy(xpath="//*[@name='LOOKS']")
	WebElement LooksTab;
	@FindBy(xpath="//*[@name='Toolbar Done Button']")
	WebElement Done;
	//@FindBy(xpath="//*[@name='Submit']")
	@FindBy(id="Submit")
	WebElement Submit;


	public void TipToStylist() 
	{
		try

		{
			Sleep(170);
			click(FourButtonID);
			Sleep(170);
			click(DoneButtonID);
			WaitElementDisplay(By.xpath("//*[@name='Feed']"));

		}catch(Exception e){


			System.err.println("\nError : TipToStylist failed\n");

		}

	}
	public void ClickMessageCounter() 
	{
		try

		{
			Sleep(170);
			click(MessageCounter);
			Sleep(170);

		}catch(Exception e){


			System.err.println("\nError : ClickMessageCounter failed\n");

		}

	}
	public void ClickFourButtonID() 
	{
		{
			try

			{
				Sleep(170);
				click(FourButtonID);
				Sleep(170);
			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickFourButtonID failed\n");	
			}
		}

	}
	public void AddMoodBord() 
	{
		{
			try

			{
				WaitElementDisplay(By.xpath("//*[@name='LOOKS']"));
				click(LooksTab);
				WaitElementDisplay(By.xpath("//*[@name='ArrowButtonID']"));
				Sleep(250);
				click(UpArrow);
				WaitElementDisplay(By.xpath("//*[@name='MOODBOARDS']"));
				click(MoodBordTab);
				SelectImage3(100,200);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : AddMoodBord failed\n");	
			}
		}


	}
	public void AddLooks() 
	{
		{
			try

			{
				WaitElementDisplay(By.xpath("//*[@name='LOOKS']"));
				click(LooksTab);
				WaitElementDisplay(By.xpath("//*[@name='ArrowButtonID']"));
				Sleep(250);
				click(UpArrow);
				WaitElementDisplay(By.xpath("//*[@name='MOODBOARDS']"));
				click(LooksTab);
				SelectImage3(100,200);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : AddLooks failed\n");	
			}
		}


	}
	public void ClickSixButtonID() 
	{
		{
			try

			{
				Sleep(170);
				click(SixButtonID);
				Sleep(170);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickSixButtonID failed\n");	
			}
		}


	}
	public void ClickTenButtonID() 
	{
		{
			try

			{
				Sleep(170);
				click(TenButtonID);
				Sleep(170);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickTenButtonID failed\n");	
			}
		}


	}
	public void ClickNoneButtonID() 
	{
		{
			try

			{
				Sleep(170);
				click(NoneButtonID);
				Sleep(170);		

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickNoneButtonID failed\n");	
			}
		}


	}
	public void ClickDoneButtonID() 
	{
		{
			try

			{
				Sleep(170);
				click(DoneButtonID);
				Sleep(170);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickDoneButtonID failed\n");	
			}
		}


	}
	public void ClickNextButtonID() 
	{
		{
			try

			{
				Sleep(170);
				click(NextButtonID);
				Sleep(170);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickNextButtonID failed\n");	
			}
		}


	}

	public void ClickLoveItem() 
	{
		{
			try

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
				//WebElement loveitem = elements.get(count-1);
				//ScrollTooElement2(loveitem);
				//loveitem.click();

				Sleep(200);
				WaitElementDisplay(By.id("Write a message..."));

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickLoveItem failed\n");	
			}
		}


	}
	public void ClickLoveOutfit() 
	{
		{
			try

			{
				Sleep(170);
				List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Love it!']"));
				//List<WebElement> elements= driver.findElements(By.id("I love this outfit"));
				System.out.println(elements);
				int count=elements.size();
				Sleep(170);
				String last =	elements.get(count-1).getText();
				System.out.println(last);
				Sleep(150);
				elements.get(count-1).click();
				Sleep(200);
				WaitElementDisplay(By.id("Write a message..."));

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickLoveOutfit failed\n");	
			}
		}


	}
	public void ClickLoveAllOfThis() 
	{
		{
			try

			{
				Sleep(170);
				List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Love all of these, can you help me choose?']"));
				//List<WebElement> elements= driver.findElements(By.id("I love this outfit"));
				System.out.println(elements);
				int count=elements.size();
				Sleep(170);
				String last =	elements.get(count-1).getText();
				System.out.println(last);
				Sleep(170);
				elements.get(count-1).click();
				Sleep(200);
				WaitElementDisplay(By.id("Write a message..."));

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickLoveAllOfThis failed\n");	
			}
		}


	}
	public void ClickCreateLook() 
	{
		{
			try

			{

				Sleep(250);
				List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Create Look']"));
				//List<WebElement> elements= driver.findElements(By.id("Create Look"));
				System.out.println(elements);
				int count=elements.size();
				Sleep(250);
				String last =	elements.get(count-1).getText();
				System.out.println(last);
				elements.get(count-1).click();
				Sleep(500);
			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickCreateLook failed\n");	
			}
		}



	}
	public void ClickStyleLook() 
	{
		{
			try

			{
				Sleep(170);
				List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Style']"));
				//List<WebElement> elements= driver.findElements(By.id("Create Look"));
				System.out.println(elements);
				int count=elements.size();
				Sleep(170);
				String last =	elements.get(count-1).getText();
				System.out.println(last);
				elements.get(count-1).click();
				Sleep(500);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickStyleLook failed\n");	
			}
		}



	}
	public void ClickReviseLookStylist() 
	{
		{
			try

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
			catch(Exception e)
			{	
				System.err.println("\nError : ClickReviseLookStylist failed\n");	
			}
		}
	}
	public void SelectImageForRevise2(String image)
	{
		{
			try

			{
				Sleep(170);
				String ImageElemet = ("(//*[@name='ReviseImageID'])[text1]");
				ImageElemet = ImageElemet.replace("text1", image);
				WebElement ImageButton = driver.findElement(By.xpath(ImageElemet));
				click(ImageButton);
				Sleep(500);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : SelectImageForRevise2 failed\n");	
			}
		}


	} 
	public void SelectImageForRevise()
	{
		{
			try

			{
				Sleep(170);
				//List<WebElement> elements= driver.findElements(By.xpath("//*[@name='TopmanID']"));
				List<WebElement> elements= driver.findElements(By.id("CellReviseID"));
				System.out.println(elements);
				int count=elements.size();
				System.out.println(count);
				String last =	elements.get(count-1).getText();
				System.out.println(last);
				Sleep(170);
				elements.get(count-1).click();
				Sleep(500);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : SelectImageForRevise failed\n");	
			}
		}


	}
	public void ClickReviseLookClient() 
	{
		{
			try

			{
				Sleep(170);
				/*
					scrollUp();
					scrollUp();
					scrollDownXpath();
					scrollDownXpath();
				 */
				scrollDownXpath();
				List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Revise it']"));
				//List<WebElement> elements= driver.findElements(By.id("I', \\\"'\\\", 'd like to revise the look"));
				System.out.println(elements);
				int count=elements.size();
				String last =	elements.get(count-1).getText();
				System.out.println(last);
				Sleep(170);
				elements.get(count-1).click();
				Sleep(500);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickReviseLookClient failed\n");	
			}
		}



	}
	public void ClickSendReviseClient() 
	{
		{
			try

			{

				Sleep(170);
				List<WebElement> elements= driver.findElements(By.xpath("//*[@name='Submit']"));
				//List<WebElement> elements= driver.findElements(By.id("SendButtonID"));
				System.out.println(elements);
				int count=elements.size();
				String last =	elements.get(count-1).getText();
				System.out.println(last);
				Sleep(170);
				elements.get(count-1).click();
				Sleep(500);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickSendReviseClient failed\n");	
			}
		}


	}
	public void ClickEndSession() 
	{
		{
			try

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
			catch(Exception e)
			{	
				System.err.println("\nError : ClickEndSession failed\n");	
			}
		}


	}
	public void ApproveEndSession() 
	{
		{
			try

			{
				Sleep(250);
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
				WaitElementDisplay(By.xpath("(//*[@name='Star grey'])[5]"));

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ApproveEndSession failed\n");	
			}
		}


	}

	public void FillDescription(String description ) 
	{
		{
			try

			{
				Sleep(170);
				//click(MBDescription);
				Sleep(170);
				SelectImage3(264,564);
				Sleep(170);
				clear(MBDescription);
				filltext(MBDescription, description);
				click(Done);
				//click(SaveDescription);
				Sleep(170);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : FillDescription failed\n");	
			}
		}


	}
	public void FillLookDescription(String description ) 
	{
		{
			try

			{

				Sleep(170);
				click(LookDescription);
				clear(Description);
				filltext(Description, description);
				click(SaveDescription);
				Sleep(170);
			}
			catch(Exception e)
			{	
				System.err.println("\nError : FillLookDescription failed\n");	
			}
		}


	}
	public void FillCollectionDescription(String description ) 
	{
		{
			try

			{
				Sleep(170);
				click(CollectionDescription);
				clear(Description);
				filltext(Description, description);
				click(SaveDescription);
				Sleep(170);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : FillCollectionDescription failed\n");	
			}
		}


	}
	public void ClickSendMoodBoard() 
	{		
		{
			try

			{
				Sleep(250);
				WaitElementDisplay(By.xpath("//*[@name='Send']"));
				click(SendMoodBoard);
				Sleep(150);
				//WaitElementNotDisplay(By.xpath("//*[@name='Send Mood Board']"));
				Sleep(250);
				Sleep(250);
				BasePage.AcceptAlert();
				WaitElementDisplay(By.id("BackButton"));

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickSendMoodBoard failed\n");	
			}
		}


	}

	public void ClickSendReviseClient1() 
	{		
		{
			try

			{
				Sleep(170);
				click(SendButtonClient);
				Sleep(500);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickSendReviseClient1 failed\n");	
			}
		}


	}
	public void ClickSendEndSession() 
	{	
		{
			try

			{
				Sleep(170);
				click(SendEndSession);
				WaitElementDisplay(By.xpath("//*[@name='Waiting for your client to confirm ending the session']"));

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickSendEndSession failed\n");	
			}
		}


	}
	public void ClickSendEndSessionStyle() 
	{		
		{
			try

			{
				Sleep(170);
				click(SendEndSession);
				WaitElementDisplay(By.xpath("//*[@name='No Action Needed']"));

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickSendEndSessionStyle failed\n");	
			}
		}


	}
	public void ReplaceToEmptyCanvas()
	{		
		{
			try

			{
				Sleep(250);
				WaitElementDisplay(By.id("EmptyCanvasID"));
				driver.findElement(By.id("EmptyCanvasID")).click();
				Sleep(170);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ReplaceToEmptyCanvas failed\n");	
			}
		}


	}

	public void ClickLookSaveButton()
	{	
		{
			try

			{
				Sleep(170);
				click(LookSaveButton);
				Sleep(250);
				BasePage.AcceptAlert();
				WaitElementDisplay(By.id("BackButton"));

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickLookSaveButton failed\n");	
			}
		}


	}
	public void ClickCollectionSaveButton()
	{		
		{
			try

			{
				Sleep(170);
				click(SaveCollection);
				BasePage.AcceptAlert();
				WaitElementDisplay(By.id("BackButton"));

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickCollectionSaveButton failed\n");	
			}
		}


	}
	public void ClickReviseLookSaveButton()
	{	
		{
			try

			{
				Sleep(170);
				click(LookSaveButton);
				Sleep(250);
				BasePage.AcceptAlert();
				WaitElementDisplay(By.id("My Bookings"));

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickReviseLookSaveButton failed\n");	
			}
		}


	}
	public void RateStylist()
	{		
		{
			try

			{
				Sleep(170);
				click(RateStylist);
				WaitElementDisplay(By.xpath("//*[@name='Your review will be public']"));
				click(NextButtonID);
				WaitElementDisplay(By.xpath("//*[@name='FourButtonID']"));

			}
			catch(Exception e)
			{	
				System.err.println("\nError : RateStylist failed\n");	
			}
		}


	}
	public void ClickSubmit()
	{	
		{
			try

			{
				Sleep(200);
				click(Submit);
				WaitElementDisplay(By.id("Write a message..."));
				//Sleep(700);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickSubmit failed\n");	
			}
		}


	}
	public void ClickChatButton()
	{
		{
			try

			{
				Sleep(170);
				click(ChatButton);
				Sleep(170);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickChatButton failed\n");	
			}
		}

	}
	public void ClickToolBarDone() 
	{		
		{
			try

			{

				Sleep(170);
				click(ToolBarDone);
				Sleep(170);
			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickToolBarDone failed\n");	
			}
		}


	}
	public void ClickSave() 
	{		
		{
			try

			{
				Sleep(170);
				click(Save);
				Sleep(170);		

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickSave failed\n");	
			}
		}


	}
	public void ClickUpArrow() 
	{	
		{
			try

			{


				Sleep(500);
				click(UpArrow);
				Sleep(200);
			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickUpArrow failed\n");	
			}
		}

	}
	public void ClickShop() 
	{		
		{
			try

			{

				Sleep(170);
				driver.findElement(By.xpath("//*[@name='SHOP']")).click();//*[@name='SHOP']
				//click(Shop);
				Sleep(170);
				WaitElementDisplay(By.xpath("//*[@name='itemCellID'][1]"));
			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickShop failed\n");	
			}
		}


	}
	public void ClickCreateMoodBoardButton()
	{		
		{
			try

			{

				Sleep(250);
				WaitElementDisplay(By.id("Create Mood Board"));
				click(CreateMoodBoardButton);
				Sleep(170);
			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickCreateMoodBoardButton failed\n");	
			}
		}


	}
	public void ClickGoItButton()
	{		
		{
			try

			{

				Sleep(250);
				WaitElementDisplay(By.id("Got It"));
				driver.findElement(By.id("Got It")).click();
				Sleep(170); 
			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickGoItButton failed\n");	
			}
		}


	}
	public void ClickCloseOBButton()
	{		
		{
			try

			{
				Sleep(250);
				WaitElementDisplay(By.xpath("//*[@name='CloseOnboarding']"));
				driver.findElement(By.xpath("//*[@name='CloseOnboarding']")).click();
				Sleep(170);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickCloseOBButton failed\n");	
			}
		}


	}
	public void ClickCreateLookButton()
	{		
		{
			try

			{
				Sleep(170);
				click(CreateLook);
				Sleep(170);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickCreateLookButton failed\n");	
			}
		}


	}
	public void ClickCloseButton() 
	{	
		{
			try

			{

				Sleep(170);
				click(CloseButton);
				Sleep(170);
			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickCloseButton failed\n");	
			}
		}


	}

	public void ClickLoginStart() 
	{
		{
			try

			{
				Sleep(170);
				click(LoginStart);
				Sleep(170);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickLoginStart failed\n");	
			}
		}
	}
	public void LoginStylistApp(String user ,String password ) 
	{
		{
			try

			{
				Sleep(170);
				filltext(UserNAme, user);
				filltext(Password, password);
				Sleep(250);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : LoginStylistApp failed\n");	
			}
		}


	}
	public void ClickLoginButton() 
	{
		{
			try

			{
				Sleep(170);
				click(LoginButton);
				Sleep(170);	

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickLoginButton failed\n");	
			}
		}

		Sleep(170);
		click(LoginButton);
		Sleep(170);
	}
	public void ClickCloseOnBoarding() 
	{
		{
			try

			{

				Sleep(170);
				click(CloseOnBoarding);
				Sleep(170);
			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickCloseOnBoarding failed\n");	
			}
		}


	}
	public void ClickBackButton() 
	{
		{
			try

			{
				Sleep(170);
				click(BackButton);
				Sleep(170);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickBackButton failed\n");	
			}
		}


	}
	public void ClickChatTab() 
	{
		{
			try

			{
				Sleep(170);
				click(ChatTab);
				Sleep(170);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickChatTab failed\n");	
			}
		}

		Sleep(170);
		click(ChatTab);
		Sleep(170);
	}
	public void ClickcChatTab() 
	{
		{
			try

			{
				Sleep(170);
				click(ChatTab);
				Sleep(170);	

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickcChatTab failed\n");	
			}
		}


	}
	public void Clickclose_menu4Button() 
	{	
		{
			try

			{
				Sleep(170);
				click(close_menu4Button);
				Sleep(170);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : Clickclose_menu4Button failed\n");	
			}
		}


	}
	public void SelectItem(String item)
	{
		{
			try

			{

				String PlusElemet = ("(//*[@name='itemCellID'])[Text1]");
				PlusElemet = PlusElemet.replace("Text1", item);
				WebElement PlusTabs = driver.findElement(By.xpath(PlusElemet));
				click(PlusTabs);
			}
			catch(Exception e)
			{	
				System.err.println("\nError : SelectItem failed\n");	
			}
		}


	}


}
