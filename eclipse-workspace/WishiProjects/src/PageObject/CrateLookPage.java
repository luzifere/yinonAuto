package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CrateLookPage extends BasePage {

	public CrateLookPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "(//div//button[@class='create-look-btn ng-binding ng-scope'])[1]")
	WebElement CrateLookButton;
	@FindBy(xpath = "//div//button[@class='create-look-btn ng-binding']")
	WebElement CrateLookButtonOfChat;

	@FindBy(xpath = "//div//li//a[text()[contains(.,'Shop')]]")
	WebElement ShopButton;
	@FindBy(xpath = "//div//canvas[@class='upper-canvas ']")
	WebElement Canvas;
	@FindBy(xpath = "//div[@class='saveBtn']")
	WebElement SaveButton;
	@FindBy(xpath = "//div//textarea[@id='TextArea']")
	WebElement Description;                //autoresize ng-pristine ng-valid ng-empty ng-valid-maxlength ng-touched
	@FindBy(xpath = "//div//textarea[@placeholder='Tell your client why you chose those items']")
	WebElement DescriptionOfPersonalShopping;
	@FindBy(xpath = "	//button[@class='save ng-binding']")
	WebElement DescriptionOfMoodBoard;
	@FindBy(xpath = "//div//textarea[@id='TextArea']")
	WebElement SaveOfDescription;
	@FindBy(css = ".ng-isolate-scope.fixed-height")
	WebElement PersonalShoppingTab;
	@FindBy(css = "//div//span[text()[contains(.,'My Bookings')]]")
	WebElement MyBookingTab;

	@FindBy(xpath="(//button[@class='create-look-btn ng-scope cta-btn big'])[1]")
	WebElement CrateMoodBoard;
	@FindBy(xpath="(//div[@class='autoreply-wrapper']//div[text()[contains(.,'I love it')]])[2]")
	WebElement I_LOVE_IT;
	@FindBy(xpath="(//div[@class='autoreply-wrapper']//div[text()[contains(.,'I love it')]])[1]")
	WebElement I_LOVE_IT_look;
	@FindBy(xpath="(//button[text()[contains(.,'End Session')]])[1]")
	WebElement EndSeesionButton;
	@FindBy(xpath="//button[text()[contains(.,'Send')]]")
	WebElement SendEndSeesionButton;
	@FindBy(xpath="//div[text()[contains(.,'Yes, thanks!')]]")
	WebElement ApproveEndSeesionButton;
	@FindBy(xpath="//div[@class='rate-send-cmnt-btn']")
	WebElement SendRate;



	public void ClickSendRate() 
	{
		click(SendRate);	
	}
	public void ClickApproveEndSeesionButton() 
	{
		WaitElementDisplay(By.xpath("//div[text()[contains(.,'Yes, thanks!')]]"));
		click(ApproveEndSeesionButton);	
	}
	public void ClickSendEndSeesionButton() 
	{
		click(SendEndSeesionButton);	
	}
	public void ClickEndSeesionButton() 
	{
		click(EndSeesionButton);	
	}
	public void ClickCrateMoodBoard() 
	{
		click(CrateMoodBoard);	
		WaitElementDisplay(By.xpath("//div//li//a[text()[contains(.,'Shop')]]"));
	}
	public void ClickI_LOVE_IT() 
	{
		WaitElementDisplay(By.xpath("(//div[@class='autoreply-wrapper']//div[text()[contains(.,'I love it')]])[1]"));
		click(I_LOVE_IT);	
	}
	public void ClickI_LOVE_IT_LOOK() 
	{
		WaitElementDisplay(By.xpath("(//div[@class='autoreply-wrapper']//div[text()[contains(.,'I love it')]])[1]"));
		click(I_LOVE_IT_look);	
	}


	public void DragDropItems(String item) {
		WebElement FromItem = driver.findElement(By.xpath(("(//div[@class='webSingleItemDisplayContainer drag-object ng-scope'])" + item)));
		WebElement ToCanvas = Canvas;

		Actions builder = new Actions(driver);
		builder.click(FromItem);
		builder.dragAndDrop(FromItem, ToCanvas).perform();
		Sleep(200);

	}

	public void SelectItem(String item) {
		BasePage.ExplicityWaitIsClickable(By.xpath("(//div[@class='webSingleItemDisplayContainer drag-object ng-scope'])" + item ));
		Sleep(200);
	}

	public void SelectLayoutTabs(String tab) {
		WebElement Layout = driver.findElement(By.xpath(("(//div[@id='layouts']//label)" + tab)));
		click(Layout);
	}

	public void CrateLook() {

		BasePage.ExplicityWaitIsClickable(By.xpath("(//div//button[@class='create-look-btn ng-binding ng-scope'])[1]"));
		WaitElementDisplay(By.xpath("//div//li//a[text()[contains(.,'Shop')]]"));

	}

	public void ClickShop() 
	{
		BasePage.ExplicityWaitIsClickable(By.xpath("//div//li//a[text()[contains(.,'Shop')]]"));
		WaitElementDisplay(By.xpath("(//div[@class='webDisplaySection-catalog']//div[@ng-drag-data='item'])[8]"));
	}

	public void SelectClass(String NameOfMenu) {
		String MainMenuClass = ("//div//li//a[text()[contains(.,'Shop')]]");
		MainMenuClass = MainMenuClass.replace("Shop", NameOfMenu);
		WebElement MainMenu = driver.findElement(By.xpath(MainMenuClass));
		click(MainMenu);
	}

	public void ClickSave() 
	{
		Sleep(200);
		click(SaveButton);
	}

	public void FillDescription(String descriptiontext) {
		ExplicityWaitIsClickable(By.xpath("//button[@class='save ng-binding']"));
		filltext(Description, descriptiontext);
	}

	public void FillDescriptionPS(String descriptiontext) {
		filltext(DescriptionOfPersonalShopping, descriptiontext);
	}

	public void ClickDescriptionPS() {
		click(DescriptionOfPersonalShopping);
	}

	public void ClickNewLook() {
		BasePage.ExplicityWaitIsClickable(By.xpath("//div//button[@class='create-look-btn ng-binding']"));
	}

	public void ClickSaveOfDescription() {
		ExplicityWaitIsClickable(By.xpath("//button[@class='save ng-binding']"));
		click(SaveOfDescription);
	}

}
