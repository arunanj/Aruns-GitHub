import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQA_hw1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/";
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement Join = driver.findElement(By.xpath("//img[@class='banner-image']"));
		//Actions act = new Actions(driver);
		//driver.findElement(By.xpath("//img[@class='banner-image']")).click();
		//act.moveToElement(Join).perform();
		//Thread.sleep(3000);
		//act.click();
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='text' and text() ='Text Box']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Arun");
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("name2@gmail.com");
		driver.findElement(By.xpath("//textarea[@placeholder = 'Current Address']")).sendKeys("hahahhhsh\\naaaaaa\\nbbbb");
		driver.findElement(By.xpath("//textarea[@id = 'permanentAddress']")).sendKeys("hahahhhsh\naaaaaa\nbbbb");
		driver.findElement(By.xpath("//button[@id = 'submit']")).click();
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		//permanentAddress
		
		//placeholder="Current Address
		

	}

}
