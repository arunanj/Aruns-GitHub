package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium2 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		options.addArguments("--disable-blink-features=AutomationControlled");
		
		
		
		String URL = "http://www.google.com";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get(URL);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@class = 'recaptcha-checkbox-border']")).click();
		//Thread.sleep(8000);
		driver.findElement(By.xpath("//textarea[@jsname = 'yZiJbe']")).sendKeys("Harry potter Movies" + Keys.ENTER);
		//driver.findElement(By.xpath("//div[@class = 'recaptcha-checkbox-border']")).click();
		Thread.sleep(10000);
		driver.close();
		driver.quit();

	}

}
