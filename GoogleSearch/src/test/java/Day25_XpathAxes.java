import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day25_XpathAxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Code for CAPTHA
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		options.addArguments("--disable-blink-features=AutomationControlled");

		//

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		String url = "http://www.google.com";
		driver.get(url);
		Thread.sleep(5000);
		WebElement search_txt = driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']"));
		
		// search_txt.sendKeys("New movies" + Keys.ENTER);
		//search_txt.sendKeys("New movies");
		//WebElement search_key = driver.findElement(By.xpath("//span[@class='lTxWLe']"));
		//search_key.click();
		
		Actions act = new Actions(driver);
		act.moveToElement(search_txt).sendKeys("New movies").perform();
		//sendKeys("New movies")perform();
		

	}

}
