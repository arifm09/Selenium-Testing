package Amazon_Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26hvadid%3D714703472859%26hvdev%3Dc%26hvlocphy%3D9075215%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D1815860062582350848%26hvtargid%3Dkwd-294882733100%26hydadcr%3D24542_2401825%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&prevRID=VFHEV9JQGYM5K2FQEEK2&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		
//		driver.findElement(By.id("ap_customer_name")).sendKeys("Mohd Arif");
		
		
//	driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Mohd Arif");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Mohd Arif");
		
		
		
	driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]")).sendKeys("8375832764");
	
	driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("mohd1234");
	
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		

				
		
		
		
		
	}

}
