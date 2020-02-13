package com.newtours.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CruiseBooking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver_win32_79\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.newtours.demoaut.com/");
		
		driver.findElement(By.xpath("//a[text()='Cruises']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Reservations Open']")).click();
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("TestMember1");
		
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		
		System.out.println("Cruise booking is successful");
		
		driver.close();

	}

}
