package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.landingPage;
import resources.base;

public class validateTitle extends base {

	@BeforeTest
	public void initialize() throws IOException {
		
		driver = browserSelection();					//catching the driver returned by base class
		driver.get(prop.getProperty("url"));
		
	}

	@Test
	public void titlevalidation () throws IOException {
		
		
		landingPage lp = new landingPage(driver);
		
		Assert.assertEquals("FEATURED COURSES", lp.titleRead().getText());         //Using assertion
		
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver = null;
	}
}
