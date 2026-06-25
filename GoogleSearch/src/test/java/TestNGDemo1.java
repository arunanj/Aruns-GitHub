import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo1 {

	@Test
	
	public void  search() throws InterruptedException {
		// TODO Auto-generated method stub
		String url = "http://google.com";
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get(url);
		Thread.sleep(10000);
		driver.manage().window().maximize();
		WebElement Adbutton = driver.findElement(By.xpath("//a[text()='Advertising']")) ;
		Adbutton.click();
		driver.close();
		driver.quit();
	}

}
