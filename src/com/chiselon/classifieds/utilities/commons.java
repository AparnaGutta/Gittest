package com.chiselon.classifieds.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class commons 
{
 
	public WebDriver driver;
	
	@Test
	public void geturl(WebDriver driver,String url)
	{
		driver.get(url);
	}
	
	
}
