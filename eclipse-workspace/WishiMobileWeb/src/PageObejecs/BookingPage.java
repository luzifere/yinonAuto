package PageObejecs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;

public class BookingPage extends BasePage
{
	
	public BookingPage(AndroidDriver<AndroidElement> _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div//span[text()[contains(.,'My Style Sessions')]]")
	WebElement MyStyleSessions;
	@FindBy(xpath="//div//span[text()[contains(.,'Stylists')]]")
	WebElement stylist;

	@FindBy(xpath="//a[text()[contains(.,'Stylists')]]")
	WebElement BookStylist;

	@FindBy(xpath="//label[@for='miniRadio']")
	WebElement Mini;
	@FindBy(xpath="//label[@for='majorRadio']")
	WebElement Major;
	@FindBy(xpath="(//div[@class='radio-button horizontal dark dot checked form-check'])[2]")
	WebElement Subscription;
	@FindBy(xpath="(//span[text()[contains(.,'$40 - One-time Mini')]])[2]")
	WebElement OneTime;
	@FindBy(xpath="(//span[text()[contains(.,'$90 - One-time Major')]])[2]")
	WebElement OneTimemajor;
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement promocodeField;
	@FindBy(xpath="(//a[@class='add-code'])[2]")
	WebElement promocode;
	@FindBy(xpath="(//button[@class='btn btn-dark'])[1]")
	WebElement promocodesubmit;
	@FindBy(xpath="//div[@ng-click='ok()']")
	WebElement Applay;

	@FindBy(xpath="//div//span[text()[contains(.,'Book A Stylist')]]")
	WebElement BookStylisk;
	@FindBy(xpath="//div[@class='big-box mini-top']//button[@class='get-your-style black-btn']")
	WebElement StartedMini;
	@FindBy(xpath="//div[@class='big-box major-top']//button[@class='get-your-style black-btn']")
	WebElement StartedMajor;

	@FindBy(xpath="//div[@class='select__control css-yk16xz-control']")
	WebElement SearchBar;

	@FindBy(xpath="//input[@id='react-select-2-input']")
	WebElement TextBar;

	@FindBy(xpath="//div//input[@placeholder='Add Promo Code']")                     
	WebElement SearchInput;

	@FindBy(xpath="//label//div[text()[contains(.,'Gender')]]")
	WebElement Gender;


	@FindBy(xpath="//div [text()[contains(.,'Female')]]")
	WebElement Femaile;

	@FindBy(xpath="//div//ul[@class='dropdown-menu ng-isolate-scope']")
	WebElement Dropdown;

	@FindBy(xpath="//li//a[@class='ng-binding ng-scope']")
	WebElement TitleOfStylist;

	@FindBy(xpath="//div//button[@class='stickyButton ng-binding']")
	WebElement SelectStylist;

	@FindBy(xpath="//div[text()[contains(.,'Style Session / Every Month')]]")
	WebElement SelectUnlimited;

	@FindBy(xpath="//div[@class='filterPopPage ng-scope']//div [text()[contains(.,'Apply')]]")
	WebElement ClickApllay;

	@FindBy(xpath="//span[text()[contains(.,'Remove promo code')]]")
	WebElement RemovePromoCode;

	@FindBy(xpath="(//div[@class='filter-name ng-binding'])[1]")
	WebElement SelectService;

	@FindBy(xpath="//div//input[@class='no-border bgTransparent ng-pristine ng-valid ng-empty ng-touched']")
	WebElement PromoCode;//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']

	@FindBy(xpath="//div[@class='closeXRight']")
	WebElement CloseBtnCheckout;

	@FindBy(xpath="(//div//input[@class='form-control ng-pristine ng-untouched ng-not-empty ng-valid ng-valid-required'])[1]")
	WebElement FirstNameCheckout;

	@FindBy(xpath="(//div//input[@class='form-control'])[2]")
	WebElement LastNameCheckout;

	@FindBy(xpath="//div//button[@class='payment_form_button space-8']")
	WebElement FinishCheckout;

	@FindBy(xpath="//div[@class='thank-u-btn']")
	WebElement TakeYourStyleQuiz;

	@FindBy(xpath="//div[@class='thank-u-btn']")
	WebElement BookStylisButton;

	@FindBy(css ="[name='cardnumber']")
	WebElement CardNaumber;

	@FindBy(css="[name='exp-date']")
	WebElement DateOfCard;

	@FindBy(css="[name='cvc']")
	WebElement CVCCard;

	@FindBy(xpath="//button[@class='payment_form_button ng-binding']")
	WebElement PayButton;
	@FindBy(xpath="//button[@class='btn btn-warning']")
	WebElement Next;

	@FindBy(xpath="//label[@for='mini']")
	WebElement MIniGoal;
	@FindBy(xpath="//label[@for='closet_cleanout']")
	WebElement cleanoutGoal;
	@FindBy(xpath="//label[@for='major']")
	WebElement MajorGoal;

	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement MIniPlan;
	@FindBy(xpath="(//button[@type='button'])[4]")
	WebElement MajorPlan;
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement MajorPlanOfCleanOut;
	
	@FindBy(xpath="//span[@class='d-block d-sm-none']")
	WebElement bookstylistprofile;
	@FindBy(xpath="//button[@class='d-none d-sm-flex btn btn-dark']")
	WebElement paymentbutton;
	@FindBy(xpath="//button[@title='Collapse Widget']")
	WebElement chatbutton;
	@FindBy(xpath="(//div[text()[contains(.,'Total')]]/..//div[text()[contains(.,'0')]])[2]")
	WebElement total_0;

	@FindBy(xpath="(//div[text()[contains(.,'BEST MATCH')]]/..//div[text()[contains(.,'Mini')]])[2]")
	WebElement minibest;
	@FindBy(xpath="(//div[text()[contains(.,'Wishi Mini package')]])[2]")
	WebElement minipackage;
	@FindBy(xpath="(//div[text()[contains(.,'BEST MATCH')]]/..//div[text()[contains(.,'Major')]])[2]")
	WebElement majorbest;
	@FindBy(xpath="//p[text()[contains(.,'Major package')]]")
	WebElement majorpackage;
	@FindBy(xpath="(//div[text()[contains(.,'Closet clean out package')]])[2]")
	WebElement cleanoutpackage;
	@FindBy(xpath="//div[text()[contains(.,'Add Credit Card')]]")
	WebElement addCC;
	@FindBy(xpath="//div[text()[contains(.,'Pay with Credit Card')]]")
	WebElement addCCcleanoot;
	@FindBy(xpath="//div[@class='payment-card row']")
	WebElement paywithCC;
	@FindBy(xpath="(//button[text()[contains(.,'Confirm')]])[1]")
	WebElement confirm;
	@FindBy(xpath="(//button[text()[contains(.,'complete booking')]])[2]")
	WebElement complatebooking;
	@FindBy(xpath="(//button[text()[contains(.,'complete booking')]])[1]")
	WebElement complatebookingmajor;
	@FindBy(xpath="//a[@id='LetsGoQuiz']")
	WebElement letsgo;
	@FindBy(xpath="//img[@class='inbox']")
	WebElement mySessions;
	@FindBy(xpath="//div[@class='channel ng-scope']")
	WebElement channel;
	
	
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
	@FindBy(xpath="//p[text()[contains(.,'Where do you live')]]")
	WebElement location;
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
	@FindBy(xpath="//textarea[@id='quiz-textarea']")
	WebElement textarea;
	@FindBy(xpath="//div[text()[contains(.,'Done')]]")
	WebElement donebutton;
	@FindBy(xpath="//select[@id='birthday-month']")
	WebElement month;
	@FindBy(xpath="//select[@id='birthday-day']")
	WebElement day;
	@FindBy(xpath="//select[@id='birthday-year']")
	WebElement year;
	@FindBy(xpath="//select[@id='selector_BUDGET_TOPS_USD']")
	WebElement budgettops;
	@FindBy(xpath="//select[@id='selector_BUDGET_BOTTOM_USD']")
	WebElement budgetbottoms;
	@FindBy(xpath="//select[@id='selector_BUDGET_SHOES_USD']")
	WebElement budgetshoes;
	@FindBy(xpath="//select[@id='selector_BUDGET_BAGS_USD']")
	WebElement budgetbugs;
	@FindBy(xpath="//select[@id='selector_BUDGET_ACCESSORIES_USD']")
	WebElement budgetAccessories;
	@FindBy(xpath="//label[@for='GOAL_WORKWEAR']")
	WebElement GOAL_WORKWEAR;
	@FindBy(xpath="//a[@id='LetsGoQuiz']")
	WebElement quizheader;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_TOPS']")
	WebElement CLOTHING_CATEGORY_TOPS;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_JACKETS']")
	WebElement CLOTHING_CATEGORY_JACKETS;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_JUMPSUITS']")
	WebElement CLOTHING_CATEGORY_JUMPSUITS;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_SWEATERS']")
	WebElement CLOTHING_CATEGORY_SWEATERS;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_SUNGLASSES']")
	WebElement CLOTHING_CATEGORY_SUNGLASSES;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_SHOES']")
	WebElement CLOTHING_CATEGORY_SHOES;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_SKIRTS']")
	WebElement CLOTHING_CATEGORY_SKIRTS;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_DRESSES']")
	WebElement CLOTHING_CATEGORY_DRESSES;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_JEANS']")
	WebElement CLOTHING_CATEGORY_JEANS;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_BLAZERS']")
	WebElement CLOTHING_CATEGORY_BLAZERS;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_COATS']")
	WebElement CLOTHING_CATEGORY_COATS;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_SCARVES']")
	WebElement CLOTHING_CATEGORY_SCARVES;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_JEWELRIES']")
	WebElement CLOTHING_CATEGORY_JEWELRIES;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_HATS']")
	WebElement CLOTHING_CATEGORY_HATS;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_BAGS']")
	WebElement CLOTHING_CATEGORY_BAGS;
	@FindBy(xpath="//div[@id='CLOTHING_CATEGORY_PANTS']")
	WebElement CLOTHING_CATEGORY_PANTS;
	@FindBy(xpath="//button[text()[contains(.,'Anything goes')]]")
	WebElement Anything_goes;
	@FindBy(xpath="//button[text()[contains(.,'Tall')]]")
	WebElement Tall;
	@FindBy(xpath="//div[text()[contains(.,'Tops')]]/..//div[text()[contains(.,'$50-$100')]]")
	WebElement top_50_100;
	@FindBy(xpath="//div[text()[contains(.,'Tops')]]/..//div[text()[contains(.,'$100-$400')]]")
	WebElement top_100_400;
	@FindBy(xpath="//div[text()[contains(.,'Tops')]]/..//div[text()[contains(.,'$400-$1,000')]]")
	WebElement top_400_1000;
	@FindBy(xpath="//div[text()[contains(.,'Tops')]]/..//div[text()[contains(.,'$1,000+')]]")
	WebElement top_1000;
	@FindBy(xpath="//div[text()[contains(.,'Bottoms')]]/..//div[text()[contains(.,'$50-$100')]]")
	WebElement Bottoms_50_100;
	@FindBy(xpath="//div[text()[contains(.,'Bottoms')]]/..//div[text()[contains(.,'$100-$400')]]")
	WebElement Bottoms_100_400;
	@FindBy(xpath="//div[text()[contains(.,'Bottoms')]]/..//div[text()[contains(.,'$400-$1,000')]]")
	WebElement Bottoms_400_1000;
	@FindBy(xpath="//div[text()[contains(.,'Bottoms')]]/..//div[text()[contains(.,'$1,000+')]]")
	WebElement Bottoms_1000;
	@FindBy(xpath="//div[text()[contains(.,'Shoes')]]/..//div[text()[contains(.,'$50-$100')]]")
	WebElement Shoes_50_100;
	@FindBy(xpath="//div[text()[contains(.,'Shoes')]]/..//div[text()[contains(.,'$100-$400')]]")
	WebElement Shoes_100_400;
	@FindBy(xpath="//div[text()[contains(.,'Shoes')]]/..//div[text()[contains(.,'$400-$1,000')]]")
	WebElement Shoes_400_1000;
	@FindBy(xpath="//div[text()[contains(.,'Shoes')]]/..//div[text()[contains(.,'$1,000+')]]")
	WebElement Shoes_1000;
	@FindBy(xpath="//div[text()[contains(.,'Bags')]]/..//div[text()[contains(.,'$50-$100')]]")
	WebElement Bags_50_100;
	@FindBy(xpath="//div[text()[contains(.,'Bags')]]/..//div[text()[contains(.,'$100-$400')]]")
	WebElement Bags_100_400;
	@FindBy(xpath="//div[text()[contains(.,'Bags')]]/..//div[text()[contains(.,'$400-$1,000')]]")
	WebElement Bags_400_1000;
	@FindBy(xpath="//div[text()[contains(.,'Bags')]]/..//div[text()[contains(.,'$1,000+')]]")
	WebElement Bags_1000;
	@FindBy(xpath="//div[text()[contains(.,'Accessories')]]/..//div[text()[contains(.,'$50-$100')]]")
	WebElement Accessories_50_100;
	@FindBy(xpath="//div[text()[contains(.,'Accessories')]]/..//div[text()[contains(.,'$100-$400')]]")
	WebElement Accessories_100_400;
	@FindBy(xpath="//div[text()[contains(.,'Accessories')]]/..//div[text()[contains(.,'$400-$1,000')]]")
	WebElement Accessories_400_1000;
	@FindBy(xpath="//div[text()[contains(.,'Accessories')]]/..//div[text()[contains(.,'$1,000+')]]")
	WebElement Accessories_1000;
	@FindBy(xpath="//div[@id='JEANS_SKINNY']")
	WebElement JEANS_SKINNY;
	@FindBy(xpath="//div[@id='JEANS_STRAIGHT']")
	WebElement JEANS_STRAIGHT;
	@FindBy(xpath="//div[@id='JEANS_LOW_RISE']")
	WebElement JEANS_LOW_RISE;
	@FindBy(xpath="//div[@id='JEANS_CROPPED']")
	WebElement JEANS_CROPPED;
	@FindBy(xpath="//div[@id='JEANS_FLAIR']")
	WebElement JEANS_FLAIR;
	@FindBy(xpath="//select[@id='selector_SIZE_TOPS_US']")
	WebElement SIZE_TOPS;
	@FindBy(xpath="//select[@id='selector_SIZE_BOTTOM_US']")
	WebElement SIZE_BOTTOM;
	@FindBy(xpath="//select[@id='selector_SIZE_DRESS_US']")
	WebElement SIZE_DRESS;
	@FindBy(xpath="//select[@id='selector_SIZE_SHOES_US']")
	WebElement SIZE_SHOES;
	@FindBy(xpath="//div[@id='HIGHLIGHT_ABS']")
	WebElement HIGHLIGHT_ABS;
	@FindBy(xpath="//div[@id='HIGHLIGHT_SHOULDERS']")
	WebElement HIGHLIGHT_SHOULDERS;
	@FindBy(xpath="//div[@id='HIGHLIGHT_BACK']")
	WebElement HIGHLIGHT_BACK;
	@FindBy(xpath="//div[@id='HIGHLIGHT_CALVES']")
	WebElement HIGHLIGHT_CALVES;
	@FindBy(xpath="//div[@id='HIGHLIGHT_CLEAVAGE']")
	WebElement HIGHLIGHT_CLEAVAGE;
	@FindBy(xpath="//div[@id='HIGHLIGHT_LEGS']")
	WebElement HIGHLIGHT_LEGS;
	@FindBy(xpath="//div[@id='HIGHLIGHT_REAR']")
	WebElement HIGHLIGHT_REAR;
	@FindBy(xpath="//div[@id='HIGHLIGHT_WAIST']")
	WebElement HIGHLIGHT_WAIST;
	@FindBy(xpath="//div[@id='FIT_TOP_TIGHT']")
	WebElement FIT_TOP_TIGHT;
	@FindBy(xpath="//div[@id='FIT_TOP_FITTED']")
	WebElement FIT_TOP_FITTED;
	@FindBy(xpath="//div[@id='FIT_TOP_STRAIGHT']")
	WebElement FIT_TOP_STRAIGHT;
	@FindBy(xpath="//div[@id='FIT_TOP_LOOSE']")
	WebElement FIT_TOP_LOOSE;
	@FindBy(xpath="//div[@id='FIT_TOP_OVERSIZED']")
	WebElement FIT_TOP_OVERSIZED;
	@FindBy(xpath="//div[@id='FIT_BOTTOM_TIGHT']")
	WebElement FIT_BOTTOM_TIGHT;
	@FindBy(xpath="//div[@id='FIT_BOTTOM_FITTED']")
	WebElement FIT_BOTTOM_FITTED;
	@FindBy(xpath="//div[@id='FIT_BOTTOM_LOOSE']")
	WebElement FIT_BOTTOM_LOOSE;
	@FindBy(xpath="//div[@id='FIT_BOTTOM_OVERSIZED']")
	WebElement FIT_BOTTOM_OVERSIZED;
	@FindBy(xpath="//div[@id='FIT_BOTTOM_STRAIGHT']")
	WebElement FIT_BOTTOM_STRAIGHT;
	@FindBy(xpath="//div[@id='FABRICS_VELVET']")
	WebElement FABRICS_VELVET;
	@FindBy(xpath="//div[@id='FABRICS_LEATHER']")
	WebElement FABRICS_LEATHER;
	@FindBy(xpath="//div[@id='FABRICS_LACE']")
	WebElement FABRICS_LACE;
	@FindBy(xpath="//div[@id='FABRICS_POLYESTER']")
	WebElement FABRICS_POLYESTER;
	@FindBy(xpath="//div[@id='FABRICS_FUR']")
	WebElement FABRICS_FUR;
	@FindBy(xpath="//div[@id='FABRICS_WOOL']")
	WebElement FABRICS_WOOL;
	@FindBy(xpath="//div[@id='FABRICS_DRY_CLEAN_ONLY']")
	WebElement FABRICS_DRY_CLEAN_ONLY;
	@FindBy(xpath="//div[@id='button_HEELS_NEVER']")
	WebElement button_HEELS_NEVER;
	@FindBy(xpath="//div[@id='button_HEELS_SOMETIMES']")
	WebElement button_HEELS_SOMETIMES;
	@FindBy(xpath="//div[@id='button_HEELS_ALWAYS']")
	WebElement button_HEELS_ALWAYS;
	@FindBy(xpath="//div[@id='button_CLOTHING_PREFERENCES_MIX']")
	WebElement button_CLOTHING_PREFERENCES_MIX;
	@FindBy(xpath="//div[@id='button_CLOTHING_PREFERENCES_PANTS']")
	WebElement button_CLOTHING_PREFERENCES_PANTS;
	@FindBy(xpath="//div[@id='button_CLOTHING_PREFERENCES_DRESSES_AND_SKIRTS']")
	WebElement button_CLOTHING_PREFERENCES_DRESSES_AND_SKIRTS;
	@FindBy(xpath="//div[@id='button_COMFORT_ZONE_TOTALLY']")
	WebElement button_COMFORT_ZONE_TOTALLY;
	@FindBy(xpath="//div[@id='button_COMFORT_ZONE_OPEN_FOR_CHANGE']")
	WebElement button_COMFORT_ZONE_OPEN_FOR_CHANGE;
	@FindBy(xpath="//div[@id='button_COMFORT_ZONE_NOT_AT_ALL']")
	WebElement button_COMFORT_ZONE_NOT_AT_ALL;
	@FindBy(xpath="//label[text()[contains(.,'Gold')]]")
	WebElement JEWELRY_GOLD;
	@FindBy(xpath="//label[text()[contains(.,'Vintage')]]")
	WebElement JEWELRY_VINTAGE;
	@FindBy(xpath="//label[text()[contains(.,'Colorful')]]")
	WebElement JEWELRY_COLORFUL;
	@FindBy(xpath="//label[text()[contains(.,'Rose Gold')]]")
	WebElement JEWELRY_ROSE_GOLD;
	@FindBy(xpath="//label[text()[contains(.,'Silver')]]")
	WebElement JEWELRY_SILVER;
	@FindBy(xpath="//label[text()[contains(.,'Black')]]")
	WebElement JEWELRY_BLACK;
	@FindBy(xpath="//input[@id='WHAT_MATTERS_VERSATILITY']/..//label[@class='checkbox-label']")
	WebElement WHAT_MATTERS_VERSATILITY;
	@FindBy(xpath="//input[@id='WHAT_MATTERS_SUSTAINABILITY']/..//label[@class='checkbox-label']")
	WebElement WHAT_MATTERS_SUSTAINABILITY;
	@FindBy(xpath="//input[@id='WHAT_MATTERS_UNIQENESS']/..//label[@class='checkbox-label']")
	WebElement WHAT_MATTERS_UNIQENESS;
	@FindBy(xpath="//input[@id='WHAT_MATTERS_COMFORT']/..//label[@class='checkbox-label']")
	WebElement WHAT_MATTERS_COMFORT;
	@FindBy(xpath="//span[@id='badge_0']")
	WebElement icon;
	@FindBy(xpath="//input[@class='form-control']")
	WebElement instegramfield;
	@FindBy(xpath="//button[text()[contains(.,'Skip')]]")
	WebElement skip;
	@FindBy(xpath="//input[@class='input-location form-control']")
	WebElement locationfield;
	@FindBy(xpath="//button[text()[contains(.,'Finish Quiz')]]")
	WebElement finishquiz;
	@FindBy(xpath="//div[@id='chat_scrollable_container']")
	WebElement chatpresent;
	@FindBy(xpath="//input[@class='phone-input']")
	WebElement phone;
	@FindBy(xpath="//input[@id='review-image']")
	WebElement addphoto;
	
	
	
	public void chatPresent() 
	{
		try

		{
			WaitElementDisplay(chatpresent);
			Assert.assertTrue( ElementDisplay(chatpresent));

		}catch(Exception e){


			System.err.println("\nError : chatPresent failed\n");
			throw e;

		}

	}
	public void Fillphone(String text) 
	{
		try

		{
			WaitElementDisplay(phone);
			filltext(phone,text);
		}catch(Exception e){


			System.err.println("\nError : Fillphone failed\n");
			throw e;

		}

	}
	public void Fillphoto() 
	{
		try

		{
			//driver.findElement(By.xpath("//input[@id='review-image']")).sendKeys("/storage/emulated/0/Download/IMG_20200608_161212.jpg");
			driver.findElement(By.xpath("//div[@id='upload']")).click();
			driver.switchTo().alert().accept();
			
		}catch(Exception e){


			System.err.println("\nError : Fillphoto failed\n");
			throw e;

		}

	}
	public void FillLocation(String text) 
	{
		try

		{
			WaitElementDisplay(locationfield);
			filltext(locationfield,text);
		}catch(Exception e){


			System.err.println("\nError : FillLocation failed\n");
			throw e;

		}

	}
	public void Fillinstegram(String text) 
	{
		try

		{
			WaitElementDisplay(instegramfield);
			filltext(instegramfield,text);
		}catch(Exception e){


			System.err.println("\nError : Filltextarea failed\n");
			throw e;

		}

	}
	public void ClickFinishQuiz() 
	{
		try

		{
			ExplicityWaitIsClickable(finishquiz);
		}catch(Exception e){


			System.err.println("\nError : ClickFinishQuiz failed\n");
			throw e;

		}

	}
	public void ClickSkip() 
	{
		try

		{
			ExplicityWaitIsClickable(skip);
		}catch(Exception e){


			System.err.println("\nError : ClickSkip failed\n");
			throw e;

		}

	}
	public void SelectWHAT_MATTERS_COMFORT() 
	{
		try

		{
			ExplicityWaitIsClickable(WHAT_MATTERS_COMFORT);
		}catch(Exception e){


			System.err.println("\nError : SelectWHAT_MATTERS_COMFORT failed\n");
			throw e;

		}

	}
	public void Selecticon() 
	{
		try

		{
			ExplicityWaitIsClickable(icon);
		}catch(Exception e){


			System.err.println("\nError : Selecticon failed\n");
			throw e;

		}

	}
	public void SelectJEWELRY_BLACK() 
	{
		try

		{
			ExplicityWaitIsClickable(JEWELRY_BLACK);
		}catch(Exception e){


			System.err.println("\nError : SelectJEWELRY_BLACK failed\n");
			throw e;

		}

	}
	public void SelectJEWELRY_GOLD() 
	{
		try

		{
			ExplicityWaitIsClickable(JEWELRY_GOLD);
		}catch(Exception e){


			System.err.println("\nError : SelectJEWELRY_GOLD failed\n");
			throw e;

		}

	}
	public void Selectbutton_COMFORT_ZONE_NOT_AT_ALL() 
	{
		try

		{
			ExplicityWaitIsClickable(button_COMFORT_ZONE_NOT_AT_ALL);
		}catch(Exception e){


			System.err.println("\nError : Selectbutton_COMFORT_ZONE_NOT_AT_ALL failed\n");
			throw e;

		}

	}
	public void Selectbutton_CLOTHING_PREFERENCES_MIX() 
	{
		try

		{
			ExplicityWaitIsClickable(button_CLOTHING_PREFERENCES_MIX);
		}catch(Exception e){


			System.err.println("\nError : Selectbutton_CLOTHING_PREFERENCES_MIX failed\n");
			throw e;

		}

	}
	public void Selectbutton_HEELS_ALWAYS() 
	{
		try

		{
			ExplicityWaitIsClickable(button_HEELS_ALWAYS);
		}catch(Exception e){


			System.err.println("\nError : Selectbutton_HEELS_ALWAYS failed\n");
			throw e;

		}

	}
	public void SelectFABRICS_DRY_CLEAN_ONLY() 
	{
		try

		{
			ExplicityWaitIsClickable(FABRICS_DRY_CLEAN_ONLY);
		}catch(Exception e){


			System.err.println("\nError : SelectFABRICS_DRY_CLEAN_ONLY failed\n");
			throw e;

		}

	}
	public void SelectFABRICS_VELVET() 
	{
		try

		{
			ExplicityWaitIsClickable(FABRICS_VELVET);
		}catch(Exception e){


			System.err.println("\nError : SelectFABRICS_VELVET failed\n");
			throw e;

		}

	}
	public void SelectFIT_BOTTOM_FITTED() 
	{
		try

		{
			ExplicityWaitIsClickable(FIT_BOTTOM_FITTED);
		}catch(Exception e){


			System.err.println("\nError : SelectFIT_BOTTOM_FITTED failed\n");
			throw e;

		}

	}
	public void SelectFIT_BOTTOM_STRAIGHT() 
	{
		try

		{
			ExplicityWaitIsClickable(FIT_BOTTOM_STRAIGHT);
		}catch(Exception e){


			System.err.println("\nError : SelectFIT_BOTTOM_STRAIGHT failed\n");
			throw e;

		}

	}
	public void SelectFIT_TOP_OVERSIZED() 
	{
		try

		{
			ExplicityWaitIsClickable(FIT_TOP_OVERSIZED);
		}catch(Exception e){


			System.err.println("\nError : SelectFIT_TOP_OVERSIZED failed\n");
			throw e;

		}

	}
	public void SelectFIT_TOP_STRAIGHT() 
	{
		try

		{
			ExplicityWaitIsClickable(FIT_TOP_STRAIGHT);
		}catch(Exception e){


			System.err.println("\nError : SelectFIT_TOP_STRAIGHT failed\n");
			throw e;

		}

	}
	
	public void SelectHIGHLIGHT_WAISTS() 
	{
		try

		{
			ExplicityWaitIsClickable(HIGHLIGHT_WAIST);
		}catch(Exception e){


			System.err.println("\nError : SelectHIGHLIGHT_WAISTS failed\n");
			throw e;

		}

	}
	public void SelectHIGHLIGHT_CLEAVAGE() 
	{
		try

		{
			ExplicityWaitIsClickable(HIGHLIGHT_CLEAVAGE);
		
		}catch(Exception e){


			System.err.println("\nError : SelectHIGHLIGHT_CLEAVAGE failed\n");
			throw e;

		}

	}
	public void SelectHIGHLIGHT_ABS() 
	{
		try

		{
			ExplicityWaitIsClickable(HIGHLIGHT_ABS);
		}catch(Exception e){


			System.err.println("\nError : SelectHIGHLIGHT_ABS failed\n");
			throw e;

		}

	}
	public void SelectSIZE_TOPS() 
	{
		try

		{
			ExplicityWaitIsClickable(SIZE_TOPS);
			SelectDropDwon(SIZE_TOPS,"M");
		}catch(Exception e){


			System.err.println("\nError : SelectSIZE_TOPS failed\n");
			throw e;

		}

	}
	public void SelectSIZE_BOTTOM(String text) 
	{
		try

		{
			ExplicityWaitIsClickable(SIZE_BOTTOM);
			SelectDropDwon(SIZE_BOTTOM,text);
		}catch(Exception e){


			System.err.println("\nError : SelectSIZE_BOTTOM failed\n");
			throw e;

		}

	}
	public void SelectSIZE_DRESS() 
	{
		try

		{
			ExplicityWaitIsClickable(SIZE_DRESS);
			SelectDropDwon(SIZE_DRESS,"4");
		}catch(Exception e){


			System.err.println("\nError : SelectSIZE_DRESS failed\n");
			throw e;

		}

	}
	public void SelectSIZE_SHOES() 
	{
		try

		{
			ExplicityWaitIsClickable(SIZE_SHOES);
			SelectDropDwon(SIZE_SHOES,"6.5");
		}catch(Exception e){


			System.err.println("\nError : SelectSIZE_SHOES failed\n");
			throw e;

		}

	}
	public void ClickJEANS_FLAIR() 
	{
		try

		{
			ExplicityWaitIsClickable(JEANS_FLAIR);
		}catch(Exception e){


			System.err.println("\nError : ClickJEANS_FLAIR failed\n");
			throw e;

		}

	}
	public void ClickJEANS_SKINNY() 
	{
		try

		{
			ExplicityWaitIsClickable(JEANS_SKINNY);
		}catch(Exception e){


			System.err.println("\nError : ClickJEANS_SKINNY failed\n");
			throw e;

		}

	}
	public void Clicktop_50_100() 
	{
		try

		{
			ExplicityWaitIsClickable(top_50_100);
		}catch(Exception e){


			System.err.println("\nError : Clicktop_50_100 failed\n");
			throw e;

		}

	}
	public void ClickBottoms_100_400() 
	{
		try

		{
			ExplicityWaitIsClickable(Bottoms_100_400);
		}catch(Exception e){


			System.err.println("\nError : ClickBottoms_100_400 failed\n");
			throw e;

		}

	}
	public void ClickShoes_400_1000() 
	{
		try

		{
			ExplicityWaitIsClickable(Shoes_400_1000);
		}catch(Exception e){


			System.err.println("\nError : ClickShoes_400_1000 failed\n");
			throw e;

		}

	}
	public void ClickBags_1000() 
	{
		try

		{
			ExplicityWaitIsClickable(Bags_1000);
		}catch(Exception e){


			System.err.println("\nError : ClickBags_1000 failed\n");
			throw e;

		}

	}
	public void ClickAccessories_50_100() 
	{
		try

		{
			ExplicityWaitIsClickable(Accessories_50_100);
		}catch(Exception e){


			System.err.println("\nError : ClickAccessories_50_100 failed\n");
			throw e;

		}

	}
	public void ClickTall() 
	{
		try

		{
			ExplicityWaitIsClickable(Tall);
		}catch(Exception e){


			System.err.println("\nError : ClickTall failed\n");
			throw e;

		}

	}
	
	public void ClickAnything_goes() 
	{
		try

		{
			ExplicityWaitIsClickable(Anything_goes);
		}catch(Exception e){


			System.err.println("\nError : ClickAnything_goes failed\n");
			throw e;

		}

	}
	
		public void ClickCLOTHING_CATEGORY_TOPS() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_TOPS);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_TOPS failed\n");
			throw e;

		}

	}
	public void ClickCLOTHING_CATEGORY_PANTS() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_PANTS);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_PANTS failed\n");
			throw e;

		}

	}
	public void ClickCLOTHING_CATEGORY_JACKETS() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_JACKETS);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_JACKETS failed\n");
			throw e;

		}

	}
	public void ClickCLOTHING_CATEGORY_JUMPSUITS() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_JUMPSUITS);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_JUMPSUITS failed\n");
			throw e;

		}

	}
	public void ClickCLOTHING_CATEGORY_SWEATERS() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_SWEATERS);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_SWEATERS failed\n");
			throw e;

		}

	}
	public void ClickCLOTHING_CATEGORY_SUNGLASSES() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_SUNGLASSES);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_SUNGLASSES failed\n");
			throw e;

		}

	}
	public void ClickCLOTHING_CATEGORY_SHOES() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_SHOES);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_SHOES failed\n");
			throw e;

		}

	}
	public void ClickCLOTHING_CATEGORY_SKIRTS() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_SKIRTS);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_SKIRTS failed\n");
			throw e;

		}

	}
	public void ClickCLOTHING_CATEGORY_DRESSES() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_DRESSES);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_DRESSES failed\n");
			throw e;

		}

	}
	public void ClickCLOTHING_CATEGORY_JEANS() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_JEANS);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_JEANS failed\n");
			throw e;

		}

	}
	public void ClickCLOTHING_CATEGORY_BLAZERS() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_BLAZERS);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_BLAZERS failed\n");
			throw e;

		}

	}
	public void ClickCLOTHING_CATEGORY_COATS() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_COATS);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_COATS failed\n");
			throw e;

		}

	}
	public void ClickCLOTHING_CATEGORY_SCARVES() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_SCARVES);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_SCARVES failed\n");
			throw e;

		}

	}
	public void ClickCLOTHING_CATEGORY_JEWELRIES() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_JEWELRIES);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_JEWELRIES failed\n");
			throw e;

		}

	}
	public void ClickCLOTHING_CATEGORY_HATS() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_HATS);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_HATS failed\n");
			throw e;

		}

	}
	public void ClickCLOTHING_CATEGORY_BAGS() 
	{
		try

		{
			ExplicityWaitIsClickable(CLOTHING_CATEGORY_BAGS);
		}catch(Exception e){


			System.err.println("\nError : ClickCLOTHING_CATEGORY_BAGS failed\n");
			throw e;

		}

	}
	public void Clickotherbutton() 
	{
		try

		{
			ExplicityWaitIsClickable(otherbutton);
		}catch(Exception e){


			System.err.println("\nError : Clickotherbutton failed\n");
			throw e;

		}

	}
	public void SelectGOAL_WORKWEAR() 
	{
		try

		{
			ExplicityWaitIsClickable(GOAL_WORKWEAR);
		}catch(Exception e){


			System.err.println("\nError : SelectGOAL_WORKWEAR failed\n");
			throw e;

		}

	}
	public void ClickNext() 
	{
		try

		{
			HideKeyboard();
			WaitElementDisplay(Next);
			ExplicityWaitIsClickable(Next);
		}catch(Exception e){


			System.err.println("\nError : ClickNext failed\n");
			throw e;

		}

	}

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
	public void Selectbudgettops() 
	{
		try

		{
			ExplicityWaitIsClickable(budgettops);
			SelectDropDwon(budgettops,"$50-$100");
		}catch(Exception e){


			System.err.println("\nError : Selectbudgettops failed\n");
			throw e;

		}

	}
	public void Selectbudgetbottoms() 
	{
		try

		{
			ExplicityWaitIsClickable(budgetbottoms);
			SelectDropDwon(budgetbottoms,"$100-$400");
		}catch(Exception e){


			System.err.println("\nError : Selectbudgetbottoms failed\n");
			throw e;

		}

	}
	public void Selectbudgetshoes() 
	{
		try

		{
			ExplicityWaitIsClickable(budgetshoes);
			SelectDropDwon(budgetshoes,"$400-$1,000");
		}catch(Exception e){


			System.err.println("\nError : Selectbudgetshoes failed\n");
			throw e;

		}

	}
	public void Selectbudgetbugs() 
	{
		try

		{
			ExplicityWaitIsClickable(budgetbugs);
			SelectDropDwon(budgetbugs,"$1,000+");
		}catch(Exception e){


			System.err.println("\nError : Selectbudgetbugs failed\n");
			throw e;

		}

	}
	public void SelectbudgetAccessories() 
	{
		try

		{
			scrollDown();
			ExplicityWaitIsClickable(budgetAccessories);
			SelectDropDwon(budgetAccessories,"$400-$1,000");
		}catch(Exception e){


			System.err.println("\nError : SelectbudgetAccessories failed\n");
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
	public void comfortzonetitletitlePresent() 
	{
		try

		{
			WaitElementDisplay(comfortzonetitletitle);
			Assert.assertTrue(ElementDisplay(comfortzonetitletitle));

		}catch(Exception e){


			System.err.println("\nError : comfortzonetitletitlePresent failed\n");
			throw e;

		}

	}
	public void confirm_emailtitlePresent() 
	{
		try

		{
			WaitElementDisplay(confirm_emailtitle);
			Assert.assertTrue(ElementDisplay(confirm_emailtitle));

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
			Assert.assertTrue( ElementDisplay(Where_do_you_livetitle));

		}catch(Exception e){


			System.err.println("\nError : Where_do_you_livetitlePresent failed\n");
			throw e;

		}

	}
	public void phone_numbertitlePresent() 
	{
		try

		{
			WaitElementDisplay(phone_numbertitle);
			Assert.assertTrue( ElementDisplay(phone_numbertitle));

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
			Assert.assertTrue( ElementDisplay(body_phototitle));

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
			Assert.assertTrue( ElementDisplay(Instagramtitle));

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
			Assert.assertTrue( ElementDisplay(style_icontitle));

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
			Assert.assertTrue( ElementDisplay(particularimportancetitle));

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
			Assert.assertTrue( ElementDisplay(Jewelrytitletitle));

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
			Assert.assertTrue( ElementDisplay(best_describestitle));

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
			Assert.assertTrue( ElementDisplay(preferencetitle));

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
			Assert.assertTrue( ElementDisplay(Anythingavoidtitle));

		}catch(Exception e){


			System.err.println("\nError : AnythingavoidtitlePresent failed\n");
			throw e;

		}

	}
	public void locationtitlePresent() 
	{
		try

		{
			WaitElementDisplay(location);
			Assert.assertTrue( ElementDisplay(location));

		}catch(Exception e){


			System.err.println("\nError : locationtitlePresent failed\n");
			throw e;

		}

	}
	public void fitbottomtitlePresent() 
	{
		try

		{
			WaitElementDisplay(fitbottomtitle);
			Assert.assertTrue( ElementDisplay(fitbottomtitle));

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
			Assert.assertTrue( ElementDisplay(topfittitle));

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
			Assert.assertTrue( ElementDisplay(featurestitle));

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
			Assert.assertTrue( ElementDisplay(jeanstitle));

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
			Assert.assertTrue( ElementDisplay(budgettitle));

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
			Assert.assertTrue( ElementDisplay(sizetitle));

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
			Assert.assertTrue( ElementDisplay(heighttitle));

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
			Assert.assertTrue( ElementDisplay(colorstitle));

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
			Assert.assertTrue( ElementDisplay(clothing_categoriestitle));

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
			Assert.assertTrue( ElementDisplay(describe_your_worktitle));

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
			Assert.assertTrue( ElementDisplay(specific_needtitle));

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
			Assert.assertTrue( ElementDisplay(HowDidYouHeartTitle));

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
			Assert.assertTrue( ElementDisplay(instegramtitle));

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
			Assert.assertTrue( ElementDisplay(birthdaytitle));

		}catch(Exception e){


			System.err.println("\nError : HowDidYouHeartPresent failed\n");
			throw e;

		}

	}
	public void ClickLetsGoQuiz() 
	{
		try

		{
			ExplicityWaitIsClickable(quizheader);

		}catch(Exception e){


			System.err.println("\nError : ClickLetsGoQuiz failed\n");
			throw e;

		}

	}
	
	public void ClickpaywithCC() 
	{
		try

		{
			ExplicityWaitIsClickable(paywithCC);

		}catch(Exception e){


			System.err.println("\nError : ClickpaywithCC failed\n");
			throw e;

		}
		WaitElementDisplay(CardNaumber);
		Assert.assertTrue(ElementDisplay(CardNaumber));
	}
	public void MyBookingDisplay() 
	{
		try 
		{		
			ExplicityWaitIsDisplayed(stylist);				
		}

		catch(Exception e){


			System.err.println("\nError : MyBookingDisplay failed\n");
			throw e;

		}

	}
	
	public void ClickComplateBooking() 
	{
		try

		{
			ExplicityWaitIsClickable(complatebooking);

		}catch(Exception e){


			System.err.println("\nError : ClickComplateBooking failed\n");
			throw e;

		}
		WaitElementDisplay(letsgo);
		Assert.assertTrue(ElementDisplay(letsgo));
	}
	public void ClickComplateBookingmajor() 
	{
		try

		{
			ExplicityWaitIsClickable(complatebookingmajor);

		}catch(Exception e){


			System.err.println("\nError : ClickComplateBookingmajor failed\n");
			throw e;

		}
		WaitElementDisplay(letsgo);
		Assert.assertTrue(ElementDisplay(letsgo));
	}
	public void ClickPaymentButton() 
	{
		try

		{
			ExplicityWaitIsClickable(paymentbutton);

		}catch(Exception e){


			System.err.println("\nError : ClickPaymentButton failed\n");
			throw e;

		}

	}
	public void Clickonfirm() 
	{
		try

		{
			ExplicityWaitIsClickable(confirm);

		}catch(Exception e){


			System.err.println("\nError : Clickonfirm failed\n");
			throw e;

		}

	}
	public void ClickaddCC() 
	{
		try

		{
			ExplicityWaitIsClickable(addCC);

		}catch(Exception e){


			System.err.println("\nError : ClickaddCC failed\n");
			throw e;

		}

	}
	public void ClickaddCCcleanoot() 
	{
		try

		{
			ExplicityWaitIsClickable(addCCcleanoot);

		}catch(Exception e){


			System.err.println("\nError : ClickaddCCcleanoot failed\n");
			throw e;

		}

	}
	public void AssertTotalIs0() 
	{
		try

		{
			WaitElementDisplay(total_0);
			Assert.assertTrue(ElementDisplay(total_0));

		}catch(Exception e){


			System.err.println("\nError : AssertTotalIs0 failed\n");
			throw e;

		}

	}

	public void ClickPromoCode() 
	{
		try

		{
			ExplicityWaitIsClickable(promocode);

		}catch(Exception e){


			System.err.println("\nError : ClickPromoCode failed\n");
			throw e;

		}

	}
	public void FillPromoCode(String code) 
	{
		try

		{
			filltext(promocodeField,code);

		}catch(Exception e){


			System.err.println("\nError : FillPromoCode failed\n");
			throw e;

		}

	}
	public void ClickSubmitPromoCode() 
	{
		try

		{
			ExplicityWaitIsClickable(promocodesubmit);

		}catch(Exception e){


			System.err.println("\nError : ClickSubmitPromoCode failed\n");
			throw e;

		}

	}
	public void BookStylistProfile() 
	{
		try

		{
			Sleep(300);
			ExplicityWaitIsClickable(bookstylistprofile);

		}catch(Exception e){


			System.err.println("\nError : BookStylistProfile failed\n");
			throw e;

		}

	}

	public void ClickStylistHeader() 
	{
		try

		{
			ExplicityWaitIsClickable(stylist);

		}catch(Exception e){


			System.err.println("\nError : ClickStylistHeader failed\n");
			throw e;

		}

	}

	public void ClickMIniPlan() 
	{
		try

		{
			scrollDown();
			ExplicityWaitIsClickable(MIniPlan);

		}catch(Exception e){


			System.err.println("\nError : ClickMIniPlan failed\n");
			throw e;

		}
		WaitElementDisplay(minipackage);
		Assert.assertTrue(ElementDisplay(minipackage));

	}

	public void QuizPresent() 
	{
		try

		{
			Assert.assertTrue(ElementDisplay(quizheader));

		}catch(Exception e){


			System.err.println("\nError : QuizPresent failed\n");
			throw e;

		}

	}

	public void ClickMajorPlan() 
	{
		try

		{
			scrollDown();
			ExplicityWaitIsClickable(MajorPlan);

		}catch(Exception e){


			System.err.println("\nError : ClickMajorPlan failed\n");
			throw e;

		}
		WaitElementDisplay(majorpackage);
		Assert.assertTrue(ElementDisplay(majorpackage));

	}
	public void ClickMajorPlanOfCleanOut() 
	{
		try

		{
			scrollDown();
			ExplicityWaitIsClickable(MajorPlanOfCleanOut);

		}catch(Exception e){


			System.err.println("\nError : ClickMajorPlanOfCleanOut failed\n");
			throw e;

		}
		WaitElementDisplay(cleanoutpackage);
		Assert.assertTrue(ElementDisplay(cleanoutpackage));

	}

	public void ClickMIniGoal() 
	{
		try

		{
			ExplicityWaitIsClickable(MIniGoal);

		}catch(Exception e){


			System.err.println("\nError : ClickMIniGoal failed\n");
			throw e;

		}
		WaitElementDisplay(minibest);
		Assert.assertTrue(ElementDisplay(minibest));

	}

	public void ClickMajorGoal() 
	{
		try

		{
			ExplicityWaitIsClickable(MajorGoal);

		}catch(Exception e){


			System.err.println("\nError : ClickMajorGoal failed\n");
			throw e;

		}
		WaitElementDisplay(majorbest);
		Assert.assertTrue(ElementDisplay(majorbest));

	}
	public void ClickCleanOutGoal() 
	{
		try

		{
			ExplicityWaitIsClickable(cleanoutGoal);

		}catch(Exception e){


			System.err.println("\nError : ClickCleanOutGoal failed\n");
			throw e;

		}
		WaitElementDisplay(majorbest);
		Assert.assertTrue(ElementDisplay(majorbest));

	}
	public void ClickBookStylisButton() 
	{
		try

		{
			ExplicityWaitIsClickable(BookStylisButton);

		}catch(Exception e){


			System.err.println("\nError : ClickMyBooking failed\n");
			throw e;

		}

	}
	public void ClickMyStyleSessions() 
	{
		try

		{
			ExplicityWaitIsClickable(MyStyleSessions);

		}catch(Exception e){


			System.err.println("\nError : ClickMyStyleSessions failed\n");

		}

	}

	public void ClickSubScription() 
	{
		try

		{
			//Sleep(300);
			ExplicityWaitIsClickable(Subscription);

		}catch(Exception e){


			System.err.println("\nError : ClickSubScription failed\n");

		}

	}
	public void ClickOneTime() 
	{
		try

		{
			Sleep(300);
			ExplicityWaitIsClickable(OneTime);
			Sleep(300);

		}catch(Exception e){


			System.err.println("\nError : ClickOneTime failed\n");

		}

	}
	public void ClickOneTimeMajor() 
	{
		try

		{
			Sleep(300);
			ExplicityWaitIsClickable(OneTimemajor);
			Sleep(300);

		}catch(Exception e){


			System.err.println("\nError : ClickOneTimeMajor failed\n");

		}

	}
	public void SearchStylist(String name,String lastname) 

	{  
		try

		{

			WaitElementDisplay(SearchBar);
			ExplicityWaitIsClickable(SearchBar);
			filltext(TextBar, name+" "+lastname);			
			List<AndroidElement> list = driver.findElements(By.cssSelector(".select__menu>div>div"));
			System.out.println(list.size());

			for(AndroidElement el: list) {
				if(el.getText().equalsIgnoreCase(name+" "+lastname)) {
					ExplicityWaitIsClickable(el);
					break;
				}
				System.out.println(el.getText());
			}


		}catch(Exception e){


			System.err.println("\nError : SearchStylist failed\n");

		}

	}
	public void MySessionDisplay() 
	{
		try 
		{
			for(int i = 0; i < 15; i++) 
			{
				if(ElementDisplay(channel))
				{
					break;
				}
				
				else if(!ElementDisplay(channel)) 
				{
					ExplicityWaitIsClickable(stylist);
					ExplicityWaitIsClickable(mySessions);
					Sleep(300);
					RefreshPage();
					
				}
					
			}
		}

		catch(Exception e){


			System.err.println("\nError : MySessionDisplay failed\n");
			throw e;

		}

	}
	/*
	public void UseCodCoopon(String promocod) 
	{ 
		try

		{
			//click(FirstNameCheckout);
			//ExplicityWaitIsClickable(By.xpath("//div//input[@class='no-border bgTransparent ng-pristine ng-valid ng-empty ng-touched']"));
			//driver.findElement(By.xpath("(//div//input[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty'])[1]")).click();
			//driver.findElement(By.xpath("//div//input[@class='no-border bgTransparent ng-pristine ng-valid ng-empty ng-touched']")).click();
			driver.findElement(By.xpath("//input[@id='coupon-element']")).click();
			driver.findElement(By.xpath("//input[@id='coupon-element']")).sendKeys(promocod);

			//filltext(PromoCode,promocod);
			Sleep(300);
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ENTER).perform();

		}catch(Exception e){


			System.out.println("\nError : UseCodCoopon failed\n");

		}

	}
	

	public void SelectStylist() 
	{	
		try

		{
			click(TitleOfStylist);
			Sleep(300);
			scrollDown();
			WaitElementDisplay(By.xpath("//div[@class='deal-btn ng-binding ng-scope']"));
			click(Next);


		}catch(Exception e){


			System.out.println("\nError : SelectStylist failed\n");

		}



	}
	*/
	/*

	public void SelectMini() 
	{
		try

		{
			WaitElementDisplay(By.xpath("//label[@for='miniRadio']"));
			click(Mini);
			WaitElementDisplay(By.xpath("//div[@class='big-box mini-top']//button[@class='get-your-style black-btn']"));
			click(StartedMini);
			WaitElementDisplay(By.xpath("//div[@class='payment-title ng-scope']"));

		}catch(Exception e){


			System.out.println("\nError : SelectMini failed\n");

		}

	}

	public void SelectMajor() 
	{	
		try

		{
			WaitElementDisplay(By.xpath("//label[@for='majorRadio']"));
			click(Major);	
			WaitElementDisplay(By.xpath("//div[@class='big-box major-top']//button[@class='get-your-style black-btn']"));
			click(StartedMajor);
			WaitElementDisplay(By.xpath("//div[@class='payment-title ng-scope']"));		 
		}catch(Exception e){


			System.out.println("\nError : SelectMajor failed\n");

		}

	}
	*/
	public void BookStylist() 
	{	
		try

		{
			ExplicityWaitIsClickable(SelectStylist);

		}catch(Exception e){


			System.out.println("\nError : BookStylist failed\n");

		}

	}
	public void CloseCheckout() 
	{		
		try

		{
			ExplicityWaitIsClickable(CloseBtnCheckout);

		}catch(Exception e){


			System.out.println("\nError : SelectSingle failed\n");

		}

	}

	public void ClickBookingstylist() 
	{
		try

		{
			ExplicityWaitIsClickable(BookStylist);		


		}catch(Exception e){


			System.out.println("\nError : ClickBookingstylist failed\n");

		}
	}	

	public void ClickGender() 
	{	
		try

		{
			click(Gender);	


		}catch(Exception e){


			System.out.println("\nError : ClickGender failed\n");

		}

	}
	public void Clickfemaile() 
	{		
		try

		{
			click(Femaile);	


		}catch(Exception e){


			System.out.println("\nError : Clickfemaile failed\n");

		}

	}
	public void ClickApplay() 
	{	
		try

		{
			click(Applay);


		}catch(Exception e){


			System.out.println("\nError : ClickApplay failed\n");

		}

	}
	/*
	public void ClickFinishCheckout() 
	{	
		try

		{
			WaitElementDisplay(By.xpath("//div//button[@class='payment_form_button space-8']"));
			Sleep(300);
			click(FinishCheckout);
			Sleep(300);


		}catch(Exception e){


			System.out.println("\nError : ClickFinishCheckout failed\n");

		}

	}
	*/

	public void SelectService() 
	{	
		try

		{
			Sleep(30);
			click(SelectService);
			Sleep(150);


		}catch(Exception e){


			System.out.println("\nError : SelectService failed\n");

		}


	}
	public void SelectUnlimited() 
	{	
		try

		{
			click(SelectUnlimited);


		}catch(Exception e){


			System.out.println("\nError : SelectUnlimited failed\n");

		}

	}
	public void ClickFirstName() 
	{	
		try

		{
			click(ClickApllay);


		}catch(Exception e){


			System.out.println("\nError : ClickFirstName failed\n");

		}

	}
	public void ClickLastName() 
	{	
		try

		{
			click(ClickApllay);


		}catch(Exception e){


			System.out.println("\nError : ClickLastName failed\n");

		}

	}
	public void ClickApllay() 
	{	
		try

		{
			click(ClickApllay);


		}catch(Exception e){


			System.out.println("\nError : ClickApllay failed\n");

		}
	}
	public void FillFirstName(String firstname)
	{
		try

		{
			filltext(FirstNameCheckout, firstname);


		}catch(Exception e){


			System.out.println("\nError : FillFirstName failed\n");

		}

	}
	public void FillLastName(String lastname)
	{
		try

		{
			filltext(LastNameCheckout, lastname);


		}catch(Exception e){


			System.out.println("\nError : FillLastName failed\n");

		}

	}
	public void FillCardNumber(String number)
	{
		try

		{
			Sleep(150);
			filltext(CardNaumber, number);


		}catch(Exception e){


			System.out.println("\nError : FillCardNumber failed\n");

		}

	}
	public void FillCardDate(String date )
	{
		try

		{
			Sleep(150);
			filltext(DateOfCard, date);


		}catch(Exception e){


			System.out.println("\nError : FillCardDate failed\n");

		}

	}
	public void FillCardCVC(String cvc)
	{
		try

		{
			Sleep(150);
			filltext(CVCCard, cvc);
			Sleep(50);
			switchWindow();
			ExplicityWaitIsClickable(confirm);
			//ExplicityWaitIsDisplayed(complatebooking);



		}catch(Exception e){


			System.out.println("\nError : FillCardCVC failed\n");

		}


	}
	public void ClickTakeYourStyleQuiz() 
	{
		try

		{
			Sleep(300);
			click(TakeYourStyleQuiz);


		}catch(Exception e){


			System.out.println("\nError : ClickTakeYourStyleQuiz failed\n");

		}

	}
	public void ClickPayButton() 
	{
		try

		{
			click(PayButton);


		}catch(Exception e){


			System.out.println("\nError : ClickPayButton failed\n");

		}


	}
}
