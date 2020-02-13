package com.newtours.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver_win32_79\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.newtours.demoaut.com/");
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("manju123");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Thread.sleep(5000);
		
		System.out.println("Login successful");
		
		driver.close();

	}

}
