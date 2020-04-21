package com.sppcloud.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sppcloud.pages.CompanyPage;
import com.sppcloud.pages.Loginpage;

public class CompanyUpdation 
{
	@BeforeMethod
	@Test
	

	public void method1() throws Exception 
	{
		
		Loginpage lp = new Loginpage();
		CompanyPage cp = new CompanyPage();
		
		lp.enterUsername("superuser");
		lp.enterPassword("default@123456");
		lp.clickOnSignin();
		
		cp.companyDetails();
		
	}
	
	
}
