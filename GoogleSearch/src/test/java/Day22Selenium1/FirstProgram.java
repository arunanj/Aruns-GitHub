package Day22Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
			

				
				
				
				
				
				
				
				
				
				
				
				
				
			
		
	}

}
