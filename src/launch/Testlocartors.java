package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlocartors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\330\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		WebElement p=driver.findElement(By.id("email"));
		p.sendKeys("mahabubpashashaik@gmail.com");
		
		WebElement m=driver.findElement(By.id("pass"));
		m.sendKeys("pasha");
		
		WebElement log=driver.findElement(By.id("loginbutton"));
		
		log.click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
	}

}
