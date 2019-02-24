import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageObject {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\surabia\\Desktop\\Java Learning\\Ex_Files_Selenium_EssT\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/form");
		
		submitForm(driver);
	
		waitForAlertBanner(driver);
		
		assertEquals("The form was successfully submitted!",getAlertBannerText(driver));
		
		driver.quit();
	}

	private static void waitForAlertBanner(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));	
	}
	
	public static String getAlertBannerText(WebDriver driver) {
		return driver.findElement(By.className("alert")).getText();
	}
	
	private static void assertEquals(String string, String alertText) {
		
	}

	public static void submitForm(WebDriver driver) throws InterruptedException {
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

	}
}

