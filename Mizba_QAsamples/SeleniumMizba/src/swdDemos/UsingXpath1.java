package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath1 {

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\BrowserDrivers108\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	// driver.get("http://ebay.com");
	 //driver.findElement(By.xpath("/html/body/header/table/tbody/tr/td[5]/form/table/tbody/tr/td[1]/div[1]/div/input[1]")).sendKeys("sony");
	 //driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
	 //driver.findElement(By.xpath("(//*[@class='s-item__title'])[5]")).click();
	 
	 driver.get("http://amazon.com");
	 driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("snowpants");
	 driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	 //Thread.sleep(3000);
	 driver.findElement(By.xpath("(//*[@class='a-size-base-plus a-color-base a-text-normal'])[5]")).click();
	}

}
