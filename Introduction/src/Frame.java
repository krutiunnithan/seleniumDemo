import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		//Total frames in web page
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//Identifying frame with webelement
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("draggable")).click();
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(source, target).build().perform();
		
		//Identifying frame with index
		driver.switchTo().frame(0);
		
		//Switching out of frame onto webpage
		driver.switchTo().defaultContent();
		
	}

}
