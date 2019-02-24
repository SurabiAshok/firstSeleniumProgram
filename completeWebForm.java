import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class completeWebForm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surabia\\Desktop\\Java Learning\\Ex_Files_Selenium_EssT\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/form");
		
		WebElement firstName = driver.findElement(By.id("first-name"));
		firstName.sendKeys("Surabi");
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.id("last-name"));
		lastName.sendKeys("A");
		Thread.sleep(2000);
		
		WebElement jobTitle = driver.findElement(By.id("job-title"));
		jobTitle.sendKeys("BTA");
		Thread.sleep(2000);
		
		WebElement education = driver.findElement(By.cssSelector("input[value='radio-button-1']"));
		education.click();
		Thread.sleep(2000);
		
		WebElement sex = driver.findElement(By.id("checkbox-1"));
		Actions actions = new Actions(driver);
		actions.moveToElement(sex);
		sex.click();
		Thread.sleep(2000);
		
		WebElement YOE = driver.findElement(By.id("select-menu"));
		Actions actionss = new Actions(driver);
		actionss.moveToElement(YOE);
		YOE.sendKeys("0-1");
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.id("datepicker"));
		Actions action = new Actions(driver);
		action.moveToElement(date);
		YOE.sendKeys("02/20/1990");
		date.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.cssSelector("a.btn-primary"));
		submit.click();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
