package com.chiselon.classifieds.Regression;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.chiselon.classifieds.utilities.Openbrowser;
import com.chiselon.classifieds.utilities.commons;

public class TC001 extends commons
{
	Openbrowser browser=new Openbrowser();
	
	@Parameters("Browsers")
	@BeforeMethod
	public WebDriver bm(String Browserskey)
	{
		
		driver=browser.openbrowser(Browserskey);
		return driver;
		
	}
	
	@Test
	public void method1()
	{
		geturl(driver, "http://www.google.co.in");	
	}
	
	/*@AfterMethod
	public void am()
	{
		driver.close();
	}*/
	
}
