package ChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;

public class LauchApplication {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\surabia\\Desktop\\Java Learning\\Ex_Files_Selenium_EssT\\libs\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.google.com");
	}

}