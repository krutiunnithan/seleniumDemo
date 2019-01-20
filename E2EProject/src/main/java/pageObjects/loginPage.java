package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	public WebDriver driver;

	By username = By.id("user_email");
	By password = By.id("user_password");
	By submit = By.name("commit");
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement userName() {
		
		return driver.findElement(username);
		
	}
	
    public WebElement passWord() {
		
		return driver.findElement(password);
		
	}

    public WebElement subMit() {
	
	return driver.findElement(submit);
	
}
	
}
