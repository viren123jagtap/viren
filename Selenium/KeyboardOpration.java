package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOpration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Virendra Jagtap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver dr=new ChromeDriver();
		 
		dr.get("https://online.actitime.com/smali/login.do");
		dr.manage().window().maximize();
		WebElement wb=dr.findElement(By.name("username"));
		wb.sendKeys("sudarshanmali703@gmail.com");
		wb.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(3000);
		wb.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(3000);
		wb.sendKeys(Keys.TAB);
		wb.click();
		Thread.sleep(3000);
		wb.sendKeys(Keys.CONTROL,"v");
		
	}
}
