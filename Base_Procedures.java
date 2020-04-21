package com.sppcloud.generic;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class Base_Procedures implements Autoconstants
{
	public static WebDriver driver ;
	
	static
	{
		System.setProperty(chrome_key, chrome_value);
		System.setProperty(gecko_key, gecko_value);
		
	}
	 @BeforeMethod
	 public void preconditions() throws Exception
	 
	 {
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 String url = Excel_data.getdata(0, 2, 0);
		 driver.get(url);
		 
	 }
	  @AfterMethod
	  public void postconditions()
	  {
		
		driver.quit();
		  
	  }
	  

}
