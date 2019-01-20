import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.name("fromPlaceName")).sendKeys("BENG");
		
		driver.findElement(By.name("fromPlaceName")).sendKeys(Keys.DOWN);
		//No output as it is hidden
		System.out.println(driver.findElement(By.name("fromPlaceName")).getText());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById('fromPlaceName').value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);

		int i =0;
		
		while(!text.equalsIgnoreCase("bengaluru internation aiport")) {
			
			i++;
			
			driver.findElement(By.name("fromPlaceName")).sendKeys(Keys.DOWN);
		    text = (String) js.executeScript(script);
			System.out.println(text);
			
			if(i>5) {
				
				System.out.println("Element not found");
				break;
			}
			
		}
	}

}
