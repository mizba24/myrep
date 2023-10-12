package swdDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingSync2_ExplicitWaitDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BrowserDrivers108\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://login.yahoo.com");
		 driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("mizba24@yahoo.com");
		 driver.findElement(By.id("login-signin")).click();
		 WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-passwd']")));
		 driver.findElement(By.id("login-passwd")).sendKeys("abc");

	}
}
