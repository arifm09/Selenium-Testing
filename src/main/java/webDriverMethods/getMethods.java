
package webDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getMethods {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 WebDriverWait myDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 
//		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 

		 
//		 System.out.println(driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed());
		 
//		 boolean isUsernameEnable = driver.findElement(By.xpath("//input[@name='username']")).isEnabled();
		 
//		 WebElement userNameElement =  myDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
//		  userNameElement.sendKeys("admin");
//		 System.out.println(isUsernameEnable);
		 
		 
		 
//		 driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
//		 
//		WebElement male_rdElement = driver.findElement(By.xpath("//input[@id='gender-male']"));
//		male_rdElement.click();
//		 
//		 
//		 boolean isSelected = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
//		 
//		 System.out.println(isSelected);
		 
		 
		 
	}

}
