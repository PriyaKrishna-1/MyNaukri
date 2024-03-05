package com.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static WebDriver driver;

	public static void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
	}

	public void login(String Email, String Password) {
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("//div[@class=\"form-row\"]/input[@type=\"text\"])"));
		driver.findElement(By.xpath("//div[@class=\"form-row\"]/input[@type=\"password\"]"));
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        System.out.println(driver.getTitle());
        

	}

}
