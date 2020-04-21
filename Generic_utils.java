package com.sppcloud.generic;

import org.openqa.selenium.support.ui.Select;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic_utils 
{
	static WebDriver driver ;
	
	public static void selectIndex(WebElement ele,int index) 
	{
		Select sel = new Select(ele);
		sel.selectByIndex(index);
	}
	
	public static void selectText(WebElement ele , String text) 
	{
		Select sel = new Select(ele);
		sel.selectByVisibleText(text);
	}
	
	public static void selectValue(WebElement ele , String value) 
	{
		Select sel = new Select(ele);
		sel.selectByVisibleText(value);
	}
}
