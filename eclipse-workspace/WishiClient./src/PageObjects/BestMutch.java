package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class BestMutch extends BasePage 
{

	public BestMutch(AppiumDriver<WebElement> _driver) 
	{
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
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
	
	@FindBy(xpath="//*[@name='GoBackToStepButtonID']")
	WebElement BackButton;
	@FindBy(xpath="//*[@name='BackButtonID']")
	WebElement BackButtonClient;
	
	@FindBy(id="ViewMoreStylistsButtonID")
	WebElement MoreStylistsButton;

	
	
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
			//WaitElementDisplay(By.xpath("//*[@name='NextButtonID']"));
			Sleep(100);
			click(GoalButton);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : SelectBodyType failed\n");
			
		 }
		
	}
	public void SelectLoveIt(String inspiration)
	{
		try
		 
		 {
			Sleep(100);
			String GoalElemet = ("(//*[@name='LoveItButtonID'])[text1]");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			//WaitElementDisplay(By.xpath("(//span[text()[contains(.,'LOVE IT!')]])[2]"));
			Sleep(200);
			click(GoalButton);
			Sleep(100);
			scrollDownXpath();
			Sleep(250);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : SelectLoveIt failed\n");
			
		 }
		
	}
	public void SelectHELLONO(String inspiration)
	{
		try
		 
		 {
			Sleep(100);
			String GoalElemet = ("(//*[@name='HellNoButtonID'])[text1]");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			//WaitElementDisplay(By.xpath("(//span[text()[contains(.,'LOVE IT!')]])[2]"));
			Sleep(200);
			click(GoalButton);
			Sleep(100);
			scrollDownXpath();
			Sleep(250);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : SelectLoveIt failed\n");
			
		 }
		
	}
	public void SelectSOMETIMES(String inspiration)
	{
		try
		 
		 {
			Sleep(100);
			String GoalElemet = ("(//*[@name='SometimesButtonID'])[text1]");
			GoalElemet = GoalElemet.replace("text1", inspiration);
			WebElement GoalButton = driver.findElement(By.xpath(GoalElemet));
			//WaitElementDisplay(By.xpath("(//span[text()[contains(.,'LOVE IT!')]])[2]"));
			Sleep(200);
			click(GoalButton);
			Sleep(100);
			scrollDownXpath();
			Sleep(250);
		 
		 }catch(Exception e){
		 
			
			 System.err.println("\nError : SelectLoveIt failed\n");
			
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
	public void ClickBacklCient() 
	{	
		try
		 
		 {
			WaitElementDisplay(By.xpath("//*[@name='BackButtonID']"));
			Sleep(100);
			click(BackButtonClient);
			Sleep(100);
		 
		 }catch(Exception e){
		 
			
			  System.err.println("\nError : ClickBack failed\n");
			
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
		Sleep(250);
		click(NextTags);
		Sleep(250);
	}
	public void ClickHoeToWork() 
	{	Sleep(250);
		click(how_it_workst);
		Sleep(250);
	}
	public void ClickBodyType() 
	{		
		Sleep(250);
		click(BodyType);
		Sleep(250);
	}
	public void ClickHoeToWorkoutfit() 
	{
		Sleep(250);
		click(how_it_works_outfit);
		Sleep(250);
	}
	public void ClickFamle() 
	{
		Sleep(250);
		click(FemaleButtonID);
		Sleep(250);
	}
	public void ClickSelfIdentityButtonID() 
	{
		Sleep(250);
		click(SelfIdentityButtonID);
		Sleep(250);
	}
	public void ClickMale() 
	{
		Sleep(250);
		click(MaleButtonID);
		Sleep(250);
	}
	public void fillBirthday(String text) 
	{
		Sleep(250);
		filltext(BirthdayTextFieldID, text);
		Sleep(250);
	}
	public void SelectCheapButtonID() 
	{
		Sleep(250);
		click(CheapButtonID);
		Sleep(250);
	}
	public void SelectNormal() 
	{
		Sleep(250);
		click(NormalButtonID);
		Sleep(250);
	}
	public void SelectExpensiveButtonID() 
	{
		Sleep(250);
		click(ExpensiveButtonID);
		Sleep(250);
	}
	public void Selectinspiration() 
	{
		Sleep(250);
		click(inspiration);
		Sleep(250);
	}
	public void SelectBrands() 
	{
		Sleep(250);
		click(Brands);
		Sleep(250);
	}
	public void ClickNextbutton() 
	{
		Sleep(250);
		click(NextButtonID);
		Sleep(250);
	}
	public void Clickclose_image() 
	{
		Sleep(250);
		click(close_image);
		Sleep(250);
	}
	
	public void SelectTag(String Picker)
    {
		Sleep(200);
    	String PickerElemet = ("Text1");
    	PickerElemet = PickerElemet.replace("Text1", Picker);
    	WebElement PickerTabs = driver.findElement(By.id(PickerElemet));
    	Sleep(200);
    	click(PickerTabs);
    }
	
}
