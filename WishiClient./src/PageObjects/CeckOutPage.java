package PageObjects;

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
	@FindBy(xpath="//*[@name='minusButtonID']")
	WebElement MinusButtonOfEvents;
	@FindBy(xpath="//*[@name='Remind me later']")
	WebElement RemindMeLater;
	@FindBy(xpath="//*[@name='back']")
	WebElement BackButton;
	//@FindBy(xpath="//*[@name='selectButtonID']")
	@FindBy(id="selectButtonID")
	WebElement SelectStylistButton;
	@FindBy(id="Add Code")
	WebElement addcode;
	@FindBy(id="ApplePayButtonID")
	WebElement ApplePay;
	@FindBy(id="PromoCodeFieldID")
	WebElement codefield;
	@FindBy(xpath="//*[@name='Done']")
	WebElement doneofcode;
	@FindBy(id="completeBookingID")
	WebElement compilebooking;
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Pay with Credit Card \"]")
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
	
	
	public void SelectCellOfStylist(String cell) 
	{
		String CellElemet = ("Text1");
		CellElemet = CellElemet.replace("Text1", cell);
		WebElement CellTabs = driver.findElement(By.id(CellElemet));
		click(CellTabs);
		
	}	public void ClickMonthButton() 
	{		
		//Sleep(150);
		click(SelectMonthButton);
		//Sleep(150);
	}
	public void ClickbackButton() 
	{		
		//Sleep(150);
		click(backButton);
		//Sleep(150);
	}
	public void ClickApplePayButton() 
	{		
		//Sleep(150);
		click(ApplePay);
		//Sleep(150);
	}
	public void ClickLoose() 
	{		
		//Sleep(150);
		click(Loose);
		//Sleep(150);
	}
	public void ClickTakeYourStyleQwiz() 
	{		
		//Sleep(150);
		click(TakeYourStyleQwiz);
		//Sleep(150);
	}
	public void ClickNext() 
	{		
		//Sleep(150);
		click(NextButton);
		//Sleep(150);
	}
	public void ClickNOtNow() 
	{		
		//Sleep(150);
		click(NotNow);
		//Sleep(150);
	}
	public void ClickSave() 
	{		
		//Sleep(150);
		click(SaveButton);
		//Sleep(150);
	}
	public void ClickOversized() 
	{		
		//Sleep(150);
		click(OversizedButton);
		//Sleep(150);
	}

	public void ClickCompileBooking() 
	{		
		//Sleep(150);
		click(compilebooking);
		//Sleep(150);
	}
	public void ClickAddCode() 
	{		
		//Sleep(150);
		click(addcode);
		//Sleep(150);
	}
	public void ClickPayWithCreditCard() 
	{		
		//Sleep(150);
		click(credit);
		//Sleep(150);
	}
	public void ClickSingleButton() 
	{		
		//Sleep(150);
		click(SelectSingleButton);
		//Sleep(150);
	}public void ClickSelectStylist() 
	{		
		//Sleep(150);
		click(SelectStylistButton);
		//Sleep(150);
	}

	public void ClickpurcaseButton() 
	{		
		//Sleep(150);
		click(purcaseButton);
		//Sleep(150);
	}
	public void ClickclosetButton() 
	{		
		//Sleep(150);
		click(closetButton);
		//Sleep(150);
	}
	public void ClickmixButton() 
	{		
		//Sleep(150);
		click(mixButton);
		//Sleep(150);
	}
	public void ClickstartCheckoutButton() 
	{		
		//Sleep(150);
		click(startCheckoutButton);
		//Sleep(150);
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
		//Sleep(150);
		click(doneofcode);
		//Sleep(150);
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
