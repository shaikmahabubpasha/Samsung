package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\330\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
	WebElement dropdown = driver.findElement(By.id("month"));
	
	Select sin = new Select(dropdown);
	
	sin.selectByIndex(3);
	
	Thread.sleep(5000);
	
	
	sin.selectByValue("10");
	
	Thread.sleep(5000);
	
	sin.selectByVisibleText("Dec");
	
	Thread.sleep(5000);
	
	
	
	}

}
