package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.base;

public class HomePage extends base {
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = browserSelection();					//catching the driver returned by base class
		
		
	}

	@Test (dataProvider = "getData")
	public void invokeBrowser(String user, String pswd, String text) throws IOException {
		
		driver.get(prop.getProperty("url"));
		
		landingPage lp = new landingPage(driver);       
		lp.loginButton().click();
		
		loginPage l = new loginPage(driver);
		l.userName().sendKeys(user);
		l.passWord().sendKeys(pswd);
		System.out.println(text);
		l.subMit().click();
		
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver = null;
	}
	
	
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[2][3];
		data[0][0] = "RestrictedUser@gmail.com"; 
		data[0][1] = "123";
		data[0][2] = "Login trial for Restricted User";
		
		data[1][0] = "NonRestrictedUser@gmail.com"; 
		data[1][1] = "123";
		data[1][2] = "Login trial for Non Restricted User";
		
		return data;
	}
	
	
}
