//import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class date {
 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		System.out.println("Before clicking on round trip, is return date enabled? ");
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {		//optical value under style for enable is 1
			System.out.println("enabled");
		} else {
			System.out.println("disabled");
		}
		
		driver.findElement(By.xpath("//*[@value='RoundTrip']")).click();
		
		System.out.println("After clicking on round trip, is return date enabled? ");

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("enabled");
		} else {
			System.out.println("disabled");
		}
		driver.close();
}
}