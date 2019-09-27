package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\330\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.onlinesbi.com/personal/sbi_home.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("login_click"));
	driver.navigate().to("https://www.google.com/");
	driver.navigate().back();
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	driver.quit();
	
	

	}

}
