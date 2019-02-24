package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\surabia\\Desktop\\Java Learning\\Ex_Files_Selenium_EssT\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/fileupload");
		
		WebElement chooseFile = driver.findElement(By.id("file-upload-field"));
		chooseFile.sendKeys("564.csv");
		Thread.sleep(2000);
		
		
		driver.quit();

	}

}
