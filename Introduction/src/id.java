import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Facebook - id, name, classname, linktext
	/*	driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("email address");
		driver.findElement(By.name("pass")).sendKeys("password");
		//driver.findElement(By.className("inputtext")).sendKeys("password");
		driver.findElement(By.linkText("Forgotten account?")).click();           */
		
		//Salesforce - id, name, linktext, xpath
	/*	driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("kruti");
		driver.findElement(By.name("pw")).sendKeys("123");
		//driver.findElement(By.linkText("Forgot Your Password?")).click();
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();             */
		
		//Salesforce - xpath and css
	/*	driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("kruti");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123");
		driver.findElement(By.cssSelector("input#Login.button.r4.wide.primary")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());   */
		
	/*	//Facebook - customized xpath - 2 ways
		driver.get("https://www.facebook.com/");
		
		//tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email");
		
		//*[@attribute='value']
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("1234");       */
		
	/*	//Salesforce - customized CSS - 5 ways
		driver.get("https://login.salesforce.com/?locale=in");
		
		//tagname[attribute='value']
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("kruti");
		
		//[attribute='value']
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("123");
		
		//tagname#id
		driver.findElement(By.cssSelector("input#Login")).click();
		
		driver.navigate().back();
		
		//#id
		driver.findElement(By.cssSelector("#Login")).click();
		
		
		//tagname.className
		//Take facebook as salesforce has space between className value       */
		
	/*	//rediff - Regex 
		driver.get("http://www.rediff.com/");
		
		// //tagname[contains(@attribute,'value')] - xpath regex
		driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
		
		//tagname[attribute*='value'] - css regex
		driver.findElement(By.cssSelector("input[id*='in1']")).sendKeys("hi");     */
		
		
		
		
	}

}
