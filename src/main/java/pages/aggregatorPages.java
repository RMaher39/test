package pages;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class aggregatorPages extends PageBase {

	public aggregatorPages(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath ="//*[@id=\"ValueAddedServicesMerchant\"]/a")
	WebElement value_added_service ;

	@FindBy(xpath ="/html/body/div[2]/div[2]/div/div[2]/div[1]/div/a[1]/div")
	WebElement payment_order ;

	@FindBy(xpath ="//*[@id='Amount']")
	WebElement Amount ;

	@FindBy(xpath ="//*[@id=\"Email\"]")
	WebElement Email ;

	@FindBy(xpath ="//*[@id=\"btnSave\"]")
	WebElement SAveBtn ;
	@FindBy(xpath ="/html/body/div[2]/div[2]/div/div[2]/div/div/div[3]/div/div[2]/a")
	WebElement urlofpayment ;
	@FindBy(xpath ="//button[@id='btnSubmit']")
	WebElement PayNowBtn  ;
	@FindBy(xpath ="//*[@id=\"CardNumber\"]")
	WebElement CardNumber  ;
	@FindBy(xpath ="//*[@id=\"Expiration\"]")
	WebElement Expiration  ;
	@FindBy(xpath ="//*[@id=\"CVV\"]")
	WebElement CVV  ;
	@FindBy(xpath ="//*[@id=\"NameOnCard\"]")
	WebElement NameOnCard  ;
	@FindBy(xpath ="//button[@id='pay']")
	WebElement PayNowBtn2  ;
	
	
	
	@FindBy(xpath ="//*[@id=\"MerchantRequestsSupportTicket\"]/a")
	WebElement Support_Ticket ;
	
	@FindBy(xpath ="//select[@id='terminalNodeId']")
	WebElement  selectTerminal ;

	@FindBy(xpath ="//*[@id=\"servirityId\"]")
	WebElement selectservertity ;

	@FindBy(xpath ="//*[@id=\"SelectedRequest\"]")
	WebElement Request ;

	@FindBy(xpath ="//*[@id=\"details\"]")
	WebElement Details ;
	@FindBy(xpath ="//*[@id=\"btnSend\"]")
	WebElement saveticket ;
	

	@FindBy(xpath ="//*[@id=\"bs-sidebar-navbar-collapse-1\"]/ul/li[2]/a")
	WebElement merchantsManegment ;

	@FindBy(xpath ="//*[@id=\"IndexMerchants\"]/a")
	WebElement merchants ;

	@FindBy(xpath ="//*[@id=\"divListPanel\"]/div[3]/div/table/tbody/tr[1]/td[8]")
	WebElement editMerchant ;
	
	@FindBy(xpath ="//*[@id='Merchant_Address1']")
	WebElement Address  ;
	
	@FindBy(xpath ="//*[@id='btnSave']")
	WebElement SAveBTN  ;

	@FindBy(xpath ="//a[@class='dropdown-toggle loging_tap']")
	WebElement welcomeUSer  ;

	@FindBy(xpath ="/html/body/div[1]/div/div/div[1]/div[3]/ul/li/ul/li[2]/a")
	WebElement logout  ;
	
	@FindBy(xpath ="(//a)[9]")
			WebElement terminakmangment;
	
	@FindBy(xpath ="//a[@href='/Portal/TerminalManagement/Terminals']")
	WebElement terminallist;
	
	@FindBy(xpath ="//*[@id=\"divListPanel\"]/div[2]/div/table/tbody/tr[2]/td[9]/div/a")
	WebElement editterminal;
	
	@FindBy(xpath ="//*[@id=\"Terminal_Name\"]")
	WebElement nameofTerminal;

	@FindBy(xpath ="//*[@id=\"Terminal_WT_Domain\"]")
	WebElement terminaldomian;
	
	
	@FindBy(xpath ="//*[@id=\"btnSave\"]")
	WebElement saveeditTerminal;
	
	
	public void  PaymentLinkAggregator() throws Exception {
		
		Thread.sleep(3000);
		value_added_service.click();
		payment_order.click();
		Amount.click();
		Amount.sendKeys("10");
		Email.click();
		Email.sendKeys("reda@reda.com");
		SAveBtn.click();
		urlofpayment.click();
		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles()); 
        driver.switchTo().window(tab.get(1));  
		PayNowBtn.click();
		Thread.sleep(2000);
		CardNumber.click();
		Thread.sleep(2000);
		CardNumber.sendKeys("5078");
		CardNumber.sendKeys("0362");
		CardNumber.sendKeys("4660");
		CardNumber.sendKeys("0381");
		Expiration.click();
		Expiration.sendKeys("05");
		Expiration.sendKeys("25");
		CVV.click();
		CVV.sendKeys("331");
		NameOnCard.click();
		NameOnCard.sendKeys("redatest");
		Thread.sleep(2000);
		PayNowBtn2.click();
		ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles()); 
        driver.switchTo().window(tab2.get(0));    

	}
	
	public void aggregatorSupporttickets() throws Exception {
		
		Thread.sleep(3000);
		Support_Ticket.click();

		driver.navigate().to("https://192.168.11.11:5006/Portal/SupportTicketManagement/SupportTicket/Requests");
		Thread.sleep(2000);
		Select selectTerminalselect = new Select(selectTerminal);
		selectTerminalselect.selectByIndex(1);
		selectservertity.click();
		selectservertity.sendKeys("Low");
		Request.click();
		Request.sendKeys("Paper rolls request");
		Details.click();
		Details.sendKeys("Reda Test Details");
		saveticket.click();
	}
	
	public void AggrigatorEditMerchant() {
		
		merchantsManegment.click();
		merchants.click();  
		editMerchant.click();
		Address.click();
		Address.clear();
		Address.sendKeys(String.valueOf(PageBase.RandomName()));
		Address.sendKeys(Keys.END);
		SAveBTN.click();
		welcomeUSer.click();
		logout.click();
		
	}
	
	public void Aggrigatoreditterminal() {
		
		terminakmangment.click();
		terminallist.click();
		editterminal.click();
		nameofTerminal.click();
		nameofTerminal.sendKeys(String.valueOf(PageBase.RandomName()));
		terminaldomian.click();
		terminaldomian.sendKeys("*");
		saveeditTerminal.click();

	}
	
	
	

}
