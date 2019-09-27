package launch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\330\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		
	driver.get("https://www.guru99.com/take-screenshot-selenium-webdriver.html");
	
	driver.manage().window().maximize();
	
	TakesScreenshot tk = (TakesScreenshot) driver;
	
	File src = tk.getScreenshotAs(OutputType.FILE);
	
	File dec = new File("F:\\selenium_books\\Screenshot\\guru.png");
	
	FileUtils.copyFile(src, dec);
	
	
	}

}
