import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlyWaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surabia\\Desktop\\Java Learning\\Ex_Files_Selenium_EssT\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/keypress");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement name = driver.findElement(By.id("name"));
		name.click();
		name.sendKeys("Surabi");
		
		WebElement button = driver.findElement(By.id("button"));
		button.click();
		
		driver.quit();

	}

}
