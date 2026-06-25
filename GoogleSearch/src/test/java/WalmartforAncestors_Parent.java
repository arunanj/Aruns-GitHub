import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WalmartforAncestors_Parent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		options.addArguments("--disable-blink-features=AutomationControlled");
		//
		WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments(args)
       
		/*options.addArguments("--disable-blink-features=AutomationControlled");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.212 Safari/537.36");
		*/
		
        WebDriver driver = new ChromeDriver(options);
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver(options);
		String url = "https://www.walmart.com/";
		driver.get(url);
		
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		act.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		act.sendKeys(Keys.ENTER);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Actions act = new Actions(driver);
		
		
		WebElement search1 = driver.findElement(By.xpath("//input [@aria-label='Search']"));
		act.moveToElement(search1).sendKeys("Easter eggs").perform();
		act.click();
		//search1.sendKeys("Easter eggs").perform();
		//act.click();		
		
		
	}

}
