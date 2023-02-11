package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFrames3_parentFrameDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BrowserDrivers108\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file://C:\\Users\\amoham885\\frames\\main1.htm");
		 driver.switchTo().frame("f1");
		 driver.switchTo().frame("f2");
		 driver.findElement(By.id("txtUid")).sendKeys("admin");
		 driver.switchTo().parentFrame();
		 driver.findElement(By.id("txtPwd")).sendKeys("abc");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("btnSignIn")).click();
		 System.out.println("Logged in succesfully");
	}

}
