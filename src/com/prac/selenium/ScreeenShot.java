package com.prac.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreeenShot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\JavaPractice\\Selenium\\Soft\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		TakesScreenshot ss= (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File dest=new File("F:\\JavaPractice\\Selenium\\ScreenShot\\insta.jpg");
		FileHandler.copy(src, dest);
		
		driver.close();
		
	}


	}

