import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\surabia\\Desktop\\Java Learning\\Ex_Files_Selenium_EssT\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/radiobutton");
		
		WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
		radiobutton1.click();
		Thread.sleep(2000);
		
		WebElement radiobutton2 = driver.findElement(By.cssSelector("input[value='option2']"));
		radiobutton2.click();
		Thread.sleep(2000);
		
		WebElement radiobutton3 = driver.findElement(By.cssSelector("input[value='option3']"));
		radiobutton3.click();
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
