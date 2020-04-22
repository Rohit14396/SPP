package com.sppcloud.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sppcloud.generic.Base_Procedures;

public class Loginpage 
{
	//declaration
	@FindBy(xpath="//*[@id=\"user_employee_id\"]")
	 WebElement untb;
	
	@FindBy(xpath="//*[@id=\"user_password\"]")
	 WebElement pwd;
	
	@FindBy(xpath="//*[@id=\"sign_in\"]")
	WebElement signinbtn;
	
WebDriver driver;

	public Loginpage()
	//initialization
		{
			PageFactory.initElements(driver, this);
		}
	// utilization
	public void enterUsername(String un)
		{
			untb.sendKeys(un);
		}

	public void enterPassword(String pw)
		{
			pwd.sendKeys(pw);
		}
	
	public void clickOnSignin() 
		{
			signinbtn.click();
		}
}

