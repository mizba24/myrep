package swdDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSync1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BrowserDrivers108\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://login.yahoo.com");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("mizba24@yahoo.com");
		 driver.findElement(By.id("login-signin")).click();
		 //driver.findElement(By.xpath("//*[@id='Stencil']/body")).click();
		 driver.findElement(By.id("login-passwd")).sendKeys("abc");
	}

}
