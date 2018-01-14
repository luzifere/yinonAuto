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
	WebElement Description;
	@FindBy(xpath = "//div//textarea[@class='autoresize ng-pristine ng-valid ng-empty ng-valid-maxlength ng-touched']")
	WebElement DescriptionOfPersonalShopping;
	@FindBy(xpath = "	//button[@class='save ng-binding']")
	WebElement SaveOfDescription;
	@FindBy(css = ".ng-isolate-scope.fixed-height")
	WebElement PersonalShoppingTab;
	@FindBy(css = "//div//span[text()[contains(.,'My Bookings')]]")
	WebElement MyBookingTab;

	public void DragDropItems(String item) {
		WebElement FromItem = driver.findElement(By.xpath(("(//div//img)" + item)));
		WebElement ToCanvas = Canvas;

		Actions builder = new Actions(driver);
		builder.click(FromItem);
		builder.dragAndDrop(FromItem, ToCanvas).perform();

	}

	public void SelectItem(String item) {
		WebElement FromItem = driver.findElement(By.xpath(("(//div//img)" + item)));
		Actions builder = new Actions(driver);
		builder.click(FromItem);

	}

	public void SelectLayoutTabs(String tab) {
		WebElement Layout = driver.findElement(By.xpath(("(//div[@id='layouts']//label)" + tab)));
		click(Layout);
	}

	public void CrateLook() {

		click(CrateLookButton);
	}

	public void SelectClass(String NameOfMenu) {
		String MainMenuClass = ("//div//li//a[text()[contains(.,'Shop')]]");
		MainMenuClass = MainMenuClass.replace("Shop", NameOfMenu);
		WebElement MainMenu = driver.findElement(By.xpath(MainMenuClass));
		click(MainMenu);
	}

	public void ClickSave() {
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
		click(CrateLookButtonOfChat);
	}

	public void ClickSaveOfDescription() {
		ExplicityWaitIsClickable(By.xpath("//button[@class='save ng-binding']"));
		click(SaveOfDescription);
	}

}
