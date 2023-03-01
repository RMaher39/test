package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.BankMerchAdmin;
import pages.BankSupervisor;
import pages.Mail;
import pages.login;

public class BankMerchAdminTests extends TestBase {

	login loginobject;
	pages.BankMerchAdmin BankMerchAdminObj;
	pages.AddnewMerchant addmerchantObj;
	pages.BankSupervisor bankSupervisorObj;
	pages.Mail   mailObj;


	@Test(priority = 1)
	public void approveSinglemerchant() throws Exception  {

		loginobject= new login(driver);
		loginobject.BankMerchAdmin();
		BankMerchAdminObj=new BankMerchAdmin(driver);
		BankMerchAdminObj.AddMerchantFRomAdmin();
		loginobject.BankMerchAdminapproval(); 
		bankSupervisorObj= new BankSupervisor(driver);
		bankSupervisorObj.saveNEwmerchant();

	} 

	@Test(priority = 2)
	public void approveBulkMerchant() throws Exception {
		Thread.sleep(3000);
		loginobject= new login(driver);
		loginobject.BankMerchAdmin2();
		BankMerchAdminObj=new BankMerchAdmin(driver);
		BankMerchAdminObj.Addbulkmerchant();
		loginobject.BankMerchAdminapproval();
		bankSupervisorObj= new BankSupervisor(driver);
		bankSupervisorObj.saveNEwmerchant();

	}

	@Test(priority = 3)
	public void AddnewBulkTerminal() throws Exception {

		loginobject= new login(driver);
		loginobject.BankMerchAdmin2();
		BankMerchAdminObj=new BankMerchAdmin(driver);
		BankMerchAdminObj.addbulkTerminal();

	}
	@Test(priority = 4)
	public void AddBranches() throws Exception {
		BankMerchAdminObj=new BankMerchAdmin(driver);
		BankMerchAdminObj.addbranches();
		loginobject.BankMerchAdminapproval();
		bankSupervisorObj= new BankSupervisor(driver);
		bankSupervisorObj.saveNEwmerchant();
	}

	@Test(priority = 5)
	public void ChanegStatusTest() throws Exception {

		loginobject= new login(driver);
		loginobject.BankMerchAdmin2();
		BankMerchAdminObj=new BankMerchAdmin(driver);
		BankMerchAdminObj.ChangestatusMEthod();
	}

	@Test(priority = 6)
	public void EditMErchantTest() throws Exception {

		BankMerchAdminObj=new BankMerchAdmin(driver);
		BankMerchAdminObj.EditMerchant();
		loginobject.BankMerchAdminapproval();
		bankSupervisorObj= new BankSupervisor(driver);
		bankSupervisorObj.saveNEwmerchant();

	}
	@Test(priority = 7)
	public void AddMDRTest() throws Exception {

		loginobject= new login(driver);
		loginobject.BankMerchAdmin2();
		BankMerchAdminObj=new BankMerchAdmin(driver);
		BankMerchAdminObj.AddMDRtemp();
	}


	@Test(priority = 8)
	public void editTerminal() throws Exception {
		BankMerchAdminObj=new BankMerchAdmin(driver);
		BankMerchAdminObj.EditTerminal();

	}

	@Test(priority = 9)
	public void MerchantBalance() {
		BankMerchAdminObj=new BankMerchAdmin(driver);
		BankMerchAdminObj.MerchantBalance();

	}

	@Test(enabled = false)
	public void SendEmail() throws Exception, IOException, Exception {
		mailObj = new Mail(driver);
		mailObj.sendreport();

	}
}
