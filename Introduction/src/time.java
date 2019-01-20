//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class time {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://alaskatrips.poweredbygps.com/");
		
		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.name("destination")).sendKeys("nyc");
		
		driver.findElement(By.name("destination")).sendKeys(Keys.TAB);					  //using sendKeys for keyboard function
		driver.findElement(By.name("destination")).sendKeys(Keys.TAB);
		driver.findElement(By.name("destination")).sendKeys(Keys.ENTER);
		
		WebElement element = driver.findElement(By.xpath("//a[@target='856934']"));       //storing the element to click in a variable              
		
		WebDriverWait w = new WebDriverWait(driver, 20);                                 //Class WebDriverWait(driver,time) is used
		w.until(ExpectedConditions.elementToBeClickable(element)).click();               //passing that variable here
	
		
		
	}

}
