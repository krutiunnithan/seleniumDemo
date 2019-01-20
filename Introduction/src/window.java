import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	    System.out.println("Title of parent window : " +driver.getTitle());
	    
	    driver.findElement(By.linkText("Help")).click();
	    Set<String> ids = driver.getWindowHandles();
	    Iterator<String> id =  ids.iterator();
	    String parentid = id.next();
	    String childid = id.next();
	    driver.switchTo().window(childid);
	    System.out.println("Title of child window : " +driver.getTitle());
	    driver.close();
	    driver.switchTo().window(parentid);

	}

}
