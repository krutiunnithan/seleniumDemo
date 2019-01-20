import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://ksrtc.in/oprs-web/");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("beng");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		
		
		
	}

}
