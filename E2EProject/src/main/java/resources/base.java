package resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class base {
	
	public static WebDriver driver;
	public Properties prop;

	
	public WebDriver browserSelection() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Kruti\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if(browserName.equals("firefox")) {
			
			System.out.println("Code to initiate gecko driver");
			
		}
		
		else {
			
			System.out.println("Code to initiate IE driver");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}


	public void getScreenShot(String result) throws IOException {
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(src, new File("C://test//"+result+"screenshot.png"));
		
		
	}
	
	

}
