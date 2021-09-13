package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import Academy.E2EProject.base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class stepDefinition extends base {
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	
	 @Given("^Initialize webdriver$")                                     //REUSABLE DRIVER INITIALIZATION
	    public void initialize_webdriver() throws Throwable {
		 driver = InitializeDriver();
		 driver.manage().window().maximize();
	    }
	 @And("^open the Marriott website$")                                  //WEBSITE OPENING
	    public void open_the_marriott_website() throws Throwable {
		 driver.get(prop.getProperty("url"));
	    }
  
	 //TEST 1
	    @When("^You reach site click on Our brands$")
	    public void you_reach_site_click_on_our_brands() throws Throwable {
	    	LandingPage l = new LandingPage(driver);
			l.getBrand().click();                       //Click on "Our Brands"
	    }

	    @Then("^Verify if JW Marriott is there$")
	    public void verify_if_jw_marriott_is_there() throws Throwable {
	    	LandingPage l = new LandingPage(driver);
	    	Assert.assertTrue(l.getJw().isDisplayed()); //Verify whether JW Marriott is listed in the list 
	    	
			log.info("JW Marriott is there in the list");
	    }

	    
	    //TEST 2
	    
	   

	    @When("^You reach site search for city name \"([^\"]*)\" in destination field$")
	    public void you_reach_site_search_for_city_name_something_in_destination_field(String city) throws Throwable {
	    	LandingPage l = new LandingPage(driver);
	    	l.getDest().clear();
			l.getDest().sendKeys(city);                      //Enter Destination
			                 
	    }

	  
	    

	    @And("^Click on Search$")
	    public void click_on_search() throws Throwable {
	    	LandingPage l = new LandingPage(driver);
	    	l.getSearch().click();
	    }
	    @Then("^Verify if city name is there in first hotel address$")
	    public void verify_if_city_name_is_there_in_first_hotel_address() throws Throwable {
	    	LandingPage l = new LandingPage(driver);
	    	Assert.assertTrue(l.getAddress().getText().contains("Chennai"));  //Verify whether it contains the city name we have tried to search
			log.info("City name is present in the address!");
	    }

	   
   
	    //TEST 3
	    
	    @When("You reach site click on Marriott Bonvoy")
	    public void you_reach_site_click_on_marriott_bonvoy() {
	    	LandingPage l = new LandingPage(driver);
			l.getBonvoy().click();            //Click on "About Marriott Bonvoy"
	    }



	   
	    @And("^Click on Member Benefits$")
	    public void click_on_member_benefits() throws Throwable {
	    	LandingPage l = new LandingPage(driver);
			l.getBenefits().click();          //Click on "Member Benefits"
	    }
	    
	    @Then("^Verify if we have the text \"([^\"]*)\" in the benefits page$")
	    public void verify_if_we_have_the_text_something_in_the_benefits_page(String str) throws Throwable {
	    	LandingPage l = new LandingPage(driver);
	    	Assert.assertEquals(l.getTextword().getText(), str); //Verify whether text is there on the page
	    	log.info("Text is present on the page!");
	    }
  
    
}
