package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProhibitedproductPage extends PageBase {

	public AddProhibitedproductPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath ="//input[@name='url']")
	WebElement ProductURl ;
	
	@FindBy(xpath ="(//input[@type='submit'])[2]")
	WebElement AddProduct ; 
	
	@FindBy(xpath = "//label[contains(text(),'we apologize, store is not available at this momen')]")
	public WebElement Assert2;
	

	public void AddautomateProduct(String ProductUrlTxtProhibited) throws InterruptedException {
		Thread.sleep(5000);
		ProductURl.click(); //click on product url 
		ProductURl.sendKeys(ProductUrlTxtProhibited);  // send the value of url

	}
}
