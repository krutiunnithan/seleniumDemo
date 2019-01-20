import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

 public static void main(String[] args) throws InterruptedException {
		
  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
		
  driver.get("http://www.qaclickacademy.com/interview.php");
  
  //parent - child traversal .. clicks on Appium tab
  driver.findElement(By.xpath("//ul[@role='tablist']/li[1]")).click();            
  
  //following sibling traversal .. from SOAP UI to Testing tab
  driver.findElement(By.xpath("//li[@id='tablist1-tab3']/following-sibling::li[1]")).click();	
  
  //child - parent traversal .. from SOAP UI to Selenium tab
  driver.findElement(By.xpath("//li[@id='tablist1-tab3']/parent::ul")).click(); 

 }
}
