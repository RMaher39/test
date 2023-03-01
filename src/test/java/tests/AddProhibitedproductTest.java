package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.LoadProperties;
import pages.AddProhibitedproductPage;


public class AddProhibitedproductTest extends TestBase {
	AddProhibitedproductPage AddProhibitedproductObject;
	String ProductUrlTxtProhibited = LoadProperties.userData.getProperty("ProductUrlTxtProhibited");

	
	@Test(priority=1)
	public void userCanaddAutomateProduct() throws InterruptedException{
		AddProhibitedproductObject= new AddProhibitedproductPage(driver);
		AddProhibitedproductObject.AddautomateProduct(ProductUrlTxtProhibited);
		
		Assert.assertTrue(AddProhibitedproductObject.Assert2.isDisplayed());	
		
	}

}
