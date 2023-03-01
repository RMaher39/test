package tests;

import org.testng.annotations.Test;

import pages.login;


public class AddnewMerchant extends TestBase {

	login loginobject;	  pages.AddnewMerchant addmerchantObj; 
	//Add_automatedproductsPage  AutomateProductObject;
	//String ProductUrlTxt = LoadProperties.userData.getProperty("ProductUrlTxtPRo");


	@Test(priority=1)
	public void addnewmerchant_happypath() throws InterruptedException{

		loginobject= new login(driver);
		loginobject.login();
		addmerchantObj= new pages.AddnewMerchant(driver);
		addmerchantObj.addAutomateMerchant();
		//	Assert.assertTrue(AutomateProductObject.AssertAutomate.isDisplayed());	

	}
}
