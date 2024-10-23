package webDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskManagerTesting {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://127.0.0.1:5500/index.html");
		
//		boolean isEnable = driver.findElement(By.xpath("//button[@id='addTask']")).isEnabled();
//		System.out.println(isEnable);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='addTask']")).click();
		
		driver.findElement(By.xpath("//div[@id='task 1']")).click();
		
		driver.findElement(By.xpath("//div[@id='task 1']")).sendKeys("finish ant and ivy");
		
	}

}
