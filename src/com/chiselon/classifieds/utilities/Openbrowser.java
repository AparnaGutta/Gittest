package com.chiselon.classifieds.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Openbrowser extends commons
{
   @Test
   public WebDriver openbrowser(String Browserskey){
	try
	{
		if(Browserskey.equalsIgnoreCase("chrome"))
		{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anusha\\workspace\\Test\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
		}else if(Browserskey.equalsIgnoreCase("firefox"))
		{
			
			driver=new FirefoxDriver();
			
		}else if(Browserskey.equalsIgnoreCase("internet explorer"))
		{
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println(Browserskey+" : is not a valid browser");
		}
		return driver;
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		return null;
	}
	
   }
	
}
