package com.pageClass;

import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.BaseClass.BaseTest;

public class pagelist extends BaseTest {
	
	@Test
	public void popularcategories() {

		setup();
		WebElement PC = driver.findElement(By.xpath("//li/a/div[text()='Jobs']"));

//		To mouseover on jobs element
		Actions act = new Actions(driver);
		act.moveToElement(PC).build().perform();

//		Creating an arraylist with expected values
		List<String> expectedList = new ArrayList<>(Arrays.asList("Popular categories", "IT jobs", "Sales jobs",
				"Marketing jobs", "Data Science jobs", "HR jobs", "Engineering jobs"));

		List<WebElement> actualList = driver.findElements(By.xpath("//li/a/div[text()='Jobs']/../following-sibling::div/ul[1]/li"));
		
//		creating empty arraylist
		List<String> actualStringList = new ArrayList<String>();

//		getting the values to empty arraylist sing for loop
		for (WebElement we : actualList) {
			actualStringList.add(we.getText());
		}
		
		Assert.assertEquals(actualStringList, expectedList, "Assertion failed");

	
	 driver.findElement(By.xpath("//li/a/div[text()='Jobs']/../following-sibling::div/ul[1]/li[2]")).click();
	 
	  String parentWH=driver.getWindowHandle();
	  System.out.println(parentWH+driver.getTitle());
//	 driver.findElement(By.xpath("//div/a[@class=\"styles_footer__btn-txt__mELhK\"]")).click();
	 
	}
	

}
