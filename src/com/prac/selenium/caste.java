package com.prac.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class caste {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\JavaPractice\\Selenium\\Soft\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.divorceematrimony.com/pune-matrimony");
		WebElement cast = driver.findElement(By.xpath("//*[@id=\"caste\"]")); // //span[@class='select2-dropdown select2-dropdown--below width_auto']/span/ul/li
		Select sc=new Select(cast);
		List<WebElement> opt = sc.getOptions();
		for(WebElement cs:opt)
		{
			System.out.println(cs.getText());
		}
		
	}

}
