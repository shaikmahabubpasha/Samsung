package launch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\SeleniumProject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.fsstech.com/");
TakesScreenshot tk = (TakesScreenshot) driver;

File src = tk.getScreenshotAs(OutputType.FILE);
File dec = new File("F:\\selenium_books\\Screenshot\\Fss.png");

FileUtils.copyFile(src,dec);



	}



}
