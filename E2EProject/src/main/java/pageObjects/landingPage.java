package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
    
	public WebDriver driver;
	
	By login = By.xpath("//a[contains(@href,'sign_in')]");
	By title = By.xpath("//*[@id='content']/div/div");
	By bar = By.xpath("//*[@id='homepage']/header/div[2]/div/nav/ul");
	
	public landingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement loginButton() {
		
		return driver.findElement(login);
		
	}
	
	public WebElement titleRead() {
		
		return driver.findElement(title);
		
	}
	
    public WebElement barPresent() {
		
		return driver.findElement(bar);
		
	}
	
}
