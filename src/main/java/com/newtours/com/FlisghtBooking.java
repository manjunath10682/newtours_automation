package com.newtours.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlisghtBooking {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver_win32_79\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.newtours.demoaut.com/");
		
		driver.findElement(By.xpath("//a[text()='Flights")).click();
		
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("TestMember1");
		
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		
		System.out.println("Flight booking is successful");
		
		driver.close();

	}

}
