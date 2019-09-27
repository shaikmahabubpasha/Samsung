package launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FssLaunchbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\330\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.flipkart.com/?gclid=CjwKCAjwk93rBRBLEiwAcMapUUW6mxr-J-VoQIFzJ0fHvjF7zWIufxblZyoInEPefjal3JOZqM4g2hoCFbwQAvD_BwE&ef_id=CjwKCAjwk93rBRBLEiwAcMapUUW6mxr-J-VoQIFzJ0fHvjF7zWIufxblZyoInEPefjal3JOZqM4g2hoCFbwQAvD_BwE:G:s&s_kwcid=AL!739!3!326505318642!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
	
driver.manage().window().maximize();

String url=driver.getCurrentUrl();

System.out.println(url);

String title  =driver.getTitle();

System.out.println(title);

Thread.sleep(5000);

driver.quit();


	}

}
