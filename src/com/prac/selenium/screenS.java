package com.prac.selenium;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenS {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\JavaPractice\\Selenium\\Soft\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.divorceematrimony.com/pune-matrimony");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[@class='clrgray popclose popupclose']")).click();
		TakesScreenshot tc=(TakesScreenshot) driver;
		File src = tc.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\JavaPractice\\Selenium\\ScreenShot\\castt.jpg");
		FileHandler.copy(src, dest);
		Thread.sleep(2000);
		driver.close();

	}

}
