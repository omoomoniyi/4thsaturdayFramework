package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class LoginTest extends TestBase {
	
	@Test(priority = 1)
	public void validLogin () throws InterruptedException {
		
		click("HomeLoginBtn_XPATH");
		Thread.sleep(2000);
		driver.findElement(By.id(OR.getProperty("Email_ID"))).sendKeys(OR.getProperty("Email_TEXT"));
		driver.findElement(By.id(OR.getProperty("password_ID"))).sendKeys(OR.getProperty("Password_TEXT"));		
		click("LoginBtn_XPATH");
		Thread.sleep(3000);
		System.out.println("Valid Login");
		//Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("Assert_XPATH"))), "Your Credential is Correct");
		log.debug("Log in successfully executed");
		//String text = driver.findElement(By.xpath("//div[contains(@class,'_71d30_2oCCX')]//div[1]//div[1]")).getText();
		//System.out.println(text);
		
		
	}
	
	@Test(priority = 2)
	public void invalidLogin () throws InterruptedException {
		
		click("HomeloginBtn_XPATH");
		Thread.sleep(2000);
		driver.findElement(By.id(OR.getProperty("email_ID"))).sendKeys(OR.getProperty("invalidEmail_TEXT"));
		driver.findElement(By.id(OR.getProperty("password_ID"))).sendKeys(OR.getProperty("password_TEXT"));		
		click("loginBtn_XPATH");
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[contains(@class,'_71d30_2oCCX')]//div[1]//div[1]")).getText();
		System.out.println(text);
		
		/*String expectedText = "Invalid Username or password";
		String actualText = "Invalid Username or password";
		
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Invalid login");
		//Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("Assert_XPATH"))), "Your Credential is not Correct");*/
		log.debug("Log in unsuccessfully executed");
	
	
	/*@Test
	public void invalidLogin () throws InterruptedException {
		
		click("HomeloginBtn_XPATH");
		Thread.sleep(2000);
		driver.findElement(By.id(OR.getProperty("email_ID"))).sendKeys(OR.getProperty("invalidEmail_TEXT"));
		driver.findElement(By.id(OR.getProperty("password_ID"))).sendKeys(OR.getProperty("password_TEXT"));		
		click("loginBtn_XPATH");
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(By.className(OR.getProperty("alert_CLASSNAME"))), "Your Credential is not Correct");
		log.debug("Log in successfully executed");*/

}
}

