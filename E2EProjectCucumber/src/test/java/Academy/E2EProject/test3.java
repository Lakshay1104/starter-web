package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

public class test3 extends base{
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void ValidateText() throws IOException, InterruptedException {
		
		driver = InitializeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		
		LandingPage l = new LandingPage(driver);
		l.getBonvoy().click();            //Click on "About Marriott Bonvoy"
		l.getBenefits().click();          //Click on "Member Benefits"
		
		
		}
}

