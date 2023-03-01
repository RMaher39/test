package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankMerchAdmin extends PageBase{

	public BankMerchAdmin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;


	}

	@FindBy(xpath ="//*[@id=\"bs-sidebar-navbar-collapse-1\"]/ul/li[2]/a")
	WebElement merchantsManegment ;

	@FindBy(xpath ="//*[@id=\"IndexMerchants\"]/a")
	WebElement merchants ;

	@FindBy(xpath ="/html/body/div[2]/div[2]/div/div[4]/a[5]/span/span")
	WebElement OptionBTN ;


	@FindBy(xpath ="/html/body/div[2]/div[2]/div/div[4]/a[5]/span/span")
	WebElement addBTN ;

	@FindBy(xpath ="//*[@id='BankId']")
	WebElement Bank ;

	@FindBy(xpath ="//input[@onchange='CheckMerchantName()']")
	WebElement Merchant_Name ;

	@FindBy(xpath ="//*[@id=\"uploadForm\"]/div[2]/div/div/div[2]/div[5]/div[1]/div[2]/span/span/input")
	WebElement Category  ;


	@FindBy(xpath ="//*[@id=\"uploadForm\"]/div[2]/div/div/div[2]/div[6]/div/div[2]/span[1]/span/input")
	WebElement City  ;

	@FindBy(xpath ="//*[@id='Merchant_Address1']")
	WebElement Address  ;

	@FindBy(xpath ="//*[@id='TempMerchant_ContactPersonPhone']")
	WebElement Mobile  ;

	@FindBy(xpath ="//*[@id='SettlementAccountType']")
	WebElement Account_type  ;

	@FindBy(xpath ="//*[@id='DailyLimitAmount']")
	WebElement Dail_Limit_Amount  ;

	@FindBy(xpath ="//*[@id='MaxTxnLimit']")
	WebElement MaxTxnLimit  ;

	@FindBy(xpath ="//*[@id='MonthlyLimitAmount']")
	WebElement MonthlyLimitAmount  ;

	@FindBy(xpath ="//*[@id='MaxTxnCountDay']")
	WebElement MaxTxnCountDay  ;

	@FindBy(xpath ="//*[@id='uploadForm']/div[2]/div/div/div[4]/div[3]/div/div[2]/label/div")
	WebElement Meeza_Account   ;

	@FindBy(xpath ="//*[@id='dvDomesticRoute']/div[2]/label/div")
	WebElement Domestic_Route   ;

	@FindBy(xpath ="//*[@id='dvPayLink']/div[2]/label/div")
	WebElement payLink  ;

	@FindBy(xpath ="//*[@id=\"uploadForm\"]/div[2]/div/div/div[4]/div[24]/div[1]/a/i")
	WebElement secure_key  ;

	@FindBy(xpath ="//*[@id='MerchantFullName']")
	WebElement FullName  ;

	@FindBy(xpath ="//*[@id='MerchantUserEmail']")
	WebElement Email  ;

	@FindBy(xpath ="//*[@id='btnSave']")
	WebElement SAveBTN  ;

	@FindBy(xpath ="/html/body/div[1]/div/div/div[1]/div[3]/ul/li/a")
	WebElement welcomeUSer  ;

	@FindBy(xpath ="/html/body/div[1]/div/div/div[1]/div[3]/ul/li/ul/li[2]/a")
	WebElement logout  ;

	@FindBy(xpath ="//li[@id=\"BulkMerchantMasterSearchMerchants\"]")
	WebElement bulkerchant;


	@FindBy(xpath ="/html/body/div[2]/div[2]/div/div[3]/div[2]/a[3]/span/span")
	WebElement optionss;

	@FindBy(xpath ="//a[@tooltip=\"Add\"]")
	WebElement addbulkmerchant;

	@FindBy(css  ="#uploadForm > div.container-fluid > div:nth-child(5) > div > div > div > div")
	WebElement selectbulkmerchant;


	@FindBy(xpath="//*[@id=\"attachments\"]")
	WebElement selectbulkmerchant2;

	String pathBulkmerchant = System.getProperty("user.dir")+"\\drivers\\3dsnver50.csv";
	String pathBulkTerminal = System.getProperty("user.dir")+"\\drivers\\bulkterminalaut50.csv";

	@FindBy(xpath="//*[@id=\"uploadForm\"]/div[2]/div[2]/div/div/label")
	WebElement elementtoclose;


	@FindBy(xpath="//*[@id=\"btnSave\"]")
	WebElement savebulkmerchant;

	@FindBy(xpath="//*[@id=\"divListPanel\"]/div/div[2]/div/table/tbody/tr/td[6]/b/div/a")
	WebElement ActionBTN;
	@FindBy(xpath="//*[@id=\"divListPanel\"]/div/div[3]/div/table/thead/tr/th[1]/div/a")
	WebElement RefershBTN;

	@FindBy(xpath="//*[@id=\"btnSaveBulk\"]")
	WebElement sendBulkR2pBTn;

	@FindBy(xpath="//*[@id=\"divListPanel\"]/div/div[2]/div/table/tbody/tr[1]/td[6]/b/div/a[2]")
	WebElement detailsoffile;

	@FindBy(xpath="//*[@id=\"btnSaveBulk\"]")
	WebElement sendbulktoAPProval;

	@FindBy(xpath="(//a)[12]")
	WebElement terminakmangment;

	@FindBy(xpath="(//a)[14]")
	WebElement bulkterminal;


	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div/div[2]/a[2]")
	WebElement addnewBulkTerminal;

	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div/div[2]/a[3]/span/span")
	WebElement optionsforTerminal;

	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div/div[2]/a[2]")
	WebElement addnewTerminal;


	@FindBy(xpath="//*[@id=\"uploadForm\"]/div[2]/div[2]/div/div/div/div/div")
	WebElement selectBulkTerminalBtn;

	@FindBy(xpath ="//*[@id=\"attachments\"]")
	WebElement selectBulkTerminalBtn2;


	@FindBy(xpath ="//*[@id=\"btnSave\"]")
	WebElement savebulkTerminal;
	

	@FindBy(xpath ="//a[@href='/Portal/MerchantManagement/MerchantBranch']")
	WebElement branchesBtn;
	
	@FindBy(xpath ="/html/body/div[2]/div[2]/div/div[4]/a[4]")
	WebElement BranchesOtions;
	
	
	@FindBy(xpath ="//a[@tooltip=\"Add\"]")
	WebElement Addbrnaches;
	
	

	@FindBy(xpath ="(//input[@id='MerchantRefId_Name'])[2]")
	WebElement branchesMerchant;
	@FindBy(xpath ="//input[type='hidden']")
	WebElement branchesMerchant2;
	

	@FindBy(xpath ="//*[@id=\"MerchantBranch_Code\"]")
	WebElement branchesCode;

	@FindBy(xpath ="//*[@id=\"MerchantBranch_Name\"]")
	WebElement BranchesName;

	@FindBy(xpath ="//*[@id=\"MerchantBranch_Address\"]")
	WebElement BranchesAddress;

	@FindBy(xpath ="//*[@id=\"CanRefund\"]")
	WebElement BranchesCanRefund;

	@FindBy(xpath ="//*[@id=\"MerchantBranchFullName\"]")
	WebElement BranchesFullName;

	@FindBy(xpath ="//*[@id=\"MerchantBranchUserEmail\"]")
	WebElement BranchesUserEmail;

	@FindBy(xpath ="//*[@id=\"TempMerchant_MerchantBranchUserPhone\"]")
	WebElement BranchesUserMobile;

	@FindBy(xpath ="//*[@id=\"btnSave\"]")
	WebElement SaveBranches;
	
	
	
	@FindBy(xpath ="//a[@href='/Portal/UserManagement/User/ViewUsers']")
	WebElement manageUSers;
	
	@FindBy(xpath ="//*[@id=\"divListPanel\"]/div[2]/div/table/tbody/tr[1]/td[9]/b/a")
	WebElement ChangeStatus;
	
	@FindBy(xpath ="//*[@id=\"status\"]")
	WebElement UserStatus;
	
	@FindBy(xpath ="//*[@id=\"btnSave\"]")
	WebElement SaveChangeStatus;
	
	@FindBy(xpath ="//*[@id=\"divListPanel\"]/div[3]/div/table/tbody/tr[1]/td[8]/b/a")
	WebElement editMerchant;
	
	
	
	@FindBy(xpath ="//a[@href='/Portal/BankManagement/MDRTemplates']")
	WebElement MDRExceptionTempleteBTN;
	
	@FindBy(xpath ="/html/body/div[2]/div[2]/div/div[4]/a[4]/span/span")
	WebElement MDROptionsBTn;
	
	@FindBy(xpath ="//a[@href='/Portal/BankManagement/MDRTemplates/Create?editID=-1']")
	WebElement MDRAddBTn;
	
	@FindBy(xpath ="//a[@href='/Portal/BankManagement/MDRTemplates/AmountRule?mDRTemplateId=0&ruleTypeId=3&chanelId=2']")
	WebElement AmountRuleBtn;
	
	//*[@id="mDRGrid"]/div[2]/div/table/tbody/tr[2]/td[4]/b/a
	@FindBy(xpath ="//*[@id=\"BankMDRExceptional_AmountFrom\"]")
	WebElement Amountfrom;
	@FindBy(xpath ="//*[@id=\"BankMDRExceptional_AmountTo\"]")
	WebElement Amountto;
	@FindBy(xpath ="//*[@id=\"BankMDRExceptional_MDRFlat\"]")
	WebElement MDRFlat;
	@FindBy(xpath ="	//*[@id=\"BankMDRExceptional_MDRValue\"]")
	WebElement MDRValue;
	@FindBy(xpath ="//*[@id=\"BankMDRExceptional_MinMDRLimits\"]")
	WebElement MinMDRLimits;
	@FindBy(xpath ="//*[@id=\"BankMDRExceptional_MaxMDRLimits\"]")
	WebElement MaxMDRLimits;
	@FindBy(xpath ="//*[@id=\"UpdateWindowContent\"]/div/div[2]/div/div[4]/div/input")
	WebElement MDRAddamountRangeBTn;
	@FindBy(xpath ="(//button[@id=\"btnSave\"])[2]")
	WebElement MDRDoneBTn;
	@FindBy(xpath ="//*[@id=\"btnSave\"]")
	WebElement SaveMDr;

	@FindBy(xpath ="//*[@id=\"BankMDRTemplate_TemplateName\"]")
	WebElement TempName;
	
	
	@FindBy(xpath ="//a[@href='/Portal/TerminalManagement/Terminals']")
	WebElement terminallist;
	
	@FindBy(xpath ="//*[@id=\"divListPanel\"]/div[2]/div/table/tbody/tr[1]/td[9]/div/a")
	
	WebElement editterminal;
	
	@FindBy(xpath ="//*[@id=\"Terminal_Name\"]")
	WebElement nameofTerminal;

	@FindBy(xpath ="//*[@id=\"Terminal_WT_Domain\"]")
	WebElement terminaldomian;
	
	
	@FindBy(xpath ="//*[@id=\"btnSave\"]")
	WebElement saveeditTerminal;
	

	@FindBy(xpath ="//a[@href='/Portal/MerchantManagement/Merchants/MerchantBalanceReport']")
	WebElement MerchantBalance;
	@FindBy(xpath ="//*[@id=\"searchHeader\"]")
	WebElement searchHeader;
	
	@FindBy(xpath ="//input[@id='MerchantRefId_Name']")
	WebElement merchanttxt;
	
	@FindBy(xpath ="//button[@class='btn btn-block btn-default btn-search']")
	WebElement searchbtn;
	
	
	
	public void AddMerchantFRomAdmin() throws Exception {

		Thread.sleep(3000);
		merchantsManegment.click(); 
		merchants.click();  
		addBTN.click();
		driver.navigate().to("https://192.168.11.11:5006/Portal/MerchantManagement/Merchants/EditRecord?editID=-1");
		Merchant_Name.sendKeys(PageBase.RandomName());
		Category.click();
		Category.sendKeys("1520");
		Category.sendKeys(Keys.ENTER);
		City.click();
		City.sendKeys("cairo");
		Thread.sleep(2000);
		City.sendKeys(Keys.ENTER); 
		Address.click();
		Address.sendKeys("test address");
		Mobile.click();
		Mobile.sendKeys(String.valueOf(PageBase.RandomMobile()));

		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
		Account_type.click();
		Account_type.sendKeys("SVA");
		Account_type.click();

		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,750)");

		Dail_Limit_Amount.click();
		Dail_Limit_Amount.clear();
		Dail_Limit_Amount.sendKeys("100000");
		MaxTxnCountDay.click();
		MaxTxnCountDay.clear();
		MaxTxnCountDay.sendKeys("100000");
		MonthlyLimitAmount.click();
		MonthlyLimitAmount.clear();
		MonthlyLimitAmount.sendKeys("100000");
		MaxTxnCountDay.click();
		MaxTxnCountDay.clear();
		MaxTxnCountDay.sendKeys("100000");

		Meeza_Account.click();
		Domestic_Route.click();

		payLink.click();
		JavascriptExecutor scroll3 = (JavascriptExecutor)driver;
		scroll3.executeScript("window.scrollBy(0,600)");

		secure_key.click();


		JavascriptExecutor scroll4 = (JavascriptExecutor)driver;
		scroll4.executeScript("window.scrollBy(0,250)");

		Thread.sleep(2000);
		FullName.click();

		FullName.sendKeys(PageBase.RandomName());
		Email.click();
		Email.sendKeys("r.ayoub@egyptianbanks.net");

		JavascriptExecutor scroll5 = (JavascriptExecutor)driver;
		scroll5.executeScript("window.scrollBy(0,250)");
		SAveBTN.click();
		welcomeUSer.click();
		logout.click();


	}

	public void Addbulkmerchant() throws Exception {

		merchantsManegment.click();
		bulkerchant.click();
		Thread.sleep(2000);
		optionss.click();
		addbulkmerchant.click();
		Thread.sleep(3000);
		selectbulkmerchant.click();
		Thread.sleep(3000);
		selectbulkmerchant2.sendKeys(pathBulkmerchant);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(3000);
		savebulkmerchant.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		detailsoffile.click();
		sendbulktoAPProval.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		welcomeUSer.click();
		logout.click();
	}

	public void addbulkTerminal() throws Exception    {

		terminakmangment.click();
		bulkterminal.click();
		optionsforTerminal.click();
		addnewTerminal.click();
		Thread.sleep(3000);
		selectBulkTerminalBtn.click();
		Thread.sleep(3000);
		selectBulkTerminalBtn2.sendKeys(pathBulkTerminal);
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(3000);
		savebulkTerminal.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}

	
	public void addbranches() throws Exception {
	
		Thread.sleep(3000);
		merchantsManegment.click();
		branchesBtn.click();
		BranchesOtions.click();
		Addbrnaches.click();
		Thread.sleep(4000);
		branchesMerchant.click();
		branchesMerchant.sendKeys("13479089177");
		branchesMerchant.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		branchesMerchant.sendKeys(Keys.ENTER);
		branchesCode.click();
		branchesCode.sendKeys("1234");
		BranchesName.click();
		BranchesName.sendKeys("reda test2");
		BranchesAddress.click();
		BranchesAddress.sendKeys("reda address test");
		BranchesCanRefund.click();
		BranchesFullName.click();
		BranchesFullName.sendKeys("reda test");
		BranchesUserEmail.click();
		BranchesUserEmail.sendKeys("r.ayoub@egyptianbanks.net");
		BranchesUserMobile.click();
		BranchesUserMobile.sendKeys(String.valueOf(PageBase.RandomMobile()));
		SaveBranches.click();
		Thread.sleep(2000);
		welcomeUSer.click();
		logout.click();
		
		
	}
	
	public void ChangestatusMEthod() {
		
		manageUSers.click();
		ChangeStatus.click();
		UserStatus.click();
		UserStatus.sendKeys(Keys.ARROW_DOWN);
		UserStatus.sendKeys(Keys.ARROW_DOWN);
		UserStatus.click();
		SaveChangeStatus.click();
		
		
	}
	
	public void EditMerchant() {
		merchantsManegment.click();
		merchants.click();  
		editMerchant.click();
		Address.click();
		Address.sendKeys(String.valueOf(PageBase.RandomName()));
		Address.sendKeys(Keys.END);
		SAveBTN.click();
		welcomeUSer.click();
		logout.click();

		
	}
	
	public void AddMDRtemp() throws Exception {
		
		merchantsManegment.click();
	
		MDRExceptionTempleteBTN.click();
		MDROptionsBTn.click();
		MDRAddBTn.click();
		AmountRuleBtn.click();
		Amountfrom.click();
		Amountfrom.clear();
		Amountfrom.sendKeys("2");
		Amountto.click();
		Amountto.clear();
		Amountto.sendKeys("3");
		MDRFlat.click();
		MDRFlat.clear();
		MDRFlat.sendKeys("2");
		MDRValue.click();
		MDRValue.clear();
		MDRValue.sendKeys("2");
		MinMDRLimits.click();
		MinMDRLimits.clear();
		MinMDRLimits.sendKeys("3");
		MaxMDRLimits.click();
		MaxMDRLimits.clear();
		MaxMDRLimits.sendKeys("4");
		MDRAddamountRangeBTn.click();
		MDRDoneBTn.click();
		TempName.click();
		TempName.sendKeys(String.valueOf(PageBase.RandomName()));
		SaveMDr.click();
		
	
		
	}
	
	public void EditTerminal() throws Exception {
		
		Thread.sleep(2000);
		terminakmangment.click();
		terminallist.click();
		editterminal.click();
		nameofTerminal.click();
		nameofTerminal.sendKeys(String.valueOf(PageBase.RandomName()));
		terminaldomian.click();
		terminaldomian.sendKeys("*");
		saveeditTerminal.click();
	}
	
	public void MerchantBalance() {
		
		MerchantBalance.click();
		searchHeader.click();
		merchanttxt.click();
		merchanttxt.sendKeys("13479089177");
		merchanttxt.sendKeys(Keys.ARROW_DOWN);
		searchbtn.click();
	}
}
