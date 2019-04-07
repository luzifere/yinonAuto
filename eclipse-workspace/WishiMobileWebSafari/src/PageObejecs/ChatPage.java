package PageObejecs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChatPage extends BasePage {

	public ChatPage(AppiumDriver<WebElement> _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div//form//textarea[@class='autoExpand ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")
	WebElement Chatfield;
	@FindBy(xpath="//div//form//button[@class='input_btn']")
	WebElement SendChatButton;
	@FindBy(xpath="//div//span[text()[contains(.,'My Bookings')]]")
	WebElement BookBtn;
	@FindBy(xpath="//li//a[text()[contains(.,'Settings')]]")
	WebElement SettingButton;
	@FindBy(xpath="//li[text()[contains(.,'Deactivate Account')]]")
	WebElement DeactivateAccount;
	@FindBy(xpath="//button[@class='btn_deactivate']")
	WebElement DeactivateAccountButton;
	@FindBy(xpath="//button[@class='approve-btn btn-primary']")
	WebElement DeactivateAccountButton_YEP;
	@FindBy(xpath="//div//a[text()[contains(.,'Edit Membership')]]")
	WebElement EditMemberShipButton;
	@FindBy(xpath="(//div//button[@class='btn_membership ng-binding'])[1]")
	WebElement PauseMemberShip;
	@FindBy(xpath="//nav//div//img")
	WebElement ProfileButton;
	@FindBy(xpath="//div//li//a[text()[contains(.,'Log Out')]]")
	WebElement LogOut;
	@FindBy(xpath="(//nav//div//img)[1]")
	WebElement ProfileClientButton;
	@FindBy(xpath="//div//span[@class='inner-credentials ng-binding credentials-mob']")
	WebElement ProfileClientButton2;
	
	
	public void FillChat(String text)
    {
		WaitElementDisplay(By.xpath("//div//form//textarea[@class='autoExpand ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']"));
    	filltext(Chatfield, text);
    }
    public void SendChat()
    {
    	click(SendChatButton);
    }
    public boolean ChatDisplay(String chattext)
    {
    	String ChetElement = ("//div[@class='msg_content ng-binding'][text()[contains(.,'test1')]]");
    	ChetElement = ChetElement.replace("test1", chattext);
    	WebElement Chat = driver.findElement(By.xpath(ChetElement));
    	Chat.toString();
    	ElementDisplay(ChetElement);
    	return true;
    }
    
    public void SelectUser(String user)
    {
    	String UserElemet = ("//div [text()[contains(.,'abarjel inon')]]");
    	UserElemet = UserElemet.replace("abarjel inon", user);
    	WebElement UserButton = driver.findElement(By.xpath(UserElemet));
    	Sleep(1000);
    	click(UserButton);
    }
    public void ClickMyBooking() 
	{
    	BasePage.ExplicityWaitIsClickable(By.xpath("//div//span[text()[contains(.,'My Bookings')]]"));
		click(BookBtn);	
	}
    public void ClickOnProfileButton2() 
	{
    	Sleep(250);
    	click(	ProfileClientButton2);
	}
    public void ClickOnProfileClientButton() 
	{  
    	Sleep(250);
    	click(ProfileClientButton);
    	//driver.findElement(By.xpath("(//nav//div//img)[1]")).click();
   		//click(ProfileClientButton);	
	}
    public void ClickOnLogOut() 
	{
		click(LogOut);	
	}
    public void ClickOnProfileButtonOfClient() 
	{
    	Sleep(400);
    	WebElement Profile= driver.findElement(By.xpath(("//div//span[@class='inner-credentials ng-binding credentials-mob']")));
   		click(Profile);	
	}
    public void DeactivateMemberShip ()
    {
    	click(SettingButton);
    	WaitElementDisplay(By.xpath("//li[text()[contains(.,'Deactivate Account')]]"));
    	click(DeactivateAccount);
    	WaitElementDisplay(By.xpath("//button[@class='btn_deactivate']"));
    	click(DeactivateAccountButton);
    	WaitElementDisplay(By.xpath("//button[@class='approve-btn btn-primary']"));
    	click(DeactivateAccountButton_YEP);
    	WaitElementDisplay(By.xpath("//div//a[text()[contains(.,'Edit Membership')]]"));
    	click(EditMemberShipButton);
    	WaitElementDisplay(By.xpath("(//div//button[@class='btn_membership ng-binding'])[1]"));
    	click(PauseMemberShip);
    	WaitElementDisplay(By.xpath("//h4[@class='note_membership ng-scope']"));
    	click(DeactivateAccount);
    	WaitElementDisplay(By.xpath("//button[@class='btn_deactivate']"));
    	click(DeactivateAccountButton);
    	WaitElementDisplay(By.xpath("//button[@class='approve-btn btn-primary']"));
    	click(DeactivateAccountButton_YEP);
    }


}
