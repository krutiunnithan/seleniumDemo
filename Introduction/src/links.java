import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		//Link count of entire webpage
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println("Total number of links in a webpage is " +links);
		
		//Limiting or narrowing down the scope of driver to footer section of a page and Link count of only footer section of webpage
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		int footerLinks = footer.findElements(By.tagName("a")).size();
		System.out.println("Total number of links in a footer section of a webpage is " +footerLinks);
		
		//Limiting or narrowing down the scope of driver to first column of a footer section of a page and Link count of only first column section of webpage
		WebElement column = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td"));
		int columnLinks = column.findElements(By.tagName("a")).size();
		System.out.println("Total number of links in a column section (within footer) of a webpage is " +columnLinks);
		
		//clicking on 4 links 1 by 1 to open in separate tabs 
		for(int i = 1; i < columnLinks ; i++) {
			
			column.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			
		}
		
		//Extracting their page titles 
		
		System.out.println("Page titles : ");
	    Set<String> ids = driver.getWindowHandles();
	    Iterator<String> id = ids.iterator();
		
	    while(id.hasNext()) {
	    	
	    	driver.switchTo().window(id.next());
	    	System.out.println(driver.getTitle());
	    	
	    }
	    
		
	}

}
