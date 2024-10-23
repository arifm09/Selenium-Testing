package webDriverMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.ListModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
		
		Set<String> windowsId = driver.getWindowHandles();
		
//		List<String> ids = new ArrayList<>(windowsId);
//		
//		String parentId = ids.get(0);
//		String childId = ids.get(1);
//		
//		driver.switchTo().window(childId);
		
		// Approach 2 to find window
		
		for(String winId: windowsId) {
			String title = driver.switchTo().window(winId).getTitle();
			
			if(title.equals("OrangeHRM")) {
				driver.close();
			}
		}
		
	}

}
