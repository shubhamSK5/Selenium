package com.prac.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","F:\\JavaPractice\\Selenium\\Soft\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/frames");
			driver.manage().window().maximize();
			Thread.sleep(1500);
			driver.switchTo().frame("frame1");
			Thread.sleep(1500);
			String pfrm = driver.findElement(By.xpath("//iframe[@width='500px']")).getText();
			System.out.println(pfrm);
			
			
			driver.close();

	}

}
