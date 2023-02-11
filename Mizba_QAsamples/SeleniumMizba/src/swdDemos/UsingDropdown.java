package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDropdown {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BrowserDrivers108\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		WebElement dd=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd);
		//s.selectByIndex(4);
		//s.selectByValue("267");
		s.selectByVisibleText("Books");
		driver.findElement(By.id("gh-ac")).sendKeys("Quran");
		driver.findElement(By.id("gh-btn")).click();

	}

}
