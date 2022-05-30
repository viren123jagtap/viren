package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement2 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Virendra Jagtap\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 
			WebDriver dr=new ChromeDriver();
		 
			dr.get("https://online.actitime.com/smali/login.do");
			boolean status=dr.findElement(By.xpath("//div[@class='atProductName']")).isDisplayed();
			System.out.println(status);
			boolean status1=dr.findElement(By.xpath("//div[@class='atLogoImg']")).isDisplayed();
			System.out.println(status1);
			WebElement wb=dr.findElement(By.id("keepLoggedInCheckBox"));
			wb.click();
			Thread.sleep(3000);
			boolean status2=wb.isSelected();
			System.out.println(status2);
			wb.click();
			boolean status3=wb.isSelected();
			System.out.println(status3);
			boolean status4=dr.findElement(By.id("loginButton")).isEnabled();
			System.out.println(status4);
			String tagname=dr.findElement(By.id("loginButton")).getTagName();
			System.out.println(tagname);
			dr.close();
	}

}

