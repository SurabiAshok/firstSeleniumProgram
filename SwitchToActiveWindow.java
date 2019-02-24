
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\surabia\\Desktop\\Java Learning\\Ex_Files_Selenium_EssT\\libs\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://formy-project.herokuapp.com/switch-window");
			
			String originalHandle = driver.getWindowHandle();
			
			for(String handle1: driver.getWindowHandles()) {
				driver.switchTo().window(handle1);
			}
			
			Thread.sleep(2000);
			driver.switchTo().window(originalHandle);
			Thread.sleep(2000);
			driver.quit();
	}

}
