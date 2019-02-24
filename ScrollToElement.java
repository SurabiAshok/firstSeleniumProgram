import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surabia\\Desktop\\Java Learning\\Ex_Files_Selenium_EssT\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/scroll");
		
		WebElement name = driver.findElement(By.id("name"));
		Actions actions = new Actions(driver);
		actions.moveToElement(name);
		Thread.sleep(2000);
		name.sendKeys("Surabi");
		
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("09/27/1993");
		Thread.sleep(2000);
		
		driver.quit();
	}

}
