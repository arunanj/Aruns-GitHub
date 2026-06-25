package Day26;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExec_Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// Code for CAPTHA
		
		
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled"); // Evade detection
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.212 Safari/537.36");
		
		*/
		
		
		
		
		
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
				options.addArguments("--disable-blink-features=AutomationControlled");
				
		
		
		WebDriverManager.chromedriver().setup();
		//Thread.sleep(10000);
		WebDriver driver = new ChromeDriver(options);
		//Thread.sleep(10000);
		String url = "https://walmart.com/";
								
		driver.get(url);
		//Thread.sleep(3000);
		driver.manage().window().maximize();
		//Thread.sleep(4000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//By holdButtonLocator = By.cssSelector("div.press-and-hold-button");
		
		WebElement captcha = driver.findElement(By.xpath("//*[@id=\"px-captcha\"]"));
		
		
				Actions act = new Actions(driver);
				
				act.click(captcha);
				
				 act.clickAndHold(captcha);
	               act.pause(Duration.ofSeconds(6)); // Hold for 6 seconds
	               act.release(captcha);
	               act.perform();
	               
	               act.click(captcha);
	               act.clickAndHold(captcha);
	               act.pause(Duration.ofSeconds(6)); // Hold for 6 seconds
	               act.release(captcha);
	               act.perform();
	               Thread.sleep(11000);
	               act.sendKeys(Keys.ESCAPE).build().perform();
	               Thread.sleep(3000);
	               act.sendKeys(Keys.ESCAPE).build().perform();
	               Thread.sleep(3000);
	               act.sendKeys(Keys.ESCAPE).build().perform();
				
				//act.moveToElement(captcha).clickAndHold(captcha).build().perform();
				//Thread.sleep(12000);
				//act.release(captcha).perform();
				
				
				
				
		//WebElement signin_btn = driver.findElement(By.xpath("//div[@class ='b lh-copy h2 f5']"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//signin_btn.click();
		
		
				
		Thread.sleep(30000);
		//driver.close();
		//driver.quit(); 

	}

}
