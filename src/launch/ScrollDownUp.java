package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\330\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");

		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement down = driver.findElement(By.xpath("//a[text()='Katalon']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(3000);
				
		WebElement up = driver.findElement(By.xpath("//div[text()='SUBSCRIBE TO NEWSLETTER']"));
		
		js.executeScript("arguments[0].scrollIntoView(false)", up);
		
		Thread.sleep(3000);
		
			
	}

}
