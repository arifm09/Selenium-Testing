package com.opkey.WebDriver_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App 
{
    public static void main( String[] args ) throws InterruptedException {
    	WebDriver driver = new ChromeDriver();
    	

//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	
    	
    	
   
    	 
    	driver.get("https://demo.opencart.com/");
    	
    	WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	
    	 WebElement searcElement = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='search']")));
    	    searcElement.sendKeys("phone");
    	    
    	    WebElement ele = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='search']")));
    	    
    	    
    	
//    	String act_title = driver.getTitle();
//    	
//    	if(act_title.equals("Your Store")) {
//    		System.out.println("Test Passed");
//    	}
//    	else {
//    		System.out.println("Test Failed");
//    	}
    	
//    	driver.quit();
    	
//        driver.manage().window().maximize();
//        
    	Thread.sleep(1000);
//       driver.findElement(By.name("search")).sendKeys("iphone");
//    	driver.findElement(By.className("btn-light")).click();
//    	
//    	driver.findElement(By.linkText("Tablets")).click();
    	
//    	driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search'] ")).sendKeys("macbook");
//    	driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search'] ")).sendKeys("macbook");
    	
//    	driver.findElement(By.xpath("//*[text()='MacBook']")).click();
//        driver.findElement(By.xpath("//a[text()='MacBook']")).click();
//        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Iphone");

 
//         driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Iphone");
    	
//    	 System.out.println(driver.getTitle());
//    	 System.out.println(driver.getCurrentUrl());
//    	 
//    	 
//    	 System.out.println(driver.getWindowHandle());
    	
  	 driver.findElement(By.linkText("Tablets")).click();
//    	 
//    	 System.out.println(driver.getWindowHandles());
//    	 driver.close();
  	 
  	 
    	
    	  
    }
}
