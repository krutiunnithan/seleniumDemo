import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		System.out.println(driver.findElement(By.xpath("//*[@value='Milk']")).isSelected());
		driver.findElement(By.xpath("//*[@value='Milk']")).click();								//clicks on Milk radiobutton
		
		//NOTE: fineElements is used as count is plural and size is used
		System.out.println("Count is " +driver.findElements(By.name("group1")).size());			//outputs the count of radiobuttons
																								//in section 1 
		int count = driver.findElements(By.name("group1")).size();								//stored the count in a variable
		
		//click on radiobuttons 1 by 1 w/o using its attributes(not really!). we use index for looping
		for (int i = 0; i < count; i++) {
		
			driver.findElements(By.name("group1")).get(i).click();								//loops through 3 radiobuttons 1 by 1
			
			String name = driver.findElements(By.name("group1")).get(i).getAttribute("value");  //extracts value attribute ka value
			if (name.equalsIgnoreCase("cheese")) {												//if the extracted value is cheese...
				
				driver.findElements(By.name("group1")).get(i).click();							//...go and click on cheese
				
			}
			
		}
		
   }

}
