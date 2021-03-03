package com.techbee.seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kaur_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize(); 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("Bose Headphones");
		WebElement SearchIcon = driver.findElement(By.className("nav-search-submit-button"));
		SearchIcon.click();
		WebElement CheckBox = driver.findElement(By.className("a-icon a-icon-checkbox"));
		CheckBox.click();
		js.executeScript("window.scrollBy(0,4000)");
		driver.quit();
	}

}

