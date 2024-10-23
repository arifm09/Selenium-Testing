package webDriverMethods;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationalMethods {
   public static void main(String[] args) throws MalformedURLException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	URL myurl = new URL("https://demo.opencart.com/");
	
	driver.navigate().to(myurl);
	
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("//a[@href='https://demo.opencart.com/en-gb/catalog/tablet']")).click();
	
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().back();
	
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().forward();
	
	System.out.println(driver.getCurrentUrl());
    
	
	
}
}
