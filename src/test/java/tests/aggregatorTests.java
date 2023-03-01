package tests;

import org.testng.annotations.Test;

import pages.aggregatorPages;
import pages.aggrigatorSupervisor;
import pages.login;

public class aggregatorTests extends TestBase {
	login loginobject;
	pages.BankMerchAdmin BankMerchAdminObj;
	pages.AddnewMerchant addmerchantObj;
	pages.BankSupervisor bankSupervisorObj;
	pages.aggregatorPages aggregatorObject;
	pages.aggrigatorSupervisor aggrigatorSupervisorObj;
	
	
	@Test(priority = 1)
	public void AggregatorPaymentlink() throws Exception {
		loginobject= new login(driver);
		loginobject.loginAggregator();
		aggregatorObject = new aggregatorPages(driver);
		aggregatorObject.PaymentLinkAggregator();
		
	}
	
	
	@Test(priority = 2)
	public void AggregatorsupportTiket() throws Exception {
		aggregatorObject = new aggregatorPages(driver);
		aggregatorObject.aggregatorSupporttickets();
	}
	
	@Test(priority = 3)
	public void Aggregatoreditterminal() throws Exception {
		
		aggregatorObject = new aggregatorPages(driver);
		aggregatorObject.Aggrigatoreditterminal();
	}

	@Test(priority = 4)
	public void AggregatoreditMerchant() throws Exception {
		aggregatorObject = new aggregatorPages(driver);
		aggregatorObject.AggrigatorEditMerchant();
		loginobject= new login(driver);
		loginobject.loginAggregatorSuperVisor();
		aggrigatorSupervisorObj=new aggrigatorSupervisor(driver);
		aggrigatorSupervisorObj.aggrigatorApprove();
	}
	
}
