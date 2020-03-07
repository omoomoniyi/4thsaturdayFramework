package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class AddToCart extends TestBase{
	//
	@Test
	public void addtocart() throws InterruptedException {
		Thread.sleep(5000);
		
		click("Folder_XPATH");
//Thread.sleep(2000);
//click("BuyNow_XPATH");
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("assert_XPATH"))), "All Categories");
		log.debug("Added to cart successfully");
		
		Thread.sleep(3000);
		
	}

}
