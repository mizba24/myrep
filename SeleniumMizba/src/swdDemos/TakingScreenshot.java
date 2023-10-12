package swdDemos;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshot {

	public static void main(String[] args) throws Exception
	{
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\BrowserDrivers108\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		File fsource=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dt=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
		File fdest=new File("C:\\Users\\amoham885\\eclipse-workspace\\Mizba_QAsamples\\SeleniumMizba\\screenshots\\errorpic_" + dt +".png");
	 FileHandler.copy(fsource,fdest);
	}

}
