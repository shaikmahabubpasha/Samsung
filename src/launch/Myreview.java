package launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myreview {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\330\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.redbus.in/?gclid=Cj0KCQjwt5zsBRD8ARIsAJfI4Bhucz9lmgp4Jh1CLuvRzFKgjQrqZ61vKJ05N_C-sfvnjso2jtczd_gaAh7-EALw_wcB");

		
		driver.manage().window().maximize();
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		String title= driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
