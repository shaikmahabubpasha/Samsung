package launch;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumProject\\driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp?");
driver.findElement(By.id("fldLoginUserId")).sendKeys("Venus");

driver.findElement(By.id("fldPassword")).sendKeys("Venus@123");

driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();

String pWind= driver.getWindowHandle();
System.out.println(pWind);
Set<String> allWind= driver.getWindowHandles(); 

System.out.println(allWind);

for(String cWind:allWind) {
	
	if(!(cWind.equals(pWind))) {
		
		driver.switchTo().window(cWind);
	}
	
}

driver.findElement(By.name("fldSubmit")).click();
driver.quit();

	}

}


