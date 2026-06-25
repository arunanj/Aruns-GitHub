package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WalmartHold {
	
	 public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.get("WALMART_URL_WITH_CAPTCHA");

	        // 1. Locate the press-and-hold button (locator subject to change)
	        By holdButtonLocator = By.cssSelector("div.press-and-hold-button"); // Update selector
	        
	        // Use WebDriverWait to wait for the element to be visible
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement holdButton = wait.until(ExpectedConditions.visibilityOfElementLocated(holdButtonLocator));

	        // 2. Perform Click and Hold action
	        Actions actions = new Actions(driver);
	        actions.clickAndHold(holdButton)
	               .pause(Duration.ofSeconds(6)) // Hold for 6 seconds
	               .release(holdButton)
	               .perform();

	        driver.quit();
	    }

}
