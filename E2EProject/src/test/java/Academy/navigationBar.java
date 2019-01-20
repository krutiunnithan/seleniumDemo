package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import resources.base;

public class navigationBar extends base {
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = browserSelection();					//catching the driver returned by base class
		driver.get(prop.getProperty("url"));
		
	}

	
	@Test
	public void bar() throws IOException {
		
		
		
		
		landingPage lp = new landingPage(driver);
		
		Assert.assertTrue(lp.barPresent().isDisplayed());			//Using Assertion
		
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver = null;
	}

}
