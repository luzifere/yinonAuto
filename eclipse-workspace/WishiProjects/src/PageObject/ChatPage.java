package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChatPage extends BasePage
{

	public ChatPage(WebDriver driver) {
		super(driver);
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
	@FindBy(xpath="//div[@id='header-profile-dropdown']")
	WebElement ProfileButton;
	@FindBy(xpath="//div//li//a[text()[contains(.,'Log Out')]]")
	WebElement LogOut;
	@FindBy(xpath="//div[@id='header-profile-dropdown']")
	WebElement ProfileClientButton;
	
	
	public void FillChat(String text)
    {
		try
		 
		 {
			filltext(Chatfield, text);

		 
		 }catch(Exception e){
		 
			
			 System.out.println("\nError : FillChat failed\n");
			
		 }
    	
    }
    public void SendChat()
    {
    	try
		 
		 {
    		click(SendChatButton);

		 
		 }catch(Exception e){
		 
			
			 System.out.println("\nError : SendChat failed\n");
			
		 }
    	
    }
    public boolean ChatDisplay(String chattext)
    {
    	try
		 
		 {
    		String ChetElement = ("//div[@class='msg_content ng-binding'][text()[contains(.,'test1')]]");
        	ChetElement = ChetElement.replace("test1", chattext);
        	WebElement Chat = driver.findElement(By.xpath(ChetElement));
        	Chat.toString();
        	ElementDisplay(ChetElement);
        	return true;

		 
		 }catch(Exception e){
		 
			
			 System.out.println("\nError : ChatDisplay failed\n");
			
		 }
		return false;
    	
    }
    
    public void SelectUser(String user)
    {
    	try
		 
		 {
    		String UserElemet = ("//div [text()[contains(.,'abarjel inon')]]");
        	UserElemet = UserElemet.replace("abarjel inon", user);
        	WebElement UserButton = driver.findElement(By.xpath(UserElemet));
        	click(UserButton);

		 
		 }catch(Exception e){
		 
			
			 System.out.println("\nError : SelectUser failed\n");
			
		 }
    	
    }
    public void ClickMyBooking() 
	{
    	try
		 
		 {
    		BasePage.ExplicityWaitIsClickable(By.xpath("//div//span[text()[contains(.,'My Bookings')]]"));
    		click(BookBtn);	
		 
		 }catch(Exception e){
		 
			
			 System.out.println("\nError : ClickMyBooking failed\n");
			
		 }
    	
	}
    public void ClickOnProfileButton() 
	{
    	try
		 
		 {
    		Sleep(250);
        	driver.findElement(By.xpath("(//nav//div//img)[1]")).click();
        	//WebElement Profile= driver.findElement(By.xpath(("(//nav//div//img)"+num)));
       		//click(Profile);
		 
		 }catch(Exception e){
		 
			
			 System.out.println("\nError : ClickOnProfileButton failed\n");
			
		 }
    		
	}
    public void ClickOnProfileClientButton() 
	{   
    	try
		 
		 {
    		click(ProfileClientButton);	
		 
		 }catch(Exception e){
		 
			
			 System.out.println("\nError : ClickOnProfileClientButton failed\n");
			
		 }
   		
	}
    public void ClickOnLogOut() 
	{
    	try
		 
		 {
    		click(LogOut);	
		 
		 }catch(Exception e){
		 
			
			 System.out.println("\nError : ClickOnProfileClientButton failed\n");
			
		 }
			
	}
    public void DeactivateMemberShip ()
    {
    	try
		 
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
		 
		 }catch(Exception e){
		 
			
			 System.out.println("\nError : DeactivateMemberShip failed\n");
			
		 }
    	
    }
    public void CancelMemberShip()
    {
    	WaitElementDisplay(By.xpath("(//div//button[@class='btn_membership ng-binding'])[1]"));
    	click(PauseMemberShip);
    }
    
    

}
