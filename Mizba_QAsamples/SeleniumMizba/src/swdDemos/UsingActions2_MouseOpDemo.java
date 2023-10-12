package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingActions2_MouseOpDemo {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\BrowserDrivers108\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com");
		WebElement ddicon=driver.findElement(By.xpath("//*[@id='nav-link-accountList']/div"));
		Actions a=new Actions(driver);
		a.moveToElement(ddicon).perform();
		driver.findElement(By.xpath("//*[@id='nav_prefetch_yourorders']/span")).click();
	}

}
