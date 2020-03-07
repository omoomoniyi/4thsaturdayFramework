package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class konga extends TestBase {
	
@Test
public void validlogin () throws InterruptedException {
	//click on login button
	click("Loginbtn_XPATH");
			//To enter email
	driver.findElement(By.name(OR.getProperty("Email_NAME"))).sendKeys(OR.getProperty("Email_TEXT"));
			
			//To enter password
	driver.findElement(By.id(OR.getProperty("Password_ID"))).sendKeys(OR.getProperty("Password_TEXT"));
			
			//To click login button
	driver.findElement(By.xpath(OR.getProperty("Loginbutton_XPATH"))).click();
	
//searchbox
	driver.findElement(By.xpath(OR.getProperty("Search_XPATH"))).sendKeys(OR.getProperty("Search_TEXT"));
	//searchbutton
	driver.findElement(By.xpath(OR.getProperty("Searchbtn_XPATH"))).click();

	Thread.sleep(5000);
	
}
	
}
