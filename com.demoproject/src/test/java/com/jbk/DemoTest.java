package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void test01(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); //browser open
			
		driver.get("file:///C:/Users/LOGITECH/Downloads/Offline%20Website/Offline%20Website/index.html");	
		driver.manage().window().maximize();	
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");// entering a text in to text box	
		driver.findElement(By.id("password")).sendKeys("123456");	
		driver.findElement(By.xpath("//button")).click();	
		/*System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //browser open
		driver.get("file:///C:/Users/LOGITECH/Downloads/Offline%20Website/Offline%20Website/index.html");
		WebElement username = driver.findElement(By.id("email")); // finding a webElement	
        username.sendKeys("kiran@gmail.com");// entering a text in to text box	
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("123456");	

		WebElement login= driver.findElement(By.xpath("//button"));	
		login.click();// to click a login button */
	}

}
