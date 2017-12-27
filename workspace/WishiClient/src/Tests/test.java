package Tests;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import PageObjects.Page;

public class test extends BaseTest
{
	@Test(priority = 1,groups={"sanity-group"})
	public void test1() throws MalformedURLException 
	{
		Page page = new Page(driver);
		page.clickDatePicker();
	}
}
