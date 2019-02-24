import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDownButton {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\surabia\\Desktop\\Java Learning\\Ex_Files_Selenium_EssT\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/dropdown");
		
		WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
		dropdown.click();
		Thread.sleep(2000);
		
		WebElement selectCheckbox = driver.findElement(By.cssSelector("div#dropdown-menu show a"));
		selectCheckbox.click();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
