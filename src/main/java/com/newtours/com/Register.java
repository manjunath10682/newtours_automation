package com.newtours.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver_win32_79\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.newtours.demoaut.com/");
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Manju");
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("MT");
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Manjunath@test.com");
		
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Test1");
		
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Test2");
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Bengaluru");
		
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Karnataka");
		
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("560071");
		
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("560071");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("manju123");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@name='register']")).click();
		
		Thread.sleep(6000);
		
		driver.close();
		
		System.out.println("Registration is successful!");
		

	}

}
