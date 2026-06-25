package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FergusonHW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://www.ferguson.com/";
		driver.get(url);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		//WebElement searchlnk = driver.findElement(By.xpath("//input[@id=\"search-bar\"]/ancestor::div[@class='c-header__search search']"));
		//Actions act = new Actions(driver);
		//driver.findElement(By.xpath("//input[@id='search-bar']/parent::form[@role='search']/ancestor::div[@class='col hidden-sm-down']")).sendKeys("water softner");
		//act.moveToElement(searchlnk).sendKeys("water softner").perform();
		//driver
		//act.click();
		driver.findElement(By.cssSelector("#search-bar")).sendKeys("water softner");
		//System.out.println("Done");
		////*[@id='search-bar']/preceding::button[@type='reset']");
		WebElement srch_btn = driver.findElement(By.xpath("//*[name()='use' and @*[name()='xlink:href'='/on/demandware.static/...']]/ancestor::button[@data-di-id ='di-id-26b2224-cb6d1a31']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", srch_btn);
		Thread.sleep(5000);
		WebElement count =driver.findElement(By.xpath("//span[@data-search-results-count]/ancestor::div[@class='result-count']"));
		//WebElement count =driver.findElement(By.xpath("//span[@data-search-results-count='dynamic_prefix_']/ancestor::div[@class='result-count text-xs']"));
		String resultsText = count.getText();
		System.out.println("count is " + resultsText);
		
		jse.executeScript("window.scrollBy(0, 1000)");
		//srch_btn.click();
		driver.close();
		Thread.sleep(5000);
		driver.quit();
				
		
		
	}

}
