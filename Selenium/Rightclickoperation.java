package com.seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclickoperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Virendra Jagtap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		 
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		dr.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions act=new Actions(dr);
		act.contextClick(dr.findElement(By.xpath("//span[text()='right click me']"))).build().perform();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//span[text()='Paste']")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		
	}

}
