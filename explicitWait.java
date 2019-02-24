import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surabia\\Desktop\\Java Learning\\Ex_Files_Selenium_EssT\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/keypress");
		
		WebElement name = driver.findElement(By.id("name"));
		name.click();
		name.sendKeys("Surabi");
		
		WebDriverWait wait = new WebDriverWait(driver,100);
		WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button")));
		
		//WebElement button = driver.findElement(By.id("button"));
		button.click();
		
		driver.quit();

	}

}
