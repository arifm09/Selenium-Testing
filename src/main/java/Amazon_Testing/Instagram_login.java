package Amazon_Testing;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Instagram_login {
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
		
        driver.get("https://www.instagram.com/accounts/login/");
        
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("noob_boy_arif");
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("localhost");
            
//        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        	Thread.sleep(10);
//            
//           WebElement loginElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
//           loginElement.click();
            
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            
         
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            try {
                WebElement inboxLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/direct/inbox/']")));
                inboxLink.click();
            } catch (StaleElementReferenceException e) {
                // If the element becomes stale, re-locate it and try again
                WebElement inboxLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/direct/inbox/']")));
                inboxLink.click();
            }

            


				
		
		
		
		
	}

}
