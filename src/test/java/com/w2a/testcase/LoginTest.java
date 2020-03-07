package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class LoginTest extends TestBase {
	
	@Test(priority=1)
	public void kongaLogin () throws InterruptedException {
		Thread.sleep(7000);
		
		click("loginBtn_XPATH");

		Thread.sleep(2000);
	
		driver.findElement(By.id(OR.getProperty("email_ID"))).sendKeys(OR.getProperty("emailKeys"));
		driver.findElement(By.id(OR.getProperty("password_ID"))).sendKeys(OR.getProperty("passwordKey"));		
		Thread.sleep(7000);
		click("finalLogin_XPATH");
		
		Thread.sleep(3000);
		/*Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("assert_XPATH"))), "All Categories");
		log.debug("Log in successfully executed");
		
		Thread.sleep(3000);*/
	}
	@Test(priority = 2)
	public void invalidLogin() throws InterruptedException {
		Thread.sleep(5000);
		click ("loginBtn_XPATH");
		Thread.sleep(2000);
		
		driver.findElement(By.id(OR.getProperty("email_ID"))).sendKeys(OR.getProperty("emailKeys"));
		driver.findElement(By.id(OR.getProperty("password_ID"))).sendKeys(OR.getProperty("wpasswordKey"));		
		Thread.sleep(7000);
		click("finalLogin_XPATH");
		
		Thread.sleep(3000);
		
		
		
		
	
		
	}

}
