package com.kitanacademy_25_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTestcases {

	@Test
	public void checkTitle()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	
		String titleact= driver.getTitle();
		String titleexpt="";
		
		Assert.assertEquals(titleact, titleexpt);
	}
	
	
}
