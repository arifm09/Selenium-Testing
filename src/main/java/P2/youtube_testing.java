package P2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_testing {
   public static void main(String [] srgs) throws InterruptedException {
	   
		
			WebDriver driver=new ChromeDriver();

			driver.get("https://www.youtube.com/");
			Thread.sleep(1000);
			
//			driver.findElement(By.name("search_query")).sendKeys("selenium sdet");
			driver.findElement(By.xpath("//input[@name = 'search_query']")).sendKeys("sprin boot");
             Thread.sleep(3000);
             
			driver.findElement(By.id("search-icon-legacy")).click();
	  
	  
	   
		
   }
}
