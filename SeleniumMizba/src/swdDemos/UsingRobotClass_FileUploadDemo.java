package swdDemos;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingRobotClass_FileUploadDemo {

	public static void main(String[] args) throws Exception
	{

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\BrowserDrivers108\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://transfer.pcloud.com/");
		 driver.findElement(By.xpath("//*[@id='upload-form']/div/div[2]/div/div[1]/div[2]/a/span/span")).click();
		 StringSelection path=new StringSelection("C:\\Users\\amoham885\\eclipse-workspace\\login.html");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		 Thread.sleep(2000);
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
	}

}
