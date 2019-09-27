package launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\330\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");

driver.manage().window().maximize();

String url= driver.getCurrentUrl();

System.out.println(url);
String title= driver.getTitle();

System.out.println(title);

Thread.sleep(5000);

driver.quit();
	}

	
}
