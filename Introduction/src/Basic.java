import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");							//Hits the mentioned url in chrome browser as we are using chrome
		
		System.out.println("Title of the page is " +driver.getTitle());				  //Extracts and prints the title of page 
		
		System.out.println("Current URL of the page is " +driver.getCurrentUrl());	  //Extracts and prints the current url of page

		//System.out.println("Page source is " +driver.getPageSource());			  //Extracts and prints the source of page. Works fine
		
 		driver.navigate().back();   												  //Navigates back by a page     i.e. blank page
 		System.out.println("Current URL of the page is " +driver.getCurrentUrl());
 																						
		driver.navigate().forward();				    							  //Navigates forward by a page i.e. amazon page
		System.out.println("Current URL of the page is " +driver.getCurrentUrl());
		driver.close();																  //closes current open browser
		driver.quit();																  //closes all instances of open browser
	
	}

}
