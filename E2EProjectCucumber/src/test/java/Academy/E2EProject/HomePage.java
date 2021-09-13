package Academy.E2EProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends base{
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void ValidateBrand() throws IOException, InterruptedException {
		
		driver = InitializeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		
		LandingPage l = new LandingPage(driver);
		l.getBrand().click();                       //Click on "Our Brands"
		
		Assert.assertTrue(l.getJw().isDisplayed()); //Verify whether JW Marriott is listed in the list 
	     
		log.info("JW Marriott is there in the list");
		
	}
	
}
