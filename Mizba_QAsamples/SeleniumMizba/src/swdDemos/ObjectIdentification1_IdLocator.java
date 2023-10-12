package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification1_IdLocator {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BrowserDrivers108\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://ebay.com");
		 WebElement txt=driver.findElement(By.id("gh-ac"));
		 txt.sendKeys("sony");
		 WebElement btn=driver.findElement(By.id("gh-btn"));
		 btn.click();

	}

}
