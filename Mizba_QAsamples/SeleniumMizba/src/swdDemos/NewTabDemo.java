package swdDemos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabDemo {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\BrowserDrivers108\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		String keyComb=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Daily Deals")).sendKeys(keyComb);
		
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.linkText("Fashion")).click();
	}

}
