import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable_selection {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "http://www.citi.com";
		driver.get(url);
		String filename = ".\\screenshot\\screenshot1.png";
		//convert webdriver object to take screenshot
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		//getScreenshotAs to create image file
		File srcfile = scrshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File (filename);
		FileUtils.copyFile(srcfile, destFile);
		System.out.println("Done");
		driver.close();
		driver.quit();
		
		
		

	}

}
