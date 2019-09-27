package launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\330\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		
		for(WebElement tRows: rows) {
			List<WebElement> cells = tRows.findElements(By.tagName("td"));
			
			for(WebElement tCell :cells) {
			String t= tCell.getText();
			
				if(t.equals("Mecca	")) {
					System.out.println(t);
					
				}
			
			}
			
		}
		
		driver.quit();
		
	}
}
