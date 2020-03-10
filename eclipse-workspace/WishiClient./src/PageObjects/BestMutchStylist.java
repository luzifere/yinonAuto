package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class BestMutchStylist extends BasePage 
{

	public BestMutchStylist(AppiumDriver<WebElement> _driver) 
	{
		super(_driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//*[@name='Let’s do it']")
	WebElement LetsDoIt;




	@FindBy(xpath="//*[@name='HellNoButtonID']")
	WebElement HellNo;
	@FindBy(xpath="//*[@name='SometimesButtonID']")
	WebElement Somtimes;
	@FindBy(xpath="//*[@name='LoveItButtonID']")
	WebElement LoveIt;
	@FindBy(xpath="//*[@name='TapToContinueLabelID']")
	WebElement how_it_workst;

	@FindBy(xpath="//*[@name='HowItWorksID']")
	WebElement BodyType;

	@FindBy(xpath="//*[@name='HowItWorksID']")
	WebElement how_it_works_outfit;

	@FindBy(xpath="//*[@name='FemaleButtonID']")
	WebElement FemaleButtonID;

	@FindBy(xpath="//*[@name='FluidButtonID']")
	WebElement SelfIdentityButtonID;

	@FindBy(xpath="//*[@name='MaleButtonID']")
	WebElement MaleButtonID;

	@FindBy(xpath="//*[@name='BirthdayTextFieldID']")
	WebElement BirthdayTextFieldID;

	@FindBy(xpath="//*[@name='CheapButtonID']")
	WebElement CheapButtonID;

	@FindBy(xpath="//*[@name='NormalButtonID']")
	WebElement NormalButtonID;

	@FindBy(xpath="//*[@name='ExpensiveButtonID']")
	WebElement ExpensiveButtonID;

	@FindBy(xpath="//*[@name='SuperExpensiveButtonID']")
	WebElement SuperExpensiveButtonID;

	@FindBy(xpath="(//*[@name='InspireCellViewID'])[1]")
	WebElement inspiration;

	@FindBy(xpath="(//*[@name='BrandsCellViewID'])[2]")
	WebElement Brands;

	@FindBy(xpath="//*[@name='NextButtonID']")
	WebElement NextButtonID;
	@FindBy(xpath="//*[@name='Next']")
	WebElement NextTags;

	@FindBy(xpath="(//*[@name='close_image'])[1]")
	WebElement close_image;


	@FindBy(xpath="//*[@name='CloseButtonID']")
	WebElement CloseBestMatch;

	@FindBy(xpath="//*[@name='BackButtonID']")
	WebElement BackButton;

	@FindBy(id="ViewMoreStylistsButtonID")
	WebElement MoreStylistsButton;
	
	@FindBy(id="ViewMoreStylistsButtonID")
	WebElement Continue;



	public void SelectBodyType(String inspiration)
	{
		try

		{
			String GoalElemet = ("//*[@name='text1']");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			WaitElementDisplay(By.xpath("//*[@name='FIT']"));
			Sleep(100);
			click(GoalButton);

		}catch(Exception e){


			System.err.println("\nError : SelectBodyType failed\n");

		}

	}
	public void SelectBrands(String inspiration)
	{
		try

		{
			String GoalElemet = ("//*[@name='text1']");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			WaitElementDisplay(By.xpath("//*[@name='NextButtonID']"));
			Sleep(100);
			click(GoalButton);

		}catch(Exception e){


			System.err.println("\nError : SelectBodyType failed\n");

		}

	}
	public void ClickMoreStylistsButton() 
	{	
		Sleep(250);
		click(MoreStylistsButton);
		Sleep(250);
		WaitElementDisplay(By.xpath("//*[@name='Allow']"));
	}
	public void CloseBestMatch() 
	{	
		Sleep(250);
		click(CloseBestMatch);
		Sleep(250);
		//WaitElementDisplay(By.xpath("//*[@name='Allow']"));
	}
	public void ClickBack() 
	{	
		try

		{
			Sleep(100);
			click(BackButton);
			Sleep(100);

		}catch(Exception e){


			System.err.println("\nError : ClickBack failed\n");

		}

	}
	public void ClickContinue() 
	{	
		try

		{
			Sleep(100);
			click(Continue);
			Sleep(100);

		}catch(Exception e){


			System.err.println("\nError : ClickContinue failed\n");

		}

	}
	public void ClickLoveItButton() 
	{	
		try

		{
			Sleep(100);
			click(LoveIt);
			Sleep(100);
			//WaitElementDisplay(By.xpath("//*[@name='LoveItButtonID']"));

		}catch(Exception e){


			System.err.println("\nError : ClickLoveItButton failed\n");

		}

	}
	public void ClickSomtimesButton() 
	{	
		try

		{
			Sleep(100);
			click(Somtimes);
			Sleep(100);
			//WaitElementDisplay(By.xpath("//*[@name='LoveItButtonID']"));

		}catch(Exception e){


			System.err.println("\nError : ClickSomtimesButton failed\n");

		}

	}
	public void ClickHellNoButton() 
	{	
		try

		{
			Sleep(100);
			click(HellNo);
			Sleep(100);
			//WaitElementDisplay(By.xpath("//*[@name='LoveItButtonID']"));

		}catch(Exception e){


			System.err.println("\nError : ClickHellNoButton failed\n");

		}

	}

	public void ClickNextTags() 
	{	
		try

		{
			Sleep(250);
			click(NextTags);
			Sleep(250);

		}catch(Exception e){


			System.err.println("\nError : ClickNextTags failed\n");

		}

	}
	public void ClickHoeToWork() 
	{	
		try

		{
			Sleep(250);
			click(how_it_workst);
			Sleep(250);

		}catch(Exception e){


			System.err.println("\nError : ClickHoeToWork failed\n");

		}
	}
	public void ClickBodyType() 
	{		
		{
			try

			{
				Sleep(250);
				click(BodyType);
				Sleep(250);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickBodyType failed\n");	
			}
		}


	}
	public void ClickHoeToWorkoutfit() 
	{
		{
			try

			{
				Sleep(250);
				click(how_it_works_outfit);
				Sleep(250);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickHoeToWorkoutfit failed\n");	
			}
		}


	}
	public void ClickFamle() 
	{
		{
			try

			{	
				Sleep(250);
				click(FemaleButtonID);
				Sleep(250);
			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickFamle failed\n");	
			}
		}


	}
	public void ClickSelfIdentityButtonID() 
	{
		{
			try

			{

				Sleep(250);
				click(SelfIdentityButtonID);
				Sleep(250);
			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickSelfIdentityButtonID failed\n");	
			}
		}


	}
	public void ClickMale() 
	{
		{
			try

			{
				Sleep(250);
				click(MaleButtonID);
				Sleep(250);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickMale failed\n");	
			}
		}


	}
	public void fillBirthday(String text) 
	{
		{
			try

			{
				Sleep(250);
				filltext(BirthdayTextFieldID, text);
				Sleep(250);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : fillBirthday failed\n");	
			}
		}
	}
	public void SelectCheapButtonID() 
	{
		{
			try

			{

				Sleep(250);
				click(CheapButtonID);
				Sleep(250);
			}
			catch(Exception e)
			{	
				System.err.println("\nError : SelectCheapButtonID failed\n");	
			}
		}


	}
	public void SelectNormal() 
	{
		{
			try

			{
				Sleep(250);
				click(NormalButtonID);
				Sleep(250);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : SelectNormal failed\n");	
			}
		}


	}
	public void SelectExpensiveButtonID() 
	{
		{
			try

			{
				Sleep(250);
				click(ExpensiveButtonID);
				Sleep(250);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : SelectExpensiveButtonID failed\n");	
			}
		}


	}
	public void Selectinspiration() 
	{
		{
			try

			{
				Sleep(250);
				click(inspiration);
				Sleep(250);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : Selectinspiration failed\n");	
			}
		}


	}
	public void SelectBrands() 
	{
		{
			try

			{

				Sleep(250);
				click(Brands);
				Sleep(250);
			}
			catch(Exception e)
			{	
				System.err.println("\nError : SelectBrands failed\n");	
			}
		}


	}
	public void ClickNextbutton() 
	{
		{
			try

			{
				Sleep(250);
				click(NextButtonID);
				Sleep(250);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : ClickNextbutton failed\n");	
			}
		}


	}
	public void Clickclose_image() 
	{
		{
			try

			{
				Sleep(250);
				click(close_image);
				Sleep(250);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : Clickclose_image failed\n");	
			}
		}


	}

	public void SelectTag(String Picker)
	{
		{
			try

			{
				Sleep(200);
				String PickerElemet = ("Text1");
				PickerElemet = PickerElemet.replace("Text1", Picker);
				WebElement PickerTabs = driver.findElement(By.id(PickerElemet));
				Sleep(200);
				click(PickerTabs);

			}
			catch(Exception e)
			{	
				System.err.println("\nError : SelectTag failed\n");	
			}
		}


	}
	public void FamaleChecked ()
	{
		if (driver.findElement(By.xpath("(//*[@name='checkmark3'])[1]")).isEnabled());
		FemaleButtonID.click();

		
	}

}
