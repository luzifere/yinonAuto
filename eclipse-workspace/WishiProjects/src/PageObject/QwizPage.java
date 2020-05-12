package PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class QwizPage extends BasePage 
{

	public QwizPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div[@class='next-step-btn ng-scope']")
	WebElement NextOfEventButton;
	@FindBy(xpath="//button[@class='chat-link-btn onboarding-next-btn ']")
	WebElement NextButton;
	@FindBy(xpath="//div[@class='next-step-btn blank']")
	WebElement SkipButton;
	@FindBy(xpath="//div[@class='back-btn']//img")
	WebElement BackButtonOfQwiz;
	@FindBy(xpath="//div//select[@name='budget--quiz']")
	WebElement Budget;
	@FindBy(xpath="//div//li//a[text()[contains(.,'Log Out')]]")
	WebElement LogOut;
	@FindBy(xpath="//nav//div//span[@class='inner-credentials ng-binding']")
	WebElement ProfileClientButton;
	@FindBy(xpath="//input[@id='month-input']")
	WebElement Date;
	@FindBy(xpath="//div[@class='selected-flag']")
	WebElement Flag;
	@FindBy(xpath="//input[@type='tel']")
	WebElement Phone;
	@FindBy(xpath="//div[text()[contains(.,'Average')]]")
	WebElement Height;
	@FindBy(xpath="//div[@class ='dropdown-control']")
	WebElement dropdown_control;
	@FindBy(xpath="//input[@type='text']")
	WebElement input;
	@FindBy(xpath="(//button[@class='chat-link-btn'])[2]")
	WebElement heart;
	
	@FindBy(xpath="//p[text()[contains(.,'How did you hear about us?')]]")
	WebElement HowDidYouHeartTitle;
	@FindBy(xpath="//p[text()[contains(.,'When’s your birthday')]]")
	WebElement birthdaytitle;
	@FindBy(xpath="//p[text()[contains(.,'Nice! Which Instagram account?')]]")
	WebElement instegramtitle;
	@FindBy(xpath="//p[text()[contains(.,'Do you have any specific need?')]]")
	WebElement specific_needtitle;
	@FindBy(xpath="//p[text()[contains(.,'How would you describe your work environment?')]]")
	WebElement describe_your_worktitle;
	@FindBy(xpath="//p[text()[contains(.,'Which clothing categories would you like to receive?')]]")
	WebElement clothing_categoriestitle;
	@FindBy(xpath="//p[text()[contains(.,'What colors and patterns do you want your stylist to use?')]]")
	WebElement colorstitle;
	@FindBy(xpath="//p[text()[contains(.,'What’s your height?')]]")
	WebElement heighttitle;
	@FindBy(xpath="//p[text()[contains(.,'And your size')]]")
	WebElement sizetitle;
	@FindBy(xpath="//p[text()[contains(.,'So if you are luxury or luxury on a dime - we are here for you. How much do you typically spend on...')]]")
	WebElement budgettitle;
	@FindBy(xpath="//p[text()[contains(.,'What types of jeans do you prefer?')]]")
	WebElement jeanstitle;
	@FindBy(xpath="//p[text()[contains(.,'Are there any features you want to accentuate?')]]")
	WebElement featurestitle;
	@FindBy(xpath="//p[text()[contains(.,'How do you prefer clothes to fit your top half?')]]")
	WebElement topfittitle;
	@FindBy(xpath="//p[text()[contains(.,'How do you prefer clothes to fit your bottom half?')]]")
	WebElement fitbottomtitle;
	@FindBy(xpath="//p[text()[contains(.,'Anything you’d like to avoid?')]]")
	WebElement Anythingavoidtitle;
	@FindBy(xpath="//p[text()[contains(.,'What’s your heels preference?')]]")
	WebElement preferencetitle;
	@FindBy(xpath="//p[text()[contains(.,'What best describes your style?')]]")
	WebElement best_describestitle;
	@FindBy(xpath="//p[text()[contains(.,'How far out of your comfort zone are you willing to go?')]]")
	WebElement comfortzonetitletitle;
	@FindBy(xpath="//p[text()[contains(.,'What’s your Jewelry preference?')]]")
	WebElement Jewelrytitletitle;
	@FindBy(xpath="//p[text()[contains(.,'Is there anything that is of particular importance to you?')]]")
	WebElement particularimportancetitle;
	@FindBy(xpath="//p[text()[contains(.,'Who’s your style icon/s? (i.e celebrity, fashion blogger/influencer)')]]")
	WebElement style_icontitle;
	@FindBy(xpath="//p[text()[contains(.,'If you’d like your stylist to view your Instagram please enter your handle.')]]")
	WebElement Instagramtitle;
	@FindBy(xpath="//p[text()[contains(.,'If you’d like your stylist to put a face to a name, please upload a full body photo of yourself.')]]")
	WebElement body_phototitle;
	@FindBy(xpath="//p[text()[contains(.,'Please add your phone number to get text messages when your board is ready.')]]")
	WebElement phone_numbertitle;
	@FindBy(xpath="//p[text()[contains(.,'Where do you live?')]]")
	WebElement Where_do_you_livetitle;
	@FindBy(xpath="//p[text()[contains(.,'Last step! Please confirm this is your preferred email address.')]]")
	WebElement confirm_emailtitle;
	@FindBy(xpath="//button[text()[contains(.,'Instagram')]]")
	WebElement instegrambutton;
	@FindBy(xpath="//button[text()[contains(.,'@thewishi')]]")
	WebElement thewishibutton;
	@FindBy(xpath="//label[text()[contains(.,'Workwear wardrobe')]]")
	WebElement Workwear_wardrobe;
	@FindBy(xpath="//button[text()[contains(.,'Other')]]")
	WebElement otherbutton;
	@FindBy(xpath="//div[textarea]")
	WebElement textarea;
	@FindBy(xpath="//div[text()[contains(.,'Done')]]")
	WebElement donebutton;
	@FindBy(xpath="//div[@class='col-6']")
	WebElement month;
	@FindBy(xpath="//div[@class='col-6']")
	WebElement day;
	@FindBy(xpath="//div[@class='col-6']")
	WebElement year;
	
	


	public void SelectYear() 
	{
		try

		{
			ExplicityWaitIsClickable(year);
			SelectDropDwon(year,"1964");
		}catch(Exception e){


			System.err.println("\nError : SelectYear failed\n");
			throw e;

		}

	}
	public void SelectDay() 
	{
		try

		{
			ExplicityWaitIsClickable(day);
			SelectDropDwon(day,"12");
		}catch(Exception e){


			System.err.println("\nError : SelectDay failed\n");
			throw e;

		}

	}
	public void SelectMonth() 
	{
		try

		{
			ExplicityWaitIsClickable(month);
			SelectDropDwon(month,"March");
		}catch(Exception e){


			System.err.println("\nError : SelectMonth failed\n");
			throw e;

		}

	}
	public void ClickDone() 
	{
		try

		{
			ExplicityWaitIsClickable(donebutton);
		}catch(Exception e){


			System.err.println("\nError : ClickDone failed\n");
			throw e;

		}

	}
	public void SelectWorkwear_wardrobe() 
	{
		try

		{
			ExplicityWaitIsClickable(Workwear_wardrobe);
		}catch(Exception e){


			System.err.println("\nError : SelectWorkwear_wardrobe failed\n");
			throw e;

		}

	}
	public void Filltextarea(String text) 
	{
		try

		{
			WaitElementDisplay(textarea);
			filltext(textarea,text);
		}catch(Exception e){


			System.err.println("\nError : Filltextarea failed\n");
			throw e;

		}

	}
	public void Clickthewishibutton() 
	{
		try

		{
			ExplicityWaitIsClickable(thewishibutton);
		}catch(Exception e){


			System.err.println("\nError : Clickthewishibutton failed\n");
			throw e;

		}

	}
	public void Clickinstegrambutton() 
	{
		try

		{
			ExplicityWaitIsClickable(instegrambutton);
		}catch(Exception e){


			System.err.println("\nError : Clickinstegrambutton failed\n");
			throw e;

		}

	}
	public void confirm_emailtitlePresent() 
	{
		try

		{
			WaitElementDisplay(confirm_emailtitle);
			Assert.assertTrue(BookingPage.ElementDisplay(confirm_emailtitle));

		}catch(Exception e){


			System.err.println("\nError : confirm_emailtitlePresent failed\n");
			throw e;

		}

	}
	public void Where_do_you_livetitlePresent() 
	{
		try

		{
			WaitElementDisplay(Where_do_you_livetitle);
			Assert.assertTrue(BookingPage.ElementDisplay(Where_do_you_livetitle));

		}catch(Exception e){


			System.err.println("\nError : Where_do_you_livetitlePresent failed\n");
			throw e;

		}

	}
	public void phone_numbertitlePresent() 
	{
		try

		{
			WaitElementDisplay(body_phototitle);
			Assert.assertTrue(BookingPage.ElementDisplay(body_phototitle));

		}catch(Exception e){


			System.err.println("\nError : phone_numbertitlePresent failed\n");
			throw e;

		}

	}
	public void body_phototitlePresent() 
	{
		try

		{
			WaitElementDisplay(body_phototitle);
			Assert.assertTrue(BookingPage.ElementDisplay(body_phototitle));

		}catch(Exception e){


			System.err.println("\nError : body_phototitlePresent failed\n");
			throw e;

		}

	}
	public void InstagramtitlePresent() 
	{
		try

		{
			WaitElementDisplay(Instagramtitle);
			Assert.assertTrue(BookingPage.ElementDisplay(Instagramtitle));

		}catch(Exception e){


			System.err.println("\nError : InstagramtitlePresent failed\n");
			throw e;

		}

	}
	public void style_icontitletitlePresent() 
	{
		try

		{
			WaitElementDisplay(style_icontitle);
			Assert.assertTrue(BookingPage.ElementDisplay(style_icontitle));

		}catch(Exception e){


			System.err.println("\nError : style_icontitletitlePresent failed\n");
			throw e;

		}

	}
	public void particularimportancetitlePresent() 
	{
		try

		{
			WaitElementDisplay(particularimportancetitle);
			Assert.assertTrue(BookingPage.ElementDisplay(particularimportancetitle));

		}catch(Exception e){


			System.err.println("\nError : particularimportancetitlePresent failed\n");
			throw e;

		}

	}
	public void JewelrytitletitlePresent() 
	{
		try

		{
			WaitElementDisplay(Jewelrytitletitle);
			Assert.assertTrue(BookingPage.ElementDisplay(Jewelrytitletitle));

		}catch(Exception e){


			System.err.println("\nError : JewelrytitletitlePresent failed\n");
			throw e;

		}

	}
	public void best_describestitlePresent() 
	{
		try

		{
			WaitElementDisplay(best_describestitle);
			Assert.assertTrue(BookingPage.ElementDisplay(best_describestitle));

		}catch(Exception e){


			System.err.println("\nError : best_describestitlePresent failed\n");
			throw e;

		}

	}
	public void preferencetitlePresent() 
	{
		try

		{
			WaitElementDisplay(preferencetitle);
			Assert.assertTrue(BookingPage.ElementDisplay(preferencetitle));

		}catch(Exception e){


			System.err.println("\nError : preferencetitlePresent failed\n");
			throw e;

		}

	}
	public void AnythingavoidtitlePresent() 
	{
		try

		{
			WaitElementDisplay(Anythingavoidtitle);
			Assert.assertTrue(BookingPage.ElementDisplay(Anythingavoidtitle));

		}catch(Exception e){


			System.err.println("\nError : AnythingavoidtitlePresent failed\n");
			throw e;

		}

	}
	public void fitbottomtitlePresent() 
	{
		try

		{
			WaitElementDisplay(fitbottomtitle);
			Assert.assertTrue(BookingPage.ElementDisplay(fitbottomtitle));

		}catch(Exception e){


			System.err.println("\nError : fitbottomtitlePresent failed\n");
			throw e;

		}

	}
	public void topfittitlePresent() 
	{
		try

		{
			WaitElementDisplay(topfittitle);
			Assert.assertTrue(BookingPage.ElementDisplay(topfittitle));

		}catch(Exception e){


			System.err.println("\nError : topfittitlePresent failed\n");
			throw e;

		}

	}
	public void featurestitlePresent() 
	{
		try

		{
			WaitElementDisplay(featurestitle);
			Assert.assertTrue(BookingPage.ElementDisplay(featurestitle));

		}catch(Exception e){


			System.err.println("\nError : featurestitlePresent failed\n");
			throw e;

		}

	}
	public void jeanstitlePresent() 
	{
		try

		{
			WaitElementDisplay(jeanstitle);
			Assert.assertTrue(BookingPage.ElementDisplay(jeanstitle));

		}catch(Exception e){


			System.err.println("\nError : jeanstitlePresent failed\n");
			throw e;

		}

	}
	public void budgettitlePresent() 
	{
		try

		{
			WaitElementDisplay(budgettitle);
			Assert.assertTrue(BookingPage.ElementDisplay(budgettitle));

		}catch(Exception e){


			System.err.println("\nError : budgettitlePresent failed\n");
			throw e;

		}

	}
	public void sizetitlePresent() 
	{
		try

		{
			WaitElementDisplay(sizetitle);
			Assert.assertTrue(BookingPage.ElementDisplay(sizetitle));

		}catch(Exception e){


			System.err.println("\nError : sizetitlePresent failed\n");
			throw e;

		}

	}
	public void heighttitlePresent() 
	{
		try

		{
			WaitElementDisplay(heighttitle);
			Assert.assertTrue(BookingPage.ElementDisplay(heighttitle));

		}catch(Exception e){


			System.err.println("\nError : heighttitlePresent failed\n");
			throw e;

		}

	}
	public void colorstitlePresent() 
	{
		try

		{
			WaitElementDisplay(colorstitle);
			Assert.assertTrue(BookingPage.ElementDisplay(colorstitle));

		}catch(Exception e){


			System.err.println("\nError : colorstitlePresent failed\n");
			throw e;

		}

	}
	public void clothing_categoriestitlePresent() 
	{
		try

		{
			WaitElementDisplay(clothing_categoriestitle);
			Assert.assertTrue(BookingPage.ElementDisplay(clothing_categoriestitle));

		}catch(Exception e){


			System.err.println("\nError : clothing_categoriestitlePresent failed\n");
			throw e;

		}

	}
	public void describe_your_worktitleTitlePresent() 
	{
		try

		{
			WaitElementDisplay(describe_your_worktitle);
			Assert.assertTrue(BookingPage.ElementDisplay(describe_your_worktitle));

		}catch(Exception e){


			System.err.println("\nError : describe_your_worktitleTitlePresent failed\n");
			throw e;

		}

	}
	public void SpecificNeedTitlePresent() 
	{
		try

		{
			WaitElementDisplay(specific_needtitle);
			Assert.assertTrue(BookingPage.ElementDisplay(specific_needtitle));

		}catch(Exception e){


			System.err.println("\nError : SpecificNeedTitlePresent failed\n");
			throw e;

		}

	}
	public void HowDidYouHeartPresent() 
	{
		try

		{
			WaitElementDisplay(HowDidYouHeartTitle);
			Assert.assertTrue(BookingPage.ElementDisplay(HowDidYouHeartTitle));

		}catch(Exception e){


			System.err.println("\nError : HowDidYouHeartPresent failed\n");
			throw e;

		}

	}
	
	public void InstegramTitlePresent() 
	{
		try

		{
			WaitElementDisplay(instegramtitle);
			Assert.assertTrue(BookingPage.ElementDisplay(instegramtitle));

		}catch(Exception e){


			System.err.println("\nError : InstegramTitlePresent failed\n");
			throw e;

		}

	}

	public void BirthdayTitlePresent() 
	{
		try

		{
			WaitElementDisplay(birthdaytitle);
			Assert.assertTrue(BookingPage.ElementDisplay(birthdaytitle));

		}catch(Exception e){


			System.err.println("\nError : HowDidYouHeartPresent failed\n");
			throw e;

		}

	}




	
	public void SelectTab(String event)
	{
		String QwizElemet = ("//div//label[text()[contains(.,'Text1')]]");
		QwizElemet = QwizElemet.replace("Text1", event);
		WebElement QwizTabs = driver.findElement(By.xpath(QwizElemet));
		click(QwizTabs);
	} 
	public void SelectColors(String color)
	{
		String ColorElemet = ("//div//label[@for='color_Text1']");
		ColorElemet = ColorElemet.replace("Text1", color);
		WebElement ColorTabs = driver.findElement(By.xpath(ColorElemet));
		click(ColorTabs);
	} 
	public void ClickPlus(String plus)
	{
		String PlusElemet = ("(//div[@class='increase-size'])[Text1]");
		PlusElemet = PlusElemet.replace("Text1", plus);
		WebElement PlusTabs = driver.findElement(By.xpath(PlusElemet));
		click(PlusTabs);
	} 
	public void ClickMinus(String minus)
	{
		String MinusElemet = ("(//div[@class='decrease-size'])[Text1]");
		MinusElemet = MinusElemet.replace("Text1", minus);
		WebElement MinusTabs = driver.findElement(By.xpath(MinusElemet));
		click(MinusTabs);
	} 
	public void SelectBlouses(String brand)
	{
		String BrandsElemet = ("//div//label[@for='Blouses_Text1']");
		BrandsElemet = BrandsElemet.replace("Text1", brand);
		WebElement BrandsTabs = driver.findElement(By.xpath(BrandsElemet));
		click(BrandsTabs);
	}
	public void SelectBottoms(String brand)
	{
		String BrandsElemet = ("//div//label[@for='Bottoms_Text1']");
		BrandsElemet = BrandsElemet.replace("Text1", brand);
		WebElement BrandsTabs = driver.findElement(By.xpath(BrandsElemet));
		click(BrandsTabs);
	}
	public void SelectShoes(String brand)
	{
		String BrandsElemet = ("//div//label[@for='Shoes_Text1']");
		BrandsElemet = BrandsElemet.replace("Text1", brand);
		WebElement BrandsTabs = driver.findElement(By.xpath(BrandsElemet));
		click(BrandsTabs);
	}
	public void SelectBags(String brand)
	{
		String BrandsElemet = ("//div//label[@for='Bags_Text1']");
		BrandsElemet = BrandsElemet.replace("Text1", brand);
		WebElement BrandsTabs = driver.findElement(By.xpath(BrandsElemet));
		click(BrandsTabs);
	}
	public void SelectBrands(String brand)
	{
		String BrandsElemet = ("//div//label[@for='brand_Text1']");
		BrandsElemet = BrandsElemet.replace("Text1", brand);
		WebElement BrandsTabs = driver.findElement(By.xpath(BrandsElemet));
		click(BrandsTabs);
	}
	public void selectBudget(int num)
	{
		Select budget = new Select (driver.findElement(By.xpath("//div//select[@name='budget--quiz']")));
		click(Budget);
		budget.selectByIndex(num);
	}
	public void ClickNextOfevent() 
	{
		click(NextOfEventButton);	
		Sleep(100);
	}
	public void ClickNext() 
	{
		WaitElementDisplay(By.xpath("//button[@class='chat-link-btn onboarding-next-btn ']"));
		click(NextButton);	
		Sleep(100);
	}
	public void ClickSkip() 
	{
		click(SkipButton);	
		Sleep(100);
	}
	public void ClickBack() 
	{
		click(BackButtonOfQwiz);
		Sleep(100);
	}
	public void ClickOnProfileClientButton() 
	{   	
		click(ProfileClientButton);	
		Sleep(100);
	}
	public void ClickOnLogOut() 
	{
		click(LogOut);
		Sleep(100);
	}

	public void FillDate(String text) 
	{
		Sleep(100);
		click(Date);
		filltext(Date,text);
		Sleep(100);
	}

	public void selectLocation(String cuntry)
	{
		click(Flag);
		Sleep(100);
		String PlusElemet = ("(//li[@class='country'])[Text1]");
		PlusElemet = PlusElemet.replace("Text1", cuntry);
		WebElement PlusTabs = driver.findElement(By.xpath(PlusElemet));
		click(PlusTabs);
		//Select mounts = new Select (driver.findElement(By.xpath("//ul[@class=' country-list']")));
		//mounts.selectByIndex(num);
	}
	
	public void FillNumberPhone(String phone)
	{
		WaitElementDisplay(By.xpath("//input[@type='tel']"));
		filltext(Phone,phone);
	}
	
	public void SelectHeight(String height ) 
	
	{                      
		String heightElemet = ("//div[text()[contains(.,'Text1')]]");
		heightElemet = heightElemet.replace("Text1", height);
		WebElement BrandsTabs = driver.findElement(By.xpath(heightElemet));
		click(BrandsTabs);
	}
	public void SelectCategory(String event)
	{
		String QwizElemet = ("//div[text()[contains(.,'Text1')]]");
		QwizElemet = QwizElemet.replace("Text1", event);
		WebElement QwizTabs = driver.findElement(By.xpath(QwizElemet));
		click(QwizTabs);
	} 
	public void OpenDropDwon(String cuntry ) 
	{
		Sleep(100);
		String PlusElemet = ("(//div[@class ='dropdown-control'])[Text1]");
		PlusElemet = PlusElemet.replace("Text1", cuntry);
		WebElement PlusTabs = driver.findElement(By.xpath(PlusElemet));
		click(PlusTabs);
	}
	public void SelectTopsSize(String cuntry ) 
	{
		Sleep(100);
		String PlusElemet = ("//div[text()[contains(.,'Text1')]]");
		PlusElemet = PlusElemet.replace("Text1", cuntry);
		WebElement PlusTabs = driver.findElement(By.xpath(PlusElemet));
		click(PlusTabs);
	}
	public void SelectBottomsSize(String cuntry ) 
	{
		Sleep(100);
		String PlusElemet = ("//div[text()[contains(.,'Text1')]]");
		PlusElemet = PlusElemet.replace("Text1", cuntry);
		WebElement PlusTabs = driver.findElement(By.xpath(PlusElemet));
		click(PlusTabs);
	}
	public void SelectShoesSize(String cuntry ) 
	{
		Sleep(100);
		String PlusElemet = ("//div[text()[contains(.,'Text1')]]");
		PlusElemet = PlusElemet.replace("Text1", cuntry);
		WebElement PlusTabs = driver.findElement(By.xpath(PlusElemet));
		click(PlusTabs);
	}
	public void SelectTopsBudget(String cuntry,String num ) 
	{
		Sleep(100);
		String PlusElemet = ("(//div[text()[contains(.,'Text1')]])["+num+"]");
		PlusElemet = PlusElemet.replace("Text1", cuntry);
		WebElement PlusTabs = driver.findElement(By.xpath(PlusElemet));
		click(PlusTabs);
	}
	public void SelectBottomsBudget(String cuntry,String num ) 
	{
		Sleep(100);
		String PlusElemet = ("(//div[text()[contains(.,'Text1')]])["+num+"]");
		PlusElemet = PlusElemet.replace("Text1", cuntry);
		WebElement PlusTabs = driver.findElement(By.xpath(PlusElemet));
		click(PlusTabs);
	}
	public void SelectShoesBudget(String cuntry,String num ) 
	{
		Sleep(100);
		String PlusElemet = ("(//div[text()[contains(.,'Text1')]])["+num+"]");
		PlusElemet = PlusElemet.replace("Text1", cuntry);
		WebElement PlusTabs = driver.findElement(By.xpath(PlusElemet));
		click(PlusTabs);
	}
	public void SelectEvent(String cuntry ) 
	{
		Sleep(100);
		String PlusElemet = ("//div[text()[contains(.,'Text1')]]");
		PlusElemet = PlusElemet.replace("Text1", cuntry);
		WebElement PlusTabs = driver.findElement(By.xpath(PlusElemet));
		click(PlusTabs);
	}
	public void FillText(String chat)
	{
		WaitElementDisplay(By.xpath("//input[@type='text']"));
		filltext(input,chat);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
	}
	public void ClickHeart() 
	{
		click(heart);	
		Sleep(100);
	}
	

}
