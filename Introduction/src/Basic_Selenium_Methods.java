import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Selenium_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("The title of this page is :");
		System.out.println(driver.getTitle());
		//To check if site is hacked use below method
		//If output is same as .get() then it is working well
		//Redirected to another site and thereby different output so it is hacked
		System.out.println("The current URL of this page is :");
		System.out.println(driver.getCurrentUrl());
		//Banking sites disable permission to view page source so use below method
		System.out.println("The page source of this page is :");
		System.out.println(driver.getPageSource());
		driver.get("https://in.yahoo.com/?p=us");
		driver.navigate().back(); //Will go back to previous url
		driver.navigate().forward(); //Will come back to next url
		//will close current browser window
		driver.close();
		//will close all browsers opened by selenium...used while dealing with child windows..
		//i.e. link within link within link
		driver.quit();
		
		
	}

}
