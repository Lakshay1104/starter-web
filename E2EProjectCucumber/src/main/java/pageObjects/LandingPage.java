package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
   WebDriver driver;
	
	
	By brand = By.xpath("/html/body/div[1]/header/div/div[3]/div/div[4]/div/div[2]/ul/li[4]/a");
	By jw = By.cssSelector(".t-brand-logo-icon-JW.t-alt-link.t-no-hover-link");
	By dest = By.cssSelector("input[class*='search-dest']");
	By search = By.cssSelector("div.l-xs-col-4:nth-child(9) > button:nth-child(1)");
	By address = By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[1]/div/div[1]/div/div[1]/div[2]/div[4]/div");   //////
	By bonvoy = By.xpath("/html/body/div[1]/header/div/div[3]/div/div[4]/div/div[2]/ul/li[6]/a");
	By benefits = By.xpath("/html/body/div[1]/header/div/div[3]/div/div[4]/div/div[2]/ul/li[6]/div/div/div/div[1]/div[1]/ul/li[3]/a");
	By textword = By.xpath("/html/body/div[1]/div[2]/div[1]/section[3]/div/div[3]/div/section/div[2]/div/h3");                   //////  
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	
	public WebElement getBrand() {
		return driver.findElement(brand);
		
	
	}
	

	public WebElement getJw() {
		return driver.findElement(jw);
		
	
	}
	public WebElement getDest() {
		return driver.findElement(dest);
		
	
	}
	public WebElement getSearch() {
		return driver.findElement(search);
		
	
	}
	public WebElement getAddress() {
		return driver.findElement(address);
		
	
	}
	public WebElement getBonvoy() {
		return driver.findElement(bonvoy);
		
	
	}
	public WebElement getBenefits() {
		return driver.findElement(benefits);
		
	
	}
	
	public  WebElement getTextword() {
		return driver.findElement(textword);
		
	
	}
}
