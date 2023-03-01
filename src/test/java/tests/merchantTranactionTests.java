package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.login;
import pages.merchantTranactions;

public class merchantTranactionTests extends TestBase{ 
	
	  login loginobject;
	   merchantTranactions merchantTranctionObject;

@Test
public void alltransactions() throws Exception {
	
	loginobject= new login(driver);
	loginobject.loginMerchant();

	merchantTranctionObject = new merchantTranactions(driver);
	merchantTranctionObject.paymentorder();
	merchantTranctionObject.StaticQR();
	merchantTranctionObject.supportticket();
	merchantTranctionObject.requestToPay();
	merchantTranctionObject.bulkR2p();
	Assert.assertTrue(merchantTranctionObject.assertFOrBulkR2p.isDisplayed());
	merchantTranctionObject.Download();
}

@Test(enabled = false)
public void ChnagepasswordTest() throws Exception {
	
	loginobject= new login(driver);
	loginobject.LoginChangePassword();
	merchantTranctionObject = new merchantTranactions(driver);
	merchantTranctionObject.ChanegpassMethod();
}
}