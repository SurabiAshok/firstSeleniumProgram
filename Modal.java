import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surabia\\Desktop\\Java Learning\\Ex_Files_Selenium_EssT\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/modal");
		
		WebElement modal = driver.findElement(By.id("modal-button"));
		modal.click();
		Thread.sleep(2000);
		
		WebElement closeButton = driver.findElement(By.id("close-button"));
		//closeButton.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", closeButton);
		
		driver.quit();
		
	}

}
