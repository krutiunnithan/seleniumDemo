import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.way2sms.com/");
		driver.findElement(By.id("mobileNo")).sendKeys("9640080958");
		driver.findElement(By.id("password")).sendKeys("idontknow");
		driver.findElement(By.xpath("//button[@onclick='return validLogin();']")).click();
		
		driver.findElement(By.id("mobile")).sendKeys("9063099949");
		driver.findElement(By.id("message")).sendKeys("This is an automated message via Selenium WebDriver by KRUTI :) ");
		driver.findElement(By.id("sendButton")).click();
		
		
	}

}
