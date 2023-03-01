package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class merchantTranactions extends PageBase{

	
	public merchantTranactions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

		this.driver = driver;
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
	
	@FindBy(xpath ="(//a[@href])[14]")
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
	
	
	@FindBy(xpath ="//html/body/div[2]/div[2]/div/div[2]/div[2]/div/a/div/div/div[1]")
	WebElement StaticQRBTN ;

	@FindBy(xpath ="//*[@id=\"divListPanel\"]/div[2]/div/table/tbody/tr/td[7]/div/a")
	WebElement StaticQRView ;


	@FindBy(xpath ="//*[@id=\"UpdateWindow\"]/div/div[1]/button/span")
	WebElement closeStaticQR ;



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


	@FindBy(xpath ="//*[@id=\"SendR2PMerchants\"]/a")
	WebElement SendR2p ;

	@FindBy(xpath ="//*[@id=\"ReceiverType\"]")
	WebElement receiver_type ;


	@FindBy(xpath ="//*[@id=\"ReceiverId\"]")
	WebElement receiver_Merchant ;


	@FindBy(xpath ="//*[@id=\"TxnAmount\"]")
	WebElement amountr2p ;

	@FindBy(xpath ="	//*[@id=\"btnSave\"]")
	WebElement Saver2p;

	@FindBy(xpath ="//*[@id=\"BulkR2PMasterSearchMerchants\"]/a")
	WebElement bulkR2p;

	@FindBy(css  ="#uploadForm > div.container-fluid > div:nth-child(5) > div > div > div > div")
	WebElement selectFileR2p;

	@FindBy(xpath="//*[@id=\"attachments\"]")
	WebElement selectFileR2p2;

	String pathBulkR2P = System.getProperty("user.dir")+"\\drivers\\BulkR2PSampleauto3.csv";
	

	@FindBy(xpath="//*[@id=\"uploadForm\"]/div[2]/div[2]/div/div/label")
	WebElement elementtoclose;


	@FindBy(xpath="//*[@id=\"btnSave\"]")
	WebElement SaveBulkR2P;

	@FindBy(xpath="//*[@id=\"divListPanel\"]/div/div[2]/div/table/tbody/tr/td[6]/b/div/a")
	WebElement ActionBTN;
	@FindBy(xpath="//*[@id=\"divListPanel\"]/div/div[3]/div/table/thead/tr/th[1]/div/a")
	WebElement RefershBTN;
	
	

	@FindBy(xpath="//*[@id=\"btnSaveBulk\"]")
	WebElement sendBulkR2pBTn;
	
	@FindBy(xpath="//*[@id=\"TerminalListMerchant\"]/a")
	WebElement terminal_List;
	
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/a[3]/span/span")
	WebElement Options;
	
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/a[2]/span")
	WebElement Download_Terminal_List;

	
	
	@FindBy(xpath="//*[@id=\"ExportedFilesDownloadSearchBase\"]/a")
	WebElement export_downloaded;
	
	@FindBy(xpath="//*[@id=\"divListPanel\"]/div/div[2]/div/table/tbody/tr/td[4]/b/div/a")
	WebElement downloadBTN;
	
	@FindBy(xpath="//*[@id=\"divListPanel\"]/div/div[3]/div/table/tbody/tr/td[3]/b/span")
	public WebElement assertFOrBulkR2p;
	
	
	@FindBy(xpath ="/html/body/div[1]/div/div/div[1]/div[3]/ul/li/a")
	WebElement welcomeUSer  ;
	
	
	@FindBy(xpath ="//a[@href=\"/Portal/Account/ChangePassword\"]")
	WebElement ChanegpasswordBtn  ;
	
	@FindBy(xpath ="//*[@id=\"OldPassword\"]")
	WebElement OldPassword  ;
	@FindBy(xpath ="//*[@id=\"NewPassword\"]")
	WebElement NewPassword  ;
	@FindBy(xpath ="//*[@id=\"ConfirmPassword\"]")
	WebElement ConfirmPassword  ;
	@FindBy(xpath ="//*[@id=\"btnSave\"]")
	WebElement btnSave  ;


	public void paymentorder() throws InterruptedException {

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

	public void StaticQR() throws InterruptedException {

		Thread.sleep(3000);
		value_added_service.click();
		StaticQRBTN.click()  ;
		StaticQRView.click();

		closeStaticQR.click();

	}


	public void supportticket() throws InterruptedException {

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

	public void requestToPay() {
		SendR2p.click();
		receiver_type.click();
		receiver_type.sendKeys("merchant");
		receiver_type.click();
		receiver_Merchant.click();
		receiver_Merchant.sendKeys("123130783");
		amountr2p.click();
		amountr2p.clear();
		amountr2p.sendKeys("10");
		Saver2p.click();


	}

	public void bulkR2p() throws InterruptedException, IOException, Exception {

		bulkR2p.click();
		driver.navigate().to("https://192.168.11.11:5006/Portal/MerchantManagement/Merchants/BulkR2PUpload");

		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		selectFileR2p.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		selectFileR2p2.sendKeys(pathBulkR2P);
		Thread.sleep(4000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

		Thread.sleep(4000);

		SaveBulkR2P.click();
		
		if(ActionBTN.isDisplayed())
		{

		ActionBTN.click();
		
		
	     }
		sendBulkR2pBTn.click();
		Thread.sleep(3000);
		driver.navigate().refresh();


	}

    public void Download() throws Exception {
Thread.sleep(5000);	
	terminal_List.click();
	Options.click();
	Download_Terminal_List.click();
	
	export_downloaded.click();
	
	if(downloadBTN.isEnabled()) {
		
		downloadBTN.click();
	}
	
	
	
}
    
    public void  ChanegpassMethod () 
    {
    	welcomeUSer.click();
    	ChanegpasswordBtn.click();
    	OldPassword.click();
    	OldPassword.sendKeys("192837");
    	NewPassword.click();
    	NewPassword.sendKeys("123987");
    	ConfirmPassword.click();
    	ConfirmPassword.sendKeys("123987");
    	
    }
    
}




