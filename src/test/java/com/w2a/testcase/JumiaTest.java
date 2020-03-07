package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class JumiaTest extends TestBase{
	@Test
	public void ValidLogin() throws InterruptedException {
		
		//click login/signup
		driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div[3]/div[2]/a")).click();
		
		//login with google
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("bolajister@yahoo.com");
		
		
		
		//enter password
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Boy12345");
		
		driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(10000);

	}
	}
