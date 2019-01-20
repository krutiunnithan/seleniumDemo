import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://tizag.com/javascriptT/javascriptalert.php");
		
		driver.findElement(By.xpath("//*[@value='Confirmation Alert']")).click();		//opens alert box
		
		System.out.println("Alert says " +driver.switchTo().alert().getText());         //outputs the message displayed on an alert
		
		driver.switchTo().alert().accept();                         					//clicks on OK i.e accept
		
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		
		driver.findElement(By.xpath("//*[@value='Say my name!']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("kruti");									//sends input to an alert
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();											//click on cancel i.e dismiss
		
	}

}
