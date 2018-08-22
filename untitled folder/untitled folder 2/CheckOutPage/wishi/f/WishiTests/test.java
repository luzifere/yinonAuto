package WishiTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vali\\Downloads\\selenium\\chromdriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://stage.wishi.me/app/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='fb ng-binding ng-isolate-scope']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//div//input[@id='email']"));
		
	}

}
