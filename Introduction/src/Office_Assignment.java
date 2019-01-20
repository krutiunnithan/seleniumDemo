import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Office_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.jetairways.com/EN/IN/home.aspx");
		//driver.switchTo().alert().dismiss();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@aria-controls='jp-login-panel']")).click();
		driver.findElement(By.xpath("//a[@class='privilege-promo form-section']")).click();
		
		driver.findElement(By.xpath("//label[@class='frm__radio-label']")).click();

		Select s = new Select(driver.findElement(By.id("MainBody_IWOVID_item_1_ddlsalutation")));
		s.selectByIndex(2);
		driver.findElement(By.id("MainBody_IWOVID_item_1_txtFname")).sendKeys("yo");
		driver.findElement(By.id("MainBody_IWOVID_item_1_txtMname")).sendKeys("Ramesh");
		driver.findElement(By.id("MainBody_IWOVID_item_1_txtLname")).sendKeys("Unnithan");
		
		Select s1 = new Select(driver.findElement(By.id("MainBody_IWOVID_item_1_ddlCOR")));
		s1.selectByVisibleText("India");
		
		driver.findElement(By.id("MainBody_IWOVID_item_1_txtDOB")).click();
	
		
		Select s2 = new Select(driver.findElement(By.className("ui-datepicker-year")));
		s2.selectByValue("1993");

		Select s3 = new Select(driver.findElement(By.className("ui-datepicker-month")));
		s3.selectByValue("4");
		
		driver.findElement(By.xpath("//a[text()='24']")).click();
		
		driver.findElement(By.id("MainBody_IWOVID_item_1_txtMobileNumber")).sendKeys("123");
		Select s4 = new Select (driver.findElement(By.id("MainBody_IWOVID_item_1_ddlCitizen")));
		s4.selectByValue("IN");
		
		driver.findElement(By.id("MainBody_IWOVID_item_1_txtEmailAddr")).sendKeys("hi@gmail.com");
		driver.findElement(By.id("MainBody_IWOVID_item_1_txtPassword")).sendKeys("password1!Z");
		driver.findElement(By.id("MainBody_IWOVID_item_1_txtRePassword")).sendKeys("password1!Z");
		
		//Image
		
		
		
		
		
		
		driver.findElement(By.id("MainBody_IWOVID_item_1_chkTermsAndCondition")).click();
		driver.findElement(By.id("MainBody_IWOVID_item_1_chkTermsOfGDPR")).click();
		driver.findElement(By.id("btnContinue")).click();
	
		
	}

}
