import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class TestFirstSeleniumProg {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surabia\\Desktop\\Java Learning\\Ex_Files_Selenium_EssT\\libs\\chromedriver.exe");
		
		//creates new instance of chromeDriver
		WebDriver driver = new ChromeDriver();
		
		//use this to visit google
		driver.get("http://www.google.com");
		
		//find the text element by its name
		WebElement element = driver.findElement(By.name("q"));
		
		//enter something to search for
		element.sendKeys("Cheese");
		
		//quits the browser
		driver.quit();
	}
	

}
