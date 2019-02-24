import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\surabia\\Desktop\\Java Learning\\Ex_Files_Selenium_EssT\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/datepicker");
		
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.sendKeys("02/02/1991");
		datePicker.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		
		driver.quit();

	}

}
