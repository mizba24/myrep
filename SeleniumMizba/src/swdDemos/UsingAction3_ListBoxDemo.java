package swdDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingAction3_ListBoxDemo {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\BrowserDrivers108\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
	driver.switchTo().frame(0);
	WebElement lstBox=driver.findElement(By.id("selectable"));
	List<WebElement> items=lstBox.findElements(By.tagName("li"));
	Actions a=new Actions(driver);
	a.keyDown(Keys.CONTROL).click(items.get(0)).click(items.get(3)).click(items.get(4)).perform();
	}
	

}
