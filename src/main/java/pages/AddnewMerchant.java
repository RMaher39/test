package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddnewMerchant extends PageBase{
	

	public AddnewMerchant(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath ="//*[@id=\"bs-sidebar-navbar-collapse-1\"]/ul/li[3]/a")
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

	@FindBy(xpath ="//*[@id='uploadForm']/div[2]/div/div/div[4]/div[20]/div[1]/a")
	WebElement secure_key  ;

	@FindBy(xpath ="//*[@id='MerchantFullName']")
	WebElement FullName  ;

	@FindBy(xpath ="//*[@id='MerchantUserEmail']")
	WebElement Email  ;

	@FindBy(xpath ="//*[@id='btnSave']")
	WebElement SAveBTN  ;

	public void addAutomateMerchant() throws InterruptedException {

		Thread.sleep(3000);
		merchantsManegment.click(); 
		merchants.click();  
		addBTN.click();
		driver.navigate().to("https://192.168.11.11:5006/Portal/MerchantManagement/Merchants/EditRecord?editID=-1");
		Bank.click();
		Bank.sendKeys("QC UPG");
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


	}



}
