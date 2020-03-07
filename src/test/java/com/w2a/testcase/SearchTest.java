package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class SearchTest extends TestBase {
	
	@Test
	public void KongaSearch() throws InterruptedException {
		Thread.sleep(5000);
	
		//driver.findElement(By.id(OR.getProperty("searchBox_ID"))).sendKeys(OR.getProperty("SearchBoxKey"));
		click("searchBtn_XPATH");
		Thread.sleep(3000);
	}

}
