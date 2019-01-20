import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.name("travel_date")).click();
		
		String month = driver.findElement(By.className("datepicker-switch")).getText();
		
		while(!month.contains("April")) {
			
			driver.findElement(By.className("prev")).click();

			month = driver.findElement(By.className("datepicker-switch")).getText();
		}
		
		 
		
		for (int i = 0; i < driver.findElements(By.className("day")).size(); i++) {
			
			String day = driver.findElements(By.className("day")).get(i).getText();
			
			if (day.equals("23")) {
				
				driver.findElements(By.className("day")).get(i).click();
			}
			
		}
	}

}
