package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

public class test2 extends base{
	public static Logger log = LogManager.getLogger(base.class.getName());
	@Test
	public void ValidateAddress() throws IOException, InterruptedException {
		
		driver = InitializeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		
		LandingPage l = new LandingPage(driver);
		l.getDest().sendKeys("Chennai");                      //Enter Destination
		l.getSearch().click();                                //Search for destination 
		
		Assert.assertTrue(l.getAddress().getText().contains("chennai"));  //Verify whether it contains the city name we have tried to search
		log.info("City name is present in the address!");
		
}
}
