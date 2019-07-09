import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surabia\\Desktop\\Java Learning\\Ex_Files_Selenium_EssT\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/autocomplete");
		
		WebElement address = driver.findElement(By.id("autocomplete"));
		address.sendKeys("1555 Park Blvd, Palo Alto, CA, USA");
		address.click();
		
		WebElement autoComplete = driver.findElement(By.className("pac-container"));
		autoComplete.click();
		driver.quit();
		
	}

}
