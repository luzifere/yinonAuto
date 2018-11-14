package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class CeckOutPage extends BasePage
{

	public CeckOutPage(AppiumDriver<WebElement> _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@name='plusButtonID']")
	WebElement PlusButtonOfEvents;
	@FindBy(xpath="//*[@name='Instagram']")
	WebElement Instagram;
	@FindBy(xpath="//*[@name='AnotherAccountButtonID']")
	WebElement Another_account;
	@FindBy(xpath="//*[@name='AnotherAccountTextFieldID']")
	WebElement AnotherAccountTextFieldID;
	@FindBy(xpath="//*[@name='NextButtonID']")
	WebElement NextButtonID;
	@FindBy(xpath="//*[@name='minusButtonID']")
	WebElement MinusButtonOfEvents;
	@FindBy(xpath="//*[@name='Remind me later']")
	WebElement RemindMeLater;
	@FindBy(xpath="//*[@name='back']")
	WebElement BackButton;
	//@FindBy(xpath="//*[@name='selectButtonID']")
	@FindBy(id="selectButtonID")
	WebElement SelectStylistButton;//*[@name='selectButtonID']
	@FindBy(xpath="//*[@name='AddCodeButtonID']")
	WebElement addcode;
	@FindBy(id="ApplePayButtonID")
	WebElement ApplePay;
	@FindBy(id="PromoCodeFieldID")
	WebElement codefield;
	@FindBy(xpath="//*[@name='Done']")
	WebElement doneofcode;
	@FindBy(id="completeBookingID")
	WebElement compilebooking;
	@FindBy(xpath="//*[@name='CreditCardButtonID']")
	WebElement credit;
	@FindBy(xpath="//*[@name='stripeTextFieldID']")
	WebElement cardnumber;
	//@FindBy(xpath="//*[@name='Not Now']")
	@FindBy(id="Not Now")
	WebElement NotNow;
	@FindBy(xpath="//*[@name='emailTextFieldID']")	
	WebElement emailfield;
	@FindBy(id="MonthButtonID")
	WebElement SelectMonthButton;
	@FindBy(id="SingleButtonID")
	WebElement SelectSingleButton;
	@FindBy(id="purcaseButtonID")
	WebElement purcaseButton;
	@FindBy(id="mixButtonID")
	WebElement mixButton;
	@FindBy(id="closetButtonID")
	WebElement closetButton;
	@FindBy(id="startCheckoutButtonID")
	WebElement startCheckoutButton;
	@FindBy(id="Pay with Credit Card")
	WebElement PayWithCreditCard;
	@FindBy(id="Take Your Style Quiz")
	WebElement TakeYourStyleQwiz; 
	@FindBy(id="Loose")
	WebElement Loose; 
	@FindBy(id="Next")
	WebElement NextButton; 
	@FindBy(id="Oversized")
	WebElement OversizedButton;
	@FindBy(id="Save")
	WebElement SaveButton;
	@FindBy(id="back")
	WebElement backButton;

	public void HowDidYouHearAboutUs(String instegram) 
	{		
		Sleep(200);
		click(Instagram);
		Sleep(200);
		click(Another_account);
		Sleep(200);
		filltext(AnotherAccountTextFieldID,instegram);
		click(NextButtonID);
		WaitElementDisplay(By.xpath("//*[@name='Phone number']"));
		
	}
	public void SelectCellOfStylist(String cell) 
	{
		String CellElemet = ("Text1");
		CellElemet = CellElemet.replace("Text1", cell);
		WebElement CellTabs = driver.findElement(By.id(CellElemet));
		click(CellTabs);

	}	public void ClickMonthButton() 
	{		
		Sleep(200);

		click(SelectMonthButton);
		Sleep(200);
	}
	public void ClickbackButton() 
	{		
		Sleep(200);

		click(backButton);
		Sleep(200);
	}
	public void ClickApplePayButton() 
	{		
		Sleep(200);
		click(ApplePay);
		Sleep(350);
	}
	public void ClickLoose() 
	{		
		Sleep(200);
		click(Loose);
		Sleep(200);
	}
	public void ClickTakeYourStyleQwiz() 
	{		
		Sleep(500);
		click(TakeYourStyleQwiz);
		//WaitElementDisplay(By.xpath("//*[@name='Allow']"));
		Sleep(200);
	}
	public void ClickNext() 
	{		
		Sleep(200);
		click(NextButton);
		Sleep(200);
	}
	public void ClickNOtNow() 
	{		
		Sleep(200);
		click(NotNow);
		Sleep(200);
	}
	public void ClickSave() 
	{		
		Sleep(200);
		click(SaveButton);
		Sleep(200);
	}
	public void ClickOversized() 
	{		
		Sleep(200);
		click(OversizedButton);
		Sleep(200);
	}

	public void ClickCompileBooking() 
	{		
		Sleep(200);
		click(compilebooking);
		WaitElementDisplay(By.xpath("//*[@name='Take Your Style Quiz']"));
		Sleep(200);
	}
	public void ClickAddCode() 
	{		
		Sleep(200);
		click(addcode);
		Sleep(200);
	}
	public void ClickPayWithCreditCard() 
	{		
		Sleep(200);
		click(credit);
		Sleep(200);
	}
	public void ClickSingleButton() 
	{		
		Sleep(200);
		click(SelectSingleButton);
		Sleep(200);
	}
	public void ClickSelectStylistButton() 
	{		
		Sleep(200);
		click(SelectStylistButton);
		Sleep(200);
	}
	public void ClickSelectStylist() 
	{	

		click(SelectStylistButton);
		Sleep(200);
		driver.findElement(By.xpath("(//*[@name='purcaseButtonID'])[1]")).click();
		Sleep(200);
	}
	public void ClickSelectStylistPS() 
	{	

		click(SelectStylistButton);
		Sleep(200);
		driver.findElement(By.xpath("(//*[@name='purcaseButtonID'])[2]")).click();
		Sleep(200);
	}

	public void ClickpurcaseButton() 
	{		
		Sleep(200);
		click(purcaseButton);
		Sleep(200);
	}
	public void ClickclosetButton() 
	{		
		Sleep(200);
		click(closetButton);
		Sleep(200);
	}
	public void ClickmixButton() 
	{		
		Sleep(200);
		click(mixButton);
		Sleep(200);
	}
	public void ClickstartCheckoutButton() 
	{		
		Sleep(200);
		click(startCheckoutButton);
		Sleep(200);
	}
	public void Fillemail(String email) 
	{
		filltext(emailfield,email);
		//Actions act = new Actions(driver);
		//act.sendKeys(Keys.TAB).perform();
	}
	public void FillCode(String cod) 
	{
		click(codefield);
		filltext(codefield,cod);
		//Actions act = new Actions(driver);
		//act.sendKeys(Keys.TAB).perform();
	}
	public void ClickDoneOfCode() 
	{		
		Sleep(200);
		click(doneofcode);
		Sleep(200);
	}

	public void Fillnumbercard(String card) 
	{
		//ContextTonativView();
		//CheckIfElementEnabled("//XCUIElementTypeOther[@name=\\\"CVC, MM/YY, 1234567812345678");
		click(cardnumber);
		filltext(cardnumber,card);
	}
	public void ClickPlus(String plus)
	{
		String PlusElemet = ("(//*[@name='plusButtonID'])[Text1]");
		PlusElemet = PlusElemet.replace("Text1", plus);
		WebElement PlusTabs = driver.findElement(By.xpath(PlusElemet));
		click(PlusTabs);
	} 
	public void ClickMinus(String minus)
	{
		String MinusElemet = ("//*[@name='minusButtonID'])[Text1]");
		MinusElemet = MinusElemet.replace("Text1", minus);
		WebElement MinusTabs = driver.findElement(By.xpath(MinusElemet));
		click(MinusTabs);
	} 

}
