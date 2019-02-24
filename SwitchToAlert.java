import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\surabia\\Desktop\\Java Learning\\Ex_Files_Selenium_EssT\\libs\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://formy-project.herokuapp.com/switch-window");
			
			WebElement alertButton = driver.findElement(By.id("alert-button"));
			alertButton.click();
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
			
			driver.quit();
	}

}
